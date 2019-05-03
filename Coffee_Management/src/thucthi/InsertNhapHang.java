
package thucthi;

import Class.NhapHang;
import ClassThucthi.ConnectedDatabase;
import ClassThucthi.Themdatabase;
import coffee.ListMuaHang;
import coffee.ListNhanVien;
import coffee.MenuManager;
import static coffee.MenuManager.Listid;
import static java.lang.System.exit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author boss
 */
public class InsertNhapHang extends javax.swing.JFrame {
    public static ArrayList<NhapHang> list=new ArrayList();
    public InsertNhapHang() {
        initComponents();
    }
    public static int l;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mahoadon = new javax.swing.JTextField();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Nhaphang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nguoiban = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nhập hàng "));

        jLabel4.setText("Mã hóa đơn");

        mahoadon.setText("N");

        close.setText("CLOSE");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên hàng nhập", "Giá", "Số lượng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Nhaphang.setText("Nhập Hàng");
        Nhaphang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NhaphangActionPerformed(evt);
            }
        });

        jLabel1.setText("Người Bán");

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ok)
                        .addGap(68, 68, 68)
                        .addComponent(delete)
                        .addGap(287, 287, 287)
                        .addComponent(close))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(mahoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                                .addComponent(nguoiban))
                            .addGap(181, 181, 181)
                            .addComponent(Nhaphang)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mahoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Nhaphang)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(4, 4, 4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)))
                    .addComponent(nguoiban, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(close))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ok)
                            .addComponent(delete))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jPanel2.setPreferredSize(new java.awt.Dimension(500, 296));
        jPanel2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
            int t=0;
            jPanel2.removeAll();
        jPanel2.add(new JPanel());
        jPanel2.validate();
        for(int i=0;i<MenuManager.Listid.size();i++){
                if(mahoadon.getText().compareTo(MenuManager.Listid.get(i))==0)t++;
            }
           if( list.size()==0){
               JOptionPane.showMessageDialog(this,"Chưa có hàng được nhập về");
           }
           else if(mahoadon.getText().equals("")||nguoiban.getText().equals(""))
           JOptionPane.showMessageDialog(this,"Bạn chưa nhập đủ thông tin của hóa đơn");
       else if(mahoadon.getText().length()<6||mahoadon.getText().length()>6){
            JOptionPane.showMessageDialog(this,"Mã hóa đơn phải đúng 6 ký tự");
       }
       else if(!mahoadon.getText().contains("N")){
            JOptionPane.showMessageDialog(this,"Mã hóa đơn phải bắt đầu bằng N");
       }
       else if(t>0){
            JOptionPane.showMessageDialog(this,"Mã hóa đơn bị trùng!!!!!");
       }
           else{
                MenuManager.Listid.add(mahoadon.getText());
               int k=0;
               Themdatabase th=new Themdatabase();
               int s=0;
               for(int i=0;i<list.size();i++){
                   s+=list.get(i).getAmount()*list.get(i).getPrice();
                   list.get(i).setIdbillimport(mahoadon.getText());
                   list.get(i).setUnit(nguoiban.getText());
               th.themNhapHang(list.get(i));
                k=th.k;
               if(k!=0)th.k=0;
               else if(k==0)break;
               }
               if(k>0){
                   int l=Integer.parseInt(ListMuaHang.tt.getText());
                   ListMuaHang.tt.setText(String.valueOf(l+s));
               JOptionPane.showMessageDialog(this,"Nhập hàng thành công");
               Themdatabase.k=0;
               DefaultTableModel model=(DefaultTableModel) coffee.ListMuaHang.jTable1.getModel();
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
                String nguon=rs.getString("unit");
                Object []data={id,date,nguon,tien};
                
                model.addRow(data);
                
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        } 
        list.clear();
        mahoadon.setText("N");
        nguoiban.setText("");
         DefaultTableModel model1=(DefaultTableModel) jTable1.getModel();
        model1.setRowCount(0);
        
           }
           }
    }//GEN-LAST:event_okActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
    dispose();
    
    }//GEN-LAST:event_closeActionPerformed

    private void NhaphangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NhaphangActionPerformed
       if(mahoadon.getText().equals("")||nguoiban.getText().equals(""))
           JOptionPane.showMessageDialog(this,"Bạn chưa nhập đủ thông tin của hóa đơn");
       else if(mahoadon.getText().length()<6||mahoadon.getText().length()>6){
            JOptionPane.showMessageDialog(this,"Mã hóa đơn phải đúng 6 ký tự");
       }
       else if(!mahoadon.getText().contains("N")){
            JOptionPane.showMessageDialog(this,"Mã hóa đơn phải bắt đầu bằng N");
       }
       else{ 
       jPanel2.removeAll();
       jPanel2.add(new Nhap());
       jPanel2.validate();
       }
       
    }//GEN-LAST:event_NhaphangActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
            DefaultTableModel model=(DefaultTableModel) jTable1.getModel();//ham xoa du lieu trong bang
         if(jTable1.getSelectedRowCount()==1){
            int k=jTable1.getSelectedRow();
           model.removeRow(k);
           list.remove(k); 
            JOptionPane.showMessageDialog(this,"Xóa hoàn tẤT");
            jPanel2.removeAll();
            jPanel2.add(new JPanel());
            jPanel2.validate();
         }
         else{
             if(jTable1.getRowCount()==0){
                 JOptionPane.showMessageDialog(this,"bảng trống");
             }
             else{
                  JOptionPane.showMessageDialog(this,"bạn chưa chon hàng để xóa");
             }
         }
    }//GEN-LAST:event_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       if(jTable1.getSelectedRowCount()==1){
       Nhap_1 n1=new Nhap_1();
       jPanel2.removeAll();
       jPanel2.add(n1);
       jPanel2.validate();
        l=jTable1.getSelectedRow();
         DefaultTableModel model=(DefaultTableModel) jTable1.getModel();
       n1.tenhn.setText(model.getValueAt(l,0).toString());
       n1.giahn.setText(model.getValueAt(l, 1).toString());
       n1.slhang.setText(model.getValueAt(l,2).toString());
       
       }
    }//GEN-LAST:event_jTable1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InsertNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertNhapHang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertNhapHang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nhaphang;
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    public static javax.swing.JTextField mahoadon;
    public static javax.swing.JTextField nguoiban;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}
