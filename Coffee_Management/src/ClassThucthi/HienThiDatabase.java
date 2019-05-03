/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassThucthi;

import Class.NhanVien;
import coffee.ListNhanVien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HienThiDatabase {
    public static String name=null;
   public  String hiennv(String id){
        try {
            String sql="select name"
                    + " from employees"
                    + " where employeenumbers= '"+id+"'";
            Connection cnn= ConnectedDatabase.getConnection();
            Statement stm=cnn.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            while(rs.next()){
                name =rs.getString("name");
            }
           return name;
        } catch (SQLException ex) {
            Logger.getLogger(HienThiDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
       return null; 
   }
   
   
   
    
}
