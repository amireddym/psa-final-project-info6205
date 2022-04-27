/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.logic;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author manojreddy
 */
public class MenaceStateUpdaterTest {
    
    @Test
    public void getActualStateTest(){
        assertEquals(2,MenaceStateUpdater.getActualState(0, 0, 1));
        assertEquals(5,MenaceStateUpdater.getActualState(1, 1, 1));
        assertEquals(3,MenaceStateUpdater.getActualState(7, 1, 1));
    }
}
