
package ec_panel;

import combination.CombinedFrame;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import combination.AppInfo;
import combination.VoteQuery;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class VoterRegCommission extends javax.swing.JFrame implements AppInfo{

   String vid,code,ename;
    
    public VoterRegCommission() throws Exception {
        
        super("  "+version);
        
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
       
        this.setSize(679, 645);
        setResizable(false);
        this.setVisible(true);
        
        eidT.setText(CommissionLogin.eid);
        eidT.setEditable(false);
        emailT.setText(CommissionLogin.email);
        emailT.setEditable(false);
        
            
        
        enameL.setText(CommissionLogin.ename);
        
        }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        emailL = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        vidT = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        vmail = new javax.swing.JTextField();
        eidT = new javax.swing.JTextField();
        emailT = new javax.swing.JTextField();
        VoterListB = new javax.swing.JButton();
        enameL = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        emailL.setBackground(new java.awt.Color(157, 214, 255));
        emailL.setForeground(new java.awt.Color(0, 0, 0));
        emailL.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Voter Registration");
        emailL.add(jLabel1);
        jLabel1.setBounds(100, 90, 470, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Voter ID");
        emailL.add(jLabel2);
        jLabel2.setBounds(140, 300, 160, 30);
        emailL.add(vidT);
        vidT.setBounds(300, 300, 210, 30);

        submitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });
        emailL.add(submitButton);
        submitButton.setBounds(300, 380, 210, 30);

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        emailL.add(updateButton);
        updateButton.setBounds(410, 450, 100, 30);

        deleteButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        emailL.add(deleteButton);
        deleteButton.setBounds(300, 450, 100, 30);

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setText("Home");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        emailL.add(exitButton);
        exitButton.setBounds(300, 480, 210, 30);

        vmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vmailActionPerformed(evt);
            }
        });
        emailL.add(vmail);
        vmail.setBounds(300, 340, 210, 30);

        eidT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eidTActionPerformed(evt);
            }
        });
        emailL.add(eidT);
        eidT.setBounds(300, 220, 210, 30);

        emailT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTActionPerformed(evt);
            }
        });
        emailL.add(emailT);
        emailT.setBounds(300, 260, 210, 30);

        VoterListB.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        VoterListB.setText("Voter List");
        VoterListB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoterListBActionPerformed(evt);
            }
        });
        emailL.add(VoterListB);
        VoterListB.setBounds(300, 420, 210, 30);

        enameL.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        enameL.setForeground(new java.awt.Color(51, 51, 255));
        enameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enameL.setText("EName");
        emailL.add(enameL);
        enameL.setBounds(20, 40, 640, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Election ID");
        emailL.add(jLabel4);
        jLabel4.setBounds(140, 220, 200, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("EC Mail");
        emailL.add(jLabel3);
        jLabel3.setBounds(140, 260, 200, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Voter Email");
        emailL.add(jLabel5);
        jLabel5.setBounds(140, 340, 160, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec_panel/longlogo.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        emailL.add(jLabel6);
        jLabel6.setBounds(0, 0, 820, 660);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emailL, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(emailL, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        VoteQuery.theQuery("UPDATE `voter` SET mail='"+vmail.getText().trim()+"' WHERE voterId='"+vidT.getText().trim()+"' and e_mail='"+emailT.getText().trim()+"' and e_id='"+eidT.getText().trim()+"'");
        JOptionPane.showMessageDialog(null, "Voter Information is Updated");
        sendMail();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        VoteQuery.theQuery("INSERT INTO `voter`(`e_id`,`e_mail`,`secrete`,`voterId`,`mail`,`name`,`pass`) VALUES  ('"+eidT.getText().trim()+"','"+emailT.getText().trim()+"','"+(eidT.getText().trim()+emailT.getText().trim()).hashCode()+"','"+vidT.getText().trim()+"','"+vmail.getText().trim()+"','','')");
        JOptionPane.showMessageDialog(null, "Voter Information is Saved");
        sendMail();
    }//GEN-LAST:event_submitButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        
        VoteQuery.theQuery("DELETE FROM `voter` WHERE voterId='"+vidT.getText().trim()+"' and e_mail='"+emailT.getText().trim()+"' and e_id='"+eidT.getText().trim()+"'");
        JOptionPane.showMessageDialog(null, "Voter Information is Deleted");
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
        int v= JOptionPane.showConfirmDialog(null, "Do you want to leave from here?", "Confirmation Dialogue", JOptionPane.YES_NO_OPTION);
               if(v==JOptionPane.YES_OPTION){
                  new CombinedFrame();
                  this.setVisible(false);
               }
        
    }//GEN-LAST:event_exitButtonActionPerformed

    private void vmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vmailActionPerformed

    private void eidTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eidTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eidTActionPerformed

    private void emailTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailTActionPerformed

    private void VoterListBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoterListBActionPerformed
        new VoterList();
    }//GEN-LAST:event_VoterListBActionPerformed

     
     public void sendMail(){

      String to = vmail.getText().trim();         // Recipient's email ID needs to be mentioned.
      String from = "election.divs@gmail.com";      // Sender's email ID needs to be mentioned
      
      String host = "smtp.gmail.com";     // Assuming you are sending email from localhost
      Properties properties = System.getProperties();
      properties.put("mail.smtp.host", host);
      properties.put("mail.smtp.port", "465");
      properties.put("mail.smtp.ssl.enable", "true");
      properties.put("mail.smtp.auth", "true");

      Session session = Session.getInstance(properties, new javax.mail.Authenticator(){
        protected PasswordAuthentication getPasswordAuthentication() {
          return new PasswordAuthentication("election.divs@gmail.com", "kjhtte8-04kiu8er");
        }
      });
      
      try {
         MimeMessage message = new MimeMessage(session);         // Create a default MimeMessage object.

         message.setFrom(new InternetAddress(from));         // Set From: header field of the header.
         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));         // Set To: header field of the header.
         message.setSubject(CommissionLogin.ename);         // Set Subject: header field
         message.setText(" Dear Voter,\n Save this following  information until your vote is accepted.\n   ID: "+vidT.getText().trim()+"\n   Election Code: "+(eidT.getText().trim()+emailT.getText().trim()).hashCode()+"\n   E-mail: "+to+"\nDon't share this information with anyone.");        // Now set the actual message
         Transport.send(message);  // Send message
         
         System.out.println("Sent message successfully....");
         
      } catch (Exception mex) {
         mex.printStackTrace();
      }
   
     } 
     
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(VoterRegCommission.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VoterRegCommission().setVisible(true);
                } catch (Exception ex) {
                    
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton VoterListB;
    private javax.swing.JButton deleteButton;
    private javax.swing.JTextField eidT;
    private javax.swing.JPanel emailL;
    private javax.swing.JTextField emailT;
    private javax.swing.JLabel enameL;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton updateButton;
    private javax.swing.JTextField vidT;
    private javax.swing.JTextField vmail;
    // End of variables declaration//GEN-END:variables
}
