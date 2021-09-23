
package hotel.management.system;

import java.sql.*;


public class conn {
 static final String DB_URL = "jdbc:mysql://localhost/projecthm";
 static final String USERNAME = "root";
 static final String PASSWORD = "5429";

    Connection c;
    Statement s;
    
    public  conn(){
         Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection(DB_URL, USERNAME, PASSWORD);
            s = c.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
       
    }
}
