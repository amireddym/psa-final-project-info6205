/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package businesslogic.util;

import businesslogic.model.Bead;
import businesslogic.model.Beads;
import businesslogic.model.MatchBox;
import businesslogic.model.MenaceGame;
import businesslogic.model.MenaceTrainedState;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author manojreddy
 */
public class CSVutil {
    
    private static final Logger logger = LoggerFactory.getLogger(CSVutil.class);
    
    public static void writeTrainedStatesDataToCSV(MenaceGame menaceGame) {
        
        //TODO add code to write states in CSV in state,beads pattern
        MenaceTrainedState menaceTrainedState = menaceGame.getMenaceTrainedState();
        Map<MatchBox, Beads> stateMaps = menaceTrainedState.getMatchBoxes();
        
        Set<MatchBox> matchBoxSet = stateMaps.keySet();
        
        try {
            FileWriter fw = new FileWriter(MenaceConstants.MENACE_TRAINED_CONSTANTS_FILE_NAME, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw);

            for(MatchBox matchBox: matchBoxSet) {
                
                String state = StatePrinter.getStateInCSVformat(matchBox.getState()) + "," 
                        + StatePrinter.getBeadsInCSVformat(stateMaps.get(matchBox));
                out.println(state);

            }
            
            bw.close();
            fw.close();
            
        }catch(Exception e) {
            
            logger.info("Error saving Trained states in a CSV file");
            logger.info(e.getMessage());
            
        }
        
    }
    
    public static MenaceGame getTrainedMenaceGameFromCSV() {
        
        MenaceTrainedState menaceTrainedState = new MenaceTrainedState();
        MenaceGame menaceGame = new MenaceGame(menaceTrainedState);
        
        File file = new File(MenaceConstants.MENACE_TRAINED_CONSTANTS_FILE_NAME);
        if(!file.exists()) {
            
            logger.info("State file dosent exist at :: "+ file.getAbsolutePath());
            try {
                file.createNewFile();
                menaceGame = InitilaizeGame.initialize();
                logger.info("Size before writing to file ::: "+menaceGame.getMenaceTrainedState().getMatchBoxes().entrySet().size());
                writeTrainedStatesDataToCSV(menaceGame);
            } catch (IOException ex) {
                logger.error("Not able to Create file");
            }
        }else {
        
            FileReader fr = null;
            BufferedReader br = null;

            Map<MatchBox,Beads> stateMaps= new HashMap<>();

            try {

                fr = new FileReader(file);
                br = new BufferedReader(fr);
                while(br.ready()) {
                    String[] line = br.readLine().split(",");

                    MatchBox matchBox = getMatchBoxStateFromCsv(line);
                    Beads beads = getBeadsStateFromCsv(line);
                    stateMaps.put(matchBox, beads);
                }
                
                menaceTrainedState.setMatchBoxes(stateMaps);

            } catch(Exception e) {

            } finally {
                try{
                    fr.close();
                    br.close();
                }catch(Exception e){

                    logger.error("Error closing file");
                    logger.info("Error from exception :: "+ e.getMessage());
                }
            }
        }
        
        logger.info("Found states on the file are ::: "+ menaceGame.getMenaceTrainedState().getMatchBoxes().keySet().size());
        return menaceGame;
    }
    
    private static MatchBox getMatchBoxStateFromCsv(String[] csvState) {
        
        int[] state = new int[9];
        for(int i=0; i<9;i++) {
            state[i] = Integer.valueOf(csvState[i]);
        }
        return new MatchBox(state);
    }
    
    private static Beads getBeadsStateFromCsv(String[] csvState) {
        
        Beads beads  = new Beads();
        List<Bead> beadList = new ArrayList<>();
        for(int i=0;i<9;i++) {
            
            if(Integer.valueOf(csvState[i+9]).intValue()!=0) { 
                Bead bead = new Bead(i,Integer.valueOf(csvState[i+9]));
                beadList.add(bead);
            }
        }
        beads.setPositions(beadList);
        return beads;
    }
    
}
