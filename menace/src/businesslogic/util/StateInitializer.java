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
        
        List<MatchBox> thirdMoveStates = generateNextMatchboxStates(secondMoveStates,1);
        matchBoxs.addAll(thirdMoveStates);
        
        List<MatchBox> fourthMoveStates = generateNextMatchboxStates(thirdMoveStates,2);
        matchBoxs.addAll(fourthMoveStates);
        
        List<MatchBox> fifthMoveStates = generateNextMatchboxStates(fourthMoveStates,1);
        matchBoxs.addAll(fifthMoveStates);
        
        List<MatchBox> sixthMoveStates = generateNextMatchboxStates(fifthMoveStates,2);
        matchBoxs.addAll(sixthMoveStates);
        
        List<MatchBox> seventhMoveStates = generateNextMatchboxStates(sixthMoveStates,1);
        matchBoxs.addAll(seventhMoveStates);
        
        List<MatchBox> eightMoveStates = generateNextMatchboxStates(seventhMoveStates,2);
        matchBoxs.addAll(eightMoveStates);
        
        List<MatchBox> ninthMoveStates = generateNextMatchboxStates(eightMoveStates,1);
        matchBoxs.addAll(ninthMoveStates);
        
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
                    //TODO need to check if this state already exists or not and then make a decision on it 
                }
            }
        }
        return nextStates;
    }
    
    public static boolean isMatchBoxStateValidForNextMove(int[] state) {
        
        return gameWonByWhom(state)==0;
    }
    
    public static int gameWonByWhom(int[] state) {
        
        // Checking if Player 1 has WON
        if(state[0]==1 && state[1]==1 && state[2]==1) {
            return 1;
        }
        if(state[3]==1 && state[4]==1 && state[5]==1) {
            return 1;
        }
        if(state[6]==1 && state[7]==1 && state[8]==1) {
            return 1;
        }
        if(state[0]==1 && state[3]==1 && state[6]==1) {
            return 1;
        }
        if(state[1]==1 && state[4]==1 && state[7]==1) {
            return 1;
        }
        if(state[2]==1 && state[5]==1 && state[8]==1) {
            return 1;
        }
        if(state[0]==1 && state[4]==1 && state[8]==1) {
            return 1;
        }
        if(state[2]==1 && state[4]==1 && state[6]==1) {
            return 1;
        }
        
        // Checking if Player 2 has WON
        if(state[0]==2 && state[1]==2 && state[2]==2) {
            return 2;
        }
        if(state[3]==2 && state[4]==2 && state[5]==2) {
            return 2;
        }
        if(state[6]==2 && state[7]==2 && state[8]==2) {
            return 2;
        }
        if(state[0]==2 && state[3]==2 && state[6]==2) {
            return 2;
        }
        if(state[1]==2 && state[4]==2 && state[7]==2) {
            return 2;
        }
        if(state[2]==2 && state[5]==2 && state[8]==2) {
            return 2;
        }
        if(state[0]==2 && state[4]==2 && state[8]==2) {
            return 2;
        }
        if(state[2]==2 && state[4]==2 && state[6]==2) {
            return 2;
        }
        
        //Game yet to complete
        return 0;
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
