/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fungsi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Owner
 */
public class WarnaTableReg extends DefaultTableCellRenderer {
    public int kolom;
    public int statrawat = 19;
    public int statbayar = 23;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        if (row % 2 == 1){
            component.setBackground(new Color(225,240,230));
        }else{
            component.setBackground(new Color(255,255,255));
        } 
        if (table.getValueAt(row, statrawat).toString().equals("Berkas Diterima")){
            component.setBackground(new Color(215,175,245));
//            component.setForeground(new Color(255,255,255));
        }
        if (table.getValueAt(row, statrawat).toString().equals("Sudah")){
            component.setBackground(new Color(240, 105, 195));
//            component.setForeground(new Color(255,255,255));
        }
        if (table.getValueAt(row, statrawat).toString().equals("Berkas Terkirim")){
            component.setBackground(new Color(119, 252, 141));
         
//            component.setForeground(new Color(255,255,255));
        }
        if (table.getValueAt(row, statrawat).toString().equals("Batal")){
            component.setBackground(new Color(143, 143, 143));
//            component.setForeground(new Color(255,255,255));
        }
        
         if (table.getValueAt(row, statbayar).toString().equals("Sudah Bayar")){
            component.setBackground(new Color(129, 217, 252));
//            component.setForeground(new Color(255,255,255));
        }
       
        return component;
    }

}
