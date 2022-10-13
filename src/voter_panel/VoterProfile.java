
package voter_panel;

import static combination.AppInfo.version;
import combination.VoteQuery;
import static combination.VoteQuery.rs;
import java.awt.Image;
import javax.swing.ImageIcon;


public class VoterProfile extends javax.swing.JFrame {

    String eid,ename,vid,vname,vmail,date,timeFrom,timeTo,secret;
     
    
    public VoterProfile() {
        super("Voter's Profile "+version);
        
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        this.setSize(540,555);
        
                  vid=VoterLogin.voterId;
                  secret=VoterLogin.secrete;
                  vmail=VoterLogin.mail;
                  vname=VoterLogin.name;
                  eid=VoterLogin.elcId;
                  
            byte[] img2=VoterLogin.img;
            ImageIcon image2= new ImageIcon(img2);
            Image im2= image2.getImage();
            
            Image myImg2= im2.getScaledInstance(imgL.getWidth(),imgL.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i2= new ImageIcon(myImg2);
                imgL.setIcon(i2);
                  
                try {
            VoteQuery.basicQuery("SELECT * FROM `election` where e_code='"+secret+"'");
            if(rs.next()){
                  ename=rs.getString("e_name");
                 // dateTime= rs.getDate("date_time").toString();
                 date= rs.getString("date");
                 timeFrom= rs.getString("start_time");
                 timeTo= rs.getString("end_time");
                rs.close();
            }
        } catch (Exception ex) {
               ex.printStackTrace();
        }
        
        enameL.setText(ename);
        idL.setText(vid);
        vnameL.setText(vname);
        mailL.setText(vmail);
        dateL.setText("Date of Election: "+date);
        timeL.setText("Time: "+timeFrom+" to "+timeTo);
        
        this.setVisible(true);
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enameL = new javax.swing.JLabel();
        idL = new javax.swing.JLabel();
        vnameL = new javax.swing.JLabel();
        mailL = new javax.swing.JLabel();
        imgL = new javax.swing.JLabel();
        dateL = new javax.swing.JLabel();
        timeL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        enameL.setFont(new java.awt.Font("Perpetua Titling MT", 1, 18)); // NOI18N
        enameL.setForeground(new java.awt.Color(0, 0, 153));
        enameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enameL.setText("enameL");
        getContentPane().add(enameL);
        enameL.setBounds(0, 25, 530, 30);

        idL.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        idL.setForeground(new java.awt.Color(0, 0, 0));
        idL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        idL.setText("idL");
        getContentPane().add(idL);
        idL.setBounds(140, 250, 250, 30);

        vnameL.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        vnameL.setForeground(new java.awt.Color(0, 0, 0));
        vnameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        vnameL.setText("nameL");
        getContentPane().add(vnameL);
        vnameL.setBounds(30, 320, 470, 20);

        mailL.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        mailL.setForeground(new java.awt.Color(0, 0, 0));
        mailL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mailL.setText("mailL");
        getContentPane().add(mailL);
        mailL.setBounds(30, 340, 470, 20);

        imgL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voter_panel/IMG_0322.JPG"))); // NOI18N
        getContentPane().add(imgL);
        imgL.setBounds(200, 90, 130, 160);

        dateL.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        dateL.setForeground(new java.awt.Color(255, 0, 0));
        dateL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateL.setText("date");
        getContentPane().add(dateL);
        dateL.setBounds(30, 370, 470, 30);

        timeL.setFont(new java.awt.Font("Dialog", 3, 14)); // NOI18N
        timeL.setForeground(new java.awt.Color(255, 0, 0));
        timeL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        timeL.setText("time");
        getContentPane().add(timeL);
        timeL.setBounds(30, 390, 470, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voter_panel/logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -50, 570, 610);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoterProfile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel dateL;
    private javax.swing.JLabel enameL;
    private javax.swing.JLabel idL;
    private javax.swing.JLabel imgL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mailL;
    private javax.swing.JLabel timeL;
    private javax.swing.JLabel vnameL;
    // End of variables declaration//GEN-END:variables
}
