
package vote_booth;

import combination.AppInfo;
import combination.VoteQuery;
import static combination.VoteQuery.rs;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import vote_booth.ResultFrame;

public class ResultCodeConfirmation extends javax.swing.JFrame implements AppInfo{

    static String ename,ecode,edate,startTime,endTime;
    static int totalVoter,totalVotedVoter;
    static String pollingRate;
    
    public ResultCodeConfirmation() {
        super(" "+version);
        initComponents();
        this.setLocationRelativeTo(null); 
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        setSize(712, 720);
        setResizable(false);
        
        
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        codeT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        codeT.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        codeT.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(codeT);
        codeT.setBounds(310, 400, 250, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Election Code");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(140, 400, 270, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Next >>");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(520, 600, 150, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote_booth/divs.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -50, 960, 870);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 712, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            VoteQuery.basicQuery("SELECT COUNT(voterId) FROM `voter` WHERE secrete ='"+Integer.parseInt(codeT.getText().trim())+"'");
            rs.next();
            totalVoter= rs.getInt(1);
            System.out.println(totalVoter);
            
            VoteQuery.basicQuery("SELECT COUNT(voterId) FROM `votedvoter` WHERE e_code ='"+Integer.parseInt(codeT.getText().trim())+"'");
            rs.next();
            totalVotedVoter= rs.getInt(1);
            System.out.println(totalVotedVoter);
            
            pollingRate=String.format("%.2f", (totalVotedVoter/(double)totalVoter)*100);
            System.out.println(pollingRate+"%");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        try {
            VoteQuery.basicQuery("SELECT * FROM election as e,candidate as o, voter as v where  e.e_code= '"+Integer.parseInt(codeT.getText().trim())+"' and o.secrete ='"+Integer.parseInt(codeT.getText().trim())+"' and v.secrete ='"+Integer.parseInt(codeT.getText().trim())+"'");
            if(rs.next()){
                ename=rs.getString("e.e_name");
                ecode=rs.getString("e.e_code");
                edate=rs.getString("e.date");
                startTime=rs.getString("e.start_time");
                endTime=rs.getString("e.end_time");
                //edate.equals(currentDate)
                
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
        String currentDate = sdf.format(date1);
        
                Date start = sdf.parse(edate+" "+startTime);
                Date end = sdf.parse(edate+" "+endTime);
                Date now = sdf.parse(currentDate);
                
                if( now.after(start) && now.before(end)){ 
                    JOptionPane.showMessageDialog(null,"Polling Rate:"+pollingRate+"% (till "+now+").\n\nTo get result, Waite for the end of "+ename);
                }
                else if(now.after(end)){
                new ResultFrame();
                this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Vote is not started yet!");
                     
                }
                
                rs.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
                    JOptionPane.showMessageDialog(null,"Your entered code is incorrect!");
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultCodeConfirmation();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codeT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
