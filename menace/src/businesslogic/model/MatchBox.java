/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;

import businesslogic.util.StateInitializer;
import businesslogic.util.StatePrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author manojreddy
 */
public class MatchBox {
    
    private static final Logger logger  = LoggerFactory.getLogger(MatchBox.class);
    
    private int[] state = new int[]{0,0,0,0,0,0,0,0,0};

    public MatchBox(int[] state) {
        this.state = state;
    }

    public int[] getState() {
        return state;
    }

    public void setState(int[] state) {
        this.state = state;
    }

    @Override
    public String toString() {
        
        return StatePrinter.getCurrentStateInString(getState());
    }
    
    //TODO Need to update the function
    @Override
    public int hashCode() {
        
        int power = 1;
        int hash = 0;
        for(int i=0;i<9;i++) {
            hash = hash + power*state[i];
            power*=7;
        }
        return hash; 
    }

    @Override
    public boolean equals(Object obj) {
        
        MatchBox matchBox = (MatchBox) obj;
        return StateInitializer.bothstatesAreSame(state.clone(), matchBox.getState().clone()).isMatched(); 
    }
    
    
    
}
