/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thucthi;

import Class.NhanVien;
import Class.PU;
import ClassThucthi.ConnectedDatabase;
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
public class InsertNhanvien extends javax.swing.JPanel {
    public InsertNhanvien() {
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
        add(EmployeeNumbres, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 131, 24));

        Name.setText("Tên");
        add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 131, 24));

        Address.setText("Địa chỉ");
        add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 131, 27));

        Email.setText("Email");
        add(Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 131, 30));

        Shift.setText("Ca làm việc");
        add(Shift, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, 79, 29));

        Note.setText("Ghi chú");
        add(Note, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 79, 28));

        id.setText("E");
        add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 242, -1));

        dName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNameActionPerformed(evt);
            }
        });
        add(dName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 242, -1));
        add(Diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 242, -1));
        add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 242, -1));
        add(calv, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 242, -1));

        Them.setText("OK");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });
        add(Them, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, -1, -1));

        thoat.setText("CLOSE");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });
        add(thoat, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 190, -1, -1));
        add(ghichu, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 242, -1));

        jLabel1.setText("Tên đăng nhập");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 85, 31));
        add(txttdn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 242, -1));

        jLabel2.setText("Mật khẩu");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 79, 32));
        add(txtmk, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 242, -1));

        jLabel3.setText("Lương");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 79, 28));
        add(txtluong, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 242, -1));

        jLabel4.setText("Số điện thoại");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 131, 21));
        add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 242, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
       String id1=id.getText();
       System.out.println(id1.substring(0,1));
       PU pg=new PU();
       int l=0;
       for(int i=0;i<MenuManager.ListNV.size();i++){
           if(pg.ktt(txttdn.getText(),txtmk.getText(),MenuManager.ListNV.get(i)))l++;
       }
        if(id.getText().equals("")||dName.getText().equals("")||Diachi.getText().equals("")||calv.getText().equals("")
           ||mail.getText().equals("")||sdt.getText().equals("")
           ||txtmk.getText().equals("")||txttdn.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập đủ thông tin nhân viên");
        }
        else if(id1.substring(0,1).compareTo("E")!=0){
            JOptionPane.showMessageDialog(this,"Mã nhân viên phải bắt đầu bằng E");
        }
        else if(id1.length()!=4){
            JOptionPane.showMessageDialog(this,"Độ dài mã nhân viên không hợp lệ");
        }
        else if(l==1){
            JOptionPane.showMessageDialog(this,"Mật khẩu và tên đăng nhập của nhân viên mới đã bị trùng bạn hãy sữa lại");
            l=0;
        }
       else{
        try{
        NhanVien nv=new NhanVien();
        nv.setEmployeeNumbers(id.getText());
        nv.setName(dName.getText());
        nv.setAddress(Diachi.getText());
        nv.setEmail(mail.getText());
        nv.setUsername(txttdn.getText());
        nv.setPassword(txtmk.getText());
        if(!txtluong.getText().equals("")){
        nv.setSalary(Integer.parseInt(txtluong.getText()));
        }
        else if (txtluong.getText().equals("")){
            nv.setSalary(0);
        }
        nv.setShift(calv.getText());
        nv.setNote(ghichu.getText());
        nv.setPhonenumber(sdt.getText());
        Themdatabase td=new Themdatabase();
        
        td.themEmployees(nv); 
        
        if(td.k!=0){
        JOptionPane.showMessageDialog(this,"Thêm thành công nhân viên: "+dName.getText());
        id.setText("E");
        dName.setText("");
        Diachi.setText("");
        mail.setText("");
        txtmk.setText("");
        txttdn.setText("");
        txtluong.setText("");
        calv.setText("");
        ghichu.setText("");
        sdt.setText("");
        td.k=0;
        }
       }catch(Exception ex){
                JOptionPane.showMessageDialog(this,"Lỗidjkbndgd'gd'g'e");
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
