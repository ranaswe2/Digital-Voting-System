
package ec_panel;

import static combination.AppInfo.version;
import combination.CombinedFrame;
import combination.VoteQuery;
import static combination.VoteQuery.rs;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class VoterList extends javax.swing.JFrame {

    public VoterList() {
        super("Voter Confirmation "+version);
  
            this.setLocationRelativeTo(null);    //set jframe at center of screen
            this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            initComponents();
            this.setSize(700, 720);
            this.setVisible(true);
            
            
        try {
            VoteQuery.basicQuery("SELECT * FROM `voter` WHERE secrete ='"+CommissionLogin.ecode+"'");
        
            
            while(rs.next()){
                String Name= rs.getString("name");
                String mail= rs.getString("mail");
                String id= rs.getString("voterId");
                
                String addTable[]= {id,Name,mail};
                DefaultTableModel model= (DefaultTableModel) tbl.getModel();
                model.addRow(addTable);
                
            }
           } catch (Exception ex) {
            Logger.getLogger(VoterList.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        enameL.setText(CommissionLogin.ename);
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        enameL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        homeB = new javax.swing.JButton();
        lb1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Century", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Voter List");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 640, 30);

        enameL.setFont(new java.awt.Font("Castellar", 1, 24)); // NOI18N
        enameL.setForeground(new java.awt.Color(51, 51, 255));
        enameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        enameL.setText("Election");
        getContentPane().add(enameL);
        enameL.setBounds(30, 20, 640, 30);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mail"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(130, 120, 453, 430);

        homeB.setBackground(new java.awt.Color(74, 41, 18));
        homeB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        homeB.setForeground(new java.awt.Color(255, 255, 255));
        homeB.setText("Back to Home");
        homeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeBActionPerformed(evt);
            }
        });
        getContentPane().add(homeB);
        homeB.setBounds(260, 610, 190, 30);

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/combination/longlogo.png"))); // NOI18N
        getContentPane().add(lb1);
        lb1.setBounds(0, 0, 990, 768);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void homeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeBActionPerformed

        new CombinedFrame();
        this.setVisible(false);

    }//GEN-LAST:event_homeBActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VoterList();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enameL;
    private javax.swing.JButton homeB;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb1;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
