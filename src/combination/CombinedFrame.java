
package combination;

import vote_booth.ResultCodeConfirmation;
import voter_panel.VoterLogin;
import ec_panel.CommissionLogin;
import ec_panel.CreateElection;
import javax.swing.ImageIcon;
import vote_booth.BoothConfirmation;

public class CombinedFrame extends javax.swing.JFrame implements AppInfo{

    
    public CombinedFrame() {
        super(" "+version);
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        
        
        this.setSize(700, 720);
        setResizable(false);
        this.setVisible(true);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        createElectB = new javax.swing.JButton();
        voteBoothB = new javax.swing.JButton();
        resultElectB = new javax.swing.JButton();
        aboutB = new javax.swing.JButton();
        ecLoginB = new javax.swing.JButton();
        voterLoginB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        createElectB.setBackground(new java.awt.Color(74, 41, 18));
        createElectB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createElectB.setForeground(new java.awt.Color(255, 255, 255));
        createElectB.setText("Create Election");
        createElectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createElectBActionPerformed(evt);
            }
        });
        jPanel1.add(createElectB);
        createElectB.setBounds(10, 240, 190, 30);

        voteBoothB.setBackground(new java.awt.Color(74, 41, 18));
        voteBoothB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        voteBoothB.setForeground(new java.awt.Color(255, 255, 255));
        voteBoothB.setText("Vote Booth");
        voteBoothB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voteBoothBActionPerformed(evt);
            }
        });
        jPanel1.add(voteBoothB);
        voteBoothB.setBounds(10, 360, 190, 30);

        resultElectB.setBackground(new java.awt.Color(74, 41, 18));
        resultElectB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resultElectB.setForeground(new java.awt.Color(255, 255, 255));
        resultElectB.setText(" Result of Election");
        resultElectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultElectBActionPerformed(evt);
            }
        });
        jPanel1.add(resultElectB);
        resultElectB.setBounds(10, 400, 190, 30);

        aboutB.setBackground(new java.awt.Color(74, 41, 18));
        aboutB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        aboutB.setForeground(new java.awt.Color(255, 255, 255));
        aboutB.setText("About DiVS");
        aboutB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutBActionPerformed(evt);
            }
        });
        jPanel1.add(aboutB);
        aboutB.setBounds(500, 380, 190, 30);

        ecLoginB.setBackground(new java.awt.Color(74, 41, 18));
        ecLoginB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ecLoginB.setForeground(new java.awt.Color(255, 255, 255));
        ecLoginB.setText("EC Login");
        ecLoginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ecLoginBActionPerformed(evt);
            }
        });
        jPanel1.add(ecLoginB);
        ecLoginB.setBounds(10, 280, 190, 30);

        voterLoginB.setBackground(new java.awt.Color(74, 41, 18));
        voterLoginB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        voterLoginB.setForeground(new java.awt.Color(255, 255, 255));
        voterLoginB.setText("Voter Login");
        voterLoginB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voterLoginBActionPerformed(evt);
            }
        });
        jPanel1.add(voterLoginB);
        voterLoginB.setBounds(10, 320, 190, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/combination/divs.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -30, 940, 830);

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

    private void aboutBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutBActionPerformed
        
        new AboutDeveloper();
        
    }//GEN-LAST:event_aboutBActionPerformed

    private void resultElectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultElectBActionPerformed
        
        new ResultCodeConfirmation();
        this.setVisible(false);
        
    }//GEN-LAST:event_resultElectBActionPerformed

    private void voteBoothBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voteBoothBActionPerformed
        
        new BoothConfirmation();
        this.setVisible(false);
        
    }//GEN-LAST:event_voteBoothBActionPerformed

    private void createElectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createElectBActionPerformed
        
        new CreateElection();
        this.setVisible(false);
        
    }//GEN-LAST:event_createElectBActionPerformed

    private void ecLoginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ecLoginBActionPerformed
        new CommissionLogin();
        this.setVisible(false);
    }//GEN-LAST:event_ecLoginBActionPerformed

    private void voterLoginBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voterLoginBActionPerformed
        new VoterLogin();
        this.setVisible(false);
    }//GEN-LAST:event_voterLoginBActionPerformed

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CombinedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CombinedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CombinedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CombinedFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CombinedFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutB;
    private javax.swing.JButton createElectB;
    private javax.swing.JButton ecLoginB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton resultElectB;
    private javax.swing.JButton voteBoothB;
    private javax.swing.JButton voterLoginB;
    // End of variables declaration//GEN-END:variables
}
