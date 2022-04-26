/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 *
 * @author anshitaverma
 */
public class MatchingInfoTest {
    
    @Test
    public void isMatchedTest(){
        boolean matched=true;
        MatchingInfo matchingInfo = new MatchingInfo();
        matchingInfo.setMatched(matched);
        assertTrue(matchingInfo.isMatched());
    }
    
    @Test
    public void getRotationsTest(){
        int rotations=0;
        MatchingInfo matchingInfo = new MatchingInfo();
        matchingInfo.setRotations(rotations);
        assertEquals(matchingInfo.getRotations(),rotations);
    }
    
    @Test
    public void getFlipsTest(){
        int flips=0;
        MatchingInfo matchingInfo = new MatchingInfo();
        matchingInfo.setFlips(flips);
        assertEquals(matchingInfo.getFlips(),flips);
    }
    
}
