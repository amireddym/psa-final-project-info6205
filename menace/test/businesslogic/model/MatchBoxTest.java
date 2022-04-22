/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *
 * @author anshitaverma
 */
public class MatchBoxTest {
    
    @Test
    public void getStateTest(){
        int[] state = new int[]{0,1,0,2,0,1,0,0,0};
        MatchBox mb=new MatchBox(state);
        mb.setState(state);
        assertEquals(mb.getState(),state);
    }
    
}
