/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.logic;

import businesslogic.model.MatchBox;
import businesslogic.model.MenaceGame;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manojreddy
 */
public class MenaceHumanPlay {
    
    private MenaceGame menaceGameTrained;
    
    private List<MatchBox> currentState = new ArrayList<>();
    
    private List<Integer> menaceChosen = new ArrayList<>();

    public MenaceHumanPlay(MenaceGame menaceGameTrained) {
        this.menaceGameTrained = menaceGameTrained;
    }
    
    
}
