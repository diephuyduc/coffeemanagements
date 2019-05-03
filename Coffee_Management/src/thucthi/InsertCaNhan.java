/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thucthi;

import ClassThucthi.ConnectedDatabase;
import coffee.ListNhanVien;
import coffee.MenuManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class InsertCaNhan extends javax.swing.JPanel {
    public InsertCaNhan() {
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
        PhoneNumbers = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        dName = new javax.swing.JTextField();
        Diachi = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        sdt = new javax.swing.JTextField();
        Them = new javax.swing.JButton();
        thoat = new javax.swing.JButton();
        txttendn = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        txtmk = new javax.swing.JLabel();
        matkhau = new javax.swing.JTextField();

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

        EmployeeNumbres.setText("Mã số");

        Name.setText("Tên");

        Address.setText("Địa chỉ");

        Email.setText("Email");

        PhoneNumbers.setText("Số điện thoại");

        Them.setText("OK");
        Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemActionPerformed(evt);
            }
        });

        thoat.setText("CLOSE");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        txttendn.setText("Tên đăng nhập");

        txtmk.setText("Mật khẩu");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(EmployeeNumbres, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Email, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(PhoneNumbers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(dName)
                            .addComponent(Diachi)
                            .addComponent(mail)
                            .addComponent(sdt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Them)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 234, Short.MAX_VALUE)
                        .addComponent(thoat))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtmk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txttendn, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name)
                            .addComponent(matkhau))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmployeeNumbres, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Diachi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PhoneNumbers, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttendn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtmk, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(matkhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Them)
                    .addComponent(thoat))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemActionPerformed
        if(dName.getText().equals("")||Diachi.getText().equals("")
                ||mail.getText().equals("")||name.getText().equals("")||
                sdt.getText().equals("")||matkhau.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Bạn chưa nhập đủ thông tin nhân viên");
        }

        else {
           
            try {
                Connection cnn=ConnectedDatabase.getConnection();
                Statement stm=cnn.createStatement();
                String sql="update employees "
                        + "set name='"+dName.getText()+"',address=' "+Diachi.getText()+"',email='"+mail.getText()+"'"
                        +",username='"+name.getText()+"',password='"+matkhau.getText()+"',phonenumber='"+sdt.getText()+"' "
                        +"where employeenumbers ='"+id.getText()+"'";
                int k= stm.executeUpdate(sql);
                if(k!=0)JOptionPane.showMessageDialog(this,"Sữa hoàn tất");
            } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this,"Lỗi "+ex);
              
            }
            
        }
                
    }//GEN-LAST:event_ThemActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
           MenuManager.jPanel1.removeAll();
            MenuManager.jPanel1.add(new JPanel());
            MenuManager.jPanel1.validate();
    }//GEN-LAST:event_thoatActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    public static javax.swing.JTextField Diachi;
    private javax.swing.JLabel Email;
    private javax.swing.JLabel EmployeeNumbres;
    private javax.swing.JLabel Name;
    private javax.swing.JLabel PhoneNumbers;
    private javax.swing.JButton Them;
    public static javax.swing.JTextField dName;
    public static javax.swing.JTextField id;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField mail;
    public static javax.swing.JTextField matkhau;
    public static javax.swing.JTextField name;
    public static javax.swing.JTextField sdt;
    private javax.swing.JButton thoat;
    private javax.swing.JLabel txtmk;
    private javax.swing.JLabel txttendn;
    // End of variables declaration//GEN-END:variables
}
