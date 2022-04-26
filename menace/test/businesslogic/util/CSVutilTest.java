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
public class CSVutilTest {
    
    @Test
    public void getMatchBoxStateFromCsvTest() {
        
        String[] csvState = new String[]{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"};
        MatchBox matchBox = CSVutil.getMatchBoxStateFromCsv(csvState);
        Assert.assertNotNull(matchBox);
        Assert.assertArrayEquals(matchBox.getState(), new int[]{0,0,0,0,0,0,0,0,0});
        csvState[1] = "1";
        matchBox = CSVutil.getMatchBoxStateFromCsv(csvState);
        Assert.assertArrayEquals(matchBox.getState(), new int[]{0,1,0,0,0,0,0,0,0});
    }
    
    @Test
    public void getBeadsStateFromCsvTest() {
        
        String[] csvState = new String[]{"0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0","0"};
        Beads beads = CSVutil.getBeadsStateFromCsv(csvState);
        Assert.assertNotNull(beads);
        Assert.assertEquals(beads.getPositions().size(), 0);
        
        csvState[9]="5";
        beads = CSVutil.getBeadsStateFromCsv(csvState);
        Assert.assertEquals(beads.getPositions().size(), 1);
        Assert.assertEquals(beads.getPositions().get(0).getBoardPosition(), 0);
        Assert.assertEquals(beads.getPositions().get(0).getCurrentCount(), 5);
    }
    
}
