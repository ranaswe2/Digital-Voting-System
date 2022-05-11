
package combination;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class VoteQuery {
    
    public static ResultSet rs;
    public static Statement st;
    
    public static void theQuery(String query){
           
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
        }
           Connection con= null;
           Statement st= null;
           
        try {
            con= DriverManager.getConnection("jdbc:mysql://localhost/divs","root","");
            st=con.createStatement();
            st.executeUpdate(query);
            
            con.close();
            st.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Connection Failed!\nTry again later.");
    }
           
       }
    
    public static void basicQuery(String query) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
            Connection con= null;
            
            con= DriverManager.getConnection("jdbc:mysql://localhost/divs","root","");
            st= con.createStatement();
               
             rs= st.executeQuery(query);
    }
}
