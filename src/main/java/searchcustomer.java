
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
public class searchcustomer extends javax.swing.JFrame {

    /**
     * Creates new form searchcustomer
     */
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
    public searchcustomer() {
        setPreferredSize(new Dimension(1030, 730));
        initComponents();
        tname.setEditable(false);
        gen.setEditable(false);
        dob.setEditable(false);
        addfield.setEditable(false);
        mobileno.setEditable(false);
        emid.setEditable(false);
        doj.setEditable(false);
        fecat.setEditable(false);
        feeprice.setEditable(false);
        adpaidtext.setEditable(false);
        weighttext.setEditable(false);
        heighttext.setEditable(false);
        totpaid.setEditable(false);
        cusadd();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DOB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        emailid = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        tname = new javax.swing.JTextField();
        addfield = new javax.swing.JTextField();
        mobileno = new javax.swing.JTextField();
        emid = new javax.swing.JTextField();
        home = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        adpaidtext = new javax.swing.JTextField();
        feeprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        DOJ = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        weighttext = new javax.swing.JTextField();
        heighttext = new javax.swing.JTextField();
        tid = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        gen = new javax.swing.JTextField();
        doj = new javax.swing.JTextField();
        dob = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        fecat = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totpaid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 150, 120, 40);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Gender");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 210, 100, 50);

        DOB.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DOB.setForeground(new java.awt.Color(255, 255, 255));
        DOB.setText("DOB");
        getContentPane().add(DOB);
        DOB.setBounds(30, 280, 140, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 350, 140, 40);

        mobile.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        mobile.setForeground(new java.awt.Color(255, 255, 255));
        mobile.setText("Mobile No.");
        getContentPane().add(mobile);
        mobile.setBounds(30, 420, 180, 60);

        emailid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        emailid.setForeground(new java.awt.Color(255, 255, 255));
        emailid.setText("Email Id");
        getContentPane().add(emailid);
        emailid.setBounds(30, 500, 170, 40);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fee Category");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 560, 160, 50);

        tname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(tname);
        tname.setBounds(200, 150, 260, 40);

