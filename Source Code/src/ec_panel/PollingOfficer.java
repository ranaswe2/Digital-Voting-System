
package ec_panel;

import static combination.AppInfo.version;
import combination.VoteQuery;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class PollingOfficer extends javax.swing.JFrame {

    public PollingOfficer() {
        
        super("  "+version);
        
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
       
        this.setSize(679, 645);
        setResizable(false);
        this.setVisible(true);
        
       // eidT.setText(CommissionPanel.eid);
        
        
        enameL.setText(CommissionLogin.ename);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enameL = new javax.swing.JLabel();
        nameT = new javax.swing.JTextField();
        mailT = new javax.swing.JTextField();
        centerT = new javax.swing.JTextField();
        roomT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        enameL.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        enameL.setForeground(new java.awt.Color(0, 0, 255));
        enameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(enameL);
        enameL.setBounds(10, 40, 650, 30);

        nameT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        nameT.setForeground(new java.awt.Color(0, 0, 0));
        nameT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTActionPerformed(evt);
            }
        });
        getContentPane().add(nameT);
        nameT.setBounds(300, 220, 240, 30);

        mailT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        mailT.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(mailT);
        mailT.setBounds(300, 260, 240, 30);

        centerT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        centerT.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(centerT);
        centerT.setBounds(300, 300, 240, 30);

        roomT.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        roomT.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(roomT);
        roomT.setBounds(300, 340, 240, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 220, 220, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("E-Mail");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 260, 220, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Vote Center");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 300, 220, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Bulding & Room No.");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 340, 220, 30);

        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 204));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Polling Officer");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 90, 510, 20);

        jButton1.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(480, 460, 130, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec_panel/longlogo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-40, -130, 790, 870);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        VoteQuery.theQuery("INSERT INTO `officers`(`e_code`, `name`, `center`, `room`, `email`) VALUES  ('"+CommissionLogin.ecode+"','"+nameT.getText().trim()+"','"+centerT.getText().trim()+"','"+roomT.getText().trim()+"','"+mailT.getText().trim()+"')");
        JOptionPane.showMessageDialog(null, "Given Information are Saved");
        sendMail();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nameTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTActionPerformed

    
        
     public void sendMail(){

      String to = mailT.getText().trim();         // Recipient's email ID needs to be mentioned.
      String from = "election.divs@gmail.com";      // Sender's email ID needs to be mentioned
      
      String host = "smtp.gmail.com";     // Assuming you are sending email from localhost
      Properties properties = System.getProperties();
      properties.put("mail.smtp.host", host);
      properties.put("mail.smtp.port", "465");
      properties.put("mail.smtp.ssl.enable", "true");
      properties.put("mail.smtp.auth", "true");

      Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
        protected PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication("election.divs@gmail.com", "********");
        }
      });

      try {
         MimeMessage message = new MimeMessage(session);         // Create a default MimeMessage object.

         message.setFrom(new InternetAddress(from));         // Set From: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));         // Set To: header field of the header.
         message.setSubject(enameL.getText());         // Set Subject: header field
         message.setText("Dear "+nameT.getText()+",\nYou are appointed as a Polling Officer(PO) from Election Commission. Save these following  information until the election is completed successfully."
                 + "\n   Election Code: "+CommissionLogin.ecode+"\n   PO ID: "+(mailT.getText().trim()+",$.;@']").hashCode()+""
                         + "\n   Vote Center: "+centerT.getText()+ "\n   Building & Room: "+roomT.getText()+""
                         + "\n   Booth Number: "+(CommissionLogin.email+"*$%#?@>=_/<").hashCode()+"\nDon't share this information with anyone.");        // Now set the actual message
         Transport.send(message);  // Send message
         
         System.out.println("Sent message successfully....");
         
      } catch (Exception mex) {
         mex.printStackTrace();
      }
   
     } 
    
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PollingOfficer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField centerT;
    private javax.swing.JLabel enameL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField mailT;
    private javax.swing.JTextField nameT;
    private javax.swing.JTextField roomT;
    // End of variables declaration//GEN-END:variables
}
