/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassThucthi;

import coffee.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author boss
 */
public class Suadatabase {
    
    public static int rs=0;
    
     public static void suaEmployeesstatic(String salary,String shift,String note,String id){
    Connection cnn=ConnectedDatabase.getConnection();
         try {
             Statement stm=cnn.createStatement();
    String sql="update employees "
            + "set salary = '"+salary+"', shift = '"+shift+"',note = '"+note+"' "
            + "where employeenumbers = '"+id+"'";
              rs=stm.executeUpdate(sql);
         } catch (SQLException ex) {
             ListBan lb=new ListBan();
             JOptionPane.showMessageDialog(lb, "Lôi:"+ex);
         }
    
    }
    public static void suaReport(int id,String thongbao){
        Connection cnn=ConnectedDatabase.getConnection();
        try {
             Statement stm=cnn.createStatement();
             String sql="update report "
            + "set contains= '"+thongbao+"'"
            + " where no = "+id;
             rs=stm.executeUpdate(sql);
        } catch (SQLException ex) {
            
            ListBan lb=new ListBan();
           JOptionPane.showMessageDialog(lb, "Lôi:"+ex);
        }
    }
    public static void suaProduct(String id,String name,String gia){
        Connection cnn=ConnectedDatabase.getConnection();
        try {
             Statement stm=cnn.createStatement();
             String sql="update products "
            + "set productname= '"+name+"', priceeach = '"+gia+"' "
            + "where productcode = '"+id+"'";
             rs=stm.executeUpdate(sql);
        } catch (SQLException ex) {
            
            ListBan lb=new ListBan();
           JOptionPane.showMessageDialog(lb, "Lôi:"+ex);
        }
        
    }
    public static void suaReciept(){
        
    }
    public static void suaDiscount(int no,String ngaybd,String ngaykt,String ht){
        Connection cnn=ConnectedDatabase.getConnection();
        try {
             Statement stm=cnn.createStatement();
             String sql="update discount "
            + "set datestart= '"+ngaybd+"', dateend = '"+ngaykt+"',percent = '"+ht+"' "
            + "where no = "+no;
             rs=stm.executeUpdate(sql);
        } catch (SQLException ex) {
            
            ListBan lb=new ListBan();
           JOptionPane.showMessageDialog(lb, "Lôi:"+ex);
        }
        
    }
}
