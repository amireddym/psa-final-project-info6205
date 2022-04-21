/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.logic;

import businesslogic.model.Bead;
import businesslogic.model.Beads;
import businesslogic.model.MatchBox;
import businesslogic.model.MenaceGame;
import businesslogic.util.CSVutil;
import businesslogic.util.StateInitializer;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author manojreddy
 */
public class MenaceSelfTrain {
    
    private static final Logger logger = LoggerFactory.getLogger(MenaceSelfTrain.class);
    
    private MenaceGame menaceGame;
    
    private int iterations;
    
    private boolean gameStartedBySystem = true;
    
    private int gameStatus = -1;

    private List<MatchBox> currentState = new ArrayList<>();
    
    private List<Integer> menaceChosen = new ArrayList<>(); 
    
    public MenaceSelfTrain(MenaceGame menaceGame, int iterations) {
        this.menaceGame = menaceGame;
        this.iterations = iterations;
    }
    
    public boolean selfPlay() {
        
        for(int i=0; i< iterations; i++) {
           
           boolean gameOver = false;           
           currentState.add(new MatchBox(new int[]{0,0,0,0,0,0,0,0,0}));
           
           while(!gameOver) {
               
               if(gameStartedBySystem){
                   logger.info("System is making a move");
                   makeMoveBySystem(currentState, menaceChosen);
                   gameStatus = StateInitializer.gameWonByWhom(currentState.get(currentState.size()-1).getState());
                   if(gameStatus!=0) {
                       logger.info("SYSYTEM WON");
                       gameOver=true;
                       break;
                   }
                   if(sumOfState(currentState.get(currentState.size()-1).getState())==13){
                       logger.info("GAME DRAW");
                       gameOver=true;
                       gameStatus=0;
                       break;
                   }
                   logger.info("Random is making a move");
                   makeMoveRandom(currentState);
                   gameStatus = StateInitializer.gameWonByWhom(currentState.get(currentState.size()-1).getState());
                   if(gameStatus!=0) {
                       logger.info("RANDOM MOVE WON");
                       gameOver=true;
                       break;
                   }
                   if(sumOfState(currentState.get(currentState.size()-1).getState())==13){
                       logger.info("GAME DRAW");
                       gameOver=true;
                       gameStatus=0;
                       break;
                   }
               }else{
                   
                   logger.info("Random is making a move");
                   makeMoveRandom(currentState);
                   gameStatus = StateInitializer.gameWonByWhom(currentState.get(currentState.size()-1).getState());
                   if(gameStatus!=0) {
                       logger.info("RANDOM MOVE WON");
                       gameOver=true;
                       break;
                   }
                   if(sumOfState(currentState.get(currentState.size()-1).getState())==13){
                       logger.info("GAME DRAW");
                       gameOver=true;
                       gameStatus=0;
                       break;
                   }
                   
                   logger.info("System is making a move");
                   makeMoveBySystem(currentState, menaceChosen);
                   gameStatus = StateInitializer.gameWonByWhom(currentState.get(currentState.size()-1).getState());
                   if(gameStatus!=0) {
                       logger.info("SYSYTEM WON");
                       gameOver=true;
                       break;
                   }
                   if(sumOfState(currentState.get(currentState.size()-1).getState())==13){
                       logger.info("GAME DRAW");
                       gameOver=true;
                       gameStatus=0;
                       break;
                   }
               }
                
           }
           
           MenaceStateUpdater.updateMenaceBeadsToTrain(menaceGame, currentState, menaceChosen, gameStartedBySystem, gameStatus);
           gameStartedBySystem=!gameStartedBySystem;
           gameStatus= -1;
        }
        
        CSVutil.writeTrainedStatesDataToCSV(menaceGame);
        
        return true;
    }
    
    public int sumOfState(int[] state) {
        
        int sum =0;
        for(int i=0;i<9;i++) {
            
            sum+=state[i];
        }
        return sum;
    }
    
    public void makeMoveRandom(List<MatchBox> currentState) {
        
        int[] lastState = currentState.get(currentState.size()-1).getState().clone();
        int count = 0;
        List<Integer> freeStates = new ArrayList<>();
        for(int i=0;i<9;i++){
            if(lastState[i]==0){
                freeStates.add(i);
                count++;
            }
        }
        Random random = new Random();
        int ran = random.nextInt(count);
        
        //TODO update the chosen state
        if(gameStartedBySystem){
            lastState[freeStates.get(ran)]= 2;
        }else{
            lastState[freeStates.get(ran)]= 1;
        }
        
        // Need to optimize by taking the value from HASH-MAP rather than creating a new Object
        currentState.add(new MatchBox(lastState));
    }
    
    public void makeMoveBySystem(List<MatchBox> currentState, List<Integer> menaceChosen) {
        
        int[] lastState = currentState.get(currentState.size()-1).getState().clone();
        //TODO get Menacebeads by for loop
        MatchBox matchbox = null;
        for(MatchBox matchBox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
            if(matchBox.equals(currentState.get(currentState.size()-1))){
                matchbox = matchBox;
                logger.info("Found MatchBox");
                break;
            }
        }
        //Replacing the one within HASH for easier access later
        currentState.remove(currentState.size()-1);
        currentState.add(matchbox);
        Beads beadsState = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchbox);
        logger.info("Printing Beads probabilities");
        printBeadsProbablilityAndMakeMove(beadsState,menaceChosen);
        if(gameStartedBySystem){
            lastState[menaceChosen.get(menaceChosen.size()-1)] = 1;
        }else{
            lastState[menaceChosen.get(menaceChosen.size()-1)] = 2;
        }
        
        // Need to optimize by taking the value from HASH-MAP rather than creating a new Object
        currentState.add(new MatchBox(lastState));
    }

    public void printBeadsProbablilityAndMakeMove(Beads beadsState, List<Integer> menaceChosen) {
        
        int sum = 0;
        sum = beadsState.getPositions().stream().map(bead -> bead.getCurrentCount()).reduce(sum, Integer::sum);
        
        logger.info("Sum ::: "+ sum);
        for(Bead bead:beadsState.getPositions()){
            
            logger.info("Probability of choosing "+ bead.getBoardPosition()+" is "+ (float)bead.getCurrentCount()/sum);
        }
        logger.info("System choosing a Random Move it can take");

        Random random = new Random();
        int randomNo = random.nextInt(sum)+1;
        int chosenPosition=-1;
        do{
            randomNo-=beadsState.getPositions().get(chosenPosition+1).getCurrentCount();
            chosenPosition++;
        }while(randomNo>0);
        
        menaceChosen.add(chosenPosition);
    }
    
    
    public MenaceGame getMenaceGame() {
        return menaceGame;
    }

    public void setMenaceGame(MenaceGame menaceGame) {
        this.menaceGame = menaceGame;
    }

    public int getIterations() {
        return iterations;
    }

    public void setIterations(int iterations) {
        this.iterations = iterations;
    }

    public boolean isGameStartedBySystem() {
        return gameStartedBySystem;
    }

    public void setGameStartedBySystem(boolean gameStartedBySystem) {
        this.gameStartedBySystem = gameStartedBySystem;
    }

    public List<MatchBox> getCurrentState() {
        return currentState;
    }

    public void setCurrentState(List<MatchBox> currentState) {
        this.currentState = currentState;
    }

    public List<Integer> getMenaceChosen() {
        return menaceChosen;
    }

    public void setMenaceChosen(List<Integer> menaceChosen) {
        this.menaceChosen = menaceChosen;
    }
    
}
