/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

import ClassThucthi.ConnectedDatabase;
import ClassThucthi.Xoadatabase;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import thucthi.InsertKhuyenMai;
import thucthi.InsertKhuyenMai1;
/**
 *
 * @author boss
 */
public class ListKhuyenMai extends javax.swing.JFrame {

    /**
     * Creates new form ListDistCount
     */
    public ListKhuyenMai() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        thoat = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Panel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Khuyến Mại");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("           KHUYẾN MÃI TRONG NĂM");
        jLabel1.setName(""); // NOI18N

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Ngày bắt đầu", "Ngày kết thúc", "Giảm(%)", "Nội dung"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        delete.setText("Xóa");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Panel.setPreferredSize(new java.awt.Dimension(455, 330));
        Panel.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(34, 34, 34)
                .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delete)
                    .addComponent(jButton1)
                    .addComponent(thoat))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
       dispose();
        JFrame new1= new MenuManager ();
        new1.setVisible(true);
    }//GEN-LAST:event_thoatActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Panel.removeAll();
       Panel.add(new InsertKhuyenMai());
       Panel.validate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
       int k=jTable1.getSelectedRowCount();
       if(k==0){
           JOptionPane.showMessageDialog(this,"Bạn chưa chọn hàng để xóa");
       }
       else{
            DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
            int id=Integer.parseInt(model.getValueAt(jTable1.getSelectedRow(), 0).toString());
            Xoadatabase.xoaDiscount(id);
            model.setRowCount(0);
            String sql=null;
            Panel.removeAll();
            Panel.add(new JPanel());
            Panel.validate();
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
                model.addRow(data);
                
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        }
            
       }
       
    }//GEN-LAST:event_deleteActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
        InsertKhuyenMai1 km=new InsertKhuyenMai1();
       Panel.removeAll();
       Panel.add(km);
       Panel.validate();
       DefaultTableModel model= (DefaultTableModel)jTable1.getModel();
       km.txtngaybd.setText(model.getValueAt(jTable1.getSelectedRow(),1).toString());
       km.txtngaykt.setText(model.getValueAt(jTable1.getSelectedRow(),2).toString());
       km.txtht.setText(model.getValueAt(jTable1.getSelectedRow(),3).toString());
       km.txtname.enable(false);
       km.txtname.setText(model.getValueAt(jTable1.getSelectedRow(),4).toString());
       km.no.setText(model.getValueAt(jTable1.getSelectedRow(),0).toString());
       km.no.enable(false);
       
       
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
            java.util.logging.Logger.getLogger(ListKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListKhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel Panel;
    private javax.swing.JButton delete;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JButton thoat;
    // End of variables declaration//GEN-END:variables
}
