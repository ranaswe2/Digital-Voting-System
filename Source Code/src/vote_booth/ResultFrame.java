
package vote_booth;

import combination.CombinedFrame;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import combination.AppInfo;
import combination.VoteQuery;
import static combination.VoteQuery.rs;
import javax.swing.JFrame;


public class ResultFrame extends javax.swing.JFrame implements AppInfo{

                String cata1,cata2,cata3,cata4,cata5;
                int candidateNum1, candidateNum2, candidateNum3, candidateNum4, candidateNum5;
                String path;
   
    public ResultFrame() throws Exception {
        super(" "+version);
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        
        
             jLabel1.setText(ResultCodeConfirmation.ename);
             prl.setText("Polling Rate : "+ResultCodeConfirmation.pollingRate+"%");
             tvl.setText("Total Voter : "+ResultCodeConfirmation.totalVoter);
             vvl.setText("Voted Voter : "+ResultCodeConfirmation.totalVotedVoter);
             
    VoteQuery.basicQuery("SELECT * FROM `election` WHERE `e_code`='"+ResultCodeConfirmation.ecode+"'");
          
            if(rs.next()){
                cata1=rs.getString("desig1");
                cata2=rs.getString("desig2");
                cata3=rs.getString("desig3");
                cata4=rs.getString("desig4");
                cata5=rs.getString("desig5");
                
                 candidateNum1=rs.getInt("candi1");
                 candidateNum2=rs.getInt("candi2");
                 candidateNum3=rs.getInt("candi3");
                 candidateNum4=rs.getInt("candi4");
                 candidateNum5=rs.getInt("candi5");
                 
                rs.close();
            }
            
                 if(candidateNum1 >1 ){
                     pan5.setVisible(true);
                 }
                 else {
                     
                     pan5.setVisible(false);
                 }
                 
                 if(candidateNum4 >1){
                     
                     pan8.setVisible(true);
                     
                 
                 }
                 else{
                     
                     pan8.setVisible(false);
                 }
                 
                 if(candidateNum2 >1){
                     
                     pan7.setVisible(true);
                     
                 }
                 else{
                     
                     pan7.setVisible(false);
                 }
                 
                 if(candidateNum3 >1){
                     
                     pan6.setVisible(true);
                     
                     
                 }
                 else{
                     
                     pan6.setVisible(false);
                 }
                 
                 if(candidateNum5 >1){
                    
                     pan9.setVisible(true);
                     
                    
                 }  
                 else{
                     
                     pan9.setVisible(false);
                 }
                 
                lab5.setText(cata1);
                lab6.setText(cata3);
                lab7.setText(cata2);
                lab8.setText(cata4);
                lab9.setText(cata5);
                 
                   
            
            
            
             try {
                 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= null;
            Statement st= null; 
            
            con= DriverManager.getConnection("jdbc:mysql://localhost/divs","root","");
            st= con.createStatement();
   //************************************************************************************************************//         
            
            if(candidateNum1 >1 ){
                
            String query= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+ResultCodeConfirmation.ecode+"' and v.secrete ='"+ResultCodeConfirmation.ecode+"' and c.voterId=v.voterId and c.designation='"+cata1+"' ";
            ResultSet rs= st.executeQuery(query);
            
            while(rs.next()){
            String Name= rs.getString("v.name");
            String vote= String.valueOf(rs.getInt("c.vote"));
            String id= rs.getString("v.voterId");
            
            String addTable[]= {id,Name,vote+"  ("+(rs.getInt("c.vote")/(double)ResultCodeConfirmation.totalVotedVoter)*100+"%) "};
            DefaultTableModel model= (DefaultTableModel) table5.getModel();
            model.addRow(addTable);
            
            }
            rs.close();
            
              
            }
            
  //************************************************************************************************************//         
            
            if(candidateNum3 >1 ){
            String query= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+ResultCodeConfirmation.ecode+"' and v.secrete ='"+ResultCodeConfirmation.ecode+"' and c.voterId=v.voterId and c.designation='"+cata3+"' ";
            ResultSet rs= st.executeQuery(query);
            
            while(rs.next()){
            String Name= rs.getString("v.name");
            String vote= String.valueOf(rs.getInt("c.vote"));
            String id= rs.getString("v.voterId");
            
            String addTable[]= {id,Name,vote+"  ("+(rs.getInt("c.vote")/(double)ResultCodeConfirmation.totalVotedVoter)*100+"%) "};
            DefaultTableModel model= (DefaultTableModel) table6.getModel();
            model.addRow(addTable);
            
            }
            rs.close();
              
            }
                
//************************************************************************************************************//         
            
            if(candidateNum2 >1 ){
                
            String query= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+ResultCodeConfirmation.ecode+"' and v.secrete ='"+ResultCodeConfirmation.ecode+"' and c.voterId=v.voterId and c.designation='"+cata2+"' ";
            ResultSet rs= st.executeQuery(query);
            
            
            while(rs.next()){
            String Name= rs.getString("v.name");
            String vote= String.valueOf(rs.getInt("c.vote"));
            String id= rs.getString("v.voterId");
            
            String addTable[]= {id,Name,vote+"  ("+(rs.getInt("c.vote")/(double)ResultCodeConfirmation.totalVotedVoter)*100+"%) "};
            DefaultTableModel model= (DefaultTableModel) table7.getModel();
            model.addRow(addTable);
            
            }
            rs.close();
              
            }
                
   //************************************************************************************************************//         
            
            if(candidateNum4 >1 ){
                
            String query= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+ResultCodeConfirmation.ecode+"' and v.secrete ='"+ResultCodeConfirmation.ecode+"' and c.voterId=v.voterId and c.designation='"+cata4+"' ";
            ResultSet rs= st.executeQuery(query);
            
            
            while(rs.next()){
            String Name= rs.getString("v.name");
            String vote= String.valueOf(rs.getInt("c.vote"));
            String id= rs.getString("v.voterId");
            
            String addTable[]= {id,Name,vote+"  ("+(rs.getInt("c.vote")/(double)ResultCodeConfirmation.totalVotedVoter)*100+"%) "};
            DefaultTableModel model= (DefaultTableModel) table8.getModel();
            model.addRow(addTable);
            
            }
            rs.close();
              
            }
                
//************************************************************************************************************//         
            
            if(candidateNum5 >1 ){
                
            String query= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+ResultCodeConfirmation.ecode+"' and v.secrete ='"+ResultCodeConfirmation.ecode+"' and c.voterId=v.voterId and c.designation='"+cata5+"' ";
            ResultSet rs= st.executeQuery(query);
            
            
            while(rs.next()){
            String Name= rs.getString("v.name");
            String vote= String.valueOf(rs.getInt("c.vote"));
            String id= rs.getString("v.voterId");
            
            String addTable[]= {id,Name,vote+"  ("+(rs.getInt("c.vote")/(double)ResultCodeConfirmation.totalVotedVoter)*100+"%) "};
            DefaultTableModel model= (DefaultTableModel) table9.getModel();
            model.addRow(addTable);
            
            }
            rs.close();
              
      }    
   //-------------------------------------------------------------------------------------------------------------//             
             
            
            
            }catch(Exception e){
            
                  e.printStackTrace();
                
            }
        
             
           this.setVisible(true);           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pan5 = new javax.swing.JPanel();
        lab5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table5 = new javax.swing.JTable();
        pan6 = new javax.swing.JPanel();
        lab6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table6 = new javax.swing.JTable();
        pan7 = new javax.swing.JPanel();
        lab7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table7 = new javax.swing.JTable();
        pan8 = new javax.swing.JPanel();
        lab8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        table8 = new javax.swing.JTable();
        lb3 = new javax.swing.JLabel();
        pan9 = new javax.swing.JPanel();
        lab9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        table9 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        tvl = new javax.swing.JLabel();
        vvl = new javax.swing.JLabel();
        prl = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 950));
        jPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Name of Election");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(300, 50, 1190, 42);

        pan5.setBackground(new java.awt.Color(153, 153, 255));

        lab5.setText("jLabel2");

        table5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Name", "Vote"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table5);

        javax.swing.GroupLayout pan5Layout = new javax.swing.GroupLayout(pan5);
        pan5.setLayout(pan5Layout);
        pan5Layout.setHorizontalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan5Layout.createSequentialGroup()
                        .addComponent(lab5, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 118, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        pan5Layout.setVerticalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(pan5);
        pan5.setBounds(380, 130, 340, 460);

        pan6.setBackground(new java.awt.Color(102, 102, 255));
        pan6.setPreferredSize(new java.awt.Dimension(257, 710));

        lab6.setText("jLabel2");

        table6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Name", "Vote"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table6);

        javax.swing.GroupLayout pan6Layout = new javax.swing.GroupLayout(pan6);
        pan6.setLayout(pan6Layout);
        pan6Layout.setHorizontalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab6, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                .addGap(85, 85, 85))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pan6Layout.setVerticalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jPanel1.add(pan6);
        pan6.setBounds(750, 130, 340, 460);

        pan7.setBackground(new java.awt.Color(153, 153, 255));

        lab7.setText("jLabel2");

        table7.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Name", "Vote"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table7);

        javax.swing.GroupLayout pan7Layout = new javax.swing.GroupLayout(pan7);
        pan7.setLayout(pan7Layout);
        pan7Layout.setHorizontalGroup(
            pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lab7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(pan7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pan7Layout.setVerticalGroup(
            pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel1.add(pan7);
        pan7.setBounds(1120, 130, 340, 460);

        pan8.setBackground(new java.awt.Color(204, 204, 255));

        lab8.setText("General-Secratery");

        table8.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Vote"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(table8);

        javax.swing.GroupLayout pan8Layout = new javax.swing.GroupLayout(pan8);
        pan8.setLayout(pan8Layout);
        pan8Layout.setHorizontalGroup(
            pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan8Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(lab8, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(pan8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pan8Layout.setVerticalGroup(
            pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel1.add(pan8);
        pan8.setBounds(10, 130, 340, 460);
        jPanel1.add(lb3);
        lb3.setBounds(536, 59, 0, 65);

        pan9.setBackground(new java.awt.Color(204, 204, 255));

        lab9.setText("jLabel2");

        table9.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID ", "Name", "Vote"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(table9);

        javax.swing.GroupLayout pan9Layout = new javax.swing.GroupLayout(pan9);
        pan9.setLayout(pan9Layout);
        pan9Layout.setHorizontalGroup(
            pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lab9, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
            .addGroup(pan9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        pan9Layout.setVerticalGroup(
            pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        jPanel1.add(pan9);
        pan9.setBounds(1490, 130, 340, 460);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("Result of ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(850, 10, 220, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Exit from Here");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(800, 790, 220, 40);

        tvl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tvl.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(tvl);
        tvl.setBounds(800, 680, 320, 30);

        vvl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        vvl.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(vvl);
        vvl.setBounds(800, 650, 320, 30);

        prl.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        prl.setForeground(new java.awt.Color(51, 51, 255));
        jPanel1.add(prl);
        prl.setBounds(800, 710, 320, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote_booth/logo.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 100, 370, 530);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote_booth/logo.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(1340, 90, 540, 530);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        new CombinedFrame();
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ResultFrame();
                } catch (Exception ex) {
                    Logger.getLogger(ResultFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JLabel lab7;
    private javax.swing.JLabel lab8;
    private javax.swing.JLabel lab9;
    private javax.swing.JLabel lb3;
    private javax.swing.JPanel pan5;
    private javax.swing.JPanel pan6;
    private javax.swing.JPanel pan7;
    private javax.swing.JPanel pan8;
    private javax.swing.JPanel pan9;
    private javax.swing.JLabel prl;
    private javax.swing.JTable table5;
    private javax.swing.JTable table6;
    private javax.swing.JTable table7;
    private javax.swing.JTable table8;
    private javax.swing.JTable table9;
    private javax.swing.JLabel tvl;
    private javax.swing.JLabel vvl;
    // End of variables declaration//GEN-END:variables
}
