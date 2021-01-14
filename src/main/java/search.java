
import java.awt.event.KeyEvent;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aumrudh Lal Kumar TJ
 */
public class search extends javax.swing.JFrame {
     public final void cusadd(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
    PreparedStatement smt=conn.prepareStatement("Select distinct id from customer");
    ResultSet rs=smt.executeQuery();
    tid.addItem("");
    while(rs.next()){
        int tempcat=rs.getInt("id");
        String tcus=String.valueOf(tempcat);
        tid.addItem(tcus);        
    }
    }       
    catch(Exception e1){
     System.out.print(e1);
    }
    }     
     
    public search() {
        //etExtendedState(JFrame.MAXIMIZED_BOTH);    
        initComponents();        
        cusadd();
        name.setEditable(false);
        
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
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        disp = new javax.swing.JTable();
        mempage = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        tid = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Search Customer ");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 50, 40));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 150, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 80, 40));

        search.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 130, 40));

        disp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Gender", "DOB", "Address", "Mobile", "Email Id", "DOJ", "Fee", "Total Fee", "Advance Paid", "Weight", "Height", "Total Paid"
            }
        ));
        jScrollPane1.setViewportView(disp);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 1190, 110));

        mempage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mempage.setText("Back");
        mempage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mempageActionPerformed(evt);
            }
        });
        getContentPane().add(mempage, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 140, 40));

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText(" Search Customer");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 300, -1));

        tid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                tidItemStateChanged(evt);
            }
        });
        getContentPane().add(tid, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\gym_backgrounds_001.jpg")); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 380));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
        String ss1=(String)tid.getSelectedItem();
        try{
            int s1=Integer.parseInt(ss1);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
            Statement smt=conn.createStatement();
            DefaultTableModel tm = (DefaultTableModel)disp.getModel();
            while (tm.getRowCount()>0)
          {
              tm.removeRow(0);
          }
            ResultSet rs=smt.executeQuery("SELECT * FROM customer WHERE id="+s1+"");
            while(rs.next())
		{
                    //JOptionPane.showMessageDialog(null, "Customer Found","Search", JOptionPane.INFORMATION_MESSAGE);
                    Object obj[]= {rs.getInt("id"),rs.getString("name"),rs.getString("gender"),rs.getString("dob"),rs.getString("address"),rs.getLong("mobile"),rs.getString("emailid"),
                    rs.getString("doj"),rs.getString("fee"),rs.getInt("totalfee"),rs.getInt("advpaid"),rs.getDouble("weight"),rs.getDouble("height"),rs.getInt("totalpaid")};
                    tm.addRow(obj);                 
                }
        }
        catch(Exception e1){
            System.out.println(e1);
            JOptionPane.showMessageDialog(null, "Customer Not Found","ALERT", JOptionPane.WARNING_MESSAGE);
        }
            
    }//GEN-LAST:event_searchActionPerformed

    private void mempageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mempageActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
         new members().setVisible(true);
    }//GEN-LAST:event_mempageActionPerformed

    private void tidItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_tidItemStateChanged
        // TODO add your handling code here:
        String ss1=(String)tid.getSelectedItem();
        try{            
            int s1=Integer.parseInt(ss1);
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
            Statement smt=conn.createStatement();
            ResultSet rs=smt.executeQuery("SELECT * FROM customer WHERE id="+s1+"");
            while(rs.next())
		{
                    //JOptionPane.showMessageDialog(null, "Customer Found","Found", JOptionPane.INFORMATION_MESSAGE);
                     name.setText(rs.getString("name"));
                     
                }
        }
        catch(Exception e1){
            System.out.println(e1);
           // JOptionPane.showMessageDialog(null, "Error","ERror", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_tidItemStateChanged
        
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
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new search().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable disp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mempage;
    private javax.swing.JTextField name;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> tid;
    // End of variables declaration//GEN-END:variables
}
