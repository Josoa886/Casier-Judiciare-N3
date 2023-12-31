package Bulletin.UI;


import Bulletin.persistence.Admin.Admin;
import Bulletin.persistence.Admin.AdminService;
import Bulletin.persistence.Admin.Rules;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class Administrateur extends javax.swing.JFrame {
private Admin user = null;
private AdminService adminService = AdminService.getInstance();

    public Admin getUser() {
        return user;
    }

    public void setUser(Admin user) {
        this.user = user;
    }

    /**
     * Creates new form Doctor
     */
    public Administrateur() {
        initComponents();
        btnSave.setEnabled(true);
        btnDelete.setEnabled(false);
        btnUpdate.setEnabled(false);
        cmbAccountType.setSelectedIndex(0);
        if(ConnexionBeanHandler.getLogin().getRule() == Rules.USER){
            cmbAccountType.setEnabled(false);
        }
        setLocationRelativeTo(null);
    }
    public Administrateur(Admin admin){
        initComponents();
        setLocationRelativeTo(null);
        this.requestFocus();
        setUser(admin);
        NomAd.setText(admin.getName());
        AdUsername.setText(admin.getUsername());
        AdPoste.setText(admin.getPoste());
        AdPassword.setText(admin.getPassword());
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
         btnDelete.setEnabled(true);
        if(admin.getRule() == Rules.ADMIN){
            cmbAccountType.setSelectedIndex(1);
        }else {
            cmbAccountType.setSelectedIndex(0);
            cmbAccountType.setEnabled(false);
        }
        if(admin != ConnexionBeanHandler.getLogin()){
            NomAd.setEnabled(false);
            AdPoste.setEnabled(false);
            AdUsername.setEnabled(false);
            AdPassword.setEnabled(false);
            btnDelete.setEnabled(false);
            btnUpdate.setEnabled(false);
            if(ConnexionBeanHandler.getLogin().getRule() == Rules.ADMIN){
                cmbAccountType.setEnabled(true);
                btnUpdate.setEnabled(true);
            }
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

        formPanel = new javax.swing.JPanel();
        AdNom = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Poste = new javax.swing.JLabel();
        NomAd = new javax.swing.JTextField();
        AdUsername = new javax.swing.JTextField();
        AdPoste = new javax.swing.JTextField();
        Sexe = new javax.swing.JLabel();
        cmbAccountType = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        AdPassword = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrteur");
        setResizable(false);

        formPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Administrateur"));

        AdNom.setText("Nom");

        Username.setText("Nom d'utilisateur");

        Poste.setText("Poste");

        Sexe.setText("Type de compte");

        cmbAccountType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Utilisateur", "Administrateur" }));
        cmbAccountType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAccountTypeActionPerformed(evt);
            }
        });

        jLabel1.setText("Mot de passe");

        javax.swing.GroupLayout formPanelLayout = new javax.swing.GroupLayout(formPanel);
        formPanel.setLayout(formPanelLayout);
        formPanelLayout.setHorizontalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AdNom)
                    .addComponent(Username)
                    .addComponent(Poste)
                    .addComponent(Sexe)
                    .addComponent(jLabel1))
                .addGap(50, 50, 50)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NomAd, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(AdPassword, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(AdPoste, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                .addContainerGap(87, Short.MAX_VALUE))
        );
        formPanelLayout.setVerticalGroup(
            formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(formPanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomAd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdNom))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(AdUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Poste)
                    .addComponent(AdPoste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(AdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(formPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbAccountType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sexe))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnNew.setText("Nouveau");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Enregistrer");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Effacer");
        btnDelete.setEnabled(false);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Mettre à jour");
        btnUpdate.setEnabled(false);
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton1.setText("Informations");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnNew, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNew)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(formPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void Reset()
{
    setUser(null);
    NomAd.setText("");
    AdUsername.setText("");
    AdPoste.setText("");
    AdPassword.setText("");
    cmbAccountType.setSelectedIndex(0);
    if(ConnexionBeanHandler.getLogin().getRule() != Rules.ADMIN){
        cmbAccountType.setEnabled(false);
    }
    btnSave.setEnabled(true);
    btnUpdate.setEnabled(false);
    btnDelete.setEnabled(false);

}
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        Reset();
    }//GEN-LAST:event_btnNewActionPerformed
    private boolean fieldValidate(){
        if(NomAd.getText().strip().equals("")){
            JOptionPane.showMessageDialog(null,"Veuillez ajouter un nom", "Erreur",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(AdUsername.getText().strip().equals("")){
            JOptionPane.showMessageDialog(null,"Veuillez ajouter un nom", "Erreur",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(AdPoste.getText().strip().equals("")){
            JOptionPane.showMessageDialog(null,"Veuillez ajouter un nom", "Erreur",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if(AdPassword.getText().strip().equals("")){
            JOptionPane.showMessageDialog(null,"Veuillez ajouter un nom", "Erreur",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        if(!fieldValidate()){
            return;
        }
        Admin admin = new Admin();
        String nom = NomAd.getText().strip();
        String username = AdUsername.getText().strip();
        String poste = AdPoste.getText().strip();
        String password = AdPassword.getText().strip();
        int ruleSelection = cmbAccountType.getSelectedIndex();
        Rules rule = Rules.UKNOWN;
        if(ruleSelection == 0){
            rule = Rules.USER;
        }else{
            rule = Rules.ADMIN;
        }
        admin.setName(nom);
        admin.setUsername(username);
        admin.setPoste(poste);
        admin.setPassword(password);
        admin.setRule(rule);
        try{
            if(adminService.getAdminByUsername(username) != null){
                JOptionPane.showMessageDialog(this,"Un utilisateur avec la m�me nom d'utilisateur existe déjà dans la base de données","Erreur",JOptionPane.ERROR_MESSAGE);
                return;
            }
            adminService.createAdmin(admin);
            JOptionPane.showMessageDialog(this,"Un utilisateur à été ajouté dans la base de donnée","Succèss",JOptionPane.INFORMATION_MESSAGE);
            this.dispose();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try{
            int P = JOptionPane.showConfirmDialog(null," Voulez vous supprimer " +
                     getUser().getUsername() +"de la base de donées ?","Confirmation",JOptionPane.YES_NO_OPTION);
            if (P==0)
            {
                boolean dconnect = getUser() == ConnexionBeanHandler.getLogin();
                adminService.removeAdmin(getUser());
                JOptionPane.showMessageDialog(this,"Un utilisateur à été supprimé de la base de donées");
                this.dispose();
                if(dconnect){
                    ConnexionBeanHandler.disconnect();
                }
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if(!fieldValidate()){
            return;
        }
        Admin admin = new Admin();
        String nom = NomAd.getText().strip();
        String username = AdUsername.getText().strip();
        String poste = AdPoste.getText().strip();
        String password = AdPassword.getText().strip();
        int ruleSelection = cmbAccountType.getSelectedIndex();
        Rules rule = Rules.UKNOWN;
        if(ruleSelection == 0){
            rule = Rules.USER;
        }else{
            rule = Rules.ADMIN;
        }
        admin.setName(nom);
        admin.setUsername(username);
        admin.setPoste(poste);
        admin.setPassword(password);
        admin.setRule(rule);
        try {
            if (adminService.getAdminByUsername(username) != null && adminService.getAdminByUsername(username) != getUser()) {
                JOptionPane.showMessageDialog(this, "Un utilisateur avec la m�me nom d'utilisateur existe déjà dans la base de données", "Erreur", JOptionPane.ERROR_MESSAGE);
                return;
            }
            if(JOptionPane.showConfirmDialog(null,"Voulez vous confirmer la mise à jour des informations sur " +
                    getUser().getUsername() + " ?", "Confirmation", JOptionPane.YES_NO_OPTION) == 0) {
                adminService.updateAdmin(getUser().getId(), admin);
                if(getUser()==ConnexionBeanHandler.getLogin()){
                ConnexionBeanHandler.setLogin(adminService.getAdminByUsername(admin.getUsername()));
                }
                JOptionPane.showMessageDialog(null,"Mise à jour terminée avec succès");
                this.dispose();
            }
        }catch (Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     this.setVisible(false);
     InfoAdmin.getInstance().setVisible(true);
     this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbAccountTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAccountTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbAccountTypeActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrateur.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrateur().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdNom;
    private javax.swing.JTextField AdPassword;
    public javax.swing.JTextField AdPoste;
    public javax.swing.JTextField AdUsername;
    public javax.swing.JTextField NomAd;
    private javax.swing.JLabel Poste;
    private javax.swing.JLabel Sexe;
    private javax.swing.JLabel Username;
    public javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    public javax.swing.JButton btnSave;
    public javax.swing.JButton btnUpdate;
    public javax.swing.JComboBox cmbAccountType;
    private javax.swing.JPanel formPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
