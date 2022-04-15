/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;

import businesslogic.util.MenaceConstants;

/**
 *
 * @author manojreddy
 */
public class Bead {
    
    int boardPosition;
    
    int currentCount = MenaceConstants.ALPHA;

    public int getBoardPosition() {
        return boardPosition;
    }

    public void setBoardPosition(int boardPosition) {
        this.boardPosition = boardPosition;
    }

    public int getCurrentCount() {
        return currentCount;
    }

    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }

    public Bead(int boardPosition) {
        this.boardPosition = boardPosition;
    }
    
    public Bead(int boardPosition, int currentCount) {
        this.boardPosition = boardPosition;
        this.currentCount = currentCount;
    }

}
