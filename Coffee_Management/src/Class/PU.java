/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;
import java.util.Date;
import javax.mail.Authenticator;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class PU {
    public String username,password;
    public PU(){
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public boolean ktt(String sh,String ch,PU pu){
        if(pu.username.compareTo(sh)==0&&pu.password.compareTo(ch)==0) return true;
        else return false;
    }
    public static void SendMail(String email,String content) throws AddressException, MessagingException{
        Properties pro=System.getProperties();
         pro.put("mail.smtp.auth","true");
          pro.put("mail.smtp.starttls.enable", "true");
        pro.put("mail.smtp.host","smtp.gmail.com");
       
        pro.put("mail.smtp.port","587");
        pro.put("mail.smtp.socKetFactory.class",javax.net.ssl.SSLSocketFactory.class.getName());
        Session session= Session.getDefaultInstance(pro, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("leha220699@gmail.com","hale9991");
            }
        });
        Message message= new MimeMessage(session);
        message.addRecipient(Message.RecipientType.TO,new InternetAddress(email));
        message.addRecipient(Message.RecipientType.CC, new InternetAddress("170207101@vnu.edu.vn"));
        message.setSubject("Dream Beans Coffee_Password-"+new Date());
        message.setContent(content,"text/html");
        Transport.send(message);
        }
}
