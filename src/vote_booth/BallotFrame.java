
package vote_booth;

import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import combination.AppInfo;
import combination.VoteQuery;
import static combination.VoteQuery.rs;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class BallotFrame extends javax.swing.JFrame implements AppInfo{

                String cata1,cata2,cata3,cata4,cata5;
                int candidateNum1, candidateNum2, candidateNum3, candidateNum4, candidateNum5;
                String path;
   
    public BallotFrame() throws Exception {
        
        super(" "+version);
        initComponents();
        this.setLocationRelativeTo(null);    //set jframe at center of screen
        this.setIconImage(new ImageIcon(getClass().getResource("logo.png")).getImage());
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //this.setUndecorated(true);
        
            
             VoteQuery.basicQuery("SELECT `e_name`, `e_id`, `mail`, `desig1`, `desig2`, `desig3`, `desig4`, `desig5`, `candi1`, `candi2`, `candi3`, `candi4`, `candi5` FROM `election` WHERE `e_code`='"+BoothConfirmation.ecode+"'");
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
                     
                         
                         if(candidateNum1==7){
                             jRadioButton1.setVisible(true);
                             jRadioButton2.setVisible(true);
                             jRadioButton3.setVisible(true);
                             jRadioButton4.setVisible(true);
                             jRadioButton5.setVisible(true);
                             jRadioButton6.setVisible(true);
                             jRadioButton7.setVisible(true);        
                                     
                                     
                         }
                         else if(candidateNum1==6){
                            jRadioButton1.setVisible(true);
                            jRadioButton2.setVisible(true);
                            jRadioButton3.setVisible(true);
                            jRadioButton4.setVisible(true);
                            jRadioButton5.setVisible(true);
                            jRadioButton6.setVisible(true);
                            jRadioButton7.setVisible(false);
                             
                         }
                         else if(candidateNum1==5){
                             jRadioButton1.setVisible(true);
                             jRadioButton2.setVisible(true);
                             jRadioButton3.setVisible(true);
                             jRadioButton4.setVisible(true);
                             jRadioButton5.setVisible(true);
                             jRadioButton6.setVisible(false);
                             jRadioButton7.setVisible(false);
                         }
                         else if(candidateNum1==4){
                            jRadioButton1.setVisible(true);
                             jRadioButton2.setVisible(true);
                             jRadioButton3.setVisible(true);
                             jRadioButton4.setVisible(true);
                             jRadioButton5.setVisible(false);
                             jRadioButton6.setVisible(false);
                             jRadioButton7.setVisible(false);
                         }
                         else if(candidateNum1==3){
                            jRadioButton1.setVisible(true);
                             jRadioButton2.setVisible(true);
                             jRadioButton3.setVisible(true);
                             jRadioButton4.setVisible(false);
                             jRadioButton5.setVisible(false);
                             jRadioButton6.setVisible(false);
                             jRadioButton7.setVisible(false);
                             
                         }
                         else if(candidateNum1==2){
                             jRadioButton1.setVisible(true);
                             jRadioButton2.setVisible(true);
                             jRadioButton3.setVisible(false);
                             jRadioButton4.setVisible(false);
                             jRadioButton5.setVisible(false);
                             jRadioButton6.setVisible(false);
                             jRadioButton7.setVisible(false);
                             
                         }
                     
                 }
                 else if(candidateNum1 <=1){
                     
                     pan5.setVisible(false);
                 }
                 
                 if(candidateNum4 >1 ){
                     
                     pan8.setVisible(true);
                     
                         if(candidateNum4==7){
                             jRadioButton22.setVisible(true);
                             jRadioButton23.setVisible(true);
                             jRadioButton24.setVisible(true);
                             jRadioButton25.setVisible(true);
                             jRadioButton26.setVisible(true);
                             jRadioButton28.setVisible(true);
                             jRadioButton27.setVisible(true);
                             
                         }
                         else if(candidateNum4==6){
                            jRadioButton22.setVisible(true);
                             jRadioButton23.setVisible(true);
                             jRadioButton24.setVisible(true);
                             jRadioButton25.setVisible(true);
                             jRadioButton26.setVisible(true);
                             jRadioButton28.setVisible(false);
                             jRadioButton27.setVisible(true);
                             
                         }
                         else if(candidateNum4==5){
                             jRadioButton22.setVisible(true);
                             jRadioButton23.setVisible(true);
                             jRadioButton24.setVisible(true);
                             jRadioButton25.setVisible(true);
                             jRadioButton26.setVisible(true);
                             jRadioButton28.setVisible(false);
                             jRadioButton27.setVisible(false);
                         }
                         else if(candidateNum4==4){
                            jRadioButton22.setVisible(true);
                             jRadioButton23.setVisible(true);
                             jRadioButton24.setVisible(true);
                             jRadioButton25.setVisible(true);
                             jRadioButton26.setVisible(false);
                             jRadioButton28.setVisible(false);
                             jRadioButton27.setVisible(false);
                             
                         }
                         else if(candidateNum4==3){
                            jRadioButton22.setVisible(true);
                             jRadioButton23.setVisible(true);
                             jRadioButton24.setVisible(true);
                             jRadioButton25.setVisible(false);
                             jRadioButton26.setVisible(false);
                             jRadioButton28.setVisible(false);
                             jRadioButton27.setVisible(false);
                             
                         }
                         else if(candidateNum4==2){
                            jRadioButton22.setVisible(true);
                             jRadioButton23.setVisible(true);
                             jRadioButton24.setVisible(false);
                             jRadioButton25.setVisible(false);
                             jRadioButton26.setVisible(false);
                             jRadioButton28.setVisible(false);
                             jRadioButton27.setVisible(false);
                             
                         }
                 }
                 else if(candidateNum4<=1){
                     
                     pan8.setVisible(false);
                 }
                 
                 
                 
                 if(candidateNum3  >1 ){
                     
                     pan7.setVisible(true);
                     
                     
                         if(candidateNum3==7){
                             jRadioButton15.setVisible(true);
                             jRadioButton16.setVisible(true);
                             jRadioButton17.setVisible(true);
                             jRadioButton18.setVisible(true);
                             jRadioButton19.setVisible(true);
                             jRadioButton20.setVisible(true);
                             jRadioButton21.setVisible(true);
                             
                         }
                         else if(candidateNum3==6){
                            jRadioButton15.setVisible(true);
                             jRadioButton16.setVisible(true);
                             jRadioButton17.setVisible(true);
                             jRadioButton18.setVisible(true);
                             jRadioButton19.setVisible(true);
                             jRadioButton20.setVisible(true);
                             jRadioButton21.setVisible(false);
                         }
                         else if(candidateNum3==5){
                             jRadioButton15.setVisible(true);
                             jRadioButton16.setVisible(true);
                             jRadioButton17.setVisible(true);
                             jRadioButton18.setVisible(true);
                             jRadioButton19.setVisible(true);
                             jRadioButton20.setVisible(false);
                             jRadioButton21.setVisible(false);
                         }
                         else if(candidateNum3==4){
                             jRadioButton15.setVisible(true);
                             jRadioButton16.setVisible(true);
                             jRadioButton17.setVisible(true);
                             jRadioButton18.setVisible(true);
                             jRadioButton19.setVisible(false);
                             jRadioButton20.setVisible(false);
                             jRadioButton21.setVisible(false);
                         }
                         else if(candidateNum3==3){
                            jRadioButton15.setVisible(true);
                             jRadioButton16.setVisible(true);
                             jRadioButton17.setVisible(true);
                             jRadioButton18.setVisible(false);
                             jRadioButton19.setVisible(false);
                             jRadioButton20.setVisible(false);
                             jRadioButton21.setVisible(false);
                             
                         }
                         else if(candidateNum3==2){
                             jRadioButton15.setVisible(true);
                             jRadioButton16.setVisible(true);
                             jRadioButton17.setVisible(false);
                             jRadioButton18.setVisible(false);
                             jRadioButton19.setVisible(false);
                             jRadioButton20.setVisible(false);
                             jRadioButton21.setVisible(false);
                             
                         }
                     }
                     
                 
                 else if(candidateNum3<=1){
                     
                     pan7.setVisible(false);
                 }
                 
                 if(candidateNum2  >1 ){
                     
                     pan6.setVisible(true);
                     
                     
                         if(candidateNum2==7){
                             jRadioButton8.setVisible(true);
                             jRadioButton9.setVisible(true);
                             jRadioButton10.setVisible(true);
                             jRadioButton11.setVisible(true);
                             jRadioButton12.setVisible(true);
                             jRadioButton13.setVisible(true);
                             jRadioButton14.setVisible(true);
                             
                         }
                         else if(candidateNum2==6){
                            jRadioButton8.setVisible(true);
                             jRadioButton9.setVisible(true);
                             jRadioButton10.setVisible(true);
                             jRadioButton11.setVisible(true);
                             jRadioButton12.setVisible(true);
                             jRadioButton13.setVisible(true);
                             jRadioButton14.setVisible(false);
                             
                         }
                         else if(candidateNum2==5){
                             jRadioButton8.setVisible(true);
                             jRadioButton9.setVisible(true);
                             jRadioButton10.setVisible(true);
                             jRadioButton11.setVisible(true);
                             jRadioButton12.setVisible(true);
                             jRadioButton13.setVisible(false);
                             jRadioButton14.setVisible(false);
                         }
                         else if(candidateNum2==4){
                            jRadioButton8.setVisible(true);
                             jRadioButton9.setVisible(true);
                             jRadioButton10.setVisible(true);
                             jRadioButton11.setVisible(true);
                             jRadioButton12.setVisible(false);
                             jRadioButton13.setVisible(false);
                             jRadioButton14.setVisible(false);
                         }
                         else if(candidateNum2==3){
                            jRadioButton8.setVisible(true);
                             jRadioButton9.setVisible(true);
                             jRadioButton10.setVisible(true);
                             jRadioButton11.setVisible(false);
                             jRadioButton12.setVisible(false);
                             jRadioButton13.setVisible(false);
                             jRadioButton14.setVisible(false);
                             
                         }
                         else if(candidateNum2==2){
                             jRadioButton8.setVisible(true);
                             jRadioButton9.setVisible(true);
                             jRadioButton10.setVisible(false);
                             jRadioButton11.setVisible(false);
                             jRadioButton12.setVisible(false);
                             jRadioButton13.setVisible(false);
                             jRadioButton14.setVisible(false);
                             
                         }
                     }
                 
                 else if(candidateNum2 <=1){
                     
                     pan6.setVisible(false);
                 }
                 
                 if(candidateNum5  >1 ){
                    
                     pan9.setVisible(true);
                     
                     
                         if(candidateNum5==7){
                             jRadioButton29.setVisible(true);
                             jRadioButton30.setVisible(true);
                             jRadioButton31.setVisible(true);
                             jRadioButton32.setVisible(true);
                             jRadioButton33.setVisible(true);
                             jRadioButton34.setVisible(true);
                             jRadioButton35.setVisible(true);
                             
                         }
                         else if(candidateNum5==6){
                             jRadioButton29.setVisible(true);
                             jRadioButton30.setVisible(true);
                             jRadioButton31.setVisible(true);
                             jRadioButton32.setVisible(true);
                             jRadioButton33.setVisible(true);
                             jRadioButton34.setVisible(true);
                             jRadioButton35.setVisible(false);
                             
                         }
                         else if(candidateNum5==5){
                             jRadioButton29.setVisible(true);
                             jRadioButton30.setVisible(true);
                             jRadioButton31.setVisible(true);
                             jRadioButton32.setVisible(true);
                             jRadioButton33.setVisible(true);
                             jRadioButton34.setVisible(false);
                             jRadioButton35.setVisible(false);
                         }
                         else if(candidateNum5==4){
                             jRadioButton29.setVisible(true);
                             jRadioButton30.setVisible(true);
                             jRadioButton31.setVisible(true);
                             jRadioButton32.setVisible(true);
                             jRadioButton33.setVisible(false);
                             jRadioButton34.setVisible(false);
                             jRadioButton35.setVisible(false);
                         }
                         else if(candidateNum5==3){
                             jRadioButton29.setVisible(true);
                             jRadioButton30.setVisible(true);
                             jRadioButton31.setVisible(true);
                             jRadioButton32.setVisible(false);
                             jRadioButton33.setVisible(false);
                             jRadioButton34.setVisible(false);
                             jRadioButton35.setVisible(false);
                             
                         }
                         else if(candidateNum5==2){
                             jRadioButton29.setVisible(true);
                             jRadioButton30.setVisible(true);
                             jRadioButton31.setVisible(false);
                             jRadioButton32.setVisible(false);
                             jRadioButton33.setVisible(false);
                             jRadioButton34.setVisible(false);
                             jRadioButton35.setVisible(false);
                             
                         }
                         
                 }
                  
                 else if(candidateNum5<=1){
                     
                     pan9.setVisible(false);
                 }
                 
                lab5.setText(cata1);
                lab6.setText(cata2);
                lab7.setText(cata3);
                lab8.setText(cata4);
                lab9.setText(cata5);
                 
                   
            
            
            
             try {
                 
            Class.forName("com.mysql.jdbc.Driver");
            Connection con= null;
            Statement st= null; 
            
            con= DriverManager.getConnection("jdbc:mysql://localhost/divs","root","");
            st= con.createStatement();
            
   //************************************************************************************************************//         
            
            if(candidateNum1 != 0){
                
   //------------------------------------------------------------------------------------------------------------//             
            
                String query= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata1+"' and `sl`=1";
                     
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                byte[] img=rs.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb1.getWidth(),lb1.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton1.setText(rs.getString("c.voterId"));
                lb1.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query2= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata1+"' and `sl`=2";                 
            ResultSet rs2= st.executeQuery(query2);
            
            if(rs2.next()){
            
                byte[] img2=rs2.getBytes("symbol");
            ImageIcon image2= new ImageIcon(img2);
            Image im2= image2.getImage();
            
            Image myImg2= im2.getScaledInstance(lb2.getWidth(),lb2.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i2= new ImageIcon(myImg2);
                jRadioButton2.setText(rs2.getString("c.voterId"));
                lb2.setIcon(i2);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            
            String query3= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata1+"' and `sl`=3";
                       
            ResultSet rs3= st.executeQuery(query3);
            
            if(rs3.next()){
            
                byte[] img=rs3.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb3.getWidth(),lb3.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton3.setText(rs3.getString("c.voterId"));
                lb3.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query4= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata1+"' and `sl`=4";
                       
            ResultSet rs4= st.executeQuery(query4);
            
            if(rs4.next()){
            
                byte[] img=rs4.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb4.getWidth(),lb4.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton4.setText(rs4.getString("c.voterId"));
                lb4.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query5= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata1+"' and `sl`=5";
                       
            ResultSet rs5= st.executeQuery(query5);
            
            if(rs5.next()){
            
                byte[] img=rs5.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb5.getWidth(),lb5.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton5.setText(rs5.getString("c.voterId"));
                lb5.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query6= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata1+"' and `sl`=6";
                       
            ResultSet rs6= st.executeQuery(query6);
            
            if(rs6.next()){
            
                byte[] img=rs6.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb6.getWidth(),lb6.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton6.setText(rs6.getString("c.voterId"));
                lb6.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query7= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata1+"' and `sl`=7";
                       
            ResultSet rs7= st.executeQuery(query7);
            
            if(rs7.next()){
            
                byte[] img=rs7.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb7.getWidth(),lb7.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton7.setText(rs7.getString("c.voterId"));
                lb7.setIcon(i);
            }
            
        }   
   //-------------------------------------------------------------------------------------------------------------//             
   //************************************************************************************************************//         
            
            if(candidateNum2 != 0){
                
   //------------------------------------------------------------------------------------------------------------//             
            
                String query= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata2+"' and `sl`=1";
                     
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                byte[] img=rs.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb8.getWidth(),lb8.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton8.setText(rs.getString("c.voterId"));
                lb8.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query2= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata2+"' and `sl`=2";                 
            ResultSet rs2= st.executeQuery(query2);
            
            if(rs2.next()){
            
                byte[] img2=rs2.getBytes("symbol");
            ImageIcon image2= new ImageIcon(img2);
            Image im2= image2.getImage();
            
            Image myImg2= im2.getScaledInstance(lb9.getWidth(),lb9.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i2= new ImageIcon(myImg2);
                jRadioButton9.setText(rs2.getString("c.voterId"));
                lb9.setIcon(i2);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            
            String query3= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata2+"' and `sl`=3";
                       
            ResultSet rs3= st.executeQuery(query3);
            
            if(rs3.next()){
            
                byte[] img=rs3.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb10.getWidth(),lb10.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton10.setText(rs3.getString("c.voterId"));
                lb10.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query4= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata2+"' and `sl`=4";
                       
            ResultSet rs4= st.executeQuery(query4);
            
            if(rs4.next()){
            
                byte[] img=rs4.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb11.getWidth(),lb11.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton11.setText(rs4.getString("c.voterId"));
                lb11.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query5= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata2+"' and `sl`=5";
                       
            ResultSet rs5= st.executeQuery(query5);
            
            if(rs5.next()){
            
                byte[] img=rs5.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb12.getWidth(),lb12.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton12.setText(rs5.getString("c.voterId"));
                lb12.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query6= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata2+"' and `sl`=6";
                       
            ResultSet rs6= st.executeQuery(query6);
            
            if(rs6.next()){
            
                byte[] img=rs6.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb13.getWidth(),lb13.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton13.setText(rs6.getString("c.voterId"));
                lb13.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query7= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata2+"' and `sl`=7";
                       
            ResultSet rs7= st.executeQuery(query7);
            
            if(rs7.next()){
            
                byte[] img=rs7.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb14.getWidth(),lb14.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton14.setText(rs7.getString("c.voterId"));
                lb14.setIcon(i);
            }
      }    
   //-------------------------------------------------------------------------------------------------------------//             
   //************************************************************************************************************//         
            
            if(candidateNum3 != 0){
                
   //------------------------------------------------------------------------------------------------------------//             
            
            String query= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata3+"' and `sl`=1";
                     
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                byte[] img=rs.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb15.getWidth(),lb15.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton15.setText(rs.getString("c.voterId"));
                lb15.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query2= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata3+"' and `sl`=2";                 
            ResultSet rs2= st.executeQuery(query2);
            
            if(rs2.next()){
            
                byte[] img2=rs2.getBytes("symbol");
            ImageIcon image2= new ImageIcon(img2);
            Image im2= image2.getImage();
            
            Image myImg2= im2.getScaledInstance(lb16.getWidth(),lb16.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i2= new ImageIcon(myImg2);
                jRadioButton16.setText(rs2.getString("c.voterId"));
                lb16.setIcon(i2);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            
            String query3= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata3+"' and `sl`=3";
                       
            ResultSet rs3= st.executeQuery(query3);
            
            if(rs3.next()){
            
                byte[] img=rs3.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb17.getWidth(),lb17.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton17.setText(rs3.getString("c.voterId"));
                lb17.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query4= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata3+"' and `sl`=4";
                       
            ResultSet rs4= st.executeQuery(query4);
            
            if(rs4.next()){
            
                byte[] img=rs4.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb18.getWidth(),lb18.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton18.setText(rs4.getString("c.voterId"));
                lb18.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query5= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata3+"' and `sl`=5";
                       
            ResultSet rs5= st.executeQuery(query5);
            
            if(rs5.next()){
            
                byte[] img=rs5.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb19.getWidth(),lb19.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton19.setText(rs5.getString("c.voterId"));
                lb19.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query6= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata3+"' and `sl`=6";
                       
            ResultSet rs6= st.executeQuery(query6);
            
            if(rs6.next()){
            
                byte[] img=rs6.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb20.getWidth(),lb20.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton20.setText(rs6.getString("c.voterId"));
                lb20.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query7= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata3+"' and `sl`=7";
                       
            ResultSet rs7= st.executeQuery(query7);
            
            if(rs7.next()){
            
                byte[] img=rs7.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb21.getWidth(),lb21.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton21.setText(rs7.getString("c.voterId"));
                lb21.setIcon(i);
            }
      }    
   //-------------------------------------------------------------------------------------------------------------//             
    //************************************************************************************************************//         
            
            if(candidateNum4 != 0){
                
   //------------------------------------------------------------------------------------------------------------//             
            
            String query= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata4+"' and `sl`=1";
                     
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                byte[] img=rs.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb22.getWidth(),lb22.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton22.setText(rs.getString("c.voterId"));
                lb22.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query2= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata4+"' and `sl`=2";                 
            ResultSet rs2= st.executeQuery(query2);
            
            if(rs2.next()){
            
                byte[] img2=rs2.getBytes("symbol");
            ImageIcon image2= new ImageIcon(img2);
            Image im2= image2.getImage();
            
            Image myImg2= im2.getScaledInstance(lb23.getWidth(),lb23.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i2= new ImageIcon(myImg2);
                jRadioButton23.setText(rs2.getString("c.voterId"));
                lb23.setIcon(i2);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            
            String query3= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata4+"' and `sl`=3";
                       
            ResultSet rs3= st.executeQuery(query3);
            
            if(rs3.next()){
            
                byte[] img=rs3.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb24.getWidth(),lb24.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton24.setText(rs3.getString("c.voterId"));
                lb24.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query4= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata4+"' and `sl`=4";
                       
            ResultSet rs4= st.executeQuery(query4);
            
            if(rs4.next()){
            
                byte[] img=rs4.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb25.getWidth(),lb25.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton25.setText(rs4.getString("c.voterId"));
                lb25.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query5= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata4+"' and `sl`=5";
                       
            ResultSet rs5= st.executeQuery(query5);
            
            if(rs5.next()){
            
                byte[] img=rs5.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb26.getWidth(),lb26.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton26.setText(rs5.getString("c.voterId"));
                lb26.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query6= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata4+"' and `sl`=6";
                       
            ResultSet rs6= st.executeQuery(query6);
            
            if(rs6.next()){
            
                byte[] img=rs6.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb27.getWidth(),lb27.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton27.setText(rs6.getString("c.voterId"));
                lb27.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query7= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata4+"' and `sl`=7";
                       
            ResultSet rs7= st.executeQuery(query7);
            
            if(rs7.next()){
            
                byte[] img=rs7.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb28.getWidth(),lb28.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton28.setText(rs7.getString("c.voterId"));
                lb28.setIcon(i);
            }
      }    
   //-------------------------------------------------------------------------------------------------------------//             
    //************************************************************************************************************//         
            
            if(candidateNum5 != 0){
                
   //------------------------------------------------------------------------------------------------------------//             
            
            String query= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata5+"' and `sl`=1";
                     
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
            
                byte[] img=rs.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb29.getWidth(),lb29.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton29.setText(rs.getString("c.voterId"));
                lb29.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query2= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata5+"' and `sl`=2";                 
            ResultSet rs2= st.executeQuery(query2);
            
            if(rs2.next()){
            
                byte[] img2=rs2.getBytes("symbol");
            ImageIcon image2= new ImageIcon(img2);
            Image im2= image2.getImage();
            
            Image myImg2= im2.getScaledInstance(lb30.getWidth(),lb30.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i2= new ImageIcon(myImg2);
                jRadioButton30.setText(rs2.getString("c.voterId"));
                lb30.setIcon(i2);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            
            String query3= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata5+"' and `sl`=3";
                       
            ResultSet rs3= st.executeQuery(query3);
            
            if(rs3.next()){
            
                byte[] img=rs3.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb31.getWidth(),lb31.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton31.setText(rs3.getString("c.voterId"));
                lb31.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query4= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata5+"' and `sl`=4";
                       
            ResultSet rs4= st.executeQuery(query4);
            
            if(rs4.next()){
            
                byte[] img=rs4.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb32.getWidth(),lb32.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton32.setText(rs4.getString("c.voterId"));
                lb32.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query5= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata5+"' and `sl`=5";
                       
            ResultSet rs5= st.executeQuery(query5);
            
            if(rs5.next()){
            
                byte[] img=rs5.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb33.getWidth(),lb33.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton33.setText(rs5.getString("c.voterId"));
                lb33.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query6= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata5+"' and `sl`=6";
                       
            ResultSet rs6= st.executeQuery(query6);
            
            if(rs6.next()){
            
                byte[] img=rs6.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb34.getWidth(),lb34.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton34.setText(rs6.getString("c.voterId"));
                lb34.setIcon(i);
            }
            
   //-------------------------------------------------------------------------------------------------------------//             
            
            String query7= "SELECT * FROM `candidate` as c, `voter` as v WHERE c.secrete ='"+BoothConfirmation.ecode+"' and v.secrete ='"+BoothConfirmation.ecode+"' and c.designation='"+cata5+"' and `sl`=7";
                       
            ResultSet rs7= st.executeQuery(query7);
            
            if(rs7.next()){
            
                byte[] img=rs7.getBytes("symbol");
            ImageIcon image= new ImageIcon(img);
            Image im= image.getImage();
            
            Image myImg= im.getScaledInstance(lb35.getWidth(),lb35.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon i= new ImageIcon(myImg);
                jRadioButton35.setText(rs7.getString("c.voterId"));
                lb35.setIcon(i);
            }
      }    
   //-------------------------------------------------------------------------------------------------------------//             
             
            
            
            }catch(Exception e){
            e.printStackTrace();
            
            }
           enameL.setText(BoothConfirmation.ename);
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
        enameL = new javax.swing.JLabel();
        pan5 = new javax.swing.JPanel();
        lab5 = new javax.swing.JLabel();
        lb1 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        lb7 = new javax.swing.JLabel();
        lb4 = new javax.swing.JLabel();
        lb6 = new javax.swing.JLabel();
        lb5 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        pan6 = new javax.swing.JPanel();
        lab6 = new javax.swing.JLabel();
        lb9 = new javax.swing.JLabel();
        lb10 = new javax.swing.JLabel();
        lb8 = new javax.swing.JLabel();
        lb11 = new javax.swing.JLabel();
        lb12 = new javax.swing.JLabel();
        lb14 = new javax.swing.JLabel();
        lb13 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        pan7 = new javax.swing.JPanel();
        lab7 = new javax.swing.JLabel();
        lb15 = new javax.swing.JLabel();
        lb16 = new javax.swing.JLabel();
        lb17 = new javax.swing.JLabel();
        lb18 = new javax.swing.JLabel();
        lb19 = new javax.swing.JLabel();
        lb20 = new javax.swing.JLabel();
        lb21 = new javax.swing.JLabel();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        jRadioButton21 = new javax.swing.JRadioButton();
        pan8 = new javax.swing.JPanel();
        lab8 = new javax.swing.JLabel();
        lb22 = new javax.swing.JLabel();
        lb24 = new javax.swing.JLabel();
        lb23 = new javax.swing.JLabel();
        lb28 = new javax.swing.JLabel();
        lb25 = new javax.swing.JLabel();
        lb27 = new javax.swing.JLabel();
        lb26 = new javax.swing.JLabel();
        jRadioButton22 = new javax.swing.JRadioButton();
        jRadioButton24 = new javax.swing.JRadioButton();
        jRadioButton25 = new javax.swing.JRadioButton();
        jRadioButton26 = new javax.swing.JRadioButton();
        jRadioButton27 = new javax.swing.JRadioButton();
        jRadioButton28 = new javax.swing.JRadioButton();
        jRadioButton23 = new javax.swing.JRadioButton();
        lb3 = new javax.swing.JLabel();
        pan9 = new javax.swing.JPanel();
        lab9 = new javax.swing.JLabel();
        lb29 = new javax.swing.JLabel();
        lb31 = new javax.swing.JLabel();
        lb32 = new javax.swing.JLabel();
        lb30 = new javax.swing.JLabel();
        lb34 = new javax.swing.JLabel();
        lb33 = new javax.swing.JLabel();
        lb35 = new javax.swing.JLabel();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton29 = new javax.swing.JRadioButton();
        jButton36 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1366, 950));
        jPanel1.setLayout(null);

        enameL.setBackground(new java.awt.Color(255, 255, 255));
        enameL.setFont(new java.awt.Font("Dialog", 1, 28)); // NOI18N
        enameL.setForeground(new java.awt.Color(0, 0, 255));
        enameL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(enameL);
        enameL.setBounds(460, 20, 1000, 42);

        pan5.setBackground(new java.awt.Color(102, 153, 255));

        lab5.setText("jLabel2");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton1.setText("--------------------");
        jRadioButton1.setPreferredSize(new java.awt.Dimension(99, 23));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton2.setText("--------------------");
        jRadioButton2.setPreferredSize(new java.awt.Dimension(99, 23));

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton3.setText("--------------------");
        jRadioButton3.setPreferredSize(new java.awt.Dimension(99, 23));

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton4.setText("--------------------");
        jRadioButton4.setPreferredSize(new java.awt.Dimension(99, 23));

        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton5.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton5.setText("--------------------");
        jRadioButton5.setPreferredSize(new java.awt.Dimension(99, 23));

        buttonGroup1.add(jRadioButton6);
        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton6.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton6.setText("--------------------");
        jRadioButton6.setPreferredSize(new java.awt.Dimension(99, 23));

        buttonGroup1.add(jRadioButton7);
        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton7.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton7.setText("--------------------");

        javax.swing.GroupLayout pan5Layout = new javax.swing.GroupLayout(pan5);
        pan5.setLayout(pan5Layout);
        pan5Layout.setHorizontalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan5Layout.createSequentialGroup()
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan5Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lab5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pan5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                            .addComponent(jRadioButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(jRadioButton5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lb2, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                        .addComponent(lb1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pan5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1386, 1386, 1386))
        );
        pan5Layout.setVerticalGroup(
            pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pan5Layout.createSequentialGroup()
                        .addComponent(lab5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lb1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton7)
                    .addComponent(lb7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(162, 162, 162))
        );

        jPanel1.add(pan5);
        pan5.setBounds(460, 170, 260, 600);

        pan6.setBackground(new java.awt.Color(0, 102, 204));
        pan6.setPreferredSize(new java.awt.Dimension(257, 710));

        lab6.setText("jLabel2");

        buttonGroup2.add(jRadioButton8);
        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton8.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton8.setText("--------------------");

        buttonGroup2.add(jRadioButton9);
        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton9.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton9.setText("--------------------");

        buttonGroup2.add(jRadioButton10);
        jRadioButton10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton10.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton10.setText("--------------------");

        buttonGroup2.add(jRadioButton11);
        jRadioButton11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton11.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton11.setText("--------------------");

        buttonGroup2.add(jRadioButton12);
        jRadioButton12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton12.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton12.setText("--------------------");

        buttonGroup2.add(jRadioButton13);
        jRadioButton13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton13.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton13.setText("--------------------");

        buttonGroup2.add(jRadioButton14);
        jRadioButton14.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton14.setText("--------------------");

        javax.swing.GroupLayout pan6Layout = new javax.swing.GroupLayout(pan6);
        pan6.setLayout(pan6Layout);
        pan6Layout.setHorizontalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan6Layout.createSequentialGroup()
                        .addComponent(lab6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4))
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb14, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb13, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb8, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                    .addComponent(lb9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        pan6Layout.setVerticalGroup(
            pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pan6Layout.createSequentialGroup()
                        .addComponent(lab6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jRadioButton8))
                    .addComponent(lb8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton10, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton13)
                    .addComponent(lb13, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton14, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(125, 125, 125))
        );

        jPanel1.add(pan6);
        pan6.setBounds(830, 170, 260, 600);

        pan7.setBackground(new java.awt.Color(102, 153, 255));

        lab7.setText("jLabel2");

        buttonGroup3.add(jRadioButton15);
        jRadioButton15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton15.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton15.setText("--------------------");

        buttonGroup3.add(jRadioButton16);
        jRadioButton16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton16.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton16.setText("--------------------");
        jRadioButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton16ActionPerformed(evt);
            }
        });

        buttonGroup3.add(jRadioButton17);
        jRadioButton17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton17.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton17.setText("--------------------");

        buttonGroup3.add(jRadioButton18);
        jRadioButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton18.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton18.setText("--------------------");

        buttonGroup3.add(jRadioButton19);
        jRadioButton19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton19.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton19.setText("--------------------");

        buttonGroup3.add(jRadioButton20);
        jRadioButton20.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton20.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton20.setText("--------------------");

        buttonGroup3.add(jRadioButton21);
        jRadioButton21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton21.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton21.setText("--------------------");

        javax.swing.GroupLayout pan7Layout = new javax.swing.GroupLayout(pan7);
        pan7.setLayout(pan7Layout);
        pan7Layout.setHorizontalGroup(
            pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan7Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan7Layout.createSequentialGroup()
                        .addComponent(lab7, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pan7Layout.createSequentialGroup()
                        .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lb17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(10, 10, 10))
            .addGroup(pan7Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jRadioButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb19, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pan7Layout.setVerticalGroup(
            pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pan7Layout.createSequentialGroup()
                        .addComponent(lab7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jRadioButton15))
                    .addComponent(lb15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan7Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jRadioButton16))
                    .addGroup(pan7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb16, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pan7Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jRadioButton17))
                    .addGroup(pan7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb17, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)))
                .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pan7Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jRadioButton18))
                    .addGroup(pan7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb19, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb20, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb21, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton21))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(pan7);
        pan7.setBounds(1190, 170, 250, 600);

        pan8.setBackground(new java.awt.Color(102, 102, 255));

        lab8.setText("General-Secratery");

        buttonGroup4.add(jRadioButton22);
        jRadioButton22.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton22.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton22.setText("--------------------");

        buttonGroup4.add(jRadioButton24);
        jRadioButton24.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton24.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton24.setText("--------------------");

        buttonGroup4.add(jRadioButton25);
        jRadioButton25.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton25.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton25.setText("--------------------");
        jRadioButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton25ActionPerformed(evt);
            }
        });

        buttonGroup4.add(jRadioButton26);
        jRadioButton26.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton26.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton26.setText("--------------------");

        buttonGroup4.add(jRadioButton27);
        jRadioButton27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton27.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton27.setText("--------------------");

        buttonGroup4.add(jRadioButton28);
        jRadioButton28.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton28.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton28.setText("--------------------");

        buttonGroup4.add(jRadioButton23);
        jRadioButton23.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton23.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton23.setText("--------------------");

        javax.swing.GroupLayout pan8Layout = new javax.swing.GroupLayout(pan8);
        pan8.setLayout(pan8Layout);
        pan8Layout.setHorizontalGroup(
            pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan8Layout.createSequentialGroup()
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan8Layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lab8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb27, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                    .addComponent(lb25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb26, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lb24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        pan8Layout.setVerticalGroup(
            pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pan8Layout.createSequentialGroup()
                        .addComponent(lab8, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jRadioButton22))
                    .addComponent(lb22, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton23, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton24, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton25, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton26)
                    .addComponent(lb26, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton27, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(pan8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pan8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jRadioButton28))
                    .addGroup(pan8Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb28, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel1.add(pan8);
        pan8.setBounds(100, 170, 270, 600);
        jPanel1.add(lb3);
        lb3.setBounds(536, 59, 0, 65);

        pan9.setBackground(new java.awt.Color(102, 102, 255));

        lab9.setText("jLabel2");

        buttonGroup5.add(jRadioButton30);
        jRadioButton30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton30.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton30.setText("--------------------");

        buttonGroup5.add(jRadioButton31);
        jRadioButton31.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton31.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton31.setText("--------------------");

        buttonGroup5.add(jRadioButton32);
        jRadioButton32.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton32.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton32.setText("--------------------");

        buttonGroup5.add(jRadioButton33);
        jRadioButton33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton33.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton33.setText("--------------------");

        buttonGroup5.add(jRadioButton34);
        jRadioButton34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton34.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton34.setText("--------------------");

        buttonGroup5.add(jRadioButton35);
        jRadioButton35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton35.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton35.setText("--------------------");

        buttonGroup5.add(jRadioButton29);
        jRadioButton29.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jRadioButton29.setForeground(new java.awt.Color(102, 102, 102));
        jRadioButton29.setText("--------------------");

        javax.swing.GroupLayout pan9Layout = new javax.swing.GroupLayout(pan9);
        pan9.setLayout(pan9Layout);
        pan9Layout.setHorizontalGroup(
            pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan9Layout.createSequentialGroup()
                        .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton30, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jRadioButton31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb31, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb30, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan9Layout.createSequentialGroup()
                        .addComponent(jRadioButton32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb32, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pan9Layout.createSequentialGroup()
                        .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRadioButton35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lb35, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb33, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lb34, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pan9Layout.createSequentialGroup()
                        .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lab9, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jRadioButton29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lb29, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        pan9Layout.setVerticalGroup(
            pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pan9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pan9Layout.createSequentialGroup()
                        .addComponent(lab9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jRadioButton29))
                    .addComponent(lb29, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pan9Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton30)
                            .addComponent(lb30, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lb31, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pan9Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jRadioButton31)
                        .addGap(10, 10, 10)))
                .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton32)
                    .addComponent(lb32, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton33)
                    .addComponent(lb33, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jRadioButton34)
                    .addComponent(lb34, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pan9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lb35, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton35))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel1.add(pan9);
        pan9.setBounds(1530, 170, 250, 600);

        jButton36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton36.setText("Submit Your Vote ");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton36);
        jButton36.setBounds(660, 820, 270, 40);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Exit From Here");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(1020, 820, 240, 40);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Digital Voting Ballot");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(570, 70, 770, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote_booth/longlogo.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(510, 0, 730, 770);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote_booth/logo.png"))); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 0, 680, 880);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vote_booth/logo.png"))); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1350, 0, 560, 870);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1781, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 879, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
    try{
        Class.forName("com.mysql.jdbc.Driver");
            Connection con= null;
            Statement st= null;
            
            con= DriverManager.getConnection("jdbc:mysql://localhost/divs","root","");
            st= con.createStatement();
        
  /************************************************************************************************************/        
        
        if(candidateNum1 != 0){
            
            String vid=null;
            
        if(jRadioButton1.isSelected()){
        vid=jRadioButton1.getText();
        }
        else if(jRadioButton2.isSelected()){
            vid=jRadioButton2.getText();
        }
        else if(jRadioButton3.isSelected()){
            vid=jRadioButton3.getText();
        }
        else if(jRadioButton4.isSelected()){
            vid=jRadioButton4.getText();
        }
        else if(jRadioButton5.isSelected()){
            vid=jRadioButton5.getText();
        }
        else if(jRadioButton6.isSelected()){
            vid=jRadioButton6.getText();
        }
        else if(jRadioButton7.isSelected()){
            vid=jRadioButton7.getText();
        }
        String query= "SELECT * FROM `candidate` WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId` = '"+vid+"'";
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
                
                 int vote=rs.getInt("vote");
                 vote=vote+1;
                 String local="UPDATE `candidate` SET vote='"+vote+"' WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId`='"+vid+"'";
                 st.executeUpdate(local);
            rs.close();
                  }
        }
        
  /************************************************************************************************************/      
    
        if(candidateNum2 != 0){
            
            String vid=null;
            
        if(jRadioButton8.isSelected()){
        vid=jRadioButton8.getText();
        }
        else if(jRadioButton9.isSelected()){
            vid=jRadioButton9.getText();
        }
        else if(jRadioButton10.isSelected()){
            vid=jRadioButton10.getText();
        }
        else if(jRadioButton11.isSelected()){
            vid=jRadioButton11.getText();
        }
        else if(jRadioButton12.isSelected()){
            vid=jRadioButton12.getText();
        }
        else if(jRadioButton13.isSelected()){
            vid=jRadioButton13.getText();
        }
        else if(jRadioButton14.isSelected()){
            vid=jRadioButton14.getText();
        }
        String query= "SELECT * FROM `candidate` WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId` = '"+vid+"'";
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
                
                 int vote=rs.getInt("vote");
                 vote=vote+1;
                 String local="UPDATE `candidate` SET vote='"+vote+"' WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId`='"+vid+"'";
                 st.executeUpdate(local);
            rs.close();
                  }
        }
        
  /************************************************************************************************************/      
    
        if(candidateNum3 != 0){
            
            String vid=null;
            
        if(jRadioButton15.isSelected()){
        vid=jRadioButton15.getText();
        }
        else if(jRadioButton16.isSelected()){
            vid=jRadioButton16.getText();
        }
        else if(jRadioButton17.isSelected()){
            vid=jRadioButton17.getText();
        }
        else if(jRadioButton18.isSelected()){
            vid=jRadioButton18.getText();
        }
        else if(jRadioButton19.isSelected()){
            vid=jRadioButton19.getText();
        }
        else if(jRadioButton20.isSelected()){
            vid=jRadioButton20.getText();
        }
        else if(jRadioButton21.isSelected()){
            vid=jRadioButton21.getText();
        }
        String query= "SELECT * FROM `candidate` WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId` = '"+vid+"'";
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
                
                 int vote=rs.getInt("vote");
                 vote=vote+1;
                 String local="UPDATE `candidate` SET vote='"+vote+"' WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId`='"+vid+"'";
                 st.executeUpdate(local);
            rs.close();
                  }
        }
        
  /************************************************************************************************************/      
    
        if(candidateNum4 != 0){
            
            String vid=null;
            
        if(jRadioButton22.isSelected()){
        vid=jRadioButton22.getText();
        }
        else if(jRadioButton23.isSelected()){
            vid=jRadioButton23.getText();
        }
        else if(jRadioButton24.isSelected()){
            vid=jRadioButton24.getText();
        }
        else if(jRadioButton25.isSelected()){
            vid=jRadioButton25.getText();
        }
        else if(jRadioButton26.isSelected()){
            vid=jRadioButton26.getText();
        }
        else if(jRadioButton27.isSelected()){
            vid=jRadioButton27.getText();
        }
        else if(jRadioButton28.isSelected()){
            vid=jRadioButton28.getText();
        }
        String query= "SELECT * FROM `candidate` WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId` = '"+vid+"'";
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
                
                 int vote=rs.getInt("vote");
                 vote=vote+1;
                 String local="UPDATE `candidate` SET vote='"+vote+"' WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId`='"+vid+"'";
                 st.executeUpdate(local);
            rs.close();
                  }
        }
        
  /************************************************************************************************************/      
    
        if(candidateNum5 != 0){
            
            String vid=null;
            
        if(jRadioButton29.isSelected()){
        vid=jRadioButton29.getText();
        }
        else if(jRadioButton30.isSelected()){
            vid=jRadioButton30.getText();
        }
        else if(jRadioButton31.isSelected()){
            vid=jRadioButton31.getText();
        }
        else if(jRadioButton32.isSelected()){
            vid=jRadioButton32.getText();
        }
        else if(jRadioButton33.isSelected()){
            vid=jRadioButton33.getText();
        }
        else if(jRadioButton34.isSelected()){
            vid=jRadioButton34.getText();
        }
        else if(jRadioButton35.isSelected()){
            vid=jRadioButton35.getText();
        }
        String query= "SELECT * FROM `candidate` WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId` = '"+vid+"'";
            ResultSet rs= st.executeQuery(query);
            
            if(rs.next()){
                
                 int vote=rs.getInt("vote");
                 vote=vote+1;
                 String local="UPDATE `candidate` SET vote='"+vote+"' WHERE `secrete`='"+BoothConfirmation.ecode+"' and `voterId`='"+vid+"'";
                 st.executeUpdate(local);
            rs.close();
                  }
        }
              
        VoteQuery.theQuery("INSERT INTO `votedvoter`(`e_code`, `voterId`) VALUES ('"+BoothConfirmation.ecode+"','"+VoterConfirmation.vid+"')");            
                
  /************************************************************************************************************/      
    
    this.setVisible(false);
    JOptionPane.showMessageDialog(null, "<html>Your vote is accepted.<br/> Now, leave this booth.");
        try {
            new VoterConfirmation();
        } catch (IOException ex) {
        ex.printStackTrace();
        }
    
    }catch(Exception e){
        e.printStackTrace();
    }
    
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try {
            new VoterConfirmation();
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(BallotFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton25ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton25ActionPerformed

    private void jRadioButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton16ActionPerformed

    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BallotFrame();
                } catch (Exception e) {
                 e.printStackTrace();
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
    private javax.swing.JLabel enameL;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton36;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton21;
    private javax.swing.JRadioButton jRadioButton22;
    private javax.swing.JRadioButton jRadioButton23;
    private javax.swing.JRadioButton jRadioButton24;
    private javax.swing.JRadioButton jRadioButton25;
    private javax.swing.JRadioButton jRadioButton26;
    private javax.swing.JRadioButton jRadioButton27;
    private javax.swing.JRadioButton jRadioButton28;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JLabel lab5;
    private javax.swing.JLabel lab6;
    private javax.swing.JLabel lab7;
    private javax.swing.JLabel lab8;
    private javax.swing.JLabel lab9;
    private javax.swing.JLabel lb1;
    private javax.swing.JLabel lb10;
    private javax.swing.JLabel lb11;
    private javax.swing.JLabel lb12;
    private javax.swing.JLabel lb13;
    private javax.swing.JLabel lb14;
    private javax.swing.JLabel lb15;
    private javax.swing.JLabel lb16;
    private javax.swing.JLabel lb17;
    private javax.swing.JLabel lb18;
    private javax.swing.JLabel lb19;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lb20;
    private javax.swing.JLabel lb21;
    private javax.swing.JLabel lb22;
    private javax.swing.JLabel lb23;
    private javax.swing.JLabel lb24;
    private javax.swing.JLabel lb25;
    private javax.swing.JLabel lb26;
    private javax.swing.JLabel lb27;
    private javax.swing.JLabel lb28;
    private javax.swing.JLabel lb29;
    private javax.swing.JLabel lb3;
    private javax.swing.JLabel lb30;
    private javax.swing.JLabel lb31;
    private javax.swing.JLabel lb32;
    private javax.swing.JLabel lb33;
    private javax.swing.JLabel lb34;
    private javax.swing.JLabel lb35;
    private javax.swing.JLabel lb4;
    private javax.swing.JLabel lb5;
    private javax.swing.JLabel lb6;
    private javax.swing.JLabel lb7;
    private javax.swing.JLabel lb8;
    private javax.swing.JLabel lb9;
    private javax.swing.JLabel lbl3;
    private javax.swing.JPanel pan5;
    private javax.swing.JPanel pan6;
    private javax.swing.JPanel pan7;
    private javax.swing.JPanel pan8;
    private javax.swing.JPanel pan9;
    // End of variables declaration//GEN-END:variables
}
