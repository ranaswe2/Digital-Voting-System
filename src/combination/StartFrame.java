
package combination;

import java.awt.Color;
import static javax.swing.BorderFactory.createMatteBorder;
import javax.swing.ImageIcon;


public class StartFrame extends javax.swing.JFrame implements AppInfo{

    
    public StartFrame() {
        //super("Welcome");
        dispose();
        this.setUndecorated(true);
        
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        
        this.setSize(700, 720);
        setResizable(false);
        this.setVisible(true);
        
        progress.setBackground(Color.gray);
        progress.setForeground(Color.blue);
        //progress.setCursor(new Cursor(Cursor.HAND_CURSOR));
        progress.setBorder(createMatteBorder(0,0,5,0,Color.white));
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        progress = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        progressL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(null);
        jPanel1.add(progress);
        progress.setBounds(430, 370, 190, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Version 1.0");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(330, 210, 120, 14);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Logo © Ikra Chowdhury Nowkshi");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(440, 650, 280, 14);

        progressL.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        progressL.setText("0%");
        jPanel1.add(progressL);
        progressL.setBounds(630, 360, 60, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/combination/divs.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, -20, 710, 770);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 707, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 694, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        
        StartFrame start= new StartFrame();
        
        try {
            int i;
            for(i=0;i<=50;i++){
            Thread.sleep(50);
                start.progress.setValue(i);
                start.progressL.setText(i+"%");
            }
            for(i=50;i<=80;i++){
            Thread.sleep(75);
                start.progress.setValue(i);
                start.progressL.setText(i+"%");
            }
            for(i=80;i<=100;i++){
            Thread.sleep(100);
                start.progress.setValue(i);
                start.progressL.setText(i+"%");
            }
            
            Thread.sleep(500);
            
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            
                
                start.dispose();
                new CombinedFrame();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar progress;
    private javax.swing.JLabel progressL;
    // End of variables declaration//GEN-END:variables
}
