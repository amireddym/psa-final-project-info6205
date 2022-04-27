/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.logic;
import businesslogic.model.MenaceGame;
import businesslogic.model.MenaceTrainedState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author manojreddy
 */
public class MenaceHumanPlayTest {
    
    @Test
    public void findActualmoveTest(){
        MenaceTrainedState menaceTrainedState = new MenaceTrainedState();
        MenaceGame menaceGameTrained=new MenaceGame(menaceTrainedState);
        MenaceHumanPlay menaceHumanPlay=new MenaceHumanPlay(menaceGameTrained);
        assertEquals(2,menaceHumanPlay.findActualmove(0, 0, 1));
    }
}
