
import java.awt.Dimension;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aumrudh Lal Kumar TJ
 */
public class subadminmembers extends javax.swing.JFrame {

    /**
     * Creates new form subadminmembers
     */
    public subadminmembers() {        
        setPreferredSize(new Dimension(433, 369));
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

        addbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        search = new javax.swing.JButton();
        viewbutton = new javax.swing.JButton();
        modifybutton = new javax.swing.JButton();
        closebutton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sub-Admin Members Panel");
        setMaximumSize(new java.awt.Dimension(712, 401));
        setPreferredSize(new java.awt.Dimension(712, 401));
        getContentPane().setLayout(null);

        addbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        addbutton.setText("Insert");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(addbutton);
        addbutton.setBounds(90, 250, 89, 43);

        deletebutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(deletebutton);
        deletebutton.setBounds(200, 250, 95, 43);

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(310, 250, 97, 43);

        viewbutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        viewbutton.setText("View ");
        viewbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbuttonActionPerformed(evt);
            }
        });
        getContentPane().add(viewbutton);
        viewbutton.setBounds(420, 250, 89, 41);

        modifybutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        modifybutton.setText("Update");
        modifybutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifybuttonActionPerformed(evt);
            }
        });
        getContentPane().add(modifybutton);
        modifybutton.setBounds(520, 250, 97, 41);

        closebutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        closebutton.setText("Back");
        closebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(closebutton);
        closebutton.setBounds(570, 61, 89, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("  Members  Panel ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(170, 60, 403, 49);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\add (5).png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(110, 180, 50, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\removeuser.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 180, 50, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\searchuser.png")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(330, 180, 50, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\viewuser.png")); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(440, 180, 50, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\updateuser (2).png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(540, 180, 50, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\first.jpg")); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 710, 400);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        // TODO add your handling code here:
        new saaddcustomer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_addbuttonActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        // TODO add your handling code here:
        new sadelcustomer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        new sasearchcustomer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_searchActionPerformed

    private void viewbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbuttonActionPerformed
        // TODO add your handling code here:
        new saviewcustomer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_viewbuttonActionPerformed

    private void modifybuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifybuttonActionPerformed
        // TODO add your handling code here:
        new saupdatecustomer().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_modifybuttonActionPerformed

    private void closebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closebuttonActionPerformed
        // TODO add your handling code here:
        new subadminhome().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_closebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(subadminmembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(subadminmembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(subadminmembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(subadminmembers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new subadminmembers().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JButton closebutton;
    private javax.swing.JButton deletebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton modifybutton;
    private javax.swing.JButton search;
    private javax.swing.JButton viewbutton;
    // End of variables declaration//GEN-END:variables
}