/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import businesslogic.model.MenaceGame;
import businesslogic.model.MenaceTrainedState;

/**
 *
 * @author manojreddy
 */
public class CSVutil {
    
    public static void writeTrainedStatesDataToCSV(MenaceGame menaceGame) {
        
        
    }
    
    public static MenaceGame getTrainedMenaceGameFromCSV() {
        
        MenaceTrainedState menaceTrainedState = new MenaceTrainedState();
        MenaceGame menaceGame = new MenaceGame(menaceTrainedState);
        
        return menaceGame;
    }
    
}
