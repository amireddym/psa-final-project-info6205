/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import businesslogic.model.Beads;
import businesslogic.model.MatchBox;
import businesslogic.model.Bead;
import businesslogic.model.MatchingInfo;
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
        
        logger.info("*****Generating 2nd possible state moves from 1st move");
        List<MatchBox> secondMoveStates = generateNextMatchboxStates(matchBoxs,2);
        logger.info("*******Found different states for 2nd move : " + secondMoveStates.size());
        
        logger.info("*****Generating 3rd possible state moves from 2st move");
        List<MatchBox> thirdMoveStates = generateNextMatchboxStates(secondMoveStates,1);
        logger.info("*******Found different states for 3rd move : " + thirdMoveStates.size());
        
        logger.info("*****Generating 4th possible state moves from 3rd move");
        List<MatchBox> fourthMoveStates = generateNextMatchboxStates(thirdMoveStates,2);
        logger.info("*******Found different states for 4th move : " + fourthMoveStates.size());
        
        logger.info("*****Generating 5th possible state moves from 4th move");
        List<MatchBox> fifthMoveStates = generateNextMatchboxStates(fourthMoveStates,1);
        logger.info("*******Found different states for 5th move : " + fifthMoveStates.size());
        
        logger.info("*****Generating 6th possible state moves from 5th move");
        List<MatchBox> sixthMoveStates = generateNextMatchboxStates(fifthMoveStates,2);
        logger.info("*******Found different states for 6th move : " + sixthMoveStates.size());
        
        logger.info("*****Generating 7th possible state moves from 6th move");
        List<MatchBox> seventhMoveStates = generateNextMatchboxStates(sixthMoveStates,1);
        logger.info("*******Found different states for 7th move : " + seventhMoveStates.size());
        
        logger.info("*****Generating 8th possible state moves from 7th move");
        List<MatchBox> eightMoveStates = generateNextMatchboxStates(seventhMoveStates,2);
        logger.info("*******Found different states for 8th move : " + eightMoveStates.size());
        
        logger.info("******Generating 9th possible state moves from 8th move");
        List<MatchBox> ninthMoveStates = generateNextMatchboxStates(eightMoveStates,1);
        logger.info("*******Found different states for 9th move : " + ninthMoveStates.size());
        
        logger.info("***** Adding all Different states possible at last ******");
        matchBoxs.addAll(secondMoveStates);
        matchBoxs.addAll(thirdMoveStates);
        matchBoxs.addAll(fourthMoveStates);
        matchBoxs.addAll(fifthMoveStates);
        matchBoxs.addAll(sixthMoveStates);
        matchBoxs.addAll(seventhMoveStates);
        matchBoxs.addAll(eightMoveStates);
        matchBoxs.addAll(ninthMoveStates);
        
        logger.info("Added 0 state i.e the starting state");
        matchBoxs.add(new MatchBox(new int[9]));
        
        return matchBoxs;
    }
    
        public static List<MatchBox> getAllPossibleMatchBoxStates2(List<MatchBox> matchBoxs) {
        
        logger.info("*****Generating 2nd possible state moves from 1st move");
        List<MatchBox> secondMoveStates = generateNextMatchboxStates2(matchBoxs,2);
        secondMoveStates = removeDuplicates(secondMoveStates);
        logger.info("*******Found different states for 2nd move : " + secondMoveStates.size());
        
        logger.info("*****Generating 3rd possible state moves from 2st move");
        List<MatchBox> thirdMoveStates = generateNextMatchboxStates2(secondMoveStates,1);
        thirdMoveStates = removeDuplicates(thirdMoveStates);
        logger.info("*******Found different states for 3rd move : " + thirdMoveStates.size());
        
        logger.info("*****Generating 4th possible state moves from 3rd move");
        List<MatchBox> fourthMoveStates = generateNextMatchboxStates2(thirdMoveStates,2);
        fourthMoveStates = removeDuplicates(fourthMoveStates);
        logger.info("*******Found different states for 4th move : " + fourthMoveStates.size());
        
        logger.info("*****Generating 5th possible state moves from 4th move");
        List<MatchBox> fifthMoveStates = generateNextMatchboxStates2(fourthMoveStates,1);
        fifthMoveStates = removeDuplicates(fifthMoveStates);
        logger.info("*******Found different states for 5th move : " + fifthMoveStates.size());
        
        logger.info("*****Generating 6th possible state moves from 5th move");
        List<MatchBox> sixthMoveStates = generateNextMatchboxStates2(fifthMoveStates,2);
        sixthMoveStates = removeDuplicates(sixthMoveStates);
        logger.info("*******Found different states for 6th move : " + sixthMoveStates.size());
        
        logger.info("*****Generating 7th possible state moves from 6th move");
        List<MatchBox> seventhMoveStates = generateNextMatchboxStates2(sixthMoveStates,1);
        seventhMoveStates = removeDuplicates(seventhMoveStates);
        logger.info("*******Found different states for 7th move : " + seventhMoveStates.size());
        
        logger.info("*****Generating 8th possible state moves from 7th move");
        List<MatchBox> eightMoveStates = generateNextMatchboxStates2(seventhMoveStates,2);
        eightMoveStates = removeDuplicates(eightMoveStates);
        logger.info("*******Found different states for 8th move : " + eightMoveStates.size());
        
        logger.info("******Generating 9th possible state moves from 8th move");
        List<MatchBox> ninthMoveStates = generateNextMatchboxStates2(eightMoveStates,1);
        ninthMoveStates = removeDuplicates(ninthMoveStates);
        logger.info("*******Found different states for 9th move : " + ninthMoveStates.size());
        
        logger.info("***** Adding all Different states possible at last ******");
        matchBoxs.addAll(secondMoveStates);
        matchBoxs.addAll(thirdMoveStates);
        matchBoxs.addAll(fourthMoveStates);
        matchBoxs.addAll(fifthMoveStates);
        matchBoxs.addAll(sixthMoveStates);
        matchBoxs.addAll(seventhMoveStates);
        matchBoxs.addAll(eightMoveStates);
        matchBoxs.addAll(ninthMoveStates);
        
        logger.info("Added 0 state i.e the starting state");
        matchBoxs.add(new MatchBox(new int[9]));
        
        return matchBoxs;
    }
        
    public static List<MatchBox> removeDuplicates(List<MatchBox> matchBoxs) {
        
        List<Integer> duplicateIndexes = new ArrayList<>();
        for(int i=0;i<matchBoxs.size();i++) {
            for(int j=i+1;j<matchBoxs.size();j++) {
                
                if(bothstatesAreSame(matchBoxs.get(i).getState().clone(), matchBoxs.get(j).getState().clone()).isMatched()) {
                    duplicateIndexes.add(j);
                }
            }
        }
        
        List<MatchBox> uniqueMatchBoxes = new ArrayList<>();
        for(int i=0;i<matchBoxs.size();i++) {
            
            if(!duplicateIndexes.contains(i)) {
                uniqueMatchBoxes.add(matchBoxs.get(i));
            }
        }
        
        return uniqueMatchBoxes;
    }
    
    public static List<MatchBox> generateNextMatchboxStates(List<MatchBox> matchBoxs, int user) {
        
//        logger.info("Starting states generation");
        List<MatchBox> nextStates = new ArrayList<>();
        for (MatchBox matchBox : matchBoxs) {
            //logger.info("Checking if we can proceed ahead with the current move");
            if(!isMatchBoxStateValidForNextMove(matchBox.getState())){
                
                //logger.info("This state has already has a WINNER");
                continue;
            }
            for(int j=0; j<9; j++){
                if(matchBox.getState()[j]==0){
                    //TODO need to check if this state already exists or not and then make a decision on it
                    int[] state = matchBox.getState().clone();
                    state[j]=user;
                    if(!stateAlreadyExists(nextStates, state)) {
                        
//                        logger.info(StatePrinter.getCurrentStateInString(state));
                        MatchBox newMatchBox = new MatchBox(state);
                        nextStates.add(newMatchBox);
                        logger.info("STATE ADDED ::: " + StatePrinter.getCurrentStateInString(state) );
                    }
                }
            }
//            logger.info("***** States found so far ***** " + nextStates.size());
        }
        return nextStates;
    }
    
    public static List<MatchBox> generateNextMatchboxStates2(List<MatchBox> matchBoxs, int user) {
        
//        logger.info("Starting states generation");
        List<MatchBox> nextStates = new ArrayList<>();
        for (MatchBox matchBox : matchBoxs) {
            for(int j=0; j<9; j++){
                if(matchBox.getState()[j]==0){
                    
                    int[] state = matchBox.getState().clone();
                    state[j]=user;
                    MatchBox newMatchBox = new MatchBox(state);
                    nextStates.add(newMatchBox);
                }
            }
        }
//      logger.info("***** States found so far ***** " + nextStates.size());
        return nextStates;
    }
    
    public static boolean stateAlreadyExists(List<MatchBox> matchBoxs, int[] stateToCheck) {
        
//        logger.info("Checking if a state generated is already existed or not");
        for(MatchBox matchBox:matchBoxs) {
            
            int[] state1 = matchBox.getState().clone();
            int[] state2 = stateToCheck.clone();
            
            if(bothstatesAreSame(state1, state2).isMatched()){
               return true;
            }               
        }
        
        return false;
    }
    
    public static MatchingInfo bothstatesAreSame(int[] state1, int[] state2) {
        
        MatchingInfo matchingInfo = new MatchingInfo(true, 0, 0);
        
        //Comparing directly without Modification
        StatePrinter.getCurrentStateInString(state2);
        matchingInfo.setMatched(true);
        for(int i=0; i< 9; i++) {
            if(state1[i]!=state2[i]){
                matchingInfo.setMatched(false);
                break;
            }
        }
        if(matchingInfo.isMatched()){
//            logger.info("State already exists");
            return matchingInfo;
        }
        
//        logger.info("Checking the 1st rotated state for finding if its a Duplicate");
        //1st rotation
        int[] rotatedState = rotateState90(state2);
        StatePrinter.getCurrentStateInString(rotatedState);
        matchingInfo.incrementRotation();
        matchingInfo.setMatched(true);
        for(int i=0; i< 9; i++) {
            if(state1[i]!=rotatedState[i]){
                matchingInfo.setMatched(false);
                break;
            }
        }
        if(matchingInfo.isMatched()){
//            logger.info("State already exists");
            return matchingInfo;
        }
        
//        logger.info("Checking the 2nd rotated state for finding if its a Duplicate");
        //2nd rotation
        rotatedState = rotateState90(rotatedState);
        StatePrinter.getCurrentStateInString(rotatedState);
        matchingInfo.incrementRotation();
        matchingInfo.setMatched(true);
        for(int i=0; i< 9; i++) {
            if(state1[i]!=rotatedState[i]){
                matchingInfo.setMatched(false);
                break;
            }
        }
        if(matchingInfo.isMatched()){
//            logger.info("State already exists");
            return matchingInfo;
        }
        
//        logger.info("Checking the 3rd rotated state for finding if its a Duplicate");
        //3rd rotation
        rotatedState = rotateState90(rotatedState);
        StatePrinter.getCurrentStateInString(rotatedState);
        matchingInfo.incrementRotation();
        matchingInfo.setMatched(true);
        for(int i=0; i< 9; i++) {
            if(state1[i]!=rotatedState[i]){
                matchingInfo.setMatched(false);
                break;
            }
        }
        if(matchingInfo.isMatched()){
//            logger.info("State already exists");
            return matchingInfo;
        }
        
//        logger.info("Checking the Flipped state for finding if its a Duplicate");
        //Flip state
        rotatedState = flipState(state2);
        StatePrinter.getCurrentStateInString(rotatedState);
        matchingInfo.incrementFlips();
        matchingInfo.setMatched(true);
        for(int i=0; i< 9; i++) {
            if(state1[i]!=rotatedState[i]){
                matchingInfo.setMatched(false);
                break;
            }
        }
        if(matchingInfo.isMatched()){
//            logger.info("State already exists");
            return matchingInfo;
        }
        
//        logger.info("Checking the 1st rotated state after Flipping for finding if its a Duplicate");
        //1st rotation
        rotatedState = rotateState90(rotatedState);
        StatePrinter.getCurrentStateInString(rotatedState);
        matchingInfo.incrementRotation();
        matchingInfo.setMatched(true);
        for(int i=0; i< 9; i++) {
            if(state1[i]!=rotatedState[i]){
                matchingInfo.setMatched(false);
                break;
            }
        }
        if(matchingInfo.isMatched()){
//            logger.info("State already exists");
            return matchingInfo;
        }
        
//        logger.info("Checking the 2nd rotated state after Flipping for finding if its a Duplicate");
        //2nd rotation
        rotatedState = rotateState90(rotatedState);
        StatePrinter.getCurrentStateInString(rotatedState);
        matchingInfo.incrementRotation();
          matchingInfo.setMatched(true);
        for(int i=0; i< 9; i++) {
            if(state1[i]!=rotatedState[i]){
                matchingInfo.setMatched(false);
                break;
            }
        }
        if(matchingInfo.isMatched()){
//            logger.info("State already exists");
            return matchingInfo;
        }
        
//        logger.info("Checking the 3rd rotated state after Flipping for finding if its a Duplicate");
        //3rd rotation
        rotatedState = rotateState90(rotatedState);
        StatePrinter.getCurrentStateInString(rotatedState);
        matchingInfo.incrementRotation();
        matchingInfo.setMatched(true);
         for(int i=0; i< 9; i++) {
            if(state1[i]!=rotatedState[i]){
                matchingInfo.setMatched(false);
                break;
            } 
        }
        if(matchingInfo.isMatched()){
//            logger.info("State already exists");
            return matchingInfo;
        }
        
        return matchingInfo;
    }
    
    public static int[] flipState(int[] state) {
        
//        logger.info("Flipping the state");
        int[] flippedState = new int[9];
        
        flippedState[2] = state[0];
        flippedState[5] = state[3];
        flippedState[8] = state[6];
        flippedState[0] = state[2];
        flippedState[3] = state[5];
        flippedState[6] = state[8];
        flippedState[7] = state[7];
        flippedState[1] = state[1];
        flippedState[4] = state[4];
        
        
        return flippedState;
    }
    
    public static int[] rotateState90(int[] state) {
        
//        logger.info("Rotating the state by 90 degrees");
        int[] rotatedState = new int[9];
        
        rotatedState[0] = state[6];
        rotatedState[2] = state[0];
        rotatedState[8] = state[2];
        rotatedState[6] = state[8];
        rotatedState[1] = state[3];
        rotatedState[5] = state[1];
        rotatedState[7] = state[5];
        rotatedState[3] = state[7];
        rotatedState[4] = state[4];
        
        return rotatedState;
    }
    
    public static boolean isMatchBoxStateValidForNextMove(int[] state) {
        
        return gameWonByWhom(state)==0;
    }
    
    public static int gameWonByWhom(int[] state) {
        
        // Checking if Player 1 has WON
//        logger.info("Checking if Player1 has WON");
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
//        logger.info("Checking if Player2 has WON");
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
//        logger.info("Game is NOT done yet");
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

    public static List<MatchBox> removeNotNeededStates(List<MatchBox> matchBoxStates) {
        
        List<Integer> statesAlreadyWon = new ArrayList<>();
        for(int i=0;i<matchBoxStates.size();i++) {
            
            if(!isMatchBoxStateValidForNextMove(matchBoxStates.get(i).getState().clone())) {
                statesAlreadyWon.add(i);
            }
        }
        
        List<MatchBox> properStates = new ArrayList<>();
        for(int i=0;i<matchBoxStates.size();i++) {
            if(!statesAlreadyWon.contains(i)) {
                properStates.add(matchBoxStates.get(i));
            }
        }
        
        return properStates;
    }
    
}
