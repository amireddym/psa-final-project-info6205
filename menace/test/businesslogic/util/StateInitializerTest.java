/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import businesslogic.model.Beads;
import businesslogic.model.MatchBox;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author manojreddy
 */
public class StateInitializerTest {
    
    @Test
    public void generateDefaultBeadsFromMatchboxStateTest() {
        
        MatchBox matchBox = new MatchBox(new int[9]);
        Assert.assertEquals(StateInitializer.generateDefaultBeadsFromMatchboxState(matchBox).getPositions().size(),9);
        Beads beads  = StateInitializer.generateDefaultBeadsFromMatchboxState(matchBox);
        Assert.assertEquals(beads.getPositions().get(0).getBoardPosition(), 0);
        Assert.assertEquals(beads.getPositions().get(1).getBoardPosition(), 1);
        Assert.assertEquals(beads.getPositions().get(2).getBoardPosition(), 2);
        Assert.assertEquals(beads.getPositions().get(3).getBoardPosition(), 3);
        Assert.assertEquals(beads.getPositions().get(4).getBoardPosition(), 4);
        Assert.assertEquals(beads.getPositions().get(5).getBoardPosition(), 5);
        Assert.assertEquals(beads.getPositions().get(6).getBoardPosition(), 6);
        Assert.assertEquals(beads.getPositions().get(7).getBoardPosition(), 7);
        Assert.assertEquals(beads.getPositions().get(8).getBoardPosition(), 8);
        
        Assert.assertEquals(beads.getPositions().get(0).getCurrentCount(), MenaceConstants.ALPHA);
        Assert.assertEquals(beads.getPositions().get(1).getCurrentCount(), MenaceConstants.ALPHA);
        Assert.assertEquals(beads.getPositions().get(2).getCurrentCount(), MenaceConstants.ALPHA);
        Assert.assertEquals(beads.getPositions().get(3).getCurrentCount(), MenaceConstants.ALPHA);
        Assert.assertEquals(beads.getPositions().get(4).getCurrentCount(), MenaceConstants.ALPHA);
        Assert.assertEquals(beads.getPositions().get(5).getCurrentCount(), MenaceConstants.ALPHA);
        Assert.assertEquals(beads.getPositions().get(6).getCurrentCount(), MenaceConstants.ALPHA);
        Assert.assertEquals(beads.getPositions().get(7).getCurrentCount(), MenaceConstants.ALPHA);
        Assert.assertEquals(beads.getPositions().get(8).getCurrentCount(), MenaceConstants.ALPHA);
        
        
    }
    
    
    
}
