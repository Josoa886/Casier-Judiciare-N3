/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Bulletin.UI;

import Bulletin.persistence.condamnation.Condamnation;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.sql.Date;
import java.time.LocalDate;
import java.util.Objects;
import java.util.regex.Pattern;

/**
 *
 * @author dazai
 */
public class AjoutCondamnation extends javax.swing.JFrame {

    /**
     * Creates new form ajoutCondamnation
     */
    private Condamnation condamnationSelected;
    public AjoutCondamnation() {
        initComponents();
        setLocationRelativeTo(null);
        dateJour.requestFocus();
    }
    public AjoutCondamnation(Condamnation condamnation){
        initComponents();
        setLocationRelativeTo(null);
        Pattern pattern = Pattern.compile("[ /-]");
        this.condamnationSelected = condamnation;
        String[] date = pattern.split(String.valueOf(condamnation.getDateCondamnation()));
        dateJour.setText(date[2]);
        dateAnnee.setText(date[0]);
        dateMois.setSelectedIndex(Integer.parseInt(date[1])-1);
        txtCoursOuTrubinaux.setText(condamnation.getCoursOutrubinaux());
        txtNatureCrimes.setText(condamnation.getNatureCrime());
        txtNaturePeine.setText(condamnation.getNaturePeine());
        txtObservation.setText(condamnation.getObservation());
        btnAjouter.setEnabled(false);
        btnSupprimer.setEnabled(true);
        btnUpdate.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ajoutCondamnationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateJour = new javax.swing.JTextField();
        txtCoursOuTrubinaux = new javax.swing.JTextField();
        txtNatureCrimes = new javax.swing.JTextField();
        txtNaturePeine = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservation = new javax.swing.JTextArea();
        dateAnnee = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dateMois = new javax.swing.JComboBox<>();
        optionPanel = new javax.swing.JPanel();
        btnAjouter = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnSupprimer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        ajoutCondamnationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajout d'une condamnation"));

        jLabel1.setText("Date de Condamnation");

        jLabel2.setText("Cour ou Tribunal");

        jLabel3.setText("Nature de Crime ou Délit");

        jLabel4.setText("Nature et durée de Peine");

        jLabel5.setText("Observation");

        dateJour.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateJourKeyTyped(evt);
            }
        });

        txtCoursOuTrubinaux.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCoursOuTrubinauxActionPerformed(evt);
            }
        });

        txtObservation.setColumns(20);
        txtObservation.setRows(5);
        jScrollPane1.setViewportView(txtObservation);

        dateAnnee.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dateAnneeKeyTyped(evt);
            }
        });

        jLabel6.setText("Jour");

        jLabel7.setText("Mois");

        jLabel8.setText("Année");

        dateMois.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre", "Octobre", "Novembre", "Decembre" }));

        javax.swing.GroupLayout ajoutCondamnationPanelLayout = new javax.swing.GroupLayout(ajoutCondamnationPanel);
        ajoutCondamnationPanel.setLayout(ajoutCondamnationPanelLayout);
        ajoutCondamnationPanelLayout.setHorizontalGroup(
            ajoutCondamnationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutCondamnationPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(ajoutCondamnationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addGroup(ajoutCondamnationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ajoutCondamnationPanelLayout.createSequentialGroup()
                        .addGroup(ajoutCondamnationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCoursOuTrubinaux, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNatureCrimes, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNaturePeine, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addGroup(ajoutCondamnationPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(dateJour, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(dateMois, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(dateAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        ajoutCondamnationPanelLayout.setVerticalGroup(
            ajoutCondamnationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ajoutCondamnationPanelLayout.createSequentialGroup()
                .addGroup(ajoutCondamnationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateJour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(dateAnnee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(dateMois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(ajoutCondamnationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCoursOuTrubinaux, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ajoutCondamnationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNatureCrimes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(ajoutCondamnationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNaturePeine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(ajoutCondamnationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ajoutCondamnationPanelLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel5))
                    .addGroup(ajoutCondamnationPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        optionPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnAjouter.setText("Ajouter");
        btnAjouter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAjouterActionPerformed(evt);
            }
        });

        btnUpdate.setText("Mettre à jour");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnSupprimer.setText("Supprimer");
        btnSupprimer.setEnabled(false);
        btnSupprimer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSupprimerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout optionPanelLayout = new javax.swing.GroupLayout(optionPanel);
        optionPanel.setLayout(optionPanelLayout);
        optionPanelLayout.setHorizontalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAjouter, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(btnSupprimer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        optionPanelLayout.setVerticalGroup(
            optionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(optionPanelLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btnAjouter)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addGap(18, 18, 18)
                .addComponent(btnSupprimer)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ajoutCondamnationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(optionPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(ajoutCondamnationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @description ajouter une condamnation
     * @param evt
     */

    private void btnAjouterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAjouterActionPerformed
        if(txtNaturePeine.getText().strip().equals("")){
            JOptionPane.showMessageDialog(null, "Veuillez specifier la nature de ou durée de la peine");
            return;
        }
        if(txtNatureCrimes.getText().strip().equals("")){
            JOptionPane.showMessageDialog(null, "Veuillez specifier la nature de la condamnation");
            return;
        }
        try {
            Integer.parseInt(dateJour.getText().strip());
            Integer.parseInt(dateAnnee.getText().strip());
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, e);
            return;
        }
        try {
            LocalDate.of(Integer.parseInt(dateAnnee.getText()),dateMois.getSelectedIndex()+1,Integer.parseInt(dateJour.getText()));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Veuillez rectifier la date de condamnation","Erreur",JOptionPane.ERROR_MESSAGE);
        }
        LocalDate localDate = LocalDate.of(Integer.parseInt(dateAnnee.getText()),dateMois.getSelectedIndex()+1,Integer.parseInt(dateJour.getText()));
        Date date = Date.valueOf(localDate);

        Condamnation condamnation = new Condamnation(date, Objects.equals(txtCoursOuTrubinaux.getText().strip(), "") ?"TPI MIARINARIVO" :txtCoursOuTrubinaux.getText().strip()
                ,txtNatureCrimes.getText(),txtNaturePeine.getText(),txtObservation.getText());
        AjoutPersonne.listeDeCondamnations.add(condamnation);
        AjoutPersonne.listCondamnationAdded.add(condamnation);
        AjoutPersonne.lister_Condamnation();
        this.dispose();
    }//GEN-LAST:event_btnAjouterActionPerformed

    private void txtCoursOuTrubinauxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCoursOuTrubinauxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCoursOuTrubinauxActionPerformed

    /**
     * @description mettre à jour une condamnation
     * @param evt
     */
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(txtNaturePeine.getText().strip().equals("")){
            JOptionPane.showMessageDialog(null, "Veuillez specifier la nature de ou durée de la peine");
            return;
        }
        if(txtNatureCrimes.getText().strip().equals("")){
            JOptionPane.showMessageDialog(null, "Veuillez specifier la nature de la condamnation");
            return;
        }
        for(Condamnation condamnation : AjoutPersonne.listeDeCondamnations){
            try {
                Integer.parseInt(dateJour.getText().strip());
                Integer.parseInt(dateAnnee.getText().strip());
            }catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null, e);
                return;
            }
            try {
                LocalDate.of(Integer.parseInt(dateAnnee.getText()),dateMois.getSelectedIndex()+1,Integer.parseInt(dateJour.getText()));
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Veuillez rectifier la date de condamnation","Erreur",JOptionPane.ERROR_MESSAGE);
                return;
            }
            LocalDate localDate = LocalDate.of(Integer.parseInt(dateAnnee.getText()),dateMois.getSelectedIndex()+1,Integer.parseInt(dateJour.getText()));
            Date date = Date.valueOf(localDate);
            if (condamnation == this.condamnationSelected){
                condamnation.setDateCondamnation(date);
                condamnation.setCoursOutrubinaux(txtCoursOuTrubinaux.getText().strip().equals("")?"TPI MIARINARIVO" :txtCoursOuTrubinaux.getText().strip());
                condamnation.setNatureCrime(txtNatureCrimes.getText());
                condamnation.setNaturePeine(txtNaturePeine.getText());
                condamnation.setObservation(txtObservation.getText());
            }
            AjoutPersonne.lister_Condamnation();
            this.dispose();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @description supprimer un condamnation
     * @param evt
     */
    private void btnSupprimerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSupprimerActionPerformed

        AjoutPersonne.listCondamnationWillRemoved.add(condamnationSelected);
        AjoutPersonne.listeDeCondamnations.remove(condamnationSelected);
        AjoutPersonne.lister_Condamnation();
        this.dispose();
    }//GEN-LAST:event_btnSupprimerActionPerformed

    private void dateJourKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateJourKeyTyped
         char c=evt.getKeyChar();
      if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
          getToolkit().beep();
          evt.consume();
    } 
    }//GEN-LAST:event_dateJourKeyTyped

    private void dateAnneeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dateAnneeKeyTyped
        char c=evt.getKeyChar();
        if (!(Character.isDigit(c)|| (c== KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE))){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_dateAnneeKeyTyped

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
            java.util.logging.Logger.getLogger(AjoutCondamnation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AjoutCondamnation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AjoutCondamnation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AjoutCondamnation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AjoutCondamnation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ajoutCondamnationPanel;
    private javax.swing.JButton btnAjouter;
    private javax.swing.JButton btnSupprimer;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField dateAnnee;
    private javax.swing.JTextField dateJour;
    private javax.swing.JComboBox<String> dateMois;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel optionPanel;
    private javax.swing.JTextField txtCoursOuTrubinaux;
    private javax.swing.JTextField txtNatureCrimes;
    private javax.swing.JTextField txtNaturePeine;
    private javax.swing.JTextArea txtObservation;
    // End of variables declaration//GEN-END:variables
}
