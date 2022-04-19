/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.play;

import businesslogic.model.MenaceGame;
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

    /**
     * Creates new form PlayJPanel
     */
    public PlayJPanel() {
        
        initComponents();
        int whoStarts = JOptionPane.showConfirmDialog(this, this, "Do you want to StartFirst", 0);
        logger.info("User chosen :: "+ whoStarts);
        while(whoStarts==-1) {
            logger.info("User closed the Dialog Window");
            whoStarts = JOptionPane.showConfirmDialog(this, this, "Do you want to StartFirst", 0);
        }
        if(whoStarts==0) {
            logger.info("User has chosen to play first");
        }else{
            logger.info("System is going to play first");
        }
    }

    public PlayJPanel(MenaceGame menaceGame) {
        
        this.menaceGame=menaceGame;
        int whoStarts = JOptionPane.showConfirmDialog(this, this, "Do you want to StartFirst", 0);
        logger.info("User chosen :: "+ whoStarts);
        while(whoStarts==-1) {
            logger.info("User closed the Dialog Window");
            whoStarts = JOptionPane.showConfirmDialog(this, this, "Do you want to StartFirst", 0);
        }
        if(whoStarts==0) {
            logger.info("User has chosen to play first");
        }else{
            logger.info("System is going to play first");
        }
        initComponents();
        
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
        onejLabel1 = new javax.swing.JLabel();
        twojLabel = new javax.swing.JLabel();
        fivejLabel = new javax.swing.JLabel();
        threejLabel1 = new javax.swing.JLabel();
        fourjLabel1 = new javax.swing.JLabel();
        eightjLabel = new javax.swing.JLabel();
        sixjLabel = new javax.swing.JLabel();
        sevenjLabel1 = new javax.swing.JLabel();

        gamejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gamejLabel.setText("Welcome");

        zerojLabel.setText("Zero");

        onejLabel1.setText("One");

        twojLabel.setText("Two");

        fivejLabel.setText("Five");

        threejLabel1.setText("Three");

        fourjLabel1.setText("Four");

        eightjLabel.setText("Eight");

        sixjLabel.setText("Six");

        sevenjLabel1.setText("Seven");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(gamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(zerojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(threejLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sixjLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sevenjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fourjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(onejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fivejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(twojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eightjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(278, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {eightjLabel, fivejLabel, fourjLabel1, onejLabel1, sevenjLabel1, sixjLabel, threejLabel1, twojLabel, zerojLabel});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(gamejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zerojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(onejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twojLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fivejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fourjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(threejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(sixjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(sevenjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(eightjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {eightjLabel, fivejLabel, fourjLabel1, onejLabel1, sevenjLabel1, sixjLabel, threejLabel1, twojLabel, zerojLabel});

    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eightjLabel;
    private javax.swing.JLabel fivejLabel;
    private javax.swing.JLabel fourjLabel1;
    private javax.swing.JLabel gamejLabel;
    private javax.swing.JLabel onejLabel1;
    private javax.swing.JLabel sevenjLabel1;
    private javax.swing.JLabel sixjLabel;
    private javax.swing.JLabel threejLabel1;
    private javax.swing.JLabel twojLabel;
    private javax.swing.JLabel zerojLabel;
    // End of variables declaration//GEN-END:variables
}
