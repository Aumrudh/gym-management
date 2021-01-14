
import java.awt.Dimension;
import java.sql.*;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aumrudh Lal Kumar TJ
 */
public class addsubadmin extends javax.swing.JFrame {

    /**
     * Creates new form addsubadmin
     */
    public addsubadmin() {
        initComponents();
        setPreferredSize(new Dimension(468, 387));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel18 = new javax.swing.JLabel();
        homebutton = new javax.swing.JButton();
        userlabel = new javax.swing.JLabel();
        passlabel = new javax.swing.JLabel();
        usernametf = new javax.swing.JTextField();
        passfield = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Add SubAdmin");
        setMaximumSize(new java.awt.Dimension(468, 387));
        setMinimumSize(new java.awt.Dimension(468, 387));
        setPreferredSize(new java.awt.Dimension(468, 387));
        getContentPane().setLayout(null);

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Add SubAdmin Panel");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(90, 40, 300, 60);

        homebutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homebutton.setText("Back");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton);
        homebutton.setBounds(250, 270, 114, 50);

        userlabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        userlabel.setForeground(new java.awt.Color(255, 255, 255));
        userlabel.setText("Username");
        getContentPane().add(userlabel);
        userlabel.setBounds(90, 140, 103, 28);

        passlabel.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        passlabel.setForeground(new java.awt.Color(255, 255, 255));
        passlabel.setText("Password");
        getContentPane().add(passlabel);
        passlabel.setBounds(90, 190, 107, 41);
        getContentPane().add(usernametf);
        usernametf.setBounds(240, 130, 160, 42);
        getContentPane().add(passfield);
        passfield.setBounds(240, 190, 160, 41);

        login.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        login.setText("Add");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login);
        login.setBounds(110, 270, 120, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\gym_backgrounds_001.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 470, 370);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new account().setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        String user=usernametf.getText();
        String pass;
        pass = passfield.getText();        
        try{
            if(user.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Username ","Alert",JOptionPane.WARNING_MESSAGE);
            }

            else if(pass.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Password ","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{          
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
            Statement smt=conn.createStatement();
            ResultSet rs=smt.executeQuery("SELECT * FROM gymsubadmin" );           
            if(rs.next()){
                if(user.equals(rs.getString("username"))){
                    JOptionPane.showMessageDialog(null,"Username already exist","Unsuccessful",JOptionPane.ERROR_MESSAGE);
                     usernametf.setText("");
                    passfield.setText("");
                }
            else{
            smt.executeUpdate("INSERT INTO gymsubadmin VALUES('"+user+"','"+pass+"');");
            JOptionPane.showMessageDialog(null,"New Subadmin added","Successful",JOptionPane.INFORMATION_MESSAGE);
            usernametf.setText("");
            passfield.setText("");
                }
            }
            }
        }
        catch(Exception e1){
            JOptionPane.showMessageDialog(null,"Username already exist","Unsuccessful",JOptionPane.ERROR_MESSAGE);
            usernametf.setText("");
            passfield.setText("");
            System.out.print(e1);
        }
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(addsubadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addsubadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addsubadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addsubadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addsubadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField passfield;
    private javax.swing.JLabel passlabel;
    private javax.swing.JLabel userlabel;
    private javax.swing.JTextField usernametf;
    // End of variables declaration//GEN-END:variables
}
