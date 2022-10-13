
package vote_booth;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import combination.AppInfo;
import combination.VoteQuery;
import static combination.VoteQuery.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class VoterConfirmation extends javax.swing.JFrame implements AppInfo {

    static String vid;
    
    public VoterConfirmation() throws IOException {
       super("Voter Confirmation - "+version);
       
        initComponents();
        
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        
        setSize(650, 650);
        setResizable(false);
        this.setVisible(true);
        enameL.setText(BoothConfirmation.ename);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        enameL = new javax.swing.JLabel();
        passT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        idT = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(64, 0, 2));
        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Next >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(430, 370, 150, 30);

        enameL.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        enameL.setForeground(new java.awt.Color(51, 51, 255));
        enameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(enameL);
        enameL.setBounds(10, 30, 590, 30);

        passT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        passT.setForeground(new java.awt.Color(0, 0, 0));
        passT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passTActionPerformed(evt);
            }
        });
        jPanel1.add(passT);
        passT.setBounds(310, 280, 173, 30);

        jLabel2.setBackground(new java.awt.Color(204, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 280, 170, 30);

        idT.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        idT.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(idT);
        idT.setBounds(310, 230, 173, 30);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Voter ID");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 230, 180, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Login for Vote");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 80, 510, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote_booth/longlogo.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(-90, 0, 940, 600);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 650, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
         try { 
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
        String currentDate = sdf.format(date1);
                Date start = sdf.parse(BoothConfirmation.edate+" "+BoothConfirmation.startTime);
                Date end = sdf.parse(BoothConfirmation.edate+" "+BoothConfirmation.endTime);
                Date now = sdf.parse(currentDate);
                                                                                                  //edate.equals(currentDate)
                if( now.after(start) && now.before(end)){  
                    
            VoteQuery.basicQuery("SELECT * FROM `votedvoter` WHERE `e_code`='"+BoothConfirmation.ecode+"' and `voterId`='"+idT.getText().trim()+"'");
            
            if(rs.next()){
             JOptionPane.showMessageDialog(null, "You are unable to vote more than one time. Leave this booth immediately.");
            }
            else{
            VoteQuery.basicQuery("SELECT * FROM `voter` WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId`='"+idT.getText().trim()+"'");
            
            if(rs.next()){
            
                 String Pass=rs.getString("pass");
                 
                 if(Pass.equals(String.valueOf((passT.getText().trim()+"/2*?$").hashCode()))){
                     new BallotFrame();
               
                     vid= idT.getText().trim();
                     this.dispose();
                     
                 }
            
            rs.close();
                  }
        
            }     
        }
                else{
                  JOptionPane.showMessageDialog(null, "Time & tide wait for none.\nThe election booth is closed after "+BoothConfirmation.endTime+" O'clock.");
                }
         }catch(Exception e){
        e.printStackTrace();
        }
                
    }//GEN-LAST:event_jButton1ActionPerformed

    private void passTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passTActionPerformed

  
        
  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new VoterConfirmation();
                } catch (IOException ex) {
                    Logger.getLogger(VoterConfirmation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enameL;
    private javax.swing.JTextField idT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passT;
    // End of variables declaration//GEN-END:variables
}
