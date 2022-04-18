/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.logic;

import businesslogic.model.MatchBox;
import businesslogic.model.MenaceGame;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class MenaceStateUpdater {
    
    
    public static void updateMenaceBeadsToTrain(MenaceGame menaceGame, List<MatchBox> currentState, List<Integer> menaceChosen, 
            boolean gameStartedBySystem, int gameStatus) {
        
        if(gameStatus==0) {
            return;
        }else if(gameStatus==1) {
            if(gameStartedBySystem) {
                
                //TODO add to the beads state is Needed
                
            }else{
                
                //TODO remove to the bead state is Needed
                
            }
        }else{
            if(gameStartedBySystem) {
                
                //TODO remove to the bead state is Needed
                
            }else{
                
                //TODO add to the bead state is Needed
                
            }
        }
        
    }
}
