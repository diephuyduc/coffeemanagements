

package coffee;

import Class.NhanVien;
import ClassThucthi.ConnectedDatabase;
import ClassThucthi.Themdatabase;
import ClassThucthi.Xoadatabase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import thucthi.InsertKhuyenMai;
import thucthi.InsertKhuyenMai1;
import thucthi.InsertNhanvien;
import thucthi.InsertNhanvien_1;

public class ListNhanVien extends javax.swing.JFrame {

        private JPanel panel;
    public ListNhanVien() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CLOSE = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        INSERT = new javax.swing.JButton();
        Panelsv = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Danh Sách Nhân Viên");
        setPreferredSize(new java.awt.Dimension(1280, 850));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("                                 DANH SÁCH NHÂN VIÊN");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhân viên", "Tên", "Địa chỉ", "Email", "Số điện thoại", "Lương", "Ca làm việc", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        CLOSE.setText("Thoát");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });

        DELETE.setText("Xóa");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        INSERT.setText("Thêm");
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });

        Panelsv.setPreferredSize(new java.awt.Dimension(636, 500));
        Panelsv.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelsv, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(980, 980, 980)
                        .addComponent(INSERT)
                        .addGap(21, 21, 21)
                        .addComponent(DELETE)
                        .addGap(9, 9, 9)
                        .addComponent(CLOSE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(INSERT)
                    .addComponent(DELETE)
                    .addComponent(CLOSE))
                .addGap(8, 8, 8)
                .addComponent(Panelsv, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
      dispose();
        JFrame new1= new MenuManager ();
        new1.setVisible(true);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
            showIn(new InsertNhanvien());
    }//GEN-LAST:event_INSERTActionPerformed
     private void showIn(JPanel panel1){
        panel=panel1;
        Panelsv.removeAll();
        Panelsv.add(panel);
        Panelsv.validate();
    }
    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
       DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
         if(jTable1.getSelectedRowCount()==1){
             String id= model.getValueAt(jTable1.getSelectedRow(),0).toString();
             Xoadatabase.xoaEmployeesstatic(id);
              String sql=null;
             model.setRowCount(0);
             Panelsv.removeAll();
             Panelsv.add(new JPanel());
             Panelsv.validate();
             Connection cnn=ConnectedDatabase.getConnection();
          sql="select * from employees";
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
            while(rs.next()){
                String ib=rs.getString("employeenumbers");
                String name=rs.getString("name");
                String address=rs.getString("address");
                String email=rs.getString("email");
                String username=rs.getString("username");
                String password=rs.getString("password");
                String phonenumber=rs.getString("phonenumber");
                int salary=rs.getInt("salary");
                String shift=rs.getString("shift");
                String note=rs.getString("note");
                Object []data={ib,name,address,email,phonenumber,salary,shift,note};
                
                model.addRow(data);
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        }
         }
         else{
                  JOptionPane.showMessageDialog(this,"bạn chưa chon hàng để xóa");
         }
    }//GEN-LAST:event_DELETEActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       InsertNhanvien_1 nv=new InsertNhanvien_1();
       showIn(nv);
        DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        
        int k=jTable1.getSelectedRow();
       nv.id.setText(model.getValueAt(k,0).toString());
     
        nv.dName.setText(model.getValueAt(k,1).toString());
        
        nv.Diachi.setText(model.getValueAt(k,2).toString());
     
        nv.mail.setText(model.getValueAt(k,3).toString());
        
        nv.sdt.setText(model.getValueAt(k,4).toString());
        nv.txtluong.setText(model.getValueAt(k,5).toString());
        nv.calv.setText(model.getValueAt(k,6).toString());
        nv.ghichu.setText(model.getValueAt(k,7).toString());
       
    }//GEN-LAST:event_jTable1MouseClicked
   
    
    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton INSERT;
    public static javax.swing.JPanel Panelsv;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
