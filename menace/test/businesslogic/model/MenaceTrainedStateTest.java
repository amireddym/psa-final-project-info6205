/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 *
 * @author anshitaverma
 */
public class MenaceTrainedStateTest {
    
    @Test
    public void getMatchBoxesTest(){
        MenaceTrainedState menaceTrainedState = new MenaceTrainedState();
        Map<MatchBox,Beads> menaceTrainedStateMap= menaceTrainedStateObjects();
        menaceTrainedState.setMatchBoxes(menaceTrainedStateMap);
        assertEquals(menaceTrainedState.getMatchBoxes(),menaceTrainedStateMap);
    }
    
    public Map<MatchBox,Beads> menaceTrainedStateObjects(){
        Map<MatchBox,Beads> map= new HashMap<>();
        
        int[] state = new int[]{0,0,0,0,0,0,0,0,0};
        MatchBox matchbox=new MatchBox(state);
        
        int[] positions = new int[]{0,1,2,3,4,5,6,7,8}; 
        
        List<Bead> beadList= new ArrayList<>();
        
        for(int pos: positions){
            beadList.add(new Bead(pos));
        }
        
        Beads beads= new Beads();
        beads.setPositions(beadList);
        
        map.put(matchbox, beads);
       
        return map;
    }
    
}
