/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.logic;

import businesslogic.model.MatchBox;
import businesslogic.model.MenaceGame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class MenaceSelfTrain {
    
    private MenaceGame menaceGame;
    
    private int iterations;
    
    private boolean gameStartedBySystem = true;
    
    private int gameStatus = 0;

    private List<MatchBox> currentState = new ArrayList<>();
    
    private List<Integer> menaceChosen = new ArrayList<>(); 
    
    public MenaceSelfTrain(MenaceGame menaceGame, int iterations) {
        this.menaceGame = menaceGame;
        this.iterations = iterations;
    }
    
    public void selfPlay() {
        
        for(int i=0; i< iterations; i++) {
           
           boolean gameOver = false;
           
           currentState.add(new MatchBox(new int[]{0,0,0,0,0,0,0,0,0}));
           
           while(!gameOver) {
               
                
           }
           
           MenaceStateUpdater.updateMenaceBeadsToTrain(menaceGame, currentState, menaceChosen, gameStartedBySystem, gameStatus);
        }

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
