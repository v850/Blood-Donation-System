

package bloodbank;
import java.sql.*;
//import javax.Swing.*;



public class DataBaseConnection {
    
   private static Connection con=null;
  //  public static Connection databaseConnection()
    //  
    public static  Connection databaseConnection()
    {
    try{
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        
        
            String path="E:\\Bloodbank.accdb";
            String url="jdbc:ucanaccess://"+path;
           con=DriverManager.getConnection(url);
            
        Statement st=con.createStatement();
        String sql="select * from Admin";
        ResultSet rs=st.executeQuery(sql);
        while(rs.next()){
            System.out.println("\n"+rs.getString(1)+"\t"+rs.getString(2));
        
        }
    con.close();
    }
    catch(ClassNotFoundException | SQLException e)
    {
        System.out.println(e);
        
    }
       return null;     
    }
}

