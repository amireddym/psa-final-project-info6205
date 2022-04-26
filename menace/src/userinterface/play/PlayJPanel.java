/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.play;

import businesslogic.logic.MenaceHumanPlay;
import businesslogic.model.MenaceGame;
import businesslogic.util.MenaceConstants;
import businesslogic.util.StateInitializer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author anshitaverma
 */
public class PlayJPanel extends javax.swing.JPanel {
    
    private final static Logger logger = LoggerFactory.getLogger(PlayJPanel.class);
    
    private MenaceGame menaceGame;
    
    private int whoStarts = -1;
    
    private int[] states = new int[9];
    
    private MenaceHumanPlay menaceHumanPlay;
    
    public PlayJPanel(MenaceGame menaceGame) {
        
        this.menaceGame=menaceGame;
        states = new int[9];
        menaceHumanPlay = new MenaceHumanPlay(menaceGame);
        whoStarts = JOptionPane.showConfirmDialog(this, this, "Do you want to StartFirst", 0);
        logger.info("User chosen :: "+ whoStarts);
        while(whoStarts==-1) {
            logger.info("User closed the Dialog Window");
            whoStarts = JOptionPane.showConfirmDialog(this, this, "Do you want to StartFirst", 0);
        }
        initComponents();
        
        if(whoStarts==0) {
            logger.info("User has chosen to play first");
            
        }else{
            logger.info("System is going to play first");
            // run system making move function here once
            int index = menaceHumanPlay.makeMove(states, whoStarts);
            states[index]= 1;
            play(index, true);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gamejLabel = new javax.swing.JLabel();
        zerojLabel = new javax.swing.JLabel();
        onejLabel = new javax.swing.JLabel();
        twojLabel = new javax.swing.JLabel();
        fivejLabel = new javax.swing.JLabel();
        threejLabel = new javax.swing.JLabel();
        fourjLabel = new javax.swing.JLabel();
        eightjLabel = new javax.swing.JLabel();
        sixjLabel = new javax.swing.JLabel();
        sevenjLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        gamejLabel.setFont(new java.awt.Font("Helvetica Neue", 3, 36)); // NOI18N
        gamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamejLabel.setText("Welcome Back to Menace");

        zerojLabel.setBackground(new java.awt.Color(153, 153, 153));
        zerojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        zerojLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        zerojLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                zerojLabelMouseClicked(evt);
            }
        });

        onejLabel.setBackground(new java.awt.Color(153, 153, 153));
        onejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        onejLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        onejLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onejLabelMouseClicked(evt);
            }
        });

        twojLabel.setBackground(new java.awt.Color(153, 153, 153));
        twojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        twojLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        twojLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twojLabelMouseClicked(evt);
            }
        });

        fivejLabel.setBackground(new java.awt.Color(153, 153, 153));
        fivejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fivejLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        fivejLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fivejLabelMouseClicked(evt);
            }
        });

        threejLabel.setBackground(new java.awt.Color(153, 153, 153));
        threejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        threejLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        threejLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                threejLabelMouseClicked(evt);
            }
        });

        fourjLabel.setBackground(new java.awt.Color(153, 153, 153));
        fourjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fourjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        fourjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fourjLabelMouseClicked(evt);
            }
        });

        eightjLabel.setBackground(new java.awt.Color(153, 153, 153));
        eightjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eightjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        eightjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eightjLabelMouseClicked(evt);
            }
        });

        sixjLabel.setBackground(new java.awt.Color(153, 153, 153));
        sixjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sixjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        sixjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sixjLabelMouseClicked(evt);
            }
        });

        sevenjLabel.setBackground(new java.awt.Color(153, 153, 153));
        sevenjLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sevenjLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        sevenjLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sevenjLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(zerojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(threejLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sixjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sevenjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fivejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(gamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 669, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eightjLabel, fivejLabel, fourjLabel, onejLabel, sevenjLabel, sixjLabel, threejLabel, twojLabel, zerojLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(gamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zerojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fivejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sixjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sevenjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eightjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(145, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eightjLabel, fivejLabel, fourjLabel, onejLabel, sevenjLabel, sixjLabel, threejLabel, twojLabel, zerojLabel});

    }// </editor-fold>//GEN-END:initComponents

    private void zerojLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_zerojLabelMouseClicked
        // TODO add your handling code here:
        
        if(!ifStatePossible(states,0)){
            JOptionPane.showMessageDialog(this, "Please Choose a valid position");
            return;
        }
        
        play(0,false);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You WON");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
        //Make a move by SYSTEM
        int index = menaceHumanPlay.makeMove(states, whoStarts);
        if(whoStarts==0){
            states[index]=2;
        }else{
            states[index]=1;
        }
        
        //Put system image in ui
        play(index, true);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You LOST");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }        
        
    }//GEN-LAST:event_zerojLabelMouseClicked

    private void onejLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onejLabelMouseClicked
        // TODO add your handling code here:
        if(!ifStatePossible(states,1)){
            JOptionPane.showMessageDialog(this, "Please Choose a valid position");
            return;
        }
        play(1,false);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You WON");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
        //Make a move by SYSTEM
        int index = menaceHumanPlay.makeMove(states, whoStarts);
        if(whoStarts==0){
            states[index]=2;
        }else{
            states[index]=1;
        }
        
        //Put system image in ui
        play(index, true);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You LOST");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
    }//GEN-LAST:event_onejLabelMouseClicked

    private void twojLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twojLabelMouseClicked
        // TODO add your handling code here:
        if(!ifStatePossible(states,2)){
            JOptionPane.showMessageDialog(this, "Please Choose a valid position");
            return;
        }
        play(2,false);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You WON");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
        //Make a move by SYSTEM
        int index = menaceHumanPlay.makeMove(states, whoStarts);
        if(whoStarts==0){
            states[index]=2;
        }else{
            states[index]=1;
        }
        
        //Put system image in ui
        play(index, true);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You LOST");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
    }//GEN-LAST:event_twojLabelMouseClicked

    private void threejLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_threejLabelMouseClicked
        // TODO add your handling code here:
        if(!ifStatePossible(states,3)){
            JOptionPane.showMessageDialog(this, "Please Choose a valid position");
            return;
        }
        play(3,false);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You WON");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
        //Make a move by SYSTEM
        int index = menaceHumanPlay.makeMove(states, whoStarts);
        if(whoStarts==0){
            states[index]=2;
        }else{
            states[index]=1;
        }
        
        //Put system image in ui
        play(index, true);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You LOST");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
    }//GEN-LAST:event_threejLabelMouseClicked

    private void fourjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fourjLabelMouseClicked
        // TODO add your handling code here:
        if(!ifStatePossible(states,4)){
            JOptionPane.showMessageDialog(this, "Please Choose a valid position");
            return;
        }
        play(4,false);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You WON");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
        //Make a move by SYSTEM
        int index = menaceHumanPlay.makeMove(states, whoStarts);
        if(whoStarts==0){
            states[index]=2;
        }else{
            states[index]=1;
        }
        
        //Put system image in ui
        play(index, true);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You LOST");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
    }//GEN-LAST:event_fourjLabelMouseClicked

    private void fivejLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fivejLabelMouseClicked
        // TODO add your handling code here:
        if(!ifStatePossible(states,5)){
            JOptionPane.showMessageDialog(this, "Please Choose a valid position");
            return;
        }
        play(5,false);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You WON");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
        //Make a move by SYSTEM
        int index = menaceHumanPlay.makeMove(states, whoStarts);
        if(whoStarts==0){
            states[index]=2;
        }else{
            states[index]=1;
        }
        
        //Put system image in ui
        play(index, true);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You LOST");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
    }//GEN-LAST:event_fivejLabelMouseClicked

    private void sixjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sixjLabelMouseClicked
        // TODO add your handling code here:
        if(!ifStatePossible(states,6)){
            JOptionPane.showMessageDialog(this, "Please Choose a valid position");
            return;
        }
        play(6,false);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You WON");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
        //Make a move by SYSTEM
        int index = menaceHumanPlay.makeMove(states, whoStarts);
        if(whoStarts==0){
            states[index]=2;
        }else{
            states[index]=1;
        }
        
        //Put system image in ui
        play(index, true);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You LOST");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
    }//GEN-LAST:event_sixjLabelMouseClicked

    private void sevenjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sevenjLabelMouseClicked
        // TODO add your handling code here:
        if(!ifStatePossible(states,7)){
            JOptionPane.showMessageDialog(this, "Please Choose a valid position");
            return;
        }
        play(7,false);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You WON");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
        //Make a move by SYSTEM
        int index = menaceHumanPlay.makeMove(states, whoStarts);
        if(whoStarts==0){
            states[index]=2;
        }else{
            states[index]=1;
        }
        
        //Put system image in ui
        play(index, true);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You LOST");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
    }//GEN-LAST:event_sevenjLabelMouseClicked

    private void eightjLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eightjLabelMouseClicked
        // TODO add your handling code here:
        if(!ifStatePossible(states,8)){
            JOptionPane.showMessageDialog(this, "Please Choose a valid position");
            return;
        }
        play(8,false);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You WON");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
        //Make a move by SYSTEM
        int index = menaceHumanPlay.makeMove(states, whoStarts);
        if(whoStarts==0){
            states[index]=2;
        }else{
            states[index]=1;
        }
        
        //Put system image in ui
        play(index, true);
        if(isGameOver()){
            JOptionPane.showMessageDialog(this, "You LOST");
            reset();
            return;
        }
        
        if(!isNextMovePossible()){
            
            JOptionPane.showMessageDialog(this, "Its a DRAW");
            reset();
            return;
        }
        
    }//GEN-LAST:event_eightjLabelMouseClicked

    private void reset() {
        
        //Train the SYSTEM
        menaceHumanPlay.updateMenaceBeadsToTrain(menaceGame,whoStarts, true);
        states = new int[9];
        resetImages();
        menaceHumanPlay = new MenaceHumanPlay(menaceGame);
        
        
    }
    
    private void resetImages() {
        
        zerojLabel.setIcon(null);
        onejLabel.setIcon(null);
        twojLabel.setIcon(null);
        threejLabel.setIcon(null);
        fourjLabel.setIcon(null);
        fivejLabel.setIcon(null);
        sixjLabel.setIcon(null);
        sevenjLabel.setIcon(null);
        eightjLabel.setIcon(null);
        
    }
    
    private boolean isNextMovePossible() {
        
        int sum = 0;
        for(int i=0;i<9;i++) {
            sum+=states[i];
        }
        if(sum==13){
            return false;
        }
        return true;
    }
    
    public boolean isGameOver() {
        
        int gameWon = StateInitializer.gameWonByWhom(states);
        if(gameWon==0) {
            return false;
        }
        return true;
    }
    
    private boolean ifStatePossible(int[] states, int index) {
        
        return states[index]==0;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eightjLabel;
    private javax.swing.JLabel fivejLabel;
    private javax.swing.JLabel fourjLabel;
    private javax.swing.JLabel gamejLabel;
    private javax.swing.JLabel onejLabel;
    private javax.swing.JLabel sevenjLabel;
    private javax.swing.JLabel sixjLabel;
    private javax.swing.JLabel threejLabel;
    private javax.swing.JLabel twojLabel;
    private javax.swing.JLabel zerojLabel;
    // End of variables declaration//GEN-END:variables

    private void play(int i, boolean system) {
        String userImagePath = MenaceConstants.CROSS_IMAGE;
        String systemImagePath = MenaceConstants.NOUGHT_IMAGE;
        if (whoStarts == 1) {
            userImagePath = MenaceConstants.NOUGHT_IMAGE;
            systemImagePath = MenaceConstants.CROSS_IMAGE;
        }
        
        if(system){
            
            if (i == 0) {
                zerojLabel.setIcon(new ImageIcon(systemImagePath));
            }
            if (i == 1) {
                onejLabel.setIcon(new ImageIcon(systemImagePath));
            }
            if (i == 2) {
                twojLabel.setIcon(new ImageIcon(systemImagePath));
            }
            if (i == 3) {
                threejLabel.setIcon(new ImageIcon(systemImagePath));
            }
            if (i == 4) {
                fourjLabel.setIcon(new ImageIcon(systemImagePath));
            }
            if (i == 5) {
                fivejLabel.setIcon(new ImageIcon(systemImagePath));
            }
            if (i == 6) {
                sixjLabel.setIcon(new ImageIcon(systemImagePath));
            }
            if (i == 7) {
                sevenjLabel.setIcon(new ImageIcon(systemImagePath));
            }
            if (i == 8) {
                eightjLabel.setIcon(new ImageIcon(systemImagePath));
            }
            
            return;
        }
        
        if (i == 0) {
            zerojLabel.setIcon(new ImageIcon(userImagePath));
        }
        if (i == 1) {
            onejLabel.setIcon(new ImageIcon(userImagePath));
        }
        if (i == 2) {
            twojLabel.setIcon(new ImageIcon(userImagePath));
        }
        if (i == 3) {
            threejLabel.setIcon(new ImageIcon(userImagePath));
        }
        if (i == 4) {
            fourjLabel.setIcon(new ImageIcon(userImagePath));
        }
        if (i == 5) {
            fivejLabel.setIcon(new ImageIcon(userImagePath));
        }
        if (i == 6) {
            sixjLabel.setIcon(new ImageIcon(userImagePath));
        }
        if (i == 7) {
            sevenjLabel.setIcon(new ImageIcon(userImagePath));
        }
        if (i == 8) {
            eightjLabel.setIcon(new ImageIcon(userImagePath));
        }
        
        if(whoStarts == 0) {
            states[i] = 1;
        }else{
            states[i] = 2;
        }
        
    }
}
