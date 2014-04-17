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
public class GestionArtistesForm extends javax.swing.JFrame {

    /**
     * Creates new form GestionArtistesForm
     */
  
    
    public GestionArtistesForm(ConnectionOracle conn) {
        initComponents();
        this.connBD = conn;
        // appel du bouton premier
        BTN_Premier.doClick();
        listerArtiste();
    }
    private void listerArtiste()
    {
        String sqlGenre = "select prenomArtiste from Artistes";
        try
        {
            Statement stmArtiste = connBD.getConnection().createStatement();
            ResultSet rstArtiste = stmArtiste.executeQuery(sqlGenre);
            while(rstArtiste.next())
            {
                CB_Artiste.addItem(rstArtiste.getString(1));
            }
        }
        catch(SQLException sqlex){ System.out.println(sqlex);}
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TB_NumeroArtiste = new javax.swing.JTextField();
        TB_NomArtiste = new javax.swing.JTextField();
        TB_Nationalite = new javax.swing.JTextField();
        TB_PrenomArtiste = new javax.swing.JTextField();
        BTN_Ajouter = new javax.swing.JButton();
        BTN_Modifier = new javax.swing.JButton();
        BTN_Supprimer = new javax.swing.JButton();
        BTN_Premier = new javax.swing.JButton();
        BTN_Dernier = new javax.swing.JButton();
        BTN_Precedent = new javax.swing.JButton();
        BTN_Suivant = new javax.swing.JButton();
        TB_Recherche = new javax.swing.JTextField();
        BTN_Recherche = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Liste_Recherche = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        Liste_CD_Par_Artiste = new javax.swing.JList();
        CB_Artiste = new javax.swing.JComboBox();
        BTN_Recherche_CD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BTN_OK.setText("OK");
        BTN_OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_OKActionPerformed(evt);
            }
        });

        jLabel2.setText("# artiste");

        jLabel3.setText("Nom d'artiste");

        jLabel4.setText("Prénom d'artiste");

        jLabel5.setText("Nationalité");

        TB_NumeroArtiste.setEnabled(false);

        BTN_Ajouter.setText("Ajouter");
        BTN_Ajouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AjouterActionPerformed(evt);
            }
        });

        BTN_Modifier.setText("Modifier");
        BTN_Modifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_ModifierActionPerformed(evt);
            }
        });

        BTN_Supprimer.setText("Supprimer");
        BTN_Supprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SupprimerActionPerformed(evt);
            }
        });

        BTN_Premier.setText("<<");
        BTN_Premier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PremierActionPerformed(evt);
            }
        });

        BTN_Dernier.setText(">>");
        BTN_Dernier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_DernierActionPerformed(evt);
            }
        });

        BTN_Precedent.setText("Précedent");
        BTN_Precedent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_PrecedentActionPerformed(evt);
            }
        });

        BTN_Suivant.setText("Suivant");
        BTN_Suivant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_SuivantActionPerformed(evt);
            }
        });

        BTN_Recherche.setText("Recherche d'artiste");
        BTN_Recherche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_RechercheActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(Liste_Recherche);

        jScrollPane2.setViewportView(Liste_CD_Par_Artiste);

        BTN_Recherche_CD.setText("Recherche CD/Artiste");
        BTN_Recherche_CD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_Recherche_CDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(53, 53, 53)
                                .addComponent(TB_NumeroArtiste, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(32, 32, 32)
                                .addComponent(TB_NomArtiste, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TB_Nationalite, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TB_PrenomArtiste, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_Supprimer, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_Ajouter, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_Modifier, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BTN_Premier)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Precedent)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Suivant)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Dernier)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BTN_Recherche, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(TB_Recherche))
                        .addGap(28, 28, 28))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(BTN_OK, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CB_Artiste, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(BTN_Recherche_CD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TB_NumeroArtiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTN_Ajouter))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(TB_NomArtiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(BTN_Modifier))
                            .addComponent(jLabel3))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(BTN_Supprimer))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(TB_PrenomArtiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(TB_Nationalite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BTN_Premier)
                            .addComponent(BTN_Precedent)
                            .addComponent(BTN_Suivant)
                            .addComponent(BTN_Dernier))
                        .addGap(185, 185, 185)
                        .addComponent(BTN_OK)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(TB_Recherche, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BTN_Recherche)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(CB_Artiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTN_Recherche_CD)
                        .addGap(18, 18, 18))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTN_OKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_OKActionPerformed
        // TODO add your handling code here:
        new JFrameGestion(connBD).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BTN_OKActionPerformed

    private void BTN_PremierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PremierActionPerformed
      
        try 
     {
         Statement stm1 = connBD.getConnection().createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
         rst = stm1.executeQuery(sql1);
         if (rst.first())
         {
            TB_NumeroArtiste.setText (((Integer)rst.getInt(1)).toString());
            TB_NomArtiste.setText(rst.getString(2));
            TB_PrenomArtiste.setText(rst.getString(3));
            TB_Nationalite.setText (rst.getString(4));
         
         }
     }
     catch(SQLException se)
     { 
         System.out.println(se);
     }
        
    }//GEN-LAST:event_BTN_PremierActionPerformed

    private void BTN_PrecedentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_PrecedentActionPerformed

        try 
       {
          if(rst.previous())
            {
                TB_NumeroArtiste.setText (((Integer)rst.getInt(1)).toString());
                TB_NomArtiste.setText(rst.getString(2));
                TB_PrenomArtiste.setText(rst.getString(3));
                TB_Nationalite.setText (rst.getString(4));
            }
          else 
          {
            JOptionPane.showMessageDialog(this, "Précedent impossible");
          }
       
       }
   
     catch(SQLException se)
     {
        JOptionPane.showMessageDialog(this, "précedent impossible");
     }// TODO add your handling code here:
        
    }//GEN-LAST:event_BTN_PrecedentActionPerformed

    private void BTN_SuivantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SuivantActionPerformed
      
        try 
     {
         if(rst.next())
          {
            TB_NumeroArtiste.setText (((Integer)rst.getInt(1)).toString());
            TB_NomArtiste.setText(rst.getString(2));
            TB_PrenomArtiste.setText(rst.getString(3));
            TB_Nationalite.setText (rst.getString(4));
          }
      
         else 
          {
            JOptionPane.showMessageDialog(this, "suivant impossible");
          }
     }
     
     catch(SQLException se)
     {
        JOptionPane.showMessageDialog(this, "Suivant imposible");
     
     }
       
    }//GEN-LAST:event_BTN_SuivantActionPerformed

    private void BTN_DernierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_DernierActionPerformed
  
      try 
      {
         if(rst.last())
         {
            TB_NumeroArtiste.setText (((Integer)rst.getInt(1)).toString());
            TB_NomArtiste.setText(rst.getString(2));
            TB_PrenomArtiste.setText(rst.getString(3));
            TB_Nationalite.setText (rst.getString(4));
         }

      
     }
     
     catch(SQLException se){
        JOptionPane.showMessageDialog(this, "dernier imposible");
     
     }
      
    }//GEN-LAST:event_BTN_DernierActionPerformed

    private void BTN_AjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AjouterActionPerformed
        // TODO add your handling code here:
        new AjoutArtisteForm(connBD).setVisible(true);
      
    }//GEN-LAST:event_BTN_AjouterActionPerformed

    private void BTN_ModifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_ModifierActionPerformed
        // TODO add your handling code here:
      String sqlupdate ="update Artistes set nomArtiste = ? , prenomArtiste = ? , nationalite = ? where numeroArtiste = " + TB_NumeroArtiste.getText();
      String nom= TB_NomArtiste.getText();
      String prenom = TB_PrenomArtiste.getText();
      String nationalite =TB_Nationalite.getText();

 
      try
         {
            PreparedStatement stmupdate= connBD.getConnection().prepareStatement(sqlupdate);
            stmupdate.setString(1,nom);
            stmupdate.setString(2,prenom);
            stmupdate.setString(3,nationalite);
            stmupdate.executeUpdate();
         }
      
      catch(SQLException se){System.out.println("err" + se);}
        
    }//GEN-LAST:event_BTN_ModifierActionPerformed

    private void BTN_SupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_SupprimerActionPerformed
        String sqlDelete = "DELETE FROM ARTISTES WHERE NUMEROARTISTE = "+TB_NumeroArtiste.getText();
        
        try
        {
            Statement stmDelete = connBD.getConnection().createStatement();
            stmDelete.executeQuery(sqlDelete);
        }
        catch(SQLException se)
        {
            System.out.println("err" + se);
        }
    }//GEN-LAST:event_BTN_SupprimerActionPerformed

    private void BTN_RechercheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_RechercheActionPerformed
        // TODO add your handling code here:
        String sqlrecherche = "Select nomartiste,prenomartiste from Artistes where nomartiste like '" +TB_Recherche.getText()+ "%' OR prenomartiste like '" +TB_Recherche.getText()+ "%'";
        
        try
        {
            Statement stmRecherche = connBD.getConnection().createStatement();
            ResultSet rst2 = stmRecherche.executeQuery(sqlrecherche);
            DefaultListModel listModel = new DefaultListModel();
            while(rst2.next())
            {
                listModel.addElement(rst2.getString(2).toString()+ " "+ rst2.getString(1).toString());
            }
            Liste_Recherche.setModel(listModel);
        }
        catch(SQLException sqlex){ System.out.println(sqlex);}
    }//GEN-LAST:event_BTN_RechercheActionPerformed

    private void BTN_Recherche_CDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_Recherche_CDActionPerformed
        // TODO add your handling code here:
        String sqlrecherche = "Select D.titredisque , A.prenomArtiste from Artistes A inner join ArtisteDisques AD on A.NumeroArtiste = AD.NumeroArtiste inner join Disques D on AD.NumeroDisque = D.NumeroDisque  where prenomartiste = '" +CB_Artiste.getSelectedItem().toString()+"'";
        
        try
        {
            Statement stmRecherche = connBD.getConnection().createStatement();
            ResultSet rst2 = stmRecherche.executeQuery(sqlrecherche);
            DefaultListModel listModel = new DefaultListModel();
            while(rst2.next())
            {
                listModel.addElement(rst2.getString(1).toString());
            }
            Liste_CD_Par_Artiste.setModel(listModel);
        }
        catch(SQLException sqlex){ System.out.println(sqlex);}
    }//GEN-LAST:event_BTN_Recherche_CDActionPerformed

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
            java.util.logging.Logger.getLogger(GestionArtistesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionArtistesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionArtistesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionArtistesForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new GestionArtistesForm().setVisible(true);
            }
        });
    }
   // Declartion des autres variables.  
   ConnectionOracle connBD;
   ResultSet rst ;
   String sql1 = "Select numeroartiste,nomartiste,prenomartiste,nationalite from artistes";

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_Ajouter;
    private javax.swing.JButton BTN_Dernier;
    private javax.swing.JButton BTN_Modifier;
    private javax.swing.JButton BTN_OK;
    private javax.swing.JButton BTN_Precedent;
    private javax.swing.JButton BTN_Premier;
    private javax.swing.JButton BTN_Recherche;
    private javax.swing.JButton BTN_Recherche_CD;
    private javax.swing.JButton BTN_Suivant;
    private javax.swing.JButton BTN_Supprimer;
    private javax.swing.JComboBox CB_Artiste;
    private javax.swing.JList Liste_CD_Par_Artiste;
    private javax.swing.JList Liste_Recherche;
    private javax.swing.JTextField TB_Nationalite;
    private javax.swing.JTextField TB_NomArtiste;
    private javax.swing.JTextField TB_NumeroArtiste;
    private javax.swing.JTextField TB_PrenomArtiste;
    private javax.swing.JTextField TB_Recherche;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
