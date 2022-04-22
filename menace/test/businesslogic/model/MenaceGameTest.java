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
public class MenaceGameTest {
    
    @Test
    public void getMenaceTrainedStateTest(){
        MenaceTrainedState menaceTrainedState = new MenaceTrainedState();
        MenaceGame menaceGame= new MenaceGame(menaceTrainedState);
        menaceGame.setMenaceTrainedState(menaceTrainedState);
        assertEquals(menaceGame.getMenaceTrainedState(),menaceTrainedState);
    }
    
    
}
