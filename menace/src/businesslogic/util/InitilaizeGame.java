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
        matchBoxStates.add(new MatchBox(new int[]{1,0,0,0,0,0,0,0,0}));
        matchBoxStates.add(new MatchBox(new int[]{0,1,0,0,0,0,0,0,0}));
        matchBoxStates.add(new MatchBox(new int[]{0,0,0,0,1,0,0,0,0}));
        
        matchBoxStates = StateInitializer.getAllPossibleMatchBoxStates(matchBoxStates);
        Map<MatchBox,Beads> matchBoxes = StateInitializer.generateAllInitialMatchBoxStates(matchBoxStates);
        menaceTrainedState.setMatchBoxes(matchBoxes);
        MenaceGame menaceGame = new MenaceGame(menaceTrainedState);
        
        return menaceGame;
    }
    
}
