/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

/**
 *
 * @author manojreddy
 */
public class MenaceConstants {
    
    // Initial no of beads in the MatchBox
    public final static int ALPHA = 10;
   
    // No of Beads added to MatchBox in state of WIN
    public final static int BETA = 1;
    
    // No of Beads removed from Matchbox in state of LOSS 
    public final static int GAMMA = 1;
    
    // No of Beads adjusted in Matchbox in state of DRAW
    public final static int DELTA = 0;
    
    // String to Welcome User in UI
    public final static String GREET_USER = "Welcome to Menace";
    
    // File name to store the trained states in CSV
    public final static String MENACE_TRAINED_CONSTANTS_FILE_NAME = "trained.csv";
    
    // File name to store the training outputs in CSV
    public final static String MENACE_WINNING_STATUS_FILE_NAME = "winning.csv";
    
    // File path for the Cross Image
    public final static String CROSS_IMAGE = "images/cross.png";
    
    // File path for the Nought Image
    public final static String NOUGHT_IMAGE = "images/zero.png";
    
}
