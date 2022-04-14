/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author manojreddy
 */
public class StatePrinter {
    
    private static final Logger logger  = LoggerFactory.getLogger(StatePrinter.class);
    
    public static String getCurrentStateInString(int[] state) {
        
        logger.info("Getting state in the String format");
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < state.length; i ++) {
            stringBuilder.append(state[i]);
            stringBuilder.append("-");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
    
    public static void printState(int[] state) {
        
        logger.info("Printing state in the Game format");
        char[] stateChars = new char[9];
        for(int i=0;i<9;i++) {
            if(state[i]==0) {
                stateChars[i]= '-';
            }
            if(state[i]==1) {
                stateChars[i]= 'X';
            }
            if(state[i]==2) {
                stateChars[i]= '0';
            }
        }
        
        System.out.println(" " + stateChars[0] + " | " + stateChars[1] + " | " + stateChars[2] );
        System.out.println("----------");
        System.out.println(" " + stateChars[3] + " | " + stateChars[4] + " | " + stateChars[5] );
        System.out.println("----------");
        System.out.println(" " + stateChars[6] + " | " + stateChars[7] + " | " + stateChars[8] );
        
        
        
    }
    
}
