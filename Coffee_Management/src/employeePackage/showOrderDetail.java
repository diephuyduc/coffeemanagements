/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeePackage;

import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import model.Main;

/**
 *
 * @author Admin
 */
public class showOrderDetail extends javax.swing.JFrame {
public static showOrderDetail sod;
 public static String ordercode ; 

    public static float discount=0;
    /**
     * Creates new form showOrderDetail
     */
    public showOrderDetail() {
        initComponents();
        loadOrder();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel2.setText("Mã hóa đơn: ");

        jLabel3.setText("Từ: ");

        jLabel4.setText("Đến: ");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Hóa đơn", "Bàn ", "Mã nhân viên", "Thời gian", "Mã giảm giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

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

        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Bàn: ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4)
                        .addGap(27, 27, 27)
                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(26, 26, 26))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4)
                    .addComponent(jButton1)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
   ordercode = (String) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
   discount = (float) jTable1.getValueAt(jTable1.getSelectedRow(), 4);
   showDetailsOfOrder s= new showDetailsOfOrder();
   s.main();
   
// TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jDateChooser1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jDateChooser1ComponentShown
loadOrder();        // TODO add your handling code here:
    }//GEN-LAST:event_jDateChooser1ComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.getDataVector().removeAllElements();
        if(jTextField1.getText().toString().compareTo("")==0){
        loadOrder();}
        else{
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String date1 = sdf.format(jDateChooser1.getDate());
    String date2= sdf.format(jDateChooser2.getDate())+" 23:59:59";
    
   Connection con;
    try{
    Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection(Main.url, Main.usernameSQL, Main.passwordSQL);
    String sql = "SELECT * FROM `orders` WHERE `startingtime` >=? AND `startingtime`<=? AND ordercode LIKE('%"+jTextField1.getText().toString()+"%')";
   
    PreparedStatement stm = con.prepareStatement(sql);
    stm.setString(1, date1);
    stm.setString(2, date2);
    ResultSet rs = stm.executeQuery();
    while(rs.next()){
        model.addRow(new Object[]{
            rs.getString(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getFloat(5)
        });
        
    }
        
    
    }
    catch(Exception e){
    e.printStackTrace();}

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String date1 = sdf.format(jDateChooser1.getDate());
    String date2= sdf.format(jDateChooser2.getDate())+" 23:59:59";
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.getDataVector().removeAllElements();
   Connection con;
    try{
    Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection(Main.url, Main.usernameSQL, Main.passwordSQL);
    String sql = "SELECT * FROM `orders` WHERE  ordercode LIKE('%"+jTextField1.getText().toString()+"%')";
   
    PreparedStatement stm = con.prepareStatement(sql);
    
    ResultSet rs = stm.executeQuery();
    while(rs.next()){
        model.addRow(new Object[]{
            rs.getString(1), rs.getInt(2), rs.getString(3), rs.getDate(4), rs.getFloat(5),
        });
        
    }
        
    
    }
    catch(Exception e){
    e.printStackTrace();}

    }//GEN-LAST:event_jTextField1KeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main() {
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
            java.util.logging.Logger.getLogger(showOrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(showOrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(showOrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(showOrderDetail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                sod =new showOrderDetail();
                sod.setVisible(true);
            }
        });
    }
    
public static void loadOrder(){
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    String date1 = sdf.format(jDateChooser1.getDate());
    String date2= sdf.format(jDateChooser2.getDate())+" 23:59:59";
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.getDataVector().removeAllElements();
   Connection con;
    try{
    Class.forName("com.mysql.jdbc.Driver");
     con = DriverManager.getConnection(Main.url, Main.usernameSQL, Main.passwordSQL);
     if(jTextField2.getText().toString().compareTo("")==0){
    String sql = "SELECT * FROM `orders` WHERE `startingtime` >=? AND `startingtime`<=?";
   
    PreparedStatement stm = con.prepareStatement(sql);
    stm.setString(1, date1);
    stm.setString(2, date2);
    ResultSet rs = stm.executeQuery();
    while(rs.next()){
        model.addRow(new Object[]{
            rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getFloat(5)
        });
        
    }}
     else{
     
      String sql = "SELECT * FROM `orders` WHERE `startingtime` >=? AND `startingtime`<=? AND tablenumber ="+jTextField2.getText();
   
    PreparedStatement stm = con.prepareStatement(sql);
    stm.setString(1, date1);
    stm.setString(2, date2);
    ResultSet rs = stm.executeQuery();
    while(rs.next()){
        model.addRow(new Object[]{
            rs.getString(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getFloat(5)
        });
        
    }
     }
        
    
    }
    catch(Exception e){
    e.printStackTrace();}

}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    public static com.toedter.calendar.JDateChooser jDateChooser1;
    public static com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    public static javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
