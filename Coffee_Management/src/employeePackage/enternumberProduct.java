/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeePackage;
import java.sql.Connection;
import java.sql.*;
import model.*;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class enternumberProduct extends javax.swing.JFrame {
public int dem=1;
public static enternumberProduct ep;
    /**
     * Creates new form enternumberProduct
     */
    public enternumberProduct() {
        initComponents();
        setName();
        nameProduct.setText("");
        nameProduct.setText(inforTable.orderAdd.getNameProducts());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        nameProduct = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        numberOfProductText = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Số Lượng");

        jLabel1.setText("Tên sản phẩm: ");

        nameProduct.setEditable(false);

        jLabel2.setText("Số lượng: ");

        numberOfProductText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numberOfProductTextActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Cập nhật");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Chỉ nhập số nguyên, VD: 1,2..");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addContainerGap(164, Short.MAX_VALUE))
                    .addComponent(nameProduct, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(numberOfProductText, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(numberOfProductText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        //sSystem.out.println("day la\n"+EmployeeTask.orderList.get(0).ordercode+ inforTable.orderAdd.productcode+ inforTable.orderAdd.nameProducts+ inforTable.orderAdd.pricecode);
           
        if(numberOfProductText.getText().compareTo("")!=0){
           
            try{inforTable.orderAdd.setNumber(Integer.valueOf(numberOfProductText.getText()));}
            catch(Exception e){e.printStackTrace();}
            try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(Main.url, Main.usernameSQL, Main.passwordSQL);
                String sql1 = "SELECT * FROM orderdetail WHERE ordercode =? AND productcode =?";
                PreparedStatement pr1 = con.prepareStatement(sql1);
                pr1.setString(1,inforTable.orderAdd.getOrdercode() );
                pr1.setString(2, inforTable.orderAdd.productcode);
                ResultSet rs = pr1.executeQuery();
                
                if(rs.next()){
                    
                    String sqlUpdate = "UPDATE orderdetail set number =? WHERE ordercode =? AND productcode =?";
                    PreparedStatement prUpdate = con.prepareStatement(sqlUpdate);
                    int sl=0;
                    sl= rs.getInt(4) + Integer.valueOf(numberOfProductText.getText());
                    prUpdate.setInt(1, sl);
                    prUpdate.setString(2,inforTable.orderAdd.getOrdercode() );
                    prUpdate.setString(3, inforTable.orderAdd.productcode);
                    prUpdate.execute();
                 con.close();
                }
                
                else{
                String sql = "INSERT INTO orderdetail values (?,?,?,?,?)";
                PreparedStatement pr = con.prepareStatement(sql);
                pr.setString(1, inforTable.orderAdd.getOrdercode());
                pr.setString(2, inforTable.orderAdd.getProductcode());
                 pr.setString(3, inforTable.orderAdd.getNameProducts());
                 pr.setInt(4, inforTable.orderAdd.getNumber());
                 pr.setInt(5, inforTable.orderAdd.getPricecode());
                 pr.execute();
                 
                 con.close();
                }
            }
            catch(Exception e){
            e.printStackTrace();}
        
       
                 EmployeeTask.dataOfBill(EmployeeTask.idTable);
                 inforTable.loadDataInBill();
                ep.setVisible(false);
        }
        
        
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void numberOfProductTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numberOfProductTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numberOfProductTextActionPerformed

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
            java.util.logging.Logger.getLogger(enternumberProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(enternumberProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(enternumberProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(enternumberProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ep = new enternumberProduct();
               ep.setVisible(true);
            }
        });
        
    }
 
public void setName(){
 nameProduct.setText(inforTable.nameOfProductChoose);
    inforTable.nameOfProductChoose = null;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JToggleButton jToggleButton1;
    public javax.swing.JTextField nameProduct;
    public javax.swing.JTextField numberOfProductText;
    // End of variables declaration//GEN-END:variables
}