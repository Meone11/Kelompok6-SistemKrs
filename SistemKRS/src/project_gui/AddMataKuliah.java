/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_gui;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;

/**
 *
 * @author meone
 */
public class AddMataKuliah extends javax.swing.JFrame {
    
    public TextEditor center = new TextEditor();
    ArrayList<AmbilMatkul> list;
    String User, Name;
    /**
     * Creates new form AddMataKuliah
     */
    public AddMataKuliah() {
        initComponents();
        setLocationRelativeTo(null);
        //Set VAlue to Center
        for (int i = 0; i < ListMk.getColumnCount(); i++){
            ListMk.getColumnModel().getColumn(i).setCellRenderer(center);
        }
        
        //set alignment header to center
        JTableHeader header = ListMk.getTableHeader();
        ((DefaultTableCellRenderer)header.getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        
        //set column widht 
        ListMk.getColumnModel().getColumn(0).setPreferredWidth(100); //kode MataKuliah
        ListMk.getColumnModel().getColumn(1).setPreferredWidth(250); //Mata Kuliah
        ListMk.getColumnModel().getColumn(2).setPreferredWidth(100); //SKS
        ListMk.getColumnModel().getColumn(3).setPreferredWidth(150); //Kelas
        ListMk.getColumnModel().getColumn(4).setPreferredWidth(250); //Nama Dosen
        ListMk.getColumnModel().getColumn(5).setPreferredWidth(200); //Jadwal Kuliah
        ListMk.getColumnModel().getColumn(6).setPreferredWidth(150); //Ruang Kuliah
        
        //make array list for save the data 
        list = new ArrayList<AmbilMatkul>();
        listArrayList();
    }
    
    public void AmbilToDisplay(String Usernama, String Nama){
        this.User = Usernama;
        this.Name = Nama;
    }
    
    public void tableMode(String Kode, String Matkul, String Sks, String Kelas, String Dosen, String Jadwal, String Ruang){
        DefaultTableModel model = (DefaultTableModel)ListMk.getModel();
        
        model.addRow(new Object[]{Kode, Matkul, Sks, Kelas, Dosen, Jadwal, Ruang});
                
    }
    
    public void listArrayList(){
        try{
            FileInputStream file = new FileInputStream("Matakuliah.dat");
            ObjectInputStream inputfile = new ObjectInputStream(file);
            
            boolean endoffile = false;
            
            while(!endoffile){
                try {
                    list.add((AmbilMatkul) inputfile.readObject());
                }catch (EOFException e){
                    endoffile = true;
                }catch (Exception f){
                    JOptionPane.showMessageDialog(null, f.getMessage());
                }
            }
            
            inputfile.close();
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }       
        
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
        jPanel2 = new javax.swing.JPanel();
        BackToMenu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMk = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackToMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gui/ExitIcon.png"))); // NOI18N
        BackToMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToMenuMouseClicked(evt);
            }
        });
        jPanel2.add(BackToMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(1350, 0, -1, -1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gui/MainMenuIcon.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Caladea", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Meone'S University");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1381, 90));

        ListMk.setBackground(new java.awt.Color(255, 255, 255));
        ListMk.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListMk.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        ListMk.setForeground(new java.awt.Color(0, 0, 0));
        ListMk.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode", "Mata Kuliah", "SKS", "Kelas", "Dosen", "Jadwal", "Ruang"
            }
        ));
        ListMk.setRowHeight(90);
        ListMk.setSelectionBackground(new java.awt.Color(153, 153, 153));
        ListMk.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(ListMk);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1340, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1381, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackToMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackToMenuMouseClicked
        // TODO add your handling code here:
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.namaDisplay(Name, User);
        this.dispose();
    }//GEN-LAST:event_BackToMenuMouseClicked

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
            java.util.logging.Logger.getLogger(AddMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddMataKuliah.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddMataKuliah().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackToMenu;
    public javax.swing.JTable ListMk;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
