/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ictartistdatabase;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Renren
 */
public class LogInConnect 
{
    public static Connection connectdb() throws ClassNotFoundException
    {
        Connection con=null;
        try 
        {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection("jdbc:sqlite:project_lh_db.db");
            Logger.getLogger("Connected!");
            //con=DriverManager.getConnection("jdbc:derby://localhost:1527/ArtistDB","ARTISTDATABASE","LOGINDATABASE");
            //con=DriverManager.getConnection("jdbc:derby://localhost:1527/ArtistDB","ARTISTDATABASE","LOGINDATABASE");
            return con;
        } catch (SQLException ex) 
        {
            Logger.getLogger(LogInConnect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}