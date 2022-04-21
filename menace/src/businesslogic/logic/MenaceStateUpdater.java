/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.logic;

import businesslogic.model.Bead;
import businesslogic.model.Beads;
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
        
        switch (gameStatus) {
            case 0:
                return;
            case 1:
                if(gameStartedBySystem) {
                    
                    //TODO add to the beads state is Needed
                    int i=0;
                    int j=0;
                    while(i<= menaceChosen.size()){
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(currentState.get(i));
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== menaceChosen.get(j)){
                                bead.setCurrentCount(bead.getCurrentCount()+1);
                                break;
                            }
                        }
                        i+=2;
                        j++;
                    }
                }else{
                    
                    //TODO remove to the bead state is Needed
                    int i=0;
                    int j=0;
                    while(i<= menaceChosen.size()){
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(currentState.get(i));
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== menaceChosen.get(j)){
                                bead.setCurrentCount(bead.getCurrentCount()-1);
                                break;
                            }
                        }
                        i+=2;
                        j++;
                    }
                }   break;
            default:
                if(gameStartedBySystem) {
                    
                    //TODO remove to the bead state is Needed
                    int i=0;
                    int j=0;
                    while(i<= menaceChosen.size()){
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(currentState.get(i));
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== menaceChosen.get(j)){
                                bead.setCurrentCount(bead.getCurrentCount()-1);
                                break;
                            }
                        }
                        i+=2;
                        j++;
                    }
                }else{
                    
                    //TODO add to the bead state is Needed
                    int i=0;
                    int j=0;
                    while(i<= menaceChosen.size()){
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(currentState.get(i));
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== menaceChosen.get(j)){
                                bead.setCurrentCount(bead.getCurrentCount()+1);
                                break;
                            }
                        }
                        i+=2;
                        j++;
                    }
                }   break;
        }
        
    }
}
