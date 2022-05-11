
package ec_panel;


import combination.AppInfo;
import combination.CombinedFrame;
import combination.VoteQuery;
import ec_panel.DateTimeUpdate;
import ec_panel.VoterRegCommission;
import static ec_panel.CommissionLogin.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class CommissionPanel extends javax.swing.JFrame implements AppInfo{

    
    public CommissionPanel() throws Exception {
        super(" "+version);
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        this.setSize(544,549);
        setResizable(false);
        this.setVisible(true);
        
        
        idL.setText(id);
        mailL.setText(mail);
        
        enameL.setText(ename);
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        electDetailsB = new javax.swing.JButton();
        electDateB = new javax.swing.JButton();
        homeB = new javax.swing.JButton();
        voterListB = new javax.swing.JButton();
        voterRegB = new javax.swing.JButton();
        cancelElectB = new javax.swing.JButton();
        pollingOfficer = new javax.swing.JButton();
        candidateListB = new javax.swing.JButton();
        enameL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        idL = new javax.swing.JLabel();
        mailL = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        electDetailsB.setBackground(new java.awt.Color(74, 41, 18));
        electDetailsB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        electDetailsB.setForeground(new java.awt.Color(255, 255, 255));
        electDetailsB.setText("Add Candidate");
        electDetailsB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electDetailsBActionPerformed(evt);
            }
        });
        jPanel1.add(electDetailsB);
        electDetailsB.setBounds(240, 260, 190, 30);

        electDateB.setBackground(new java.awt.Color(74, 41, 18));
        electDateB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        electDateB.setForeground(new java.awt.Color(255, 255, 255));
        electDateB.setText("Election Date");
        electDateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                electDateBActionPerformed(evt);
            }
        });
        jPanel1.add(electDateB);
        electDateB.setBounds(240, 140, 190, 30);

        homeB.setBackground(new java.awt.Color(74, 41, 18));
        homeB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homeB.setForeground(new java.awt.Color(255, 255, 255));
        homeB.setText("Back to Home");
        homeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBActionPerformed(evt);
            }
        });
        jPanel1.add(homeB);
        homeB.setBounds(240, 420, 190, 30);

        voterListB.setBackground(new java.awt.Color(74, 41, 18));
        voterListB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        voterListB.setForeground(new java.awt.Color(255, 255, 255));
        voterListB.setText("Voter List");
        voterListB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voterListBActionPerformed(evt);
            }
        });
        jPanel1.add(voterListB);
        voterListB.setBounds(240, 220, 190, 30);

        voterRegB.setBackground(new java.awt.Color(74, 41, 18));
        voterRegB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        voterRegB.setForeground(new java.awt.Color(255, 255, 255));
        voterRegB.setText("Add Voter");
        voterRegB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voterRegBActionPerformed(evt);
            }
        });
        jPanel1.add(voterRegB);
        voterRegB.setBounds(240, 180, 190, 30);

        cancelElectB.setBackground(new java.awt.Color(74, 41, 18));
        cancelElectB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cancelElectB.setForeground(new java.awt.Color(255, 255, 255));
        cancelElectB.setText("Remove Election");
        cancelElectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelElectBActionPerformed(evt);
            }
        });
        jPanel1.add(cancelElectB);
        cancelElectB.setBounds(240, 380, 190, 30);

        pollingOfficer.setBackground(new java.awt.Color(74, 41, 18));
        pollingOfficer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        pollingOfficer.setForeground(new java.awt.Color(255, 255, 255));
        pollingOfficer.setText("Polling Officer");
        pollingOfficer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pollingOfficerActionPerformed(evt);
            }
        });
        jPanel1.add(pollingOfficer);
        pollingOfficer.setBounds(240, 340, 190, 30);

        candidateListB.setBackground(new java.awt.Color(74, 41, 18));
        candidateListB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        candidateListB.setForeground(new java.awt.Color(255, 255, 255));
        candidateListB.setText("Candidate List");
        candidateListB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                candidateListBActionPerformed(evt);
            }
        });
        jPanel1.add(candidateListB);
        candidateListB.setBounds(240, 300, 190, 30);

        enameL.setFont(new java.awt.Font("Engravers MT", 1, 14)); // NOI18N
        enameL.setForeground(new java.awt.Color(0, 0, 0));
        enameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enameL.setText("Math Club Election 2022");
        jPanel1.add(enameL);
        enameL.setBounds(10, 20, 510, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/combination/logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -150, 630, 810);
        jPanel1.add(idL);
        idL.setBounds(370, 310, 80, 20);
        jPanel1.add(mailL);
        mailL.setBounds(400, 440, 80, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 691, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voterListBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voterListBActionPerformed
        
                new VoterList();
                
    }//GEN-LAST:event_voterListBActionPerformed

    private void homeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBActionPerformed
        
        new CombinedFrame();
        this.setVisible(false);
        
    }//GEN-LAST:event_homeBActionPerformed

    private void electDateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electDateBActionPerformed
        
        new DateTimeUpdate();
        
    }//GEN-LAST:event_electDateBActionPerformed

    private void electDetailsBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_electDetailsBActionPerformed

        try {
            new CandidateInfo();
            this.setVisible(false);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_electDetailsBActionPerformed

    private void voterRegBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voterRegBActionPerformed
        
                
        try {
            new VoterRegCommission();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
                this.setVisible(false);
                  
            
    }//GEN-LAST:event_voterRegBActionPerformed

    private void cancelElectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelElectBActionPerformed
        
            
            
            int result = JOptionPane.showConfirmDialog(this,"<html>Do You Want to <b color= 'red'>Remove All Data of the Election?</b></html>", "Delete Election",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
                
            try {
            VoteQuery.basicQuery("DELETE FROM `voter` where `e_id`='"+eid+"'");
            VoteQuery.basicQuery("DELETE FROM `election`");
            
            this.dispose();
            new CombinedFrame();
                  
            
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            }
            
    }//GEN-LAST:event_cancelElectBActionPerformed

    private void pollingOfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pollingOfficerActionPerformed
       
        new PollingOfficer();
        
    }//GEN-LAST:event_pollingOfficerActionPerformed

    private void candidateListBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_candidateListBActionPerformed
        try {
            new CandidateList();
        } catch (Exception ex) {
            Logger.getLogger(CommissionPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_candidateListBActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new CommissionPanel().setVisible(true);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelElectB;
    private javax.swing.JButton candidateListB;
    private javax.swing.JButton electDateB;
    private javax.swing.JButton electDetailsB;
    private javax.swing.JLabel enameL;
    private javax.swing.JButton homeB;
    private javax.swing.JLabel idL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mailL;
    private javax.swing.JButton pollingOfficer;
    private javax.swing.JButton voterListB;
    private javax.swing.JButton voterRegB;
    // End of variables declaration//GEN-END:variables
}
