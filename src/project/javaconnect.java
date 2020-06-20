/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author F
 */
public class javaconnect {
    
     public static Connection connectdb()  {
        
        Connection con = null;
     
           
       
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root", "");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(javaconnect.class.getName()).log(Level.SEVERE, null, ex);
            
        }
            return null;
       
       
    
}
}
