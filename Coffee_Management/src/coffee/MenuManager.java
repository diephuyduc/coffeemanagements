package coffee;
import Class.PU;
import ClassThucthi.ConnectedDatabase;
import static coffee.ListNhanVien.jTable1;
import employeePackage.LogIn;

import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import thucthi.InsertCaNhan;

public class MenuManager extends javax.swing.JFrame {
    static String name;
    private JPanel childPanel1;
    public static ArrayList<String>Listid=new ArrayList();
    public static ArrayList<Integer>Listtien=new ArrayList();
    public static ArrayList<PU>ListNV=new ArrayList();
    
    public MenuManager() {
        initComponents();
        Clock();
        ten();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Hienthiten = new javax.swing.JLabel();
        DongHo = new javax.swing.JLabel();
        Banthan = new javax.swing.JButton();
        nhânvien = new javax.swing.JButton();
        nhaphang = new javax.swing.JButton();
        banhang = new javax.swing.JButton();
        thucpham = new javax.swing.JButton();
        ban = new javax.swing.JButton();
        close = new javax.swing.JButton();
        km = new javax.swing.JButton();
        tb = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Trang chủ");

        DongHo.setAlignmentX(10.0F);
        DongHo.setAlignmentY(20.0F);

        Banthan.setText("Thông tin cá nhân");
        Banthan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BanthanActionPerformed(evt);
            }
        });

        nhânvien.setText("Nhân viên");
        nhânvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhânvienActionPerformed(evt);
            }
        });

        nhaphang.setText("Nhập hàng");
        nhaphang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhaphangActionPerformed(evt);
            }
        });

        banhang.setText("Bán hàng");
        banhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banhangActionPerformed(evt);
            }
        });

        thucpham.setText("Thực phẩm");
        thucpham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thucphamActionPerformed(evt);
            }
        });

        ban.setText("Bàn");
        ban.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                banActionPerformed(evt);
            }
        });

        close.setText("Thoát");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        km.setText("Khuyến mãi");
        km.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmActionPerformed(evt);
            }
        });

        tb.setText("Thông báo");
        tb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Banthan, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Hienthiten, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                            .addComponent(DongHo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(nhaphang, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                                .addComponent(nhânvien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(tb, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(km, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ban, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(thucpham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(banhang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 567, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Hienthiten, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(DongHo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Banthan)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 440, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(nhânvien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(nhaphang)
                        .addGap(60, 60, 60)
                        .addComponent(banhang)
                        .addGap(61, 61, 61)
                        .addComponent(thucpham)
                        .addGap(55, 55, 55)
                        .addComponent(ban)
                        .addGap(51, 51, 51)
                        .addComponent(km)
                        .addGap(47, 47, 47)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(tb)
                        .addGap(29, 29, 29))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
       exit(0);
       ListNV.clear();
       new LogIn().setVisible(true);
    }//GEN-LAST:event_closeActionPerformed

    private void nhânvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhânvienActionPerformed
        JFrame nv= new ListNhanVien();
        dispose();
        nv.setVisible(true);
        String sql=null;
        Connection cnn=ConnectedDatabase.getConnection();
          sql="select * from employees";
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
           int l=0;
            while(rs.next()){
                PU pu=new PU();
                String id=rs.getString("employeenumbers");
                String name=rs.getString("name");
                String address=rs.getString("address");
                String email=rs.getString("email");
                String username=rs.getString("username");
                pu.username=username;
                
                String password=rs.getString("password");
                pu.password=password;
                ListNV.add(pu);
                String phonenumber=rs.getString("phonenumber");
                int salary=rs.getInt("salary");
                String shift=rs.getString("shift");
                String note=rs.getString("note");
                Object []data={id,name,address,email,phonenumber,salary,shift,note};
                DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
                model.addRow(data);
                l++;
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        }
        
    }//GEN-LAST:event_nhânvienActionPerformed

    private void banhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banhangActionPerformed
       JFrame bh=new ListBanHang();
       dispose();
       bh.setVisible(true);
       
       
       String sql=null;
        Connection cnn=ConnectedDatabase.getConnection();
          sql="SELECT a.ordercode,a.tablenumber,a.employeenumber,a.startingtime,sum(b.number*b.price) as total"
              + " FROM orders a INNER JOIN orderdetail b ON a.ordercode=b.ordercode"
              + " group by a.ordercode";
          
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
             DefaultTableModel model= (DefaultTableModel) coffee.ListBanHang.jTable1.getModel();
            
            while(rs.next()){
                String code=rs.getString("ordercode");
                int ban=rs.getInt("tablenumber");
                String manv=rs.getString("employeenumber");
                Timestamp date=rs.getTimestamp("startingtime");
                int tien=rs.getInt("total");
                Object []data={code,ban,manv,tien,date};
                model.addRow(data);
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        }
       
    }//GEN-LAST:event_banhangActionPerformed

    private void kmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmActionPerformed
        JFrame km=new ListKhuyenMai();
       dispose();
       km.setVisible(true);
       String sql=null;
        Connection cnn=ConnectedDatabase.getConnection();
          sql="select * from discount";
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
            while(rs.next()){
                int no=rs.getInt("no");
                Date datestart=rs.getDate("datestart");
                Date dateend=rs.getDate("dateend");
                int percent=rs.getInt("percent");
                String contains=rs.getString("contains");
                Object []data={no,datestart,dateend,percent,contains};
                DefaultTableModel model= (DefaultTableModel) coffee.ListKhuyenMai.jTable1.getModel();
                model.addRow(data);
                
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        }
    }//GEN-LAST:event_kmActionPerformed

    private void thucphamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thucphamActionPerformed
       JFrame tp=new ListSanPham();
       dispose();
       tp.setVisible(true);
       String sql=null;
        Connection cnn=ConnectedDatabase.getConnection();
          sql="select * from products";
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
            while(rs.next()){
                String productcode=rs.getString("productcode");
                String productname=rs.getString("productname");
                String productline=rs.getString("productline");
                int priceeach=rs.getInt("priceeach");
                Object []data={productcode,productname,productline,priceeach};
                DefaultTableModel model= (DefaultTableModel) coffee.ListSanPham.jTable1.getModel();
                model.addRow(data);
                
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        }
    }//GEN-LAST:event_thucphamActionPerformed

    private void nhaphangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhaphangActionPerformed
        JFrame nh=new ListMuaHang();
       dispose();
       nh.setVisible(true);
       String sql=null;
        Connection cnn=ConnectedDatabase.getConnection();
          sql="select idbillimport,dateimport,sum(price*amount)as total,unit"
             + " from import_materials"
             + " group by idbillimport";
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
            while(rs.next()){
                String id=rs.getString("idbillimport");
                Listid.add(id);
                Date date=rs.getDate("dateimport");
                int tien=rs.getInt("total");
                Listtien.add(tien);
                String nguon=rs.getString("unit");
                Object []data={id,date,nguon,tien};
                DefaultTableModel model= (DefaultTableModel) coffee.ListMuaHang.jTable1.getModel();
                model.addRow(data);
                
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        }
        int t=0;
        for(int i=0;i<Listtien.size();i++){
            t+=Listtien.get(i);
        }
        coffee.ListMuaHang.tt.setText(String.valueOf(t));
    }//GEN-LAST:event_nhaphangActionPerformed

    private void banActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_banActionPerformed
        JFrame b=new ListBan();
       dispose();
       b.setVisible(true);
      String sql=null;
        Connection cnn=ConnectedDatabase.getConnection();
          sql="select * from desk";
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
            while(rs.next()){
                String desknumber=rs.getString("desknumber");
                String deskname=rs.getString("deskname");
                String status=rs.getString("status");
                String  comments=rs.getString("comments");
                Object []data={desknumber,deskname,status,comments};
                DefaultTableModel model= (DefaultTableModel) coffee.ListBan.jTable1.getModel();
                model.addRow(data);
                
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        } 
    }//GEN-LAST:event_banActionPerformed

    private void BanthanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BanthanActionPerformed
        InsertCaNhan icn=new InsertCaNhan();
        Show(icn);
        
        String sql="select * from employees where employeenumbers like 'M%'";
            Connection cnn=ConnectedDatabase.getConnection();
        try {
            Statement stm=cnn.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            while(rs.next()){
            icn.id.setText(rs.getString("employeenumbers"));
            icn.id.enable(false);
            icn.dName.setText(rs.getString("name"));
           
            icn.Diachi.setText(rs.getString("address"));
           
            icn.mail.setText(rs.getString("email"));
          
            icn.sdt.setText(rs.getString("phonenumber"));
            
            icn.name.setText(rs.getString("username"));
            
            icn.matkhau.setText(rs.getString("password"));
           
            }
                 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Lỗi "+ex);
           
        }
       
    }//GEN-LAST:event_BanthanActionPerformed

    private void tbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbActionPerformed
        dispose();
        new ListReport().setVisible(true);
        try {
            Connection cnn=ConnectedDatabase.getConnection();
            String sql="select * from report";
            Statement stm= cnn.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            while(rs.next()){
                int no=rs.getInt("no");
                Date date=rs.getDate("date");
                String contains=rs.getString("contains");
                Object []data={no,date,contains};
                DefaultTableModel model= (DefaultTableModel) coffee.ListReport.jTable1.getModel();
                model.addRow(data);
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this,"Lỗi "+ex);
        }
    }//GEN-LAST:event_tbActionPerformed

    private void Show(JPanel panel){
        childPanel1=panel;
        jPanel1.removeAll();
        jPanel1.add(childPanel1);
        jPanel1.validate();
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuManager().setVisible(true);
            }
        });
    }
    public void ten(){
        Hienthiten.setText("Xin chào Lê Ngọc Hà");
    }
    //đồng hồ
    public void Clock(){
    
    Thread clock = new Thread(){
              public void run(){
            try{
        while (true) {            
            java.util.Date date = new java.util.Date();
            DateFormat df = new SimpleDateFormat("hh:mm:ss  EEEE dd/MM/yyyy");
	    String time = df.format(date);
             DongHo.setText(time);
            
        }
    
    }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    };clock.start();
    
}    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Banthan;
    private javax.swing.JLabel DongHo;
    private javax.swing.JLabel Hienthiten;
    private javax.swing.JButton ban;
    private javax.swing.JButton banhang;
    private javax.swing.JButton close;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JButton km;
    private javax.swing.JButton nhaphang;
    private javax.swing.JButton nhânvien;
    private javax.swing.JButton tb;
    private javax.swing.JButton thucpham;
    // End of variables declaration//GEN-END:variables
}
