/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import businesslogic.model.Bead;
import businesslogic.model.Beads;
import businesslogic.model.MatchBox;
import businesslogic.model.MenaceGame;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import static org.junit.Assert.assertNotNull;
import org.junit.Test;
/**
 *
 * @author manojreddy
 */
public class InitializeGameTest {
    
    @Test
    public void initializeTest(){
        MenaceGame menaceGame= InitilaizeGame.initialize();
        assertNotNull(menaceGame);
        assertNotNull(menaceGame.getMenaceTrainedState());
        assertNotNull(menaceGame.getMenaceTrainedState().getMatchBoxes());
        Assert.assertEquals(menaceGame.getMenaceTrainedState().getMatchBoxes().size(), 631);
    }
    
    @Test
    public void addaddInitalState() {
        
        Map<MatchBox, Beads> matchBoxes = new HashMap<>();
        InitilaizeGame.addInitalState(matchBoxes);
        MatchBox matchBox = matchBoxes.keySet().stream().findFirst().get();
        Assert.assertEquals(matchBox.getState().length,9);
        for(int i=0;i<9;i++) {
            Assert.assertTrue(matchBox.getState()[i]==0);
        }
        
        Beads beads = matchBoxes.get(matchBox);
        Assert.assertEquals(beads.getPositions().size(), 3);
        List<Bead> beadList = beads.getPositions();
        Assert.assertEquals(beadList.get(0).getBoardPosition(), 0);
        Assert.assertEquals(beadList.get(1).getBoardPosition(), 1);
        Assert.assertEquals(beadList.get(2).getBoardPosition(), 4);
        
        Assert.assertEquals(beadList.get(0).getCurrentCount(), MenaceConstants.ALPHA);
        Assert.assertEquals(beadList.get(1).getCurrentCount(), MenaceConstants.ALPHA);
        Assert.assertEquals(beadList.get(2).getCurrentCount(), MenaceConstants.ALPHA);
        
    }
}
