/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import businesslogic.model.Beads;
import businesslogic.model.MatchBox;
import businesslogic.model.Bead;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author manojreddy
 */
public class StateInitializer {
    
    private final static Logger logger = LoggerFactory.getLogger(StateInitializer.class);    
    
    public static Beads generateDefaultBeadsFromMatchboxState(MatchBox matchBox) {
        
        logger.info("Generating defaults beads state for the MatchBox state : "+ matchBox);
        List<Bead> beadList = new ArrayList<>();
        int[] currentState = matchBox.getState();
        for(int i =0 ;i < currentState.length; i++) {
            if(currentState[i]==0){
                Bead bead = new Bead(i);
                beadList.add(bead);
            }
        }
        
        Beads beads = new Beads();
        beads.setPositions(beadList);
        return beads;
    }
    
    public static List<MatchBox> getAllPossibleMatchBoxStates(List<MatchBox> matchBoxs) {
        
        List<MatchBox> secondMoveStates = generateNextMatchboxStates(matchBoxs,2);
        matchBoxs.addAll(secondMoveStates);
        
        return matchBoxs;
    }
    
    public static List<MatchBox> generateNextMatchboxStates(List<MatchBox> matchBoxs, int user) {
        
        List<MatchBox> nextStates = new ArrayList<>();
        for (MatchBox matchBox : matchBoxs) {
            if(!isMatchBoxStateValidForNextMove(matchBox.getState())){
                continue;
            }
            for(int j=0; j<9; j++){
                if(matchBox.getState()[j]==0){
                    
                }
            }
        }
        return nextStates;
    }
    
    public static boolean isMatchBoxStateValidForNextMove(int[] state) {
        
        //TODO check if this state has WON and return false if it is
        //Write a function to check if anyone WON in this state
        
        return false;
    }
    
    public static Map<MatchBox,Beads> generateAllInitialMatchBoxStates(List<MatchBox> matchBoxs) {
        
        Map<MatchBox,Beads> matchBoxes = new HashMap<>();
        
        for(MatchBox matchBox:matchBoxs){
            Beads beads = generateDefaultBeadsFromMatchboxState(matchBox);
            matchBoxes.put(matchBox, beads);
        }
        return matchBoxes;
    }
    
}
