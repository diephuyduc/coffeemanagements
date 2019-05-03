/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffee;

import ClassThucthi.ConnectedDatabase;
import ClassThucthi.Xoadatabase;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import thucthi.InsertBan;
public class ListBan extends javax.swing.JFrame {
    private JPanel newpanel;
        public ListBan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        CLOSE = new javax.swing.JButton();
        INSERT = new javax.swing.JButton();
        DELETE = new javax.swing.JButton();
        PanelBan = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Danh Sách Bàn");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("DANH SÁCH BÀN TRONG QUÁN");
        jLabel1.setMaximumSize(new java.awt.Dimension(100, 22));
        jLabel1.setMinimumSize(new java.awt.Dimension(100, 22));
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 22));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã bàn", "Tên bàn", "Trạng thái", "Ghi chú"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        CLOSE.setText("CLOSE");
        CLOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CLOSEActionPerformed(evt);
            }
        });

        INSERT.setText("INSERT");
        INSERT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                INSERTActionPerformed(evt);
            }
        });

        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });

        PanelBan.setPreferredSize(new java.awt.Dimension(400, 250));
        PanelBan.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 73, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(INSERT)
                        .addGap(80, 80, 80)
                        .addComponent(DELETE)
                        .addGap(64, 64, 64)
                        .addComponent(CLOSE)
                        .addGap(55, 55, 55))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(PanelBan, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(INSERT)
                            .addComponent(DELETE)
                            .addComponent(CLOSE))
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CLOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CLOSEActionPerformed
        dispose();
        JFrame new1= new MenuManager ();
        new1.setVisible(true);
    }//GEN-LAST:event_CLOSEActionPerformed

    private void INSERTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_INSERTActionPerformed
        showData(new InsertBan());
    }//GEN-LAST:event_INSERTActionPerformed

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
         DefaultTableModel model= (DefaultTableModel) coffee.ListBan.jTable1.getModel();
        int k= coffee.ListBan.jTable1.getSelectedRowCount();
        if(k==0){
            JOptionPane.showMessageDialog(this,"Bạn chưa chọn bàn để xóa");
        }
        else{
            int l=Integer.parseInt(model.getValueAt(coffee.ListBan.jTable1.getSelectedRow(),0).toString());
            Xoadatabase.xoaDesk(l);
            
        PanelBan.removeAll();
        PanelBan.add(new JPanel());
        PanelBan.validate();
            model.setRowCount(0);
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
                model.addRow(data);
                
            }
            
        } catch (SQLException ex) {
            ListNhanVien list1=new ListNhanVien();
           JOptionPane.showMessageDialog(list1,"lỗi"+ ex);
        } 
        }
    }//GEN-LAST:event_DELETEActionPerformed
    private void showData(JPanel panel){
        newpanel=panel;
        PanelBan.removeAll();
        PanelBan.add(newpanel);
        PanelBan.validate();
    }
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListBan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CLOSE;
    private javax.swing.JButton DELETE;
    private javax.swing.JButton INSERT;
    public static javax.swing.JPanel PanelBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
