
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
public class updatepdt extends javax.swing.JFrame {

    /**
     * Creates new form updatepdt
     */
     public final void idadd(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
    PreparedStatement smt=conn.prepareStatement("Select id from product");
    ResultSet rs=smt.executeQuery();
    id.addItem(""); 
    while(rs.next()){
        String tempcat=rs.getString("id");
        id.addItem(tempcat);        
    }
    }       
    catch(Exception e1){
     System.out.print(e1);
    }
    }
    public updatepdt() {
        setPreferredSize(new Dimension(370, 540));
        initComponents();
        idadd();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idlabel = new javax.swing.JLabel();
        namelabel = new javax.swing.JLabel();
        quanlabel = new javax.swing.JLabel();
        tquan = new javax.swing.JTextField();
        tprice = new javax.swing.JTextField();
        pricelabel = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        update = new javax.swing.JButton();
        id = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        des = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modify Product");
        getContentPane().setLayout(null);

        idlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        idlabel.setForeground(new java.awt.Color(255, 255, 255));
        idlabel.setText("Id");
        getContentPane().add(idlabel);
        idlabel.setBounds(40, 120, 61, 40);

        namelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        namelabel.setForeground(new java.awt.Color(255, 255, 255));
        namelabel.setText("Name");
        getContentPane().add(namelabel);
        namelabel.setBounds(40, 170, 80, 48);

        quanlabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        quanlabel.setForeground(new java.awt.Color(255, 255, 255));
        quanlabel.setText("Quantity");
        getContentPane().add(quanlabel);
        quanlabel.setBounds(40, 230, 90, 42);

        tquan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tquan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tquanActionPerformed(evt);
            }
        });
        tquan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tquanKeyTyped(evt);
            }
        });
        getContentPane().add(tquan);
        tquan.setBounds(150, 240, 150, 42);

        tprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tpriceActionPerformed(evt);
            }
        });
        tprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tpriceKeyTyped(evt);
            }
        });
        getContentPane().add(tprice);
        tprice.setBounds(150, 300, 150, 41);

        pricelabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pricelabel.setForeground(new java.awt.Color(255, 255, 255));
        pricelabel.setText("Price");
        getContentPane().add(pricelabel);
        pricelabel.setBounds(40, 290, 81, 46);

        back.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(260, 440, 104, 37);

        update.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update);
        update.setBounds(140, 440, 103, 37);

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(id);
        id.setBounds(150, 120, 150, 40);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(name);
        name.setBounds(150, 180, 150, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 440, 95, 37);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Description");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 360, 103, 48);

        des.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(des);
        des.setBounds(150, 360, 150, 40);

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Modify Product");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(80, 20, 235, 80);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\gym_backgrounds_001.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 370, 500);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tquanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tquanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tquanActionPerformed

    private void tquanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tquanKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE )){
            evt.consume();
        }
    }//GEN-LAST:event_tquanKeyTyped

    private void tpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tpriceActionPerformed

    private void tpriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpriceKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE )){
            evt.consume();
        }
    }//GEN-LAST:event_tpriceKeyTyped

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new product().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:

        String ss1=(String)id.getSelectedItem();
        String s2=name.getText();
        String ss3=tquan.getText();
        String ss4=tprice.getText();
        String ss5=des.getText();
        if(ss1.equals("")){
            JOptionPane.showMessageDialog(null,"Select id","Alert",JOptionPane.WARNING_MESSAGE);
        }
        if(s2.equals("")){
            JOptionPane.showMessageDialog(null,"Select name ","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else if(ss3.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Quantity","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else if(ss4.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Price","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else if(ss5.equals("")){
            JOptionPane.showMessageDialog(null,"Enter Description","Alert",JOptionPane.WARNING_MESSAGE);
        }
        else{
            try{
                int s1=Integer.parseInt(ss1);
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
                Statement smt=conn.createStatement();
                if(ss3.equals("")){
                    //JOptionPane.showMessageDialog(null, "Enter Quantity","Updation", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    int s3=Integer.parseInt(tquan.getText());
                    smt.executeUpdate("UPDATE product SET quantity="+s3+" WHERE ID="+s1+" ");
                    //JOptionPane.showMessageDialog(null, "Updated Quantity","Updation", JOptionPane.INFORMATION_MESSAGE);
                }
                if(ss4.equals("")){
                    //JOptionPane.showMessageDialog(null, "Enter price","Updation", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    int s4=Integer.parseInt(tprice.getText());
                    smt.executeUpdate("UPDATE product SET totalprice="+s4+" WHERE ID="+s1+" ");
                    //JOptionPane.showMessageDialog(null, "Updated price","Updation", JOptionPane.INFORMATION_MESSAGE);
                }
                if(ss5.equals("")){
                    // JOptionPane.showMessageDialog(null,"Enter Description","Alert",JOptionPane.WARNING_MESSAGE);
                }
                else{
                    smt.executeUpdate("UPDATE product SET description='"+ss5+"' WHERE ID="+s1+" ");
                }
                JOptionPane.showMessageDialog(null, "Updated Sucssefully","Updation", JOptionPane.INFORMATION_MESSAGE);
                id.setSelectedIndex(0);
                name.setText("");
                tquan.setText("");
                tprice.setText("");
                des.setText("");
            }
            catch(Exception e1){
                System.out.print(e1);
            }
        }
    }//GEN-LAST:event_updateActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String tid = (String)id.getSelectedItem();
        int tempid=Integer.parseInt(tid);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
            String sql = "Select * from product where id = ? ";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,tempid);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                name.setText(rs.getString("name"));
                tquan.setText(rs.getString("quantity"));
                tprice.setText(rs.getString("totalprice"));
                des.setText(rs.getString("description"));
            }
            int f = 0;
            String sq = "Select id , name from product";
            PreparedStatement ps = conn.prepareStatement(sq);
            ResultSet res = ps.executeQuery();
            while(res.next())
            {
                if((tempid == res.getInt("id")) ){
                    f++;
                }
            }
            if(f == 1){
                //JOptionPane.showMessageDialog(null,"Doctor SSN already exists !");
                //SSN.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid id  !");
                name.setText("");
                tquan.setText("");
                tprice.setText("");
                des.setText("");
            }
        }
        catch(Exception e)
        {
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "No record found ","ALERT", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(updatepdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updatepdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updatepdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updatepdt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updatepdt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JTextField des;
    private javax.swing.JComboBox<String> id;
    private javax.swing.JLabel idlabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JTextField name;
    private javax.swing.JLabel namelabel;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JLabel quanlabel;
    private javax.swing.JTextField tprice;
    private javax.swing.JTextField tquan;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
