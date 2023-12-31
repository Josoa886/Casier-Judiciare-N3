package Bulletin.UI;


import Bulletin.persistence.Admin.Admin;
import Bulletin.persistence.Admin.AdminService;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
//import net.proteanit.sql.DbUtils;

// Classe en relation avec Barre Menu (Admin)

public class InfoConnexion extends javax.swing.JFrame {
    /**
     * Creates new form LoginDetails
     */
    private final AdminService adminService = AdminService.getInstance();
    public InfoConnexion() {
        initComponents();
        Get_Data();
        setLocationRelativeTo(null);
    }
    // Pour avoir les données de l'utilisateur et l'afficher dans le tableau
    private void Get_Data(){
          try{
              Object[][] data = new Object[1][2];
              Admin admin = ConnexionBeanHandler.getLogin();
                  data[0][0] = admin.getUsername();
                  data[0][1] = admin.getPassword();


              String[] columnNames = new String[2];
              columnNames[0] = "Nom d'utilisateur";
              columnNames[1] = "Mot de passe";
              DefaultTableModel tableModel = new DefaultTableModel(data,columnNames);
              try{
                  connectedUserList.setModel(tableModel);
              }catch(Exception e){
                  JOptionPane.showMessageDialog(null, e);
              };
         }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
          
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

        jScrollPane1 = new javax.swing.JScrollPane();
        connectedUserList = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        connectedUserList.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        connectedUserList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nom d'utilisateur", "Password"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        connectedUserList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(connectedUserList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InfoConnexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InfoConnexion().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable connectedUserList;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
