package ClassThucthi;

import Class.Ban;
import Class.KhuyenMai;
import Class.NhanVien;
import Class.NhapHang;
import Class.Report;
import Class.ThucPham;
import coffee.*;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import thucthi.InsertBan;
import thucthi.InsertKhuyenMai;
import thucthi.InsertNhanvien;
import thucthi.InsertNhapHang;
import thucthi.InsertProducts;

public class Themdatabase {
    
    
    ConnectedDatabase cb=new ConnectedDatabase();
    Connection cnn=cb.getConnection();
    String sql;
    public static int k=0;
    public  void themEmployees(NhanVien nv){
      sql="insert into employees(employeenumbers,name,address,email,username,password,phonenumber,shift,salary,note)"
            + "values (?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ptm=cnn.prepareStatement(sql);
            ptm.setString(1,nv.getEmployeeNumbers());
            ptm.setString(2, nv.getName());
            ptm.setString(3,nv.getAddress());
            ptm.setString(4,nv.getEmail());
            ptm.setString(5,nv.getUsername());
            ptm.setString(6,nv.getPassword());
            ptm.setString(7,nv.getPhonenumber());
            ptm.setString(8,nv.getShift());
            ptm.setInt(9, nv.getSalary());
            ptm.setString(10,nv.getNote());
           k= ptm.executeUpdate();
            cnn.close();
           ptm.close();
        } catch (Exception ex) {
            InsertNhanvien nh=new InsertNhanvien();
            JOptionPane.showMessageDialog(nh, "lỗi "+ex);
        }
    }
    
    
    public int themDesk(Ban b){
        sql="insert into desk(deskname,status,comments) values(?,?,?)";
        try{
            PreparedStatement ptm=cnn.prepareStatement(sql);
            ptm.setString(1,b.getDeskname());
            ptm.setString(2,b.getStatus());
            ptm.setString(3,b.getComments());
            return ptm.executeUpdate();
            
        }catch(Exception ex){
            InsertBan ib=new InsertBan();
            JOptionPane.showMessageDialog(ib," Lỗi "+ ex);
        }
        return 0;
                
    }
    
    public int  themProduct(ThucPham tp){
        sql="insert into products(productcode,productname,productline,priceeach)values (?,?,?,?)";
        try {
            PreparedStatement ptm=cnn.prepareStatement(sql);
            ptm.setString(1,tp.getProductCode());
            ptm.setString(2,tp.getProductName());
            ptm.setString(3,tp.getProductLine());
            ptm.setInt(4,tp.getPriceeach());
            return ptm.executeUpdate();
//            cnn.close();
//            ptm.close();
        } catch (SQLException ex) {
            InsertProducts ip;
             JOptionPane.showMessageDialog( ip=new InsertProducts(),"lỗi "+ ex);
        }
        return 0;
    }
   
    public  int themDiscount(KhuyenMai km){
        sql="insert into discount(datestart,dateend,percent,contains)values(?,?,?,?)";
        try {
            PreparedStatement ptm=cnn.prepareStatement(sql);
            ptm.setDate(1,km.getDatestart() );
            ptm.setDate(2, km.getDateend());
            ptm.setInt(3, km.getPercent());
            ptm.setString(4,km.getContains());
            return ptm.executeUpdate();
        } catch (SQLException ex) {
            InsertKhuyenMai im=new InsertKhuyenMai();
            JOptionPane.showMessageDialog(im, "Lỗi "+ex);
        }
        return 0;
        
    }
    public void themNhapHang(NhapHang nh){
        sql="insert into import_materials(idbillimport,materialsname,dateimport,price,amount,unit)values(?,?,?,?,?,?)";
        try {
            PreparedStatement ptm=cnn.prepareStatement(sql);
            ptm.setString(1,nh.getIdbillimport());
            ptm.setString(2,nh.getMaterialsname());
            ptm.setDate(3, nh.getImportDate());
            ptm.setInt(4,nh.getPrice());
            ptm.setInt(5, nh.getAmount());
            ptm.setString(6,nh.getUnit());
             k= ptm.executeUpdate();
        } catch (SQLException ex) {
            InsertNhapHang im=new InsertNhapHang();
           JOptionPane.showMessageDialog(im,"Lỗi "+ex);
        }
        
       
    }
    public void themReport(String sh){
        sql="insert into report(date,contains)values(?,?)";
        try {
            long mili=System.currentTimeMillis();
            Date date=new Date(mili);
            PreparedStatement ptm=cnn.prepareStatement(sql);
            ptm.setDate(1,date);
            ptm.setString(2,sh);
            
             k= ptm.executeUpdate();
        } catch (SQLException ex) {
            InsertNhapHang im=new InsertNhapHang();
           JOptionPane.showMessageDialog(im,"Lỗi "+ex);
        }
    }
    
    }
    
    

