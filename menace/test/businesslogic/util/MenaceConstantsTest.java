/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 * @author manojreddy
 */
public class MenaceConstantsTest {
    
    @Test
    public void alphaValueTest(){
        assertEquals(10,MenaceConstants.ALPHA);
    }
    
    @Test
    public void betaValueTest(){
        assertEquals(1,MenaceConstants.BETA);
    }
    
    @Test
    public void gammaValueTest(){
        assertEquals(1,MenaceConstants.GAMMA);
    }
    
    @Test
    public void deltaValueTest(){
        assertEquals(0,MenaceConstants.DELTA);
    }
    
    @Test
    public void greet_userValueTest(){
        assertEquals("Welcome to Menace",MenaceConstants.GREET_USER);
    }
    
    @Test
    public void menace_trained_constanst_file_nameValueTest(){
        assertEquals("trained.csv",MenaceConstants.MENACE_TRAINED_CONSTANTS_FILE_NAME);
    }
    
    @Test
    public void cross_imageValueTest(){
        assertEquals("images/cross.png",MenaceConstants.CROSS_IMAGE);
    }
    
    @Test
    public void nought_imageValueTest(){
        assertEquals("images/zero.png",MenaceConstants.NOUGHT_IMAGE);
    }
    
}
