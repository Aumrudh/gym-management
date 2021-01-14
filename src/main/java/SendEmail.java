
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aumrudh Lal Kumar TJ
 */

public class SendEmail {
    private String user="aumrudhmepco@gmail.com";
    private String pass="Mepco123";
    
    SendEmail(String sub,String msg){
            Properties prop=new Properties();
            prop.put("mail.smtp.host", "smtp.gmail.com");
            prop.put("mail.smtp.port", "587");	
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.starttls.enable", "true");
            Session session=Session.getInstance(prop,new javax.mail.Authenticator() {
                @Override
                protected javax.mail.PasswordAuthentication getPasswordAuthentication(){
                    return new javax.mail.PasswordAuthentication(user,pass);
                }
            });
            
            try{
                Message message=new MimeMessage(session);
                message.setFrom(new InternetAddress("no-reply@genesisgym.com"));
                //message.setRecipients(Message.RecipientType.CC, InternetAddress.parse(to));
                  try
                    {
                Class.forName("com.mysql.cj.jdbc.Driver");
                Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/gymautomationsystem","root","Jeyakumar28");
                PreparedStatement ps = conn.prepareStatement("SELECT distinct emailid FROM customer");
                ResultSet rs = ps.executeQuery();
                while(rs.next())
                {                    
                   String to=rs.getString("emailid");
                   message.addRecipients(Message.RecipientType.BCC, InternetAddress.parse(to));
                }                
                
                }
                catch(Exception e)
                {
                System.out.print(e);
                JOptionPane.showMessageDialog(null, "Invalid email id","Alert",ERROR_MESSAGE);
                }
                message.setSubject(sub);
                message.setText(msg);
                
                Transport.send(message);
                JOptionPane.showMessageDialog(null, "Email Sent", "Successful", INFORMATION_MESSAGE);
            
            }
            catch(Exception e1){
                System.out.print(e1);
                JOptionPane.showMessageDialog(null, "Email Not Sent", "UnSuccessful", WARNING_MESSAGE);
            }
    }
}
