/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package survcalc.view;

import java.util.HashMap;
import survcalc.control.*;

import survcalc.model.Points;
//import javax.swing.JOptionPane;
import survcalc.model.PointFactory;

/**
 *
 * @author John H. Goettsche <john.h.goettsche@gmail.com>
 */
public class SurvCalcFrame extends javax.swing.JFrame {

    HashMap<String, Command> commands;
    
    Points points;
    PointFactory pointFactory;
    
    ViewPointList viewPointList;
    
    //FileExitCommand fileExitCommand = new FileExitCommand();
    
    /**
     * Creates new form SurvCalcFrame
     */
    public SurvCalcFrame() {
        initComponents();
        initMenu();
        
        viewPointList = new ViewPointList();
        mainPanel = viewPointList;
    }
    
    private void initMenu(){
        commands = new HashMap();
        commands.put("fileExit", new FileExitCommand());
        
        commands.put("pointsEnterCoordinates", new PointsEnterCoordinatesCommand());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPanel = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        fileNew = new javax.swing.JMenuItem();
        fileOpen = new javax.swing.JMenuItem();
        fileSave = new javax.swing.JMenuItem();
        fileSaveAs = new javax.swing.JMenuItem();
        fileExportPoints = new javax.swing.JMenuItem();
        fileExitItem = new javax.swing.JMenuItem();
        pointsMenu = new javax.swing.JMenu();
        pointsEnterCoordinates = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        fileMenu.setText("File");

        fileNew.setText("New");
        fileNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileNewActionPerformed(evt);
            }
        });
        fileMenu.add(fileNew);

        fileOpen.setText("Open");
        fileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileOpenActionPerformed(evt);
            }
        });
        fileMenu.add(fileOpen);

        fileSave.setText("Save");
        fileSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSaveActionPerformed(evt);
            }
        });
        fileMenu.add(fileSave);

        fileSaveAs.setText("Save As");
        fileSaveAs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileSaveAsActionPerformed(evt);
            }
        });
        fileMenu.add(fileSaveAs);

        fileExportPoints.setText("Export Points");
        fileExportPoints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExportPointsActionPerformed(evt);
            }
        });
        fileMenu.add(fileExportPoints);

        fileExitItem.setText("Exit");
        fileExitItem.setToolTipText("");
        fileExitItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileExitItemActionPerformed(evt);
            }
        });
        fileMenu.add(fileExitItem);

        menuBar.add(fileMenu);

        pointsMenu.setText("Points");

        pointsEnterCoordinates.setText("Enter Coordinates");
        pointsEnterCoordinates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pointsEnterCoordinatesActionPerformed(evt);
            }
        });
        pointsMenu.add(pointsEnterCoordinates);

        menuBar.add(pointsMenu);

        helpMenu.setText("Help");
        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fileExitItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExitItemActionPerformed
        commands.get("fileExit").execute();
    }//GEN-LAST:event_fileExitItemActionPerformed

    private void fileNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileNewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileNewActionPerformed

    private void fileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileOpenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileOpenActionPerformed

    private void fileSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileSaveActionPerformed

    private void fileSaveAsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileSaveAsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileSaveAsActionPerformed

    private void fileExportPointsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileExportPointsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fileExportPointsActionPerformed

    private void pointsEnterCoordinatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pointsEnterCoordinatesActionPerformed
        commands.get("pointsEnterCoordinates").execute();
    }//GEN-LAST:event_pointsEnterCoordinatesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info
                : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SurvCalcFrame.class.getName()).
                log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SurvCalcFrame.class.getName()).
                log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SurvCalcFrame.class.getName()).
                log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SurvCalcFrame.class.getName()).
                log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SurvCalcFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem fileExitItem;
    private javax.swing.JMenuItem fileExportPoints;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem fileNew;
    private javax.swing.JMenuItem fileOpen;
    private javax.swing.JMenuItem fileSave;
    private javax.swing.JMenuItem fileSaveAs;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pointsEnterCoordinates;
    private javax.swing.JMenu pointsMenu;
    // End of variables declaration//GEN-END:variables
}
