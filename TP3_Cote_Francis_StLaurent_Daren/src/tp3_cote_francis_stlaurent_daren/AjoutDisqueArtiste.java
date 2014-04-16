/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tp3_cote_francis_stlaurent_daren;

import java.sql.*;
import java.awt.*;
import javax.swing.*;

/**
 *
 * @author 201106779
 */
public class AjoutDisqueArtiste extends javax.swing.JFrame {

    /**
     * Creates new form AjoutDisqueArtiste
     */
    public AjoutDisqueArtiste(ConnectionOracle conn) {
        initComponents();
        this.connBD = conn;
        listerArtiste();
        listerDisque();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BTN_OK = new javax.swing.JButton();
        BTN_Cancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CB_Disque = new javax.swing.JComboBox();
        CB_Artiste = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTN_OK.setText("OK");
        BTN_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OKActionPerformed(evt);
            }
        });

        BTN_Cancel.setText("Cancel");
        BTN_Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_CancelActionPerformed(evt);
            }
        });

        jLabel1.setText("# Disque");

        jLabel2.setText("# d'artiste");

        CB_Disque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CB_DisqueActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(BTN_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(BTN_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CB_Disque, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CB_Artiste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CB_Disque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CB_Artiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTN_OK)
                    .addComponent(BTN_Cancel))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listerDisque()
    {
        String sqlGenre = "select numerodisque,titredisque from Disques";
        try
        {
            Statement stmDisque = connBD.getConnection().createStatement();
            ResultSet rstDisque = stmDisque.executeQuery(sqlGenre);
            while(rstDisque.next())
            {
                CB_Disque.addItem(rstDisque.getString(1)+ " "+ rstDisque.getString(2));
            }
        }
        catch(SQLException sqlex){ System.out.println(sqlex);}
    }
    private void listerArtiste()
    {
        String sqlArtiste = "select numeroartiste,prenomArtiste,nomArtiste from Artistes";
        try
        {
            Statement stmGenre = connBD.getConnection().createStatement();
            ResultSet rstArtiste = stmGenre.executeQuery(sqlArtiste);
            while(rstArtiste.next())
            {
                CB_Artiste.addItem(rstArtiste.getString(1)+ " "+ rstArtiste.getString(2) +" "+ rstArtiste.getString(3) );
            }
        }
        catch(SQLException sqlex){ System.out.println(sqlex);}
    }
    private void BTN_CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_CancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BTN_CancelActionPerformed

    private void BTN_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OKActionPerformed
        // TODO add your handling code here:
        String sqlajout ="insert into ArtisteDisques (numeroartiste,numerodisque) values(?,?)";

      int disque =Integer.parseInt(CB_Disque.getSelectedItem().toString().substring(0, 1));
      int artiste =Integer.parseInt(CB_Artiste.getSelectedItem().toString().substring(0, 1));

      try
         {
            PreparedStatement stminsert= connBD.getConnection().prepareStatement(sqlajout);
            stminsert.setInt(1, disque);
            stminsert.setInt(2, artiste);
            stminsert.executeUpdate();
         }
      
      catch(SQLException se){System.out.println("err" + se);}
      finally
      {
        this.dispose();
      }
    }//GEN-LAST:event_BTN_OKActionPerformed

    private void CB_DisqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CB_DisqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CB_DisqueActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AjoutDisqueArtiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutDisqueArtiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutDisqueArtiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutDisqueArtiste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new AjoutDisqueArtiste().setVisible(true);
            }
        });
    }
     // Declartion des autres variables.  
        ConnectionOracle connBD;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Cancel;
    private javax.swing.JButton BTN_OK;
    private javax.swing.JComboBox CB_Artiste;
    private javax.swing.JComboBox CB_Disque;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
