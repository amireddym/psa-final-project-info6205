/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

/**
 *
 * @author manojreddy
 */
public class StatePrinter {
    
    public static String getCurrentStateInString(int[] state) {
        
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i < state.length; i ++) {
            stringBuilder.append(state[i]);
            stringBuilder.append("-");
        }
        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        return stringBuilder.toString();
    }
    
}
