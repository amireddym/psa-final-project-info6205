/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import businesslogic.model.Bead;
import businesslogic.model.Beads;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author manojreddy
 */
public class StatePrinterTest {
    
    @Test
    public void getCurrentStateInStringTest(){
        int[] state = new int[]{0,1,0,2,0,1,0,0,0};
        String expected=getCurrentStateInStringValue(state);
        assertEquals(expected,StatePrinter.getCurrentStateInString(state));
        
    }
    
    @Test
    public void getStateInCSVformatTest(){
        int[] state = new int[]{0,1,0,2,0,1,0,0,0};
        String expected="0,1,0,2,0,1,0,0,0";
        assertEquals(expected,StatePrinter.getStateInCSVformat(state));
    }
    
    @Test
    public void getBeadsInCSVformatTest(){
        
        Beads beads = new Beads();
        String desired = StatePrinter.getBeadsInCSVformat(beads);
        assertEquals(desired, "0,0,0,0,0,0,0,0,0");
        
        beads.getPositions().add(new Bead(1));
        desired = StatePrinter.getBeadsInCSVformat(beads);
        assertEquals(desired, "0,10,0,0,0,0,0,0,0");
        
        beads.getPositions().add(new Bead(0));
        desired = StatePrinter.getBeadsInCSVformat(beads);
        assertEquals(desired, "10,10,0,0,0,0,0,0,0");
        
        beads.getPositions().add(new Bead(2));
        desired = StatePrinter.getBeadsInCSVformat(beads);
        assertEquals(desired, "10,10,10,0,0,0,0,0,0");
        
        beads.getPositions().add(new Bead(3));
        desired = StatePrinter.getBeadsInCSVformat(beads);
        assertEquals(desired, "10,10,10,10,0,0,0,0,0");
        
        beads.getPositions().add(new Bead(4));
        desired = StatePrinter.getBeadsInCSVformat(beads);
        assertEquals(desired, "10,10,10,10,10,0,0,0,0");
        
        beads.getPositions().add(new Bead(5));
        desired = StatePrinter.getBeadsInCSVformat(beads);
        assertEquals(desired, "10,10,10,10,10,10,0,0,0");
        
        beads.getPositions().add(new Bead(6));
        desired = StatePrinter.getBeadsInCSVformat(beads);
        assertEquals(desired, "10,10,10,10,10,10,10,0,0");
        
        beads.getPositions().add(new Bead(7));
        desired = StatePrinter.getBeadsInCSVformat(beads);
        assertEquals(desired, "10,10,10,10,10,10,10,10,0");
        
        beads.getPositions().add(new Bead(8));
        desired = StatePrinter.getBeadsInCSVformat(beads);
        assertEquals(desired, "10,10,10,10,10,10,10,10,10");
        
    }
    
    
    public String getCurrentStateInStringValue(int[] state){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < state.length; i ++) {
            stringBuilder.append(state[i]);
            stringBuilder.append("-");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
    
    
}
