
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
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

public class samaint extends javax.swing.JFrame {

    /**
     * Creates new form samaint
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

    public samaint() {
        setPreferredSize(new Dimension(865, 840));
        initComponents();
        name.setEditable(false);
        idadd();try
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
                PreparedStatement ps = conn.prepareStatement("SELECT * FROM maint");
                ResultSet rs = ps.executeQuery();
                DefaultTableModel tm = (DefaultTableModel)disp.getModel();
                tm.setRowCount(0);
                while(rs.next())
                {
                    Object obj[] = {rs.getInt("id"),rs.getString("name"),rs.getString("description"),rs.getInt("quantity"),rs.getInt("price")};
                    tm.addRow(obj);
                }
            }
            catch(Exception e)
            {
                //JOptionPane.showMessageDialog(null, e);
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

        jLabel18 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JComboBox<>();
        name = new javax.swing.JTextField();
        tdesc = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tprice = new javax.swing.JTextField();
        tqua = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        disp = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        del = new javax.swing.JButton();
        add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sub-Admin Product Maintanence");
        setMaximumSize(new java.awt.Dimension(865, 840));
        setMinimumSize(new java.awt.Dimension(865, 840));
        setPreferredSize(new java.awt.Dimension(865, 840));
        getContentPane().setLayout(null);

        jLabel18.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Maintanence");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(230, 20, 180, 60);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(70, 100, 120, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 170, 90, 22);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Description");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 230, 130, 30);

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                idItemStateChanged(evt);
            }
        });
        getContentPane().add(id);
        id.setBounds(210, 100, 170, 40);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(name);
        name.setBounds(210, 160, 180, 40);

        tdesc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tdesc);
        tdesc.setBounds(210, 220, 290, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Quantity");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 290, 110, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Price");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 350, 120, 30);

        tprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tpriceKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tpriceKeyTyped(evt);
            }
        });
        getContentPane().add(tprice);
        tprice.setBounds(210, 340, 170, 40);

        tqua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tqua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tquaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tquaKeyTyped(evt);
            }
        });
        getContentPane().add(tqua);
        tqua.setBounds(210, 280, 170, 40);

        disp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Description", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(disp);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 390, 830, 402);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(530, 330, 110, 40);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(530, 270, 110, 40);

        del.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        del.setText("Delete");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        getContentPane().add(del);
        del.setBounds(530, 210, 110, 40);

        add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add);
        add.setBounds(530, 150, 110, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(530, 100, 110, 40);

        back.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(530, 30, 100, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\gym_backgrounds_001.jpg")); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 860, 810);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_idItemStateChanged
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
            PreparedStatement smt=conn.prepareStatement("Select name from product where id=?");
            String s=(String)id.getSelectedItem();
            smt.setString(1,s);
            ResultSet rs=smt.executeQuery();
            while(rs.next()){
                name.setText(rs.getString("name"));
            }
        }
        catch(Exception e1){
            System.out.print(e1);
        }
    }//GEN-LAST:event_idItemStateChanged

    private void tpriceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpriceKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE )){
            evt.consume();
        }
    }//GEN-LAST:event_tpriceKeyPressed

    private void tpriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tpriceKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE )){
            evt.consume();
        }
    }//GEN-LAST:event_tpriceKeyTyped

    private void tquaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tquaKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE )){
            evt.consume();
        }
    }//GEN-LAST:event_tquaKeyPressed

    private void tquaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tquaKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE )){
            evt.consume();
        }
    }//GEN-LAST:event_tquaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code
        new maintainence().setVisible(true);
        id.setSelectedIndex(0);
        name.setText("");
        tdesc.setText("");
        tqua.setText("");
        tprice.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String ss1=(String)id.getSelectedItem();
        String s2=name.getText();
        String ss3=tdesc.getText();
        String ss4=tqua.getText();
        String ss5=tprice.getText();
        try{
            if(ss1.equals("")){
                JOptionPane.showMessageDialog(null,"Select id","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(s2.equals("")){
                JOptionPane.showMessageDialog(null,"Select name ","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(ss3.equals("")){
                JOptionPane.showMessageDialog(null,"Enter Description","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(ss4.equals("")){
                JOptionPane.showMessageDialog(null,"Enter quantity","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(ss5.equals("")){
                JOptionPane.showMessageDialog(null,"Enter Price","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                int s1=Integer.parseInt(ss1);
                int s3=Integer.parseInt(tqua.getText());
                int s4=Integer.parseInt(tprice.getText());
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
                Statement smt=conn.createStatement();
                smt.executeUpdate("UPDATE maint SET description='"+ss3+"' WHERE ID="+s1+" ");
                smt.executeUpdate("UPDATE maint SET quantity="+s3+" WHERE ID="+s1+" ");
                smt.executeUpdate("UPDATE maint SET price="+s4+" WHERE ID="+s1+" ");

                JOptionPane.showMessageDialog(null, "Updated Sucssefully","Updation", JOptionPane.INFORMATION_MESSAGE);
                id.setSelectedIndex(0);
                name.setText("");
                tdesc.setText("");
                tqua.setText("");
                tprice.setText("");
            }
        }
        catch(Exception e1){
            System.out.print(e1);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
        String ss1=(String)id.getSelectedItem();
        try{
            if(ss1 == null){
                JOptionPane.showMessageDialog(null,"Select id","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                int s1=Integer.parseInt(ss1);
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
                Statement stmt=conn.createStatement();
                stmt.executeUpdate("DELETE FROM maint WHERE ID="+s1+"");
                JOptionPane.showMessageDialog(null, "Deleted Succefully");
                id.setSelectedIndex(0);
                name.setText("");
                tdesc.setText("");
                tqua.setText("");
                tprice.setText("");
            }

        }
        catch (Exception ex)  {
            System.out.println(ex);
        }
    }//GEN-LAST:event_delActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        String ss1=(String)id.getSelectedItem();
        int s1=Integer.parseInt(ss1);
        String s2=(String)name.getText();
        String s3=tdesc.getText();
        String ss4=tqua.getText();
        String ss5=tprice.getText();
        try{
            if(ss1 == null){
                JOptionPane.showMessageDialog(null,"Select id","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(s3.equals("")){
                JOptionPane.showMessageDialog(null,"Enter Description","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(ss4.equals("")){
                JOptionPane.showMessageDialog(null,"Enter Quantity","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else if(ss5.equals("")){
                JOptionPane.showMessageDialog(null,"Enter Price","Alert",JOptionPane.WARNING_MESSAGE);
            }
            else{
                int s4=Integer.parseInt(tqua.getText());
                int s5=Integer.parseInt(tprice.getText());
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
                Statement smt=conn.createStatement();
                smt.executeUpdate("INSERT INTO maint VALUES("+s1+",'"+s2+"','"+s3+"',"+s4+","+s5+");");
                JOptionPane.showMessageDialog(null, "Inserted Sucssefully","Insertion", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(Exception e1){
            System.out.print(e1);
        }
        id.setSelectedIndex(0);
        name.setText("");
        tdesc.setText("");
        tqua.setText("");
        tprice.setText("");
    }//GEN-LAST:event_addActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String tempid = (String)id.getSelectedItem();
        int tempid1=Integer.parseInt(tempid);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
            String sql = "Select * from maint where id = ? ";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setInt(1,tempid1);
            ResultSet rs = st.executeQuery();
            while(rs.next())
            {
                tdesc.setText(rs.getString("description"));
                tqua.setText(rs.getString("quantity"));
                tprice.setText(rs.getString("price"));
            }
            int f = 0;
            String sq = "Select *  from maint";
            PreparedStatement ps = conn.prepareStatement(sq);
            ResultSet res = ps.executeQuery();
            while(res.next())
            {
                if((tempid1 == res.getInt("id")) ){
                    f++;
                }
            }
            if(f == 1){

                //SSN.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid id !");
                name.setText("");
            }
        }
        catch(Exception e)
        {
            System.out.print(e);
            JOptionPane.showMessageDialog(null, "No record found ","ALERT", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new subadminhome().setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(samaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(samaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(samaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(samaint.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new samaint().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton back;
    private javax.swing.JButton del;
    private javax.swing.JTable disp;
    private javax.swing.JComboBox<String> id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField tdesc;
    private javax.swing.JTextField tprice;
    private javax.swing.JTextField tqua;
    // End of variables declaration//GEN-END:variables
}
