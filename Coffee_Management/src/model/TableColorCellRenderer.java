/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;
import sun.swing.table.DefaultTableCellHeaderRenderer;

/**
 *
 * @author Admin
 */
public class TableColorCellRenderer implements TableCellRenderer{
private static final TableCellRenderer RENDERER = new DefaultTableCellHeaderRenderer();
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c= RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
       
        Color color = null;
        if(column ==3){ 
            String result = (String) table.getModel().getValueAt(row, column);
        if(result.toString().compareTo("Có Khách")==0){
            color = Color.RED;
            
            c.setForeground(color);
        }
        }
        return c;
    }
    
}
