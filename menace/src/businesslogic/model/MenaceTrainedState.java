/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author manojreddy
 */
public class MenaceTrainedState {
    
    private Map<MatchBox, Beads> matchBoxes = new HashMap<>();

    public Map<MatchBox, Beads> getMatchBoxes() {
        return matchBoxes;
    }

    public void setMatchBoxes(Map<MatchBox, Beads> matchBoxes) {
        this.matchBoxes = matchBoxes;
    }
    
}
