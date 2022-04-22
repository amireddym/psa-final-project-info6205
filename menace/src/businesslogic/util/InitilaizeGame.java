/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import businesslogic.model.Beads;
import businesslogic.model.MatchBox;
import businesslogic.model.MenaceGame;
import businesslogic.model.MenaceTrainedState;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author manojreddy
 */
public class InitilaizeGame {
    
    private final static Logger logger = LoggerFactory.getLogger(InitilaizeGame.class);
    
    public static MenaceGame initialize() {
        
        logger.info("Creating basic default Menace game state without any training");
        MenaceTrainedState menaceTrainedState = new MenaceTrainedState();
        List<MatchBox> matchBoxStates = new ArrayList<>();
        
        logger.info("Adding inital starting states of matchboxes to list");
        matchBoxStates.add(new MatchBox(new int[]{1,0,0,0,0,0,0,0,0}));
        matchBoxStates.add(new MatchBox(new int[]{0,1,0,0,0,0,0,0,0}));
        matchBoxStates.add(new MatchBox(new int[]{0,0,0,0,1,0,0,0,0}));
        
        logger.info("Getting all possible states of the matchBoxes");
        matchBoxStates = StateInitializer.getAllPossibleMatchBoxStates2(matchBoxStates);
        logger.info("Found no of MatchBox states ::: " + matchBoxStates.size());
        
//        for(MatchBox matchBox: matchBoxStates) {
//            System.out.println(matchBox.hashCode());
//        }
        // Removing won states
        matchBoxStates = StateInitializer.removeNotNeededStates(matchBoxStates);
        logger.info("Final no of MatchBox states ::: " + matchBoxStates.size());
        
        logger.info("Adding all Bead states to the corresponding matchBox in a HashMap");
        Map<MatchBox,Beads> matchBoxes = StateInitializer.generateAllInitialMatchBoxStates(matchBoxStates);
        menaceTrainedState.setMatchBoxes(matchBoxes);
        MenaceGame menaceGame = new MenaceGame(menaceTrainedState);
        
        logger.info("Done creating all the MatchBox states and possible Beads");
        return menaceGame;
    }
    
}
