/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;

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

    @Override
    public boolean equals(Object obj) {
        
        logger.info("Called equals method to evaluate Equality");
        MatchBox matchBox = (MatchBox)obj;
        for(int i=0; i<getState().length; i++) {
            if(matchBox.getState()[i]!= getState()[i] ){
                return false;
            }
        }
        return true;
    }
    
    
    
}
