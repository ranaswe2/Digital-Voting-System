
package voter_panel;

import combination.VoteQuery;
import voter_panel.VoterRegVoter;
import static combination.AppInfo.version;
import static combination.VoteQuery.rs;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import voter_panel.VoterProfile;

public class VoterLogin extends javax.swing.JFrame {
     static String elcId,voterId,name,mail,dayTime,secrete,pass;
     static byte[] img;
    public VoterLogin() {
        super("Voter Confirmation "+version);
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
       
        initComponents();
        this.setSize(700, 720);
        
        wrong.setVisible(false);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JTextField();
        codeT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        wrong = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        id.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        id.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(id);
        id.setBounds(310, 300, 200, 30);

        codeT.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        codeT.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(codeT);
        codeT.setBounds(310, 340, 200, 30);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Voter ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 300, 170, 30);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Election Code");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 340, 170, 30);

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(510, 440, 140, 30);

        wrong.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        wrong.setForeground(new java.awt.Color(255, 0, 51));
        wrong.setText("Enter Correct Information !");
        getContentPane().add(wrong);
        wrong.setBounds(410, 390, 280, 20);

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/combination/divs.png"))); // NOI18N
        getContentPane().add(lb1);
        lb1.setBounds(0, 0, 850, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            VoteQuery.basicQuery("SELECT * FROM `voter` where `voterId`='"+id.getText().trim()+"' AND `secrete`='"+codeT.getText().trim()+"'");
            
            if(rs.next()){
                     name=rs.getString("name");
                     pass=rs.getString("pass");
                     voterId=rs.getString("voterId");
                     mail=rs.getString("mail");
                     name=rs.getString("name");
                     elcId=rs.getString("e_id");
                     secrete=rs.getString("secrete");
                     img=rs.getBytes("image");
                if(name.equals("") && pass.equals("")){
                    new VoterRegVoter();
                    this.dispose();
                }
                else if(!name.equals("") && !pass.equals("")){
                    new VoterProfile();
                    this.dispose();
                }
                
            }
            else{
                    wrong.setVisible(true);
            }
                
                rs.close();
            
        } catch (Exception ex) {
            Logger.getLogger(VoterLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoterLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeT;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel wrong;
    // End of variables declaration//GEN-END:variables
}
