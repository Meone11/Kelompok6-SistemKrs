/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_gui;

import java.awt.Component;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author meone
 */
public class TextEditor extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isselected, boolean hasFocus, int row, int column){
        super.getTableCellRendererComponent(table, value, isselected, hasFocus, row, column);
        setHorizontalAlignment(SwingConstants.CENTER);
        return this;
    }
    
}
