/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import businesslogic.model.Beads;
import businesslogic.model.MatchBox;
import businesslogic.model.MatchingInfo;
import java.util.ArrayList;
import java.util.List;
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
    
    @Test
    public void getAllPossibleMatchBoxStatesTest() {
        
        List<MatchBox> matchBoxs = new ArrayList<>();
        
        Assert.assertEquals(StateInitializer.getAllPossibleMatchBoxStates(matchBoxs).size(), 0);
        matchBoxs.add(new MatchBox(new int[]{1,0,0,0,0,0,0,0,0}));
        matchBoxs.add(new MatchBox(new int[]{0,1,0,0,0,0,0,0,0}));
        matchBoxs.add(new MatchBox(new int[]{0,0,0,0,1,0,0,0,0}));
        
        Assert.assertEquals(StateInitializer.getAllPossibleMatchBoxStates(matchBoxs).size(), 764);
        
    }
    
    @Test
    public void getAllPossibleMatchBoxStates2Test() {
        
        List<MatchBox> matchBoxs = new ArrayList<>();
        
        Assert.assertEquals(StateInitializer.getAllPossibleMatchBoxStates2(matchBoxs).size(), 0);
        matchBoxs.add(new MatchBox(new int[]{1,0,0,0,0,0,0,0,0}));
        matchBoxs.add(new MatchBox(new int[]{0,1,0,0,0,0,0,0,0}));
        matchBoxs.add(new MatchBox(new int[]{0,0,0,0,1,0,0,0,0}));
        
        Assert.assertEquals(StateInitializer.getAllPossibleMatchBoxStates2(matchBoxs).size(), 849);
        
    }
    
    @Test
    public void removeDuplicatesTest() {
        
        List<MatchBox> matchBoxs = new ArrayList<>();
        matchBoxs.add(new MatchBox(new int[]{0,0,0,0,0,0,0,0,0}));
        
        Assert.assertEquals(StateInitializer.removeDuplicates(matchBoxs).size(), 1);
        
        matchBoxs.add(new MatchBox(new int[]{1,0,0,0,0,0,0,0,0}));
        Assert.assertEquals(StateInitializer.removeDuplicates(matchBoxs).size(), 2);
        
        matchBoxs.add(new MatchBox(new int[]{0,0,1,0,0,0,0,0,0}));
        Assert.assertEquals(StateInitializer.removeDuplicates(matchBoxs).size(), 2);
        
    }
    
    @Test
    public void generateNextMatchboxStatesTest() {
        
        List<MatchBox> matchBoxs = new ArrayList<>();
        matchBoxs.add(new MatchBox(new int[]{0,0,0,0,0,0,0,0,0}));
        
        List<MatchBox> states = StateInitializer.generateNextMatchboxStates(matchBoxs, 1);
        Assert.assertEquals(states.size(), 3);
        
        Assert.assertArrayEquals(states.get(0).getState(), new int[]{1,0,0,0,0,0,0,0,0});
        
    }
    
    @Test
    public void generateNextMatchboxStates2Test() {
        
        List<MatchBox> matchBoxs = new ArrayList<>();
        matchBoxs.add(new MatchBox(new int[]{0,0,0,0,0,0,0,0,0}));
        
        List<MatchBox> states = StateInitializer.generateNextMatchboxStates2(matchBoxs, 1);
        Assert.assertEquals(states.size(), 9);
        
        Assert.assertArrayEquals(states.get(0).getState(), new int[]{1,0,0,0,0,0,0,0,0});
                
    }
    
    
    @Test
    public void stateAlreadyExistsTest() {
        
        List<MatchBox> matchBoxs = new ArrayList<>();
        matchBoxs.add(new MatchBox(new int[]{0,0,0,0,0,0,0,0,0}));
        matchBoxs.add(new MatchBox(new int[]{1,0,0,0,0,0,0,0,0}));
        
        Assert.assertTrue(StateInitializer.stateAlreadyExists(matchBoxs, new int[]{0,0,0,0,0,0,0,0,0}));
        Assert.assertTrue(StateInitializer.stateAlreadyExists(matchBoxs, new int[]{0,0,1,0,0,0,0,0,0}));
        Assert.assertFalse(StateInitializer.stateAlreadyExists(matchBoxs, new int[]{0,1,0,0,0,0,0,0,0}));
    } 
    
    
    @Test
    public void bothstatesAreSame() {
        
        MatchingInfo matchingInfo = StateInitializer.bothstatesAreSame(new int[]{0,0,0,0,0,0,0,0,0}, new int[]{0,0,0,0,0,0,0,0,0});
        Assert.assertEquals(matchingInfo.getFlips(), 0);
        Assert.assertTrue(matchingInfo.isMatched());
        Assert.assertEquals(matchingInfo.getRotations(), 0);
        
        matchingInfo = StateInitializer.bothstatesAreSame(new int[]{0,0,0,0,0,0,0,0,0}, new int[]{1,0,0,0,0,0,0,0,0});
        Assert.assertFalse(matchingInfo.isMatched());
        
        matchingInfo = StateInitializer.bothstatesAreSame(new int[]{1,0,2,0,0,0,0,0,0}, new int[]{1,0,0,0,0,0,2,0,0});
        Assert.assertEquals(matchingInfo.getFlips(), 1);
        Assert.assertTrue(matchingInfo.isMatched());
        Assert.assertEquals(matchingInfo.getRotations(), 3);
        
    }
    
    @Test
    public void flipStateTest() {
        
        Assert.assertArrayEquals(StateInitializer.flipState(new int[]{0,0,0,0,0,0,0,0,0}), new int[]{0,0,0,0,0,0,0,0,0});
        Assert.assertArrayEquals(StateInitializer.flipState(new int[]{1,0,0,0,0,0,0,0,0}), new int[]{0,0,1,0,0,0,0,0,0});
        Assert.assertArrayEquals(StateInitializer.flipState(new int[]{1,2,1,2,0,0,0,0,0}), new int[]{1,2,1,0,0,2,0,0,0});
        
    }
    
    @Test
    public void rotateState90Test() {
        
        Assert.assertArrayEquals(StateInitializer.rotateState90(new int[]{0,0,0,0,0,0,0,0,0}), new int[]{0,0,0,0,0,0,0,0,0});
        Assert.assertArrayEquals(StateInitializer.rotateState90(new int[]{1,0,0,0,0,0,0,0,0}), new int[]{0,0,1,0,0,0,0,0,0});
        Assert.assertArrayEquals(StateInitializer.rotateState90(new int[]{1,2,1,2,0,0,0,0,0}), new int[]{0,2,1,0,0,2,0,0,1});

    }
    
    @Test
    public void isMatchBoxStateValidForNextMoveTest() {
        
        Assert.assertEquals(StateInitializer.isMatchBoxStateValidForNextMove(new int[]{0,0,0,0,0,0,0,0,0}), true);
        Assert.assertEquals(StateInitializer.isMatchBoxStateValidForNextMove(new int[]{1,0,2,2,1,0,0,0,1}), false);
    }
    
    @Test
    public void gameWonByWhomTest() {
        
        Assert.assertEquals(StateInitializer.gameWonByWhom(new int[]{0,0,0,0,0,0,0,0,0}), 0);
        Assert.assertEquals(StateInitializer.gameWonByWhom(new int[]{1,0,2,2,1,0,0,0,1}), 1);
        Assert.assertEquals(StateInitializer.gameWonByWhom(new int[]{1,2,1,1,2,0,0,2,0}), 2);
    }
    
    
    @Test
    public void removeNotNeededStatesTest() {
        
        List<MatchBox> matchboxes = new ArrayList<>();
        matchboxes.add(new MatchBox(new int[]{0,0,0,0,0,0,0,0,0}));
        matchboxes.add(new MatchBox(new int[]{1,0,0,0,0,0,0,0,0}));
        
        Assert.assertEquals(StateInitializer.removeNotNeededStates(matchboxes).size(), 2);
        
        matchboxes.add(new MatchBox(new int[]{1,1,1,2,2,0,0,0,0}));
        Assert.assertEquals(StateInitializer.removeNotNeededStates(matchboxes).size(), 2);
        
    }
    
    
}
