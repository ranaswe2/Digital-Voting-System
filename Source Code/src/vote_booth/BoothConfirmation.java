
package vote_booth;

import javax.swing.ImageIcon;
import combination.AppInfo;
import combination.VoteQuery;
import static combination.VoteQuery.rs;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;


public class BoothConfirmation extends javax.swing.JFrame implements AppInfo{

    static String ename,ecode,edate,startTime,endTime;
    
    public BoothConfirmation() {
        super(" "+version);
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        setSize(741, 720);
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
        codeT1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        boothT = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        codeT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(codeT);
        codeT.setBounds(340, 310, 260, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Election Code");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 310, 220, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(500, 490, 150, 30);

        codeT1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(codeT1);
        codeT1.setBounds(340, 310, 260, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Election Code");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(170, 310, 220, 30);

        idT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(idT);
        idT.setBounds(340, 360, 260, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("PO  ID");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(170, 360, 220, 30);

        boothT.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jPanel1.add(boothT);
        boothT.setBounds(340, 410, 260, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Booth Number");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(170, 410, 220, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/voter_panel/divs.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -50, 820, 870);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 769, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        
        try {  
            
            VoteQuery.basicQuery("SELECT * FROM election as e,officers as o where  e.e_code= '"+Integer.parseInt(codeT.getText().trim())+"' and o.e_code ='"+Integer.parseInt(codeT.getText().trim())+"'");
            if(rs.next()){
                ename=rs.getString("e.e_name").trim();
                ecode=rs.getString("e.e_code").trim();
                edate=rs.getString("e.date").trim();
                startTime=rs.getString("e.start_time").trim();
                endTime=rs.getString("e.end_time").trim();
                
                String pomail=rs.getString("o.email").trim();
                String boothmail=rs.getString("e.mail").trim();
                
                String poId= String.valueOf((pomail+",$.;@']").hashCode());
                String boothNumber= String.valueOf((boothmail+"*$%#?@>=_/<").hashCode());
                
                
        Date date1 = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss") ;
        String currentDate = sdf.format(date1);
        
                Date start = sdf.parse(edate+" "+startTime);
                Date end = sdf.parse(edate+" "+endTime);
                Date now = sdf.parse(currentDate);
                                                                                                  //edate.equals(currentDate)
                if((idT.getText().trim()).equals(poId) && boothT.getText().trim().equals(boothNumber) && now.after(start) && now.before(end)){                    
                    
                new VoterConfirmation();
                this.dispose();
                }
                else if(!(idT.getText().trim()).equals(poId) || !boothT.getText().trim().equals(boothNumber)){
                    JOptionPane.showMessageDialog(this,"Your entered information is incorrect!");
                     }
                else if((now.after(end) || now.before(start))){
                    JOptionPane.showMessageDialog(this,"You are not permitted to open booth before or after the election time!");
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
                new BoothConfirmation();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField boothT;
    private javax.swing.JTextField codeT;
    private javax.swing.JTextField codeT1;
    private javax.swing.JTextField idT;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