        addfield.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addfieldActionPerformed(evt);
            }
        });
        getContentPane().add(addfield);
        addfield.setBounds(200, 350, 720, 50);

        mobileno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilenoActionPerformed(evt);
            }
        });
        mobileno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobilenoKeyTyped(evt);
            }
        });
        getContentPane().add(mobileno);
        mobileno.setBounds(200, 430, 260, 50);

        emid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        emid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emidActionPerformed(evt);
            }
        });
        getContentPane().add(emid);
        emid.setBounds(200, 490, 260, 50);

        home.setBackground(new java.awt.Color(255, 255, 255));
        home.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        home.setText("Back");
        home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeActionPerformed(evt);
            }
        });
        getContentPane().add(home);
        home.setBounds(890, 40, 90, 37);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Advance Paid");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(500, 430, 180, 50);

        adpaidtext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adpaidtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adpaidtextActionPerformed(evt);
            }
        });
        adpaidtext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                adpaidtextKeyTyped(evt);
            }
        });
        getContentPane().add(adpaidtext);
        adpaidtext.setBounds(710, 430, 200, 50);

        feeprice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(feeprice);
        feeprice.setBounds(200, 630, 270, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Height");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 270, 130, 50);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Weight");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(490, 210, 120, 50);

        DOJ.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        DOJ.setForeground(new java.awt.Color(255, 255, 255));
        DOJ.setText("Date of joining");
        getContentPane().add(DOJ);
        DOJ.setBounds(480, 140, 210, 50);

        jLabel17.setFont(new java.awt.Font("Monotype Corsiva", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("                        Search Customer");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(220, 20, 402, 41);

        weighttext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        weighttext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                weighttextKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                weighttextKeyTyped(evt);
            }
        });
        getContentPane().add(weighttext);
        weighttext.setBounds(700, 210, 200, 50);

        heighttext.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        heighttext.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heighttextKeyTyped(evt);
            }
        });
        getContentPane().add(heighttext);
        heighttext.setBounds(700, 270, 200, 50);

        tid.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(tid);
        tid.setBounds(200, 90, 120, 36);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Id");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 90, 110, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 85, 100, 40);

        gen.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(gen);
        gen.setBounds(200, 220, 260, 40);

        doj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(doj);
        doj.setBounds(700, 150, 200, 40);

        dob.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(dob);
        dob.setBounds(200, 290, 270, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fee price");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 630, 150, 40);

        fecat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(fecat);
        fecat.setBounds(200, 562, 530, 40);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Total Paid");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(510, 510, 150, 50);

        totpaid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(totpaid);
        totpaid.setBounds(710, 512, 200, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(510, 85, 80, 40);

        jLabel11.setIcon(new javax.swing.ImageIcon("C:\\Users\\Aumrudh Lal Kumar TJ\\Documents\\NetBeansProjects\\gymautotmation\\images\\gym_backgrounds_001.jpg")); // NOI18N
        jLabel11.setText("jLabel7");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 1030, 710);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addfieldActionPerformed

    private void mobilenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobilenoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobilenoActionPerformed

    private void mobilenoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobilenoKeyTyped
        // TODO add your handling code here:
        String phone = mobileno.getText();
        int len = phone.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9')
        {
            if(len<10){
                mobileno.setEditable(true);
                //JOptionPane.showMessageDialog(null, "Invalid Mobile Number","Alert", JOptionPane.WARNING_MESSAGE);
            }
            else{
                mobileno.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                mobileno.setEditable(true);
            }
            else{
                mobileno.setEditable(false);
            }
        }
    }//GEN-LAST:event_mobilenoKeyTyped

    private void emidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emidActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        new members().setVisible(true);
    }//GEN-LAST:event_homeActionPerformed

    private void adpaidtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adpaidtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adpaidtextActionPerformed

    private void adpaidtextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adpaidtextKeyTyped
        // TODO add your handling code here:
        char c =evt.getKeyChar();
        if(!(Character.isDigit(c))||(c==KeyEvent.VK_BACK_SPACE)||(c==KeyEvent.VK_DELETE )){
            evt.consume();
        }
    }//GEN-LAST:event_adpaidtextKeyTyped

    private void weighttextKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weighttextKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_weighttextKeyPressed

    private void weighttextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weighttextKeyTyped
        // TODO add your handling code here:
        String a = weighttext.getText();
        int length = a.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<2){
                weighttext.setEditable(true);
            }
            else{
                weighttext.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                weighttext.setEditable(true);
            }
            else{
                weighttext.setEditable(false);
            }
        }
    }//GEN-LAST:event_weighttextKeyTyped

    private void heighttextKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heighttextKeyTyped
        // TODO add your handling code here:
        String a = heighttext.getText();
        int length = a.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<2){
                heighttext.setEditable(true);
            }
            else{
                heighttext.setEditable(false);
            }
        }
        else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                heighttext.setEditable(true);
            }
            else{
                heighttext.setEditable(false);
            }
        }
    }//GEN-LAST:event_heighttextKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
                     tname.setText(rs.getString("name"));
                     gen.setText(rs.getString("gender"));
                     dob.setText(rs.getString("dob"));
                     addfield.setText(rs.getString("address"));
                     mobileno.setText(rs.getString("mobile"));
                     emid.setText(rs.getString("emailid"));
                     doj.setText(rs.getString("doj"));
                     fecat.setText(rs.getString("fee"));
                     feeprice.setText(rs.getString("totalfee"));
                     adpaidtext.setText(rs.getString("advpaid"));
                     weighttext.setText(rs.getString("weight"));
                     heighttext.setText(rs.getString("height"));
                     totpaid.setText(rs.getString("totalpaid"));
                     
                }
        }
        catch(Exception e1){
            System.out.println(e1);
            JOptionPane.showMessageDialog(null, "Error","ERror", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
                     tid.setSelectedIndex(0);
                     tname.setText("");
                     gen.setText("");
                     dob.setText("");
                     addfield.setText("");
                     mobileno.setText("");
                     emid.setText("");
                     doj.setText("");
                     fecat.setText("");
                     feeprice.setText("");
                     adpaidtext.setText("");
                     weighttext.setText("");
                     heighttext.setText("");
                     totpaid.setText("");
        
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
            java.util.logging.Logger.getLogger(searchcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(searchcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(searchcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(searchcustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new searchcustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DOB;
    private javax.swing.JLabel DOJ;
    private javax.swing.JTextField addfield;
    private javax.swing.JTextField adpaidtext;
    private javax.swing.JTextField dob;
    private javax.swing.JTextField doj;
    private javax.swing.JLabel emailid;
    private javax.swing.JTextField emid;
    private javax.swing.JTextField fecat;
    private javax.swing.JTextField feeprice;
    private javax.swing.JTextField gen;
    private javax.swing.JTextField heighttext;
    private javax.swing.JButton home;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel mobile;
    private javax.swing.JTextField mobileno;
    private javax.swing.JComboBox<String> tid;
    private javax.swing.JTextField tname;
    private javax.swing.JTextField totpaid;
    private javax.swing.JTextField weighttext;
    // End of variables declaration//GEN-END:variables
}
