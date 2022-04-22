/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;


import businesslogic.util.MenaceConstants;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author anshitaverma
 */
public class BeadTest {
    
    @Test
    public void getBoardPositionTest(){
        
        Bead bead=new Bead(3);
        assertEquals(bead.getBoardPosition(),3);
        assertEquals(bead.getCurrentCount(), MenaceConstants.ALPHA);
    }
    
    @Test
    public void constructorTest() {
        
        Bead bead = new Bead(3,5);
        assertEquals(bead.getBoardPosition(), 3);
        assertEquals(bead.getCurrentCount(), 5);
        
    }
    
    @Test
    public void getSetTests() {
        
        Bead bead = new Bead(3,5);
        bead.setBoardPosition(2);
        bead.setCurrentCount(10);
        assertEquals(bead.getBoardPosition(), 2);
        assertEquals(bead.getCurrentCount(), 10);
    }
    
}
