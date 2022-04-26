/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author anshitaverma
 */
public class BeadsTest {
    
    @Test
    public void getPositionsTest(){
        List<Bead> positions = new ArrayList<>();
        //add list
        Beads beads =new Beads();
        beads.setPositions(positions);
        assertEquals(beads.getPositions(),positions);
    }
    
}
