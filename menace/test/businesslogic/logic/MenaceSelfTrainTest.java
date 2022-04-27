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
public class MenaceSelfTrainTest {
    
    @Test
    public void sumOfStateTest(){
        MenaceTrainedState menaceTrainedState = new MenaceTrainedState();
        MenaceGame menaceGame=new MenaceGame(menaceTrainedState);
        int iterations=0;
        MenaceSelfTrain menaceSelfTrain=new MenaceSelfTrain(menaceGame,iterations);
        int[] state={0,0,0,0,0,0,0,0,0};
        assertEquals(0,menaceSelfTrain.sumOfState(state));
        int[] state2={0,1,0,2,0,0,0,0,0};
        assertEquals(3,menaceSelfTrain.sumOfState(state2));
    }
    
    @Test
    public void findActualmoveTest(){
        MenaceTrainedState menaceTrainedState = new MenaceTrainedState();
        MenaceGame menaceGame=new MenaceGame(menaceTrainedState);
        int iterations=0;
        MenaceSelfTrain menaceSelfTrain=new MenaceSelfTrain(menaceGame,iterations);
        assertEquals(2,menaceSelfTrain.findActualmove(0, 0, 1));
    }
}
