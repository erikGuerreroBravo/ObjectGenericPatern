/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.uttt.view;
///importo la clase  del singleton
import mx.edu.uttt.generic.SingletonLogin;
import mx.edu.uttt.view.frmLogin;
/**
 *
 * @author Erik Guerrero bravo Version 1.0.0
 */
public class frmMenu extends javax.swing.JFrame {

    /**
     * Creates new form frmMenu
     */
    public frmMenu() {
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

        MenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        frmMenuLogin = new javax.swing.JMenu();
        frmItemMenuLogin = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Principal");
        getContentPane().setLayout(null);

        jMenu1.setText("File");

        frmMenuLogin.setText("Login");

        frmItemMenuLogin.setText("Acceso");
        frmItemMenuLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                frmItemMenuLoginActionPerformed(evt);
            }
        });
        frmMenuLogin.add(frmItemMenuLogin);

        jMenu1.add(frmMenuLogin);

        MenuPrincipal.add(jMenu1);

        jMenu2.setText("Edit");
        MenuPrincipal.add(jMenu2);

        setJMenuBar(MenuPrincipal);

        setBounds(0, 0, 834, 508);
    }// </editor-fold>//GEN-END:initComponents

    private void frmItemMenuLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_frmItemMenuLoginActionPerformed
        
        //vamos a crear el singleton
        //aqui esta el singleton ahora lo estoy 
        //creando voy a correr el ejercicio
        //no hara nada no esperen mucho
        SingletonLogin.getInstance().setVisible(true); 
        
        
    }//GEN-LAST:event_frmItemMenuLoginActionPerformed

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
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MenuPrincipal;
    private javax.swing.JMenuItem frmItemMenuLogin;
    private javax.swing.JMenu frmMenuLogin;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    // End of variables declaration//GEN-END:variables
}
