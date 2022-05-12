
package ec_panel;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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


public class CreateElection extends javax.swing.JFrame implements AppInfo{

    
    public CreateElection() {
        
        super(" "+version);
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        setSize(741, 720);
        setResizable(false);
        
        idT.addKeyListener(new KeyAdapter(){
            
            public void keyTyped(KeyEvent e){
                 
                char ch= e.getKeyChar();
               
                if(!(ch >='1' && ch <='9' || (ch==KeyEvent.VK_BACK_SPACE) || (ch==KeyEvent.VK_PERIOD)|| (ch==KeyEvent.VK_DELETE))){
                     e.consume();
                    JOptionPane.showMessageDialog(null, " Please ! Give correct input.");
                    // jLabel5.setText("* Please ! Give correct input.");
                   
                }
             
            }
        });
      
        this.setVisible(true);
        
        lb1.setVisible(false);
        lb2.setVisible(false);
        tf1.setVisible(false);
        tf2.setVisible(false);
        tf3.setVisible(false);
        tf4.setVisible(false);
        tf5.setVisible(false);
        tf6.setVisible(false);
        tf7.setVisible(false);
        tf8.setVisible(false);
        tf9.setVisible(false);
        tf10.setVisible(false);
        button2.setVisible(false);
        
    }

 
   
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        idT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        elecT = new javax.swing.JTextField();
        lb1 = new javax.swing.JLabel();
        mailT = new javax.swing.JTextField();
        toggle = new javax.swing.JToggleButton();
        tf0 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tf1 = new javax.swing.JTextField();
        tf2 = new javax.swing.JTextField();
        tf3 = new javax.swing.JTextField();
        tf4 = new javax.swing.JTextField();
        tf5 = new javax.swing.JTextField();
        tf6 = new javax.swing.JTextField();
        tf7 = new javax.swing.JTextField();
        tf8 = new javax.swing.JTextField();
        tf9 = new javax.swing.JTextField();
        tf10 = new javax.swing.JTextField();
        button2 = new javax.swing.JButton();
        lb2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        idT.setFont(new java.awt.Font("Dialog", 1, 15)); // NOI18N
        idT.setText("98473232334");
        idT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idTActionPerformed(evt);
            }
        });
        jPanel1.add(idT);
        idT.setBounds(260, 250, 330, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Name of Election");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 210, 170, 30);

        elecT.setText("MATH CLUB ELECTION - 2020");
        jPanel1.add(elecT);
        elecT.setBounds(260, 210, 330, 30);

        lb1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lb1.setForeground(new java.awt.Color(0, 0, 0));
        lb1.setText("     *  -  Keep the Candidate number 0 if you don't use the designation, else 2 to 7");
        jPanel1.add(lb1);
        lb1.setBounds(30, 630, 530, 20);

        mailT.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        mailT.setText("ranaswe2@gmail.com");
        mailT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailTActionPerformed(evt);
            }
        });
        jPanel1.add(mailT);
        mailT.setBounds(260, 290, 330, 30);

        toggle.setText("V");
        toggle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                toggleActionPerformed(evt);
            }
        });
        jPanel1.add(toggle);
        toggle.setBounds(520, 330, 70, 30);

        tf0.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        tf0.setText("1");
        tf0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf0ActionPerformed(evt);
            }
        });
        jPanel1.add(tf0);
        tf0.setBounds(260, 330, 270, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 102, 102));
        jLabel9.setText("Number of Designation");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(60, 330, 260, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("Election ID ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(60, 250, 160, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7.setText("Commission's Mail");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(60, 290, 260, 30);

        jLabel8.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 102));
        jLabel8.setText("** - You will receive a secret code after clicking the confirm button.");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 650, 550, 20);

        tf1.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tf1.setText("President");
        tf1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf1ActionPerformed(evt);
            }
        });
        jPanel1.add(tf1);
        tf1.setBounds(180, 450, 220, 30);

        tf2.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tf2.setText("Vice President");
        jPanel1.add(tf2);
        tf2.setBounds(180, 480, 220, 30);

        tf3.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tf3.setText("Secretary");
        jPanel1.add(tf3);
        tf3.setBounds(180, 510, 220, 30);

        tf4.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tf4.setText("Treasurer");
        jPanel1.add(tf4);
        tf4.setBounds(180, 540, 220, 30);

        tf5.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tf5.setText("Executive Member");
        jPanel1.add(tf5);
        tf5.setBounds(180, 570, 220, 30);

        tf6.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tf6.setText("0");
        jPanel1.add(tf6);
        tf6.setBounds(400, 450, 60, 30);

        tf7.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tf7.setText("0");
        jPanel1.add(tf7);
        tf7.setBounds(400, 480, 60, 30);

        tf8.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tf8.setText("0");
        jPanel1.add(tf8);
        tf8.setBounds(400, 510, 60, 30);

        tf9.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tf9.setText("0");
        jPanel1.add(tf9);
        tf9.setBounds(400, 540, 60, 30);

        tf10.setFont(new java.awt.Font("Dialog", 0, 15)); // NOI18N
        tf10.setText("0");
        jPanel1.add(tf10);
        tf10.setBounds(400, 570, 60, 30);

        button2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        button2.setText("Confirm");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel1.add(button2);
        button2.setBounds(490, 510, 140, 30);

        lb2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 15)); // NOI18N
        lb2.setForeground(new java.awt.Color(102, 0, 51));
        lb2.setText("Name of Designation & Number of Candidates ");
        jPanel1.add(lb2);
        lb2.setBounds(120, 400, 620, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec_panel/divs.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, 0, 910, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 706, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
       
        
        VoteQuery.theQuery("INSERT INTO `election`(`e_name`, `e_id`, `e_code`, `mail`, `desig1`, `desig2`, `desig3`, `desig4`, `desig5`, `candi1`, `candi2`, `candi3`, `candi4`, `candi5`) "
                + "VALUES  ('"+elecT.getText()+"','"+idT.getText().trim()+"','"+(idT.getText().trim()+mailT.getText().trim()).hashCode()+"','"+mailT.getText().trim()+"','"+tf1.getText()+"','"+tf2.getText()+"','"+tf3.getText()+"','"+tf4.getText()+"','"+tf5.getText()
                +"','"+(tf6.getText()).trim()+"','"+(tf7.getText()).trim()+"','"+(tf8.getText()).trim()+"','"+(tf9.getText()).trim()+"','"+(tf10.getText()).trim()+"')");
        
        
        sendMail();
        this.dispose();
        new CommissionLogin();
    }//GEN-LAST:event_button2ActionPerformed

    private void mailTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailTActionPerformed

    private void idTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idTActionPerformed

    private void tf1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf1ActionPerformed

    private void tf0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf0ActionPerformed

    private void toggleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_toggleActionPerformed
        if(toggle.isSelected()){
        try{
        int designat= Integer.valueOf(tf0.getText().trim());
        
        if(designat<=5 && designat>=1){
            toggle.setText("∧"); 
        lb2.setVisible(true);
        lb1.setVisible(true);
        button2.setVisible(true);
        
                if((tf0.getText().trim()).equals("1")){
                     tf1.setVisible(true);
                     tf6.setVisible(true);
                 }
                else if((tf0.getText().trim()).equals("2")){
                     tf1.setVisible(true);
                     tf2.setVisible(true);
                     tf6.setVisible(true);
                     tf7.setVisible(true);
                    
                }
                else if((tf0.getText().trim()).equals("3")){
                     tf1.setVisible(true);
                     tf2.setVisible(true);
                     tf3.setVisible(true);
                     tf8.setVisible(true);
                     tf6.setVisible(true);
                     tf7.setVisible(true);
                    
                }
                else if((tf0.getText().trim()).equals("4")){
                     tf1.setVisible(true);
                     tf2.setVisible(true);
                     tf3.setVisible(true);
                     tf4.setVisible(true);
                     tf6.setVisible(true);
                     tf7.setVisible(true);
                     tf8.setVisible(true);
                     tf9.setVisible(true);
                    
                }
                else if((tf0.getText().trim()).equals("5")){
                     tf1.setVisible(true);
                     tf2.setVisible(true);
                     tf3.setVisible(true);
                     tf4.setVisible(true);
                     tf5.setVisible(true);
                     tf6.setVisible(true);
                     tf7.setVisible(true);
                     tf8.setVisible(true);
                     tf9.setVisible(true);
                     tf10.setVisible(true);
                    
                }
        }
        else{    
            JOptionPane.showMessageDialog(this,"<html>Please, enter digit from <h3 color=red>1 to 5</h3> for designation.</html>");  
             }
        }catch(Exception e){   
            JOptionPane.showMessageDialog(this,"<html>Please, enter digit from <h3 color=red>1 to 5</h3> for designation.</html>");  
               }
        
        }else{
            toggle.setText("V");
        lb1.setVisible(false);
        lb2.setVisible(false);
        tf1.setVisible(false);
        tf2.setVisible(false);
        tf3.setVisible(false);
        tf4.setVisible(false);
        tf5.setVisible(false);
        tf6.setVisible(false);
        tf7.setVisible(false);
        tf8.setVisible(false);
        tf9.setVisible(false);
        tf10.setVisible(false);
        button2.setVisible(false);
        }
            
    }//GEN-LAST:event_toggleActionPerformed

     
    
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
         message.setSubject(elecT.getText());         // Set Subject: header field
         message.setText("Dear EC,\nSave this following  information until your election is completed successfully."
                 + "\n   Election ID: "+idT.getText().trim()+"\n   Secret Code: "+(mailT.getText().trim()+",.;']").hashCode()+"\nDon't share this information with anyone.");        // Now set the actual message
         Transport.send(message);  // Send message
         
         System.out.println("Sent message successfully....");
         
      } catch (Exception mex) {
         mex.printStackTrace();
      }
   
     } 
    
    
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateElection();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button2;
    private javax.swing.JTextField elecT;
    private javax.swing.JTextField idT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb2;
    private javax.swing.JTextField mailT;
    private javax.swing.JTextField tf0;
    private javax.swing.JTextField tf1;
    private javax.swing.JTextField tf10;
    private javax.swing.JTextField tf2;
    private javax.swing.JTextField tf3;
    private javax.swing.JTextField tf4;
    private javax.swing.JTextField tf5;
    private javax.swing.JTextField tf6;
    private javax.swing.JTextField tf7;
    private javax.swing.JTextField tf8;
    private javax.swing.JTextField tf9;
    private javax.swing.JToggleButton toggle;
    // End of variables declaration//GEN-END:variables
}
