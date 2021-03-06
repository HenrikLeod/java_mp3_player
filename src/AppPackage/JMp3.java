/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AppPackage;


import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;



/**
 *
 * @author leod@ifal912
 */
public class JMp3 extends javax.swing.JFrame {

    /**
     * Creates new form JMp3
     */
    
    
    
    Control Music = new Control();
    public JMp3() {
        initComponents();
        setLocationRelativeTo(null);
        
        }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        stop1 = new javax.swing.JLabel();
        stop2 = new javax.swing.JLabel();
        stop = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        stop3 = new javax.swing.JLabel();
        estado = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MP3 player by leod@ifal912");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        stop1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.png"))); // NOI18N
        stop1.setToolTipText("Stop");
        stop1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stop1MouseClicked(evt);
            }
        });

        stop2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        stop2.setToolTipText("Play/Resume");
        stop2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stop2MouseClicked(evt);
            }
        });

        stop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/6.png"))); // NOI18N
        stop.setToolTipText("Pause");
        stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stopMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(stop1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(stop2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(stop)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stop)
                    .addComponent(stop2)
                    .addComponent(stop1))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 230, 100));

        state.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        state.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 88, 59, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 230, 90));

        stop3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/music_orange.png"))); // NOI18N
        stop3.setToolTipText("Open");
        stop3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stop3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                stop3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                stop3MouseExited(evt);
            }
        });
        getContentPane().add(stop3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 60, 60));

        estado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estado.setForeground(new java.awt.Color(255, 255, 255));
        estado.setText("Abra um arquivo clicando na nota musical");
        getContentPane().add(estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/jailson.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 220));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void stop3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop3MouseClicked
        // TODO add your handling code here:
         FileFilter filter = new FileNameExtensionFilter("Músicas em mp3","mp3","mpeg3");
        
        JFileChooser chooser = new JFileChooser("F:\\Music");
        chooser.addChoosableFileFilter(filter);
        
        int returnVal = chooser.showOpenDialog(null);
        
        if(returnVal == JFileChooser.APPROVE_OPTION){
            
            File myFile = chooser.getSelectedFile();
            String song = myFile + "";
            
            String name = chooser.getSelectedFile().getName();            
            estado.setText("Reproduzindo: " + name);
            Music.Play(song);
        }
    }//GEN-LAST:event_stop3MouseClicked

    private void stop3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop3MouseEntered
        // TODO add your handling code here:
        stop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/music (3).png")));
    }//GEN-LAST:event_stop3MouseEntered

    private void stop3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop3MouseExited
        // TODO add your handling code here:
        stop3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/music_orange.png")));
    }//GEN-LAST:event_stop3MouseExited

    private void stopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_stopMouseEntered

    private void stopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stopMouseClicked
        // TODO add your handling code here:
        Music.Pause();
        estado.setText("Pausado");
    }//GEN-LAST:event_stopMouseClicked

    private void stop2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop2MouseClicked
        // TODO add your handling code here:
        Music.Resume();
       estado.setText("Reproduzindo");
    }//GEN-LAST:event_stop2MouseClicked

    private void stop1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stop1MouseClicked
        // TODO add your handling code here:
        Music.Stop();
        estado.setText("Paragem!!!");
    }//GEN-LAST:event_stop1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            UIManager.setLookAndFeel("Windows");
        } catch (Exception e) {
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JMp3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel estado;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel state;
    private javax.swing.JLabel stop;
    private javax.swing.JLabel stop1;
    private javax.swing.JLabel stop2;
    private javax.swing.JLabel stop3;
    // End of variables declaration//GEN-END:variables
}
