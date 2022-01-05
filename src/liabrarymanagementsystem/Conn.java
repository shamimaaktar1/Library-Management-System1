
package liabrarymanagementsystem;

import java.sql.*;  

public class Conn{
    Connection c1;
    Statement s;
    public Conn(){  
        try{  
            Class.forName("com.mysql.jdbc.Driver");  
            
            c1 =DriverManager.getConnection("jdbc:sqlserver://localhost:1433;database=LibraryManagementSystem","sa","1234");    
            s =c1.createStatement();  
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    }  
}  

