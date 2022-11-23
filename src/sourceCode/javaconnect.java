package sourceCode;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAZZ
 */
import java.sql.*;
import javax.swing.*;
public class javaconnect {
    Connection conn=null;
    public static Connection connectdb(){
    try{
     Class.forName("com.mysql.jdbc.Driver");
     Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pms","root","");
     return conn;
    }catch(Exception e){
    JOptionPane.showMessageDialog(null, e);
    return null;}
        
        
        }
    
}
