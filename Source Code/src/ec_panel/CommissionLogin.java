
package ec_panel;

import combination.VoteQuery;
import static combination.AppInfo.version;
import static combination.VoteQuery.rs;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CommissionLogin extends javax.swing.JFrame {

    public static String id,mail,eid,email,ename,getEname,ecode;
    public static String desig1,desig2,desig3,desig4,desig5;
    public static int candNum1,candNum2,candNum3,candNum4,candNum5;
    
    public CommissionLogin() {
        super("Voter Confirmation "+version);
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
       
        initComponents();
        this.setSize(700, 720);
        
        wrong.setVisible(false);
        this.setVisible(true);
        
        System.out.println("Run Successfully.............");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        idL = new javax.swing.JTextField();
        mailL = new javax.swing.JTextField();
        secretT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        wrong = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        idL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        idL.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(idL);
        idL.setBounds(310, 280, 200, 30);

        mailL.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        mailL.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(mailL);
        mailL.setBounds(310, 330, 200, 30);

        secretT.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        secretT.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(secretT);
        secretT.setBounds(310, 380, 200, 30);

        jLabel2.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Election ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 280, 220, 30);

        jLabel3.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("E-Mail");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 330, 220, 30);

        jLabel4.setFont(new java.awt.Font("Georgia", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Secret Code **");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 380, 220, 30);

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(500, 490, 140, 30);

        wrong.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        wrong.setForeground(new java.awt.Color(255, 0, 51));
        wrong.setText("Enter Correct Information !");
        getContentPane().add(wrong);
        wrong.setBounds(440, 530, 280, 20);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("** You have received a Secret Code to your e-mail. Use here.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 440, 660, 30);

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/combination/divs.png"))); // NOI18N
        getContentPane().add(lb1);
        lb1.setBounds(0, 0, 920, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            
            VoteQuery.basicQuery("SELECT * FROM `election` where e_id='"+idL.getText().trim()+"' and mail='"+mailL.getText().trim()+"'");
            if(rs.next()){
                
                 ename=rs.getString("e_name");
                 eid=rs.getString("e_id");
                 email=rs.getString("mail");
                 ecode=rs.getString("e_code");
                 
                 desig1=rs.getString("desig1");
                 desig2=rs.getString("desig2");
                 desig3=rs.getString("desig3");
                 desig4=rs.getString("desig4");
                 desig5=rs.getString("desig5");
                 
                 candNum1=rs.getInt("candi1");
                 candNum2=rs.getInt("candi2");
                 candNum3=rs.getInt("candi3");
                 candNum4=rs.getInt("candi4");
                 candNum5=rs.getInt("candi5");
                 
                
                
                
                
                String secret= String.valueOf((email+",.;']").hashCode());
                
                if(secretT.getText().trim().equals(secret)){                    
                    
                new CommissionPanel();
                this.dispose();
                }
                else{
            JOptionPane.showMessageDialog(null, "Given Secret Code is Incorrect! Check mail from < election.divs@gmail.com >.");
                }
                
                rs.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Wrong Election ID or Mail !");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CommissionLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField idL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb1;
    private javax.swing.JTextField mailL;
    private javax.swing.JTextField secretT;
    private javax.swing.JLabel wrong;
    // End of variables declaration//GEN-END:variables
}
