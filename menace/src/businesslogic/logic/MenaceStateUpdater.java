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
import businesslogic.util.MenaceConstants;
import businesslogic.util.StateInitializer;
import businesslogic.util.StatePrinter;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author manojreddy
 */
public class MenaceStateUpdater {
    
    private static final Logger logger  = LoggerFactory.getLogger(MenaceStateUpdater.class);
    
    public static void updateMenaceBeadsToTrain(MenaceGame menaceGame, List<MatchBox> currentState, List<Integer> menaceChosen, 
            boolean gameStartedBySystem, int gameStatus) {
        
        switch (gameStatus) {
            case 0:
                if(gameStartedBySystem) {
                    
                    //TODO add to the beads state is Needed
                    int i=0;
                    int j=0;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox);
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()+MenaceConstants.DELTA);
                                break;
                            }
                        }
                        i+=1;
                        j+=2;
                    }
                }else{
                    
                    //TODO remove to the bead state is Needed
                    int i=0;
                    int j=1;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox);
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()+MenaceConstants.DELTA);
                                break;
                            }
                        }
                        i+=1;
                        j+=2;
                    }
                }   break;
            case 1:
                if(gameStartedBySystem) {
                    
                    //TODO add to the beads state is Needed
                    int i=0;
                    int j=0;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox);
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()+MenaceConstants.BETA);
                                break;
                            }
                        }
                        i+=1;
                        j+=2;
                    }
                }else{
                    
                    //TODO remove to the bead state is Needed
                    int i=0;
                    int j=1;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox);
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()-MenaceConstants.GAMMA);
                                break;
                            }
                        }
                        i+=1;
                        j+=2;
                    }
                }   break;
            default:
                if(gameStartedBySystem) {
                    
                    //TODO remove to the bead state is Needed
                    int i=0;
                    int j=0;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it    
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox);
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()-MenaceConstants.GAMMA);
                                break;
                            }
                        }
                        i+=1;
                        j+=2;
                    }
                }else{
                    
                    //TODO add to the bead state is Needed
                    int i=0;
                    int j=1;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox); 
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()+MenaceConstants.ALPHA);
                                break;
                            }
                        }
                        i+=1;
                        j+=2;
                    }
                }   break;
        }
        
    }
    
    public static int getActualState(int index, int rotations, int flips) {
        
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
        
        return index;
    }
    
    public static void updateMenaceBeadsToTrainHuman(MenaceGame menaceGame, List<MatchBox> currentState, List<Integer> menaceChosen, 
            boolean gameStartedBySystem, int gameStatus) {
        
        switch (gameStatus) {
            case 0:
                if(gameStartedBySystem) {
                    
                    //TODO add to the beads state is Needed
                    int i=0;
                    int j=0;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox);
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()+MenaceConstants.DELTA);
                                break;
                            }
                        }
                        i+=1;
                        j+=1;
                    }
                }else{
                    
                    //TODO remove to the bead state is Needed
                    int i=0;
                    int j=0;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox);
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()+MenaceConstants.DELTA);
                                break;
                            }
                        }
                        i+=1;
                        j+=1;
                    }
                }   break;
            case 1:
                if(gameStartedBySystem) {
                    
                    //TODO add to the beads state is Needed
                    int i=0;
                    int j=0;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox);
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()+MenaceConstants.BETA);
                                break;
                            }
                        }
                        i+=1;
                        j+=1;
                    }
                }else{
                    
                    //TODO remove to the bead state is Needed
                    int i=0;
                    int j=0;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox);
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()-MenaceConstants.GAMMA);
                                break;
                            }
                        }
                        i+=1;
                        j+=1;
                    }
                }   break;
            default:
                if(gameStartedBySystem) {
                    
                    //TODO remove to the bead state is Needed
                    int i=0;
                    int j=0;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it    
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox);
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()-MenaceConstants.GAMMA);
                                break;
                            }
                        }
                        i+=1;
                        j+=1;
                    }
                }else{
                    
                    //TODO add to the bead state is Needed
                    int i=0;
                    int j=0;
                    while(i< menaceChosen.size()){
                        
                        //Find from the whole States and update it
                        MatchBox matchBox = null;
                        MatchingInfo matchingInfo = null;
                        for(MatchBox matchbox:menaceGame.getMenaceTrainedState().getMatchBoxes().keySet()){
                            
                            matchingInfo = StateInitializer.bothstatesAreSame(matchbox.getState().clone(),currentState.get(j).getState().clone());
                            if(matchingInfo.isMatched()){
                                matchBox = matchbox;
                                logger.info("Found MatchBox");
                                break;
                            }
                        }
                        if(matchBox==null) {
                            logger.info("Not found state :"+ StatePrinter.getStateInCSVformat(currentState.get(j).getState().clone()));
                        }
                        int move = getActualState(menaceChosen.get(i), matchingInfo.getRotations(), matchingInfo.getFlips());
                        
                        Beads beads = menaceGame.getMenaceTrainedState().getMatchBoxes().get(matchBox); 
                        for(Bead bead:beads.getPositions()) {
                            if(bead.getBoardPosition()== move){
                                bead.setCurrentCount(bead.getCurrentCount()+MenaceConstants.ALPHA);
                                break;
                            }
                        }
                        i+=1;
                        j+=1;
                    }
                }   break;
        }
        
    }
}
