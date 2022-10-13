
package ec_panel;

import static combination.AppInfo.version;
import combination.VoteQuery;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DateTimeUpdate extends javax.swing.JFrame {

    public DateTimeUpdate() {
        super(" "+version);
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        this.setSize(544,549);
        setResizable(false);
        this.setVisible(true);
        
        enameL.setText(CommissionLogin.ename);
        eidL.setText(CommissionLogin.eid);
        emailL.setText(CommissionLogin.email);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enameL = new javax.swing.JLabel();
        eidL = new javax.swing.JLabel();
        emailL = new javax.swing.JLabel();
        dateT = new javax.swing.JTextField();
        endTimeT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jl2343434 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        startTimeT = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        enameL.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        enameL.setForeground(new java.awt.Color(0, 0, 0));
        enameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enameL.setText("Election Name");
        getContentPane().add(enameL);
        enameL.setBounds(10, 10, 480, 30);

        eidL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        eidL.setForeground(new java.awt.Color(0, 0, 0));
        eidL.setText("----------------------");
        getContentPane().add(eidL);
        eidL.setBounds(230, 140, 580, 30);

        emailL.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        emailL.setForeground(new java.awt.Color(0, 0, 0));
        emailL.setText("----------------------");
        getContentPane().add(emailL);
        emailL.setBounds(230, 170, 590, 30);

        dateT.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        dateT.setForeground(new java.awt.Color(0, 0, 0));
        dateT.setText("YYYY-MM-DD");
        dateT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dateTActionPerformed(evt);
            }
        });
        getContentPane().add(dateT);
        dateT.setBounds(230, 210, 190, 30);

        endTimeT.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        endTimeT.setForeground(new java.awt.Color(0, 0, 0));
        endTimeT.setText("HH:MM:SS");
        getContentPane().add(endTimeT);
        endTimeT.setBounds(230, 290, 190, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("Start Time of Election");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 250, 190, 30);

        jl2343434.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jl2343434.setForeground(new java.awt.Color(0, 0, 51));
        jl2343434.setText("Date of Election");
        getContentPane().add(jl2343434);
        jl2343434.setBounds(70, 210, 170, 30);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("EC Mail");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 170, 130, 30);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("Election ID");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(70, 140, 130, 30);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 380, 120, 25);

        startTimeT.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        startTimeT.setForeground(new java.awt.Color(0, 0, 0));
        startTimeT.setText("HH:MM:SS");
        getContentPane().add(startTimeT);
        startTimeT.setBounds(230, 250, 190, 30);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("End Time of Election");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 290, 190, 30);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 51));
        jLabel6.setText("Alwase use 24 hour time formate");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(300, 330, 370, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec_panel/logo.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String date= dateT.getText().trim();
        String startTime= startTimeT.getText().trim();
        String endTime= endTimeT.getText().trim();
        if(date.matches("[0-9]{4}-[0-9]{2}-[0-9]{2}") && startTime.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}") && endTime.matches("[0-9]{2}:[0-9]{2}:[0-9]{2}")){
            VoteQuery.theQuery("update `election` set `date`='"+date+"',`start_time`='"+startTime+"',`end_time`='"+endTime+"' where `e_id`='"+eidL.getText()+"' and `mail`='"+emailL.getText()+"'");
            JOptionPane.showMessageDialog(null,"Date & Time of Election Added Successfully!");
            this.dispose();
        }
        else{
         JOptionPane.showMessageDialog(null,"Enter Date & Time(24 Hour Formate) of Election According to Given Formate:\nDate: YYYY-MM-DD\nTime: HH:MM:SS");
         }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void dateTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dateTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dateTActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DateTimeUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dateT;
    private javax.swing.JLabel eidL;
    private javax.swing.JLabel emailL;
    private javax.swing.JLabel enameL;
    private javax.swing.JTextField endTimeT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jl2343434;
    private javax.swing.JTextField startTimeT;
    // End of variables declaration//GEN-END:variables
}
