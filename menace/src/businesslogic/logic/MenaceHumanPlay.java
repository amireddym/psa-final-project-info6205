/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.logic;

import businesslogic.model.Bead;
import businesslogic.model.Beads;
import businesslogic.model.MatchBox;
import businesslogic.model.MatchingInfo;
import businesslogic.model.MenaceGame;
import businesslogic.util.StateInitializer;
import businesslogic.util.StatePrinter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author manojreddy
 */
public class MenaceHumanPlay {
    
    private static final Logger logger = LoggerFactory.getLogger(MenaceHumanPlay.class);
    
    private MenaceGame menaceGameTrained;
    
    private List<MatchBox> currentState = new ArrayList<>();
    
    private List<Integer> menaceChosen = new ArrayList<>();

    public MenaceHumanPlay(MenaceGame menaceGameTrained) {
        this.menaceGameTrained = menaceGameTrained;
    }

    public int makeMove(int[] states, int whoStarted) {
       
        int[] state = states.clone();
        
        //get move from trained state
        int index = getSystemMove(state);
        
        // update states and add to currentstate and menace chosen
        if(whoStarted==0){
            state[index]=2;
        }else{
            state[index]=1;
        }
        
        currentState.add(new MatchBox(state));
        menaceChosen.add(index);
        
        return index;
        
    }
    
    private int getSystemMove(int[] state) {
        
        MatchBox matchbox = null;
        MatchingInfo matchingInfo = null;
        for(MatchBox matchBox:menaceGameTrained.getMenaceTrainedState().getMatchBoxes().keySet()){
            matchingInfo = StateInitializer.bothstatesAreSame(matchBox.getState().clone(),state);
            if(matchingInfo.isMatched()){
                matchbox = matchBox;
                logger.info("Found MatchBox");
                break;
            }
        }        
        if(matchbox == null) {
            logger.info("**************NOT FOUND A MATCH BOX IN HASH************");
            StatePrinter.printState(state);
            System.out.println(StatePrinter.getStateInCSVformat(state));
        }
        
        Beads beadsState = menaceGameTrained.getMenaceTrainedState().getMatchBoxes().get(matchbox);
        logger.info("Printing Beads probabilities");
        int position = printBeadsProbablilityAndMakeMove(beadsState);
        
        int actualMove = findActualmove(position, matchingInfo.getRotations(), matchingInfo.getFlips());
        menaceChosen.add(actualMove);
        
        return actualMove;
    }
    
    public int  printBeadsProbablilityAndMakeMove(Beads beadsState) {
        
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
        
        chosenPosition = beadsState.getPositions().get(chosenPosition).getBoardPosition();
        
        return chosenPosition;
    }
    
    
    public int findActualmove(int index, int rotations, int flips) {
        
        rotations = 4-rotations;
        while(rotations>0) {
            
            rotations = rotations-1;
            if(index==1) {
                index=5;
            }else if(index==5){
                index=7;
            }else if(index==7){
                index=3;
            }else if(index==3){
                index=1;
            }else if(index==0){
                index=2;
            }else if(index==2){
                index=8;
            }else if(index==8){
                index=6;
            }else if(index==6){
                index=0;
            }
            
        } 
        if(flips==1) {
            
            if(index==0) {
                index=2;
            }else if(index==3){
                index=5;
            }else if(index==6){
                index=8;
            }else if(index==2){
                index=0;
            }else if(index==5){
                index=3;
            }else if(index==8){
                index=6;
            }
            
        }
            
        return index;
    }

    public void updateMenaceBeadsToTrain(MenaceGame menaceGame, int whoStarted, boolean systemWon) {
     
        if(whoStarted==0){
            // Started by USER
            if(systemWon){
                MenaceStateUpdater.updateMenaceBeadsToTrain(menaceGame, currentState, menaceChosen, false, 2);
            }else{
                MenaceStateUpdater.updateMenaceBeadsToTrain(menaceGame, currentState, menaceChosen, false, 1);
            }
        }else{
            //Started by SYSTEM
            if(systemWon){
                MenaceStateUpdater.updateMenaceBeadsToTrain(menaceGame, currentState, menaceChosen, true, 1);
            }else{
                MenaceStateUpdater.updateMenaceBeadsToTrain(menaceGame, currentState, menaceChosen, true, 2);
            }
        }
        
    }
    
}
