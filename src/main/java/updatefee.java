
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.*;
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
public class updatefee extends javax.swing.JFrame {

    /**
     * Creates new form updatefee
     */
    public final void catadd(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
    PreparedStatement smt=conn.prepareStatement("Select distinct category from fee");
    ResultSet rs=smt.executeQuery();
    feecat.addItem("");    
    while(rs.next()){
        String tempcat=rs.getString("category");
        feecat.addItem(tempcat); 
    }
    }       
    catch(Exception e1){
     System.out.print(e1);
    }
    }
    public updatefee() {
         //setExtendedState(JFrame.MAXIMIZED_BOTH);
         setPreferredSize(new Dimension(472, 494));
        initComponents();
        catadd();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        feecat = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        feemon = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        feeprice = new javax.swing.JTextField();
        back = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Update Fee");
        getContentPane().setLayout(null);

        feecat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(feecat);
        feecat.setBounds(204, 122, 180, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Category");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(64, 118, 93, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Month");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(64, 208, 61, 38);

        update.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(230, 350, 100, 50);

        feemon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(feemon);
        feemon.setBounds(204, 208, 180, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(64, 278, 70, 40);

        feeprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        feeprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                feepriceKeyPressed(evt);
            }
        });
        getContentPane().add(feeprice);
        feeprice.setBounds(204, 278, 180, 40);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(320, 40, 90, 50);

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Update Fee ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(110, 20, 180, 80);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(70, 350, 95, 50);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\gym_backgrounds_001.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 470, 490);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
       String s1=(String)feecat.getSelectedItem();
       String s2=(String)feemon.getSelectedItem();
       String ss3=feeprice.getText();
        try{
            if(s1.equals("")){                
                    JOptionPane.showMessageDialog(null,"Enter Category","Alert",JOptionPane.WARNING_MESSAGE);     
            }
        else  if(feemon.getSelectedIndex() == -1){               
                    JOptionPane.showMessageDialog(null,"Enter Month","Alert",JOptionPane.WARNING_MESSAGE);     
            }
        else if(ss3.equals("")){                
                    JOptionPane.showMessageDialog(null,"Enter Price","Alert",JOptionPane.WARNING_MESSAGE);     
            }
        else {
            int s3=Integer.parseInt(feeprice.getText());
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
            Statement smt=conn.createStatement();
            smt.executeUpdate("UPDATE fee SET price="+s3+" WHERE category='"+s1+"' and Months='"+s2+"'");
            JOptionPane.showMessageDialog(null, "Updated Sucssefully","Updation", JOptionPane.INFORMATION_MESSAGE);
            feecat.setSelectedIndex(0);
            feemon.setSelectedIndex(0);           
            feeprice.setText("");      
        }    
        }
        catch(Exception e1){
            System.out.print(e1);
        }
    }//GEN-LAST:event_updateActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new fee().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void feepriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_feepriceKeyPressed
        // TODO add your handling code here:
        String a = feeprice.getText();
        int length = a.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<5){
                feeprice.setEditable(true);
            }
            else{
                feeprice.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                feeprice.setEditable(true);
            }
            else{
                feeprice.setEditable(false);
            }
        }  
    }//GEN-LAST:event_feepriceKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:     
        feemon.removeAllItems();
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
    PreparedStatement smt=conn.prepareStatement("Select distinct Months from fee where category=?");
    String s=(String)feecat.getSelectedItem();
    smt.setString(1,s);
    ResultSet rs=smt.executeQuery();
    feemon.addItem("");    
    while(rs.next()){
        String tempcat=rs.getString("Months");
        feemon.addItem(tempcat); 
    }
    }       
    catch(Exception e1){
     System.out.print(e1);     
    }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(updatefee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatefee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatefee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatefee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatefee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JComboBox<String> feecat;
    private javax.swing.JComboBox<String> feemon;
    private javax.swing.JTextField feeprice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}