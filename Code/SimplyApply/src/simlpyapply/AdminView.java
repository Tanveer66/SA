/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package simlpyapply;

import simlpyapply.HomeDashboard;

/**
 *
 * @author mc
 */
public class AdminView extends javax.swing.JFrame {

    /**
     * Creates new form AdminView
     */
    public AdminView() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        logoffBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(750, 600));
        setSize(new java.awt.Dimension(700, 500));
        getContentPane().setLayout(null);

        jLabel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("                                                                Administartion");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 770, 60);

        jPanel1.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        jPanel1.setLayout(null);

        jButton1.setText("Manage Owner");
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 120, 30);

        jButton2.setText("Check Requests");
        jPanel1.add(jButton2);
        jButton2.setBounds(10, 73, 120, 30);

        jButton3.setText("Manage Institue");
        jPanel1.add(jButton3);
        jButton3.setBounds(10, 133, 120, 30);

        logoffBtn.setText("Logoff");
        logoffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffBtnActionPerformed(evt);
            }
        });
        jPanel1.add(logoffBtn);
        logoffBtn.setBounds(10, 193, 120, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 60, 140, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoffBtnActionPerformed
       
        this.setVisible(false);
        new HomeDashboard().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoffBtnActionPerformed

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
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoffBtn;
    // End of variables declaration//GEN-END:variables
}
