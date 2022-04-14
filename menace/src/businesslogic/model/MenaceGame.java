/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.model;

/**
 *
 * @author manojreddy
 */
public class MenaceGame {
    
    private MenaceTrainedState menaceTrainedState;

    public MenaceGame(MenaceTrainedState menaceTrainedState) {
        this.menaceTrainedState = menaceTrainedState;
    }

    public MenaceTrainedState getMenaceTrainedState() {
        return menaceTrainedState;
    }

    public void setMenaceTrainedState(MenaceTrainedState menaceTrainedState) {
        this.menaceTrainedState = menaceTrainedState;
    }
    
}
