/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolmanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SMRUTI RANJAN SWAIN
 */
public class connect {
    public static Connection connectdb()
    {
        Connection con=null;
        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/school","aa","aa");
            return con;
        } catch (SQLException ex){
            Logger.getLogger(connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
