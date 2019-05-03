package coffee;

import ClassThucthi.ConnectedDatabase;
import ClassThucthi.Xoadatabase;
import static coffee.ListNhanVien.jTable1;
import static coffee.MenuManager.Listid;
import static coffee.MenuManager.Listtien;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import thucthi.ChiTietHDMua;
import thucthi.InsertNhapHang;
public class ListMuaHang extends javax.swing.JFrame {
    public ListMuaHang() {
        initComponents();
    }
    public static ArrayList<Integer> list=new ArrayList();
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CLOSE = new javax.swing.JButton();
        INSERT = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        TOTALMONEY = new javax.swing.JButton();
        tt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Nhập Hàng");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("DANH SÁCH HÓA ĐƠN MUA HÀNG CỦA QUÁN");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Ngày nhập", "Nguồn nhập", "Thành tiền"
            }
        ));
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

        INSERT.setText("Thêm");
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });

        DELETE.setText("Xóa");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        TOTALMONEY.setText("Tổng Tiền");
        TOTALMONEY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TOTALMONEYActionPerformed(evt);
            }
        });

        tt.setEditable(false);

        jLabel2.setText("Tổng tiền nhập hàng");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DELETE)
                        .addGap(54, 54, 54)
                        .addComponent(INSERT)
                        .addGap(72, 72, 72)
                        .addComponent(TOTALMONEY)
                        .addGap(76, 76, 76)
                        .addComponent(CLOSE)))
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CLOSE)
                    .addComponent(TOTALMONEY)
                    .addComponent(INSERT)
                    .addComponent(DELETE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        dispose();
        JFrame new1= new MenuManager ();
        new1.setVisible(true);
        MenuManager.Listid.clear();
        Listtien.clear();
    }//GEN-LAST:event_CLOSEActionPerformed

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
      new InsertNhapHang().setVisible(true);
    }//GEN-LAST:event_INSERTActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        int k=jTable1.getSelectedRowCount();
        if(k==0){
            JOptionPane.showMessageDialog(this,"Bạn chưa chon mục để xóa");
        }
        else{
            DefaultTableModel model= (DefaultTableModel) jTable1.getModel();
            String id1=model.getValueAt(jTable1.getSelectedRow(), 0).toString();
            int tien1=Integer.parseInt(model.getValueAt(jTable1.getSelectedRow(),3).toString());
            int l=Integer.parseInt(tt.getText());
            tt.setText(String.valueOf(l-tien1));
            Xoadatabase.xoaHoadonnhap(id1);
            model.setRowCount(0);
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
                model.addRow(data);
                
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        }
        }
    }//GEN-LAST:event_DELETEActionPerformed

    private void TOTALMONEYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TOTALMONEYActionPerformed
       new Ttiennhap().setVisible(true);
       String sql=null;
        Connection cnn=ConnectedDatabase.getConnection();
          sql="select dateimport,sum(price*amount) as totalmoney"
            + " from import_materials "
                  +" group by  dateimport"
              + " order by  dateimport" ;   
              
             
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
            
            while(rs.next()){
                Date date=rs.getDate("dateimport");
                int tongtien=rs.getInt("totalmoney");
                list.add(tongtien);
                Object []data={date,tongtien};
                DefaultTableModel model= (DefaultTableModel) coffee.Ttiennhap.jTable1.getModel();
                model.addRow(data);
            }
            
        } catch (SQLException ex) {
            
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        }
       sql="select left(dateimport,7) as date,sum(price*amount) as totalmoney"
            + " from import_materials "
                  +" group by  date"
              + " order by  date" ;   
              
             
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
            
            while(rs.next()){
                String date=rs.getString("date");
                int tongtien=rs.getInt("totalmoney");
                list.add(tongtien);
                Object []data={date,tongtien};
                DefaultTableModel model= (DefaultTableModel) coffee.Ttiennhap.jTable2.getModel();
                model.addRow(data);
            }
            
        } catch (SQLException ex) {
            
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        }
       
    }//GEN-LAST:event_TOTALMONEYActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int k=jTable1.getSelectedRow();
         DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
        ChiTietHDMua hdm=new ChiTietHDMua();
        hdm.setVisible(true);
        hdm.mhd.setText(model.getValueAt(k,0).toString());
        hdm.nh.setText(model.getValueAt(k, 2).toString());
        hdm.nh1.setText(model.getValueAt(k,1).toString());
        String sql=null;
        Connection cnn=ConnectedDatabase.getConnection();
          sql="select idbillimport,materialsname,price,amount,(price*amount) as total"
             + " from import_materials"
             + " where idbillimport= '"+model.getValueAt(k,0).toString()+"'";
        try {
          Statement  ptm= cnn.createStatement();
            ResultSet rs=ptm.executeQuery(sql);
            while(rs.next()){
                String name=rs.getString("materialsname");
                
                int gia=rs.getInt("price");
                int sl=rs.getInt("amount");
                int tien=rs.getInt("total");
                
                Object []data={name,gia,sl,tien};
                DefaultTableModel model1= (DefaultTableModel) hdm.jTable1.getModel();
                model1.addRow(data);
                
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        } 
        
    }//GEN-LAST:event_jTable1MouseClicked

    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListMuaHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton INSERT;
    private javax.swing.JButton TOTALMONEY;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField tt;
    // End of variables declaration//GEN-END:variables
}
