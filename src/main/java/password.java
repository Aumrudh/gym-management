
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
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
public class password extends javax.swing.JFrame {

    /**
     * Creates new form password
     */
    public password() {
        // setExtendedState(JFrame.MAXIMIZED_BOTH);
         setPreferredSize(new Dimension(545, 488));
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

        oldpaf = new javax.swing.JPasswordField();
        newpassf = new javax.swing.JPasswordField();
        oldpass = new javax.swing.JLabel();
        newpass = new javax.swing.JLabel();
        sumbit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        confirmnewpassf = new javax.swing.JPasswordField();
        homebutton = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Change Password");
        setMaximumSize(new java.awt.Dimension(538, 448));
        getContentPane().setLayout(null);

        oldpaf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(oldpaf);
        oldpaf.setBounds(260, 180, 210, 40);

        newpassf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(newpassf);
        newpassf.setBounds(260, 250, 210, 40);

        oldpass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        oldpass.setForeground(new java.awt.Color(255, 255, 255));
        oldpass.setText("Old Password");
        getContentPane().add(oldpass);
        oldpass.setBounds(30, 180, 130, 30);

        newpass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        newpass.setForeground(new java.awt.Color(255, 255, 255));
        newpass.setText("New Password");
        getContentPane().add(newpass);
        newpass.setBounds(30, 250, 140, 30);

        sumbit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sumbit.setText("Change Password");
        sumbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumbitActionPerformed(evt);
            }
        });
        getContentPane().add(sumbit);
        sumbit.setBounds(160, 380, 200, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 110, 100, 40);

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(jTextField1);
        jTextField1.setBounds(260, 110, 210, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirm New Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 310, 210, 30);

        confirmnewpassf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(confirmnewpassf);
        confirmnewpassf.setBounds(260, 310, 210, 40);

        homebutton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        homebutton.setText("Back");
        homebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homebuttonActionPerformed(evt);
            }
        });
        getContentPane().add(homebutton);
        homebutton.setBounds(440, 20, 80, 50);

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Change Admin Password  ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(90, 30, 340, 60);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\gym_backgrounds_001.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 540, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sumbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumbitActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
            String user=jTextField1.getText();
            String oldpass = oldpaf.getText();
            String newpass = newpassf.getText();
            String cnewpass=confirmnewpassf.getText();
            if(user.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Username ","Alert",JOptionPane.WARNING_MESSAGE);
                }
             if(oldpass.equals("")){
            JOptionPane.showMessageDialog(null,"Enter old Password ","Alert",JOptionPane.WARNING_MESSAGE);
            }
             if(newpass.equals("")){
            JOptionPane.showMessageDialog(null,"Enter new Password ","Alert",JOptionPane.WARNING_MESSAGE);
            }
              if(newpass.equals(cnewpass)){
            
            Statement smt=conn.createStatement();
            ResultSet rs=smt.executeQuery("SELECT * FROM gym Where username='"+user+"'");
           
            while(rs.next()){
                if(oldpass.equals(rs.getString("password"))){
                    String sql3="UPDATE gym SET password='"+newpass+"' WHERE username='"+user+"'";
                    smt.executeUpdate(sql3);
                    JOptionPane.showMessageDialog(null, "Password Updated ");
                    jTextField1.setText("");
                    oldpaf.setText("");
                    newpassf.setText("");
                    confirmnewpassf.setText("");
                    //this.setVisible(false);
                    //new account().setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Username Or Password","Alert",JOptionPane.WARNING_MESSAGE);
                    jTextField1.setText("");
                    oldpaf.setText("");
                    newpassf.setText("");
                    confirmnewpassf.setText("");
                }
            } 
              }
              else{                  
            JOptionPane.showMessageDialog(null,"New Password and confirm new password must be same  ","Alert",JOptionPane.WARNING_MESSAGE);
            jTextField1.setText("");
                    oldpaf.setText("");
                    newpassf.setText("");
                    confirmnewpassf.setText("");
              }
             
    }                                        
    catch(Exception e1){
     System.out.print(e1);
    }
        
    }//GEN-LAST:event_sumbitActionPerformed

    private void homebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homebuttonActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new account().setVisible(true);
    }//GEN-LAST:event_homebuttonActionPerformed

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
            java.util.logging.Logger.getLogger(password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(password.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new password().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confirmnewpassf;
    private javax.swing.JButton homebutton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel newpass;
    private javax.swing.JPasswordField newpassf;
    private javax.swing.JPasswordField oldpaf;
    private javax.swing.JLabel oldpass;
    private javax.swing.JButton sumbit;
    // End of variables declaration//GEN-END:variables
}
