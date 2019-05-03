/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thucthi;

import Class.NhanVien;
import ClassThucthi.ConnectedDatabase;
import ClassThucthi.Suadatabase;
import ClassThucthi.Themdatabase;
import coffee.ListNhanVien;
import static coffee.ListNhanVien.jTable1;
import coffee.MenuManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
public class InsertNhanvien_1 extends javax.swing.JPanel {
    public InsertNhanvien_1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        EmployeeNumbres = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Address = new javax.swing.JLabel();
        Email = new javax.swing.JLabel();
        Shift = new javax.swing.JLabel();
        Note = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        dName = new javax.swing.JTextField();
        Diachi = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        calv = new javax.swing.JTextField();
        Them = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        ghichu = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txttdn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtmk = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtluong = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        sdt = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        EmployeeNumbres.setText("Mã nhân viên");
        add(EmployeeNumbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 42, 131, 24));

        Name.setText("Tên");
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 24));

        Address.setText("Địa chỉ");
        add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 27));

        Email.setText("Email");
        add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 70, 30));

        Shift.setText("Ca làm việc");
        add(Shift, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 90, 29));

        Note.setText("Ghi chú");
        add(Note, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 80, 28));

        id.setEditable(false);
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 280, -1));

        dName.setEditable(false);
        dName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNameActionPerformed(evt);
            }
        });
        add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 280, -1));

        Diachi.setEditable(false);
        add(Diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 280, -1));

        mail.setEditable(false);
        add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 280, -1));
        add(calv, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 100, 320, -1));

        Them.setText("OK");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });
        add(Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 220, -1, -1));

        thoat.setText("CLOSE");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        add(thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 220, -1, -1));
        add(ghichu, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 140, 320, -1));

        jLabel1.setText("Tên đăng nhập");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 100, 31));

        txttdn.setEditable(false);
        add(txttdn, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 40, 320, -1));

        jLabel2.setText("Mật khẩu");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 131, 32));

        txtmk.setEditable(false);
        add(txtmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 70, 320, -1));

        jLabel3.setText("Lương ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 100, 28));
        add(txtluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(542, 180, 320, -1));

        jLabel4.setText("Số điện thoại");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 80, 30));

        sdt.setEditable(false);
        add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 280, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
 try{
        String ide=id.getText();
        String luong= txtluong.getText();
        String note=ghichu.getText();
        String clv=calv.getText();
        
       Suadatabase.suaEmployeesstatic(luong,clv, note, ide);
        if(Suadatabase.rs!=0){
            JOptionPane.showMessageDialog(this,"Sữa hoàn tất nhân viên "+dName.getText());
            Suadatabase.rs=0;
        }   
        
       }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Lỗi"+ ex);
                }
        
       DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
       model.setRowCount(0);
       String sql=null;
    Connection cnn=ConnectedDatabase.getConnection();
          sql="select * from employees";
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
            while(rs.next()){
                String id=rs.getString("employeenumbers");
                String name=rs.getString("name");
                String address=rs.getString("address");
                String email=rs.getString("email");
                String username=rs.getString("username");
                String password=rs.getString("password");
                String phonenumber=rs.getString("phonenumber");
                int salary=rs.getInt("salary");
                String shift=rs.getString("shift");
                String note=rs.getString("note");
                Object []data={id,name,address,email,phonenumber,salary,shift,note};
                model.addRow(data);
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(this,"lỗi"+ ex);
        }
       
    }//GEN-LAST:event_ThemActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
           ListNhanVien.Panelsv.removeAll();
            ListNhanVien.Panelsv.add(new JPanel());
            ListNhanVien.Panelsv.validate();
    }//GEN-LAST:event_thoatActionPerformed

    private void dNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    public javax.swing.JTextField Diachi;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel EmployeeNumbres;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel Note;
    private javax.swing.JLabel Shift;
    public javax.swing.JButton Them;
    public javax.swing.JTextField calv;
    public javax.swing.JTextField dName;
    public javax.swing.JTextField ghichu;
    public javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField mail;
    public javax.swing.JTextField sdt;
    private javax.swing.JButton thoat;
    public javax.swing.JTextField txtluong;
    public javax.swing.JTextField txtmk;
    public javax.swing.JTextField txttdn;
    // End of variables declaration//GEN-END:variables
}
