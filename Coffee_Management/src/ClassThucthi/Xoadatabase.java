package ClassThucthi;

import coffee.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Xoadatabase {
    
     public  static void xoaEmployeesstatic(String id){
            String sql="delete from employees where employeenumbers = ?";
             ListBan lnv=new ListBan();
            Connection cnn=ConnectedDatabase.getConnection();
         try {
             PreparedStatement ptm=cnn.prepareStatement(sql);
             ptm.setString(1, id);
             int k=ptm.executeUpdate();
             if(k!=0)JOptionPane.showMessageDialog(lnv,"xóa hoàn tất ");
             ptm.close();
         } catch (SQLException ex) {
             
            JOptionPane.showMessageDialog(lnv, "Lỗi: "+ex);
         }
            
            
    }
    public static void xoaDesk(int  id){
        String sql="delete from desk where desknumber = ?";
             ListSanPham lnv=new ListSanPham();
            Connection cnn=ConnectedDatabase.getConnection();
         try {
             PreparedStatement ptm=cnn.prepareStatement(sql);
             ptm.setInt(1, id);
             int k=ptm.executeUpdate();
             if(k!=0)JOptionPane.showMessageDialog(lnv,"xóa hoàn tất "+id);
             ptm.close();
         } catch (SQLException ex) {
             
            JOptionPane.showMessageDialog(lnv, "Lỗi: "+ex);
         }
        
    }
    public static void xoaProduct(String id){
        String sql="delete from products where productcode = ?";
             ListBan lnv=new ListBan();
            Connection cnn=ConnectedDatabase.getConnection();
         try {
             PreparedStatement ptm=cnn.prepareStatement(sql);
             ptm.setString(1, id);
             int k=ptm.executeUpdate();
             if(k!=0)JOptionPane.showMessageDialog(lnv,"xóa hoàn tất "+id);
             ptm.close();
         } catch (SQLException ex) {
             
            JOptionPane.showMessageDialog(lnv, "Lỗi: "+ex);
         }
        
    }
    public static void xoaHoadonnhap(String id){
        String sql="delete from import_materials where idbillimport = ?";
             ListBan lnv=new ListBan();
            Connection cnn=ConnectedDatabase.getConnection();
         try {
             PreparedStatement ptm=cnn.prepareStatement(sql);
             ptm.setString(1, id);
             int k=ptm.executeUpdate();
             if(k!=0)JOptionPane.showMessageDialog(lnv,"xóa hoàn tất mã hóa đơn"+id);
             ptm.close();
         } catch (SQLException ex) {
             
            JOptionPane.showMessageDialog(lnv, "Lỗi: "+ex);
         }
    }
    public static void xoaDiscount(int id){
        String sql="delete from discount where no = ?";
             ListBan lnv=new ListBan();
            Connection cnn=ConnectedDatabase.getConnection();
         try {
             PreparedStatement ptm=cnn.prepareStatement(sql);
             ptm.setInt(1, id);
             int k=ptm.executeUpdate();
             if(k!=0)JOptionPane.showMessageDialog(lnv,"xóa hoàn tất "+id);
             ptm.close();
         } catch (SQLException ex) {
             
            JOptionPane.showMessageDialog(lnv, "Lỗi: "+ex);
         }
        
    }
    public static void xoaReport(int id){
        String sql="delete from report where no = ?";
             ListBan lnv=new ListBan();
            Connection cnn=ConnectedDatabase.getConnection();
         try {
             PreparedStatement ptm=cnn.prepareStatement(sql);
             ptm.setInt(1, id);
             int k=ptm.executeUpdate();
             if(k!=0)JOptionPane.showMessageDialog(lnv,"xóa hoàn tất "+id);
             ptm.close();
         } catch (SQLException ex) {
             
            JOptionPane.showMessageDialog(lnv, "Lỗi: "+ex);
         }
        
    }
    public static void xoaOrders(String id){
        String sql="delete from orders where ordercode = ?";
             ListBan lnv=new ListBan();
            Connection cnn=ConnectedDatabase.getConnection();
         try {
             PreparedStatement ptm=cnn.prepareStatement(sql);
             ptm.setString(1, id);
             int k=ptm.executeUpdate();
             if(k!=0)JOptionPane.showMessageDialog(lnv,"xóa hoàn tất "+id);
             ptm.close();
         } catch (SQLException ex) {
             
            JOptionPane.showMessageDialog(lnv, "Lỗi: "+ex);
            System.out.println(ex);
         }
        
    }
    
    public static void xoaOrderdetails(String id){
        String sql="delete from orderdetail where ordercode = ?";
             ListBan lnv=new ListBan();
            Connection cnn=ConnectedDatabase.getConnection();
         try {
             PreparedStatement ptm=cnn.prepareStatement(sql);
             ptm.setString(1, id);
             int k=ptm.executeUpdate();
             if(k!=0)JOptionPane.showMessageDialog(lnv,"xóa hoàn tất "+id);
             ptm.close();
         } catch (SQLException ex) {
             System.out.println(ex);
            JOptionPane.showMessageDialog(lnv, "Lỗi: "+ex);
         }
        
    }
}
