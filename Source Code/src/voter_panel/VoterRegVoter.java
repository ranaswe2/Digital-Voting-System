
package voter_panel;

import combination.CombinedFrame;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import combination.AppInfo;
import combination.VoteQuery;
import static combination.VoteQuery.rs;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class VoterRegVoter extends javax.swing.JFrame implements AppInfo{

   String path,s,vid,vmail,code,ename;
    
    public VoterRegVoter() throws Exception {
        
        super(" "+version);
        
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
       
        
        this.setSize(700, 690);
        setResizable(false);
        this.setVisible(true);
        
        
        
                  vid=VoterLogin.voterId;
                  code=VoterLogin.secrete;
                  vmail=VoterLogin.mail;
            
            VoteQuery.basicQuery("SELECT * FROM `election` where e_code='"+code+"'");  
            if(rs.next()){
                  ename=rs.getString("e_name");
                rs.close();
            }
            
            
        idT.setText(vid);
        idT.setEditable(false);
        codeT.setText(code);
        codeT.setEditable(false);
        enameL.setText(ename);
        }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nameT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        passT = new javax.swing.JTextField();
        updateButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        codeT = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        enameL = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(157, 214, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Voter Information");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 100, 470, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Voter ID");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 220, 120, 30);

        idT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTActionPerformed(evt);
            }
        });
        jPanel1.add(idT);
        idT.setBounds(240, 220, 210, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 51));
        jLabel3.setText("Name");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 300, 120, 30);
        jPanel1.add(nameT);
        nameT.setBounds(240, 300, 210, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Password ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 340, 180, 30);
        jPanel1.add(passT);
        passT.setBounds(240, 340, 210, 30);

        updateButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateButton.setText("Submit");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });
        jPanel1.add(updateButton);
        updateButton.setBounds(450, 440, 180, 30);

        exitButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exitButton.setText("Home   >>");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        jPanel1.add(exitButton);
        exitButton.setBounds(450, 480, 180, 30);

        codeT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codeTActionPerformed(evt);
            }
        });
        jPanel1.add(codeT);
        codeT.setBounds(240, 260, 210, 30);

        jButton1.setText("Profile Picture");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(470, 360, 140, 25);

        jLabel9.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("** You will not able to change any information If submit once.");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(240, 390, 510, 20);

        enameL.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        enameL.setForeground(new java.awt.Color(0, 51, 255));
        enameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enameL.setText("                                                  ");
        jPanel1.add(enameL);
        enameL.setBounds(20, 30, 630, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec_panel/asd.jpg"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(470, 200, 140, 160);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("Election Code");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 260, 200, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec_panel/longlogo.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 680, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        
        
        if(idT.getText().trim().length()==0 || codeT.getText().trim().length()==0 || 
                nameT.getText().trim().length()==0 || passT.getText().trim().length()==0 ){
            JOptionPane.showMessageDialog(null, "Fill all fields!");
        }
        else {
            
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
                
           Connection con= null;
           Statement st=null;
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/divs","root","");
           InputStream is = new FileInputStream(new File(s));
                      st = con.createStatement();
                      
                      
                        PreparedStatement pst= con.prepareStatement("UPDATE voter SET `name`=?, `pass`=?, `image`=? where `voterId`=? and `secrete`=?" );
                        
                        pst.setString(1,nameT.getText());
                        pst.setString(2,String.valueOf((passT.getText().trim()+"/2*?$").hashCode()));
                        pst.setBlob(3, is);
                        pst.setString(4,idT.getText());
                        pst.setString(5,codeT.getText());
                        
                        pst.executeUpdate();
                        pst.close();
                        con.close();
                        
                        
        JOptionPane.showMessageDialog(null, "Your Information is Updated!");
        sendMail();
                    
        } catch (Exception ex) {
            ex.printStackTrace();
        }
            
            }
        
    }//GEN-LAST:event_updateButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        
        int v= JOptionPane.showConfirmDialog(null, "Do you want to leave from here?", "Confirmation Dialogue", JOptionPane.YES_NO_OPTION);
               if(v==JOptionPane.YES_OPTION){
                  new CombinedFrame();
                  this.setVisible(false);
               }
        
    }//GEN-LAST:event_exitButtonActionPerformed

    private void codeTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codeTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codeTActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        JFileChooser filecsr= new JFileChooser();
        filecsr.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter= new FileNameExtensionFilter("*.IMAGE","jpg","png","gif","jpeg");
        filecsr.addChoosableFileFilter(filter);
        int result= filecsr.showSaveDialog(this);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedFile= filecsr.getSelectedFile();
             path= selectedFile.getAbsolutePath();
            jLabel7.setIcon(new ImageIcon(path));
            s=path;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTActionPerformed

     
     public void sendMail(){

      String to = vmail;         // Recipient's email ID needs to be mentioned.
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
         message.setText("Dear Voter,\nSave this following  information until your vote is accepted."
                 + "\n ID: "+idT.getText()+"\n Password: "+passT.getText().trim()+"\nDon't share this information with anyone.");        // Now set the actual message
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
            ex.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VoterRegVoter().setVisible(true);
                } catch (Exception ex) {
                    
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeT;
    private javax.swing.JLabel enameL;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField idT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameT;
    private javax.swing.JTextField passT;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
