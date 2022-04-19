/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;

/**
 *
 * @author manojreddy
 */
public class MatchingInfo {
    
    private boolean matched = false;
    
    private int rotations = 0;
    
    private int flips = 0;

    public MatchingInfo() {
        
    }

    public MatchingInfo(boolean matched, int rotations, int flips) {
        
        this.flips = flips;
        this.matched = matched;
        this.rotations = rotations;
    }

    public boolean isMatched() {
        return matched;
    }

    public void setMatched(boolean matched) {
        this.matched = matched;
    }

    public int getRotations() {
        return rotations;
    }

    public void setRotations(int rotations) {
        this.rotations = rotations;
    }

    public int getFlips() {
        return flips;
    }

    public void setFlips(int flips) {
        this.flips = flips;
    }
    
    public void incrementRotation() {
        this.rotations++;
    }
    
    public void decrementRotations() {
        this.rotations--;
    }
    
    public void incrementFlips() {
        this.flips++;
    }
    
    public void decrementFlips() {
        this.flips--;
    }
    
}
