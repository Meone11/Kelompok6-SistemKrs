/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_gui;

import java.awt.*;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.*;

/**
 *
 * @author meone
 */
public class AmbilMk extends javax.swing.JFrame {
    
    public TextEditor center = new TextEditor();
    ArrayList<AmbilMatkul> list;
    String User, Name;
    int index_select;
    /**
     * Creates new form AmbilMk
     */
    public AmbilMk() {
        initComponents();
        setLocationRelativeTo(null);
        //Set VAlue to Center
        for (int i = 0; i < ListMK.getColumnCount(); i++){
            ListMK.getColumnModel().getColumn(i).setCellRenderer(center);
        }
        
        //set alignment header to center
        JTableHeader header = ListMK.getTableHeader();
        ((DefaultTableCellRenderer)header.getDefaultRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        
        //set column widht 
        ListMK.getColumnModel().getColumn(0).setPreferredWidth(50); //checkbox
        ListMK.getColumnModel().getColumn(1).setPreferredWidth(100); //kode MataKuliah
        ListMK.getColumnModel().getColumn(2).setPreferredWidth(250); //Mata Kuliah
        ListMK.getColumnModel().getColumn(3).setPreferredWidth(100); //SKS
        ListMK.getColumnModel().getColumn(4).setPreferredWidth(150); //Kelas
        ListMK.getColumnModel().getColumn(5).setPreferredWidth(250); //Nama Dosen
        ListMK.getColumnModel().getColumn(6).setPreferredWidth(200); //Jadwal Kuliah
        ListMK.getColumnModel().getColumn(7).setPreferredWidth(150); //Ruang Kuliah
        
        //make array list for save the data 
        list = new ArrayList<AmbilMatkul>();
        listArrayList();
        tableMode();
        
    }
    public void tableMode(){
        DefaultTableModel model = (DefaultTableModel)ListMK.getModel();
        
        model.addRow(new Object[]{null,"MK101","Pemprograman","4","A","Rama Dhaniansyah S.Si,M.Si", "Senin, 10.00-12.45", "INF101"});
        model.addRow(new Object[]{null, "MK101", "Pemograman", "4", "B", "Dr. Syuaib Suhadi S.Si, M.Si", "Senin, 10.00-12.45", "INF002"});
        model.addRow(new Object[]{null, "MK102", "Basis Data", "3", "A", "Furqan Ramadhan S.Si, M.Si", "Selasa, 10.00-12.05", "INF001"});
        model.addRow(new Object[]{null, "MK102", "Basis Data",  "3", "B", "Fagih Akram S.Si, M.Si", "Selasa, 10.00-12.05", "INF002"});
        model.addRow(new Object[]{null, "MK103", "Jaringan Komputer", "3", "A", "Dr. Fajry Ariansyah PhD", "Rabu, 10.00-12.05", "INF001"});
        model.addRow(new Object[]{null, "MK103", "Jaringan Komputer", "3", "B", "Habil Nasution S.Si, M.Si", "Rabu, 10.00-12.05", "INF002"});
        model.addRow(new Object[]{null, "MK104", "Struktur Diskrit", "3", "A", "Diky Wahyudi S.Pd, M.Pd", "Kamis, 10.00-12.05", "INF001"});
        model.addRow(new Object[]{null, "MK104", "Struktur Diskrit", "3", "B", "Alfaturraudah S.Si, M.Si", "Kamis, 10.00-12.05", "INF002"});
        model.addRow(new Object[]{null, "MK105", "Kewirausahaan", "3", "A", "Ihsan Sanidi S.E, M.E", "Jum'at, 14.00-15.40", "ECN001"});
        model.addRow(new Object[]{null, "MK105", "Kewirausahaan", "3", "B", "Naya Sarmidah S.E, M.E", "Jum'at, 14.00-15.40", "ECN002"});
                
    }
    
    public void Ambil(String Username, String Nama){
        this.User = Username;
        this.Name = Nama;
    }
    
    public void savetoFile(){
        
        try{
            
            FileOutputStream file = new FileOutputStream("Matakuliah.dat");
            ObjectOutputStream outputfile = new ObjectOutputStream(file);
            
            for (int i = 0; i < list.size(); i++){
                outputfile.writeObject(list.get(i));
            }
            
            outputfile.close();
            
            JOptionPane.showMessageDialog(null, "Your MataKuliah Saved!!");
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
   
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BackButton = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMK = new javax.swing.JTable();
        CancelPanel = new javax.swing.JPanel();
        CancelButton = new javax.swing.JLabel();
        SubmitPanel = new javax.swing.JPanel();
        SubmitButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gui/MainMenuIcon.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Caladea", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Meone'S university");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, -1));

        BackButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        BackButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gui/ExitIcon.png"))); // NOI18N
        BackButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackButtonMouseClicked(evt);
            }
        });
        jPanel2.add(BackButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1370, 0, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 90));

        ListMK.setBackground(new java.awt.Color(255, 255, 255));
        ListMK.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ListMK.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        ListMK.setForeground(new java.awt.Color(0, 0, 0));
        ListMK.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ambil", "Kode", "Mata Kuliah", "SKS", "Kelas", "Dosen", "Jadwal", "Ruang"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        ListMK.setRowHeight(40);
        ListMK.setSelectionBackground(new java.awt.Color(153, 153, 153));
        ListMK.setSelectionForeground(new java.awt.Color(0, 0, 0));
        ListMK.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        ListMK.getTableHeader().setResizingAllowed(false);
        jScrollPane1.setViewportView(ListMK);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 1340, -1));

        CancelPanel.setBackground(new java.awt.Color(255, 255, 255));
        CancelPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        CancelPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CancelButton.setBackground(new java.awt.Color(255, 255, 255));
        CancelButton.setFont(new java.awt.Font("Caladea", 0, 15)); // NOI18N
        CancelButton.setForeground(new java.awt.Color(0, 0, 0));
        CancelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CancelButton.setText("Cancel");
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
        });
        CancelPanel.add(CancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(CancelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 560, 120, 30));

        SubmitPanel.setBackground(new java.awt.Color(255, 255, 255));
        SubmitPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SubmitPanel.setForeground(new java.awt.Color(0, 0, 0));
        SubmitPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SubmitButton.setBackground(new java.awt.Color(255, 255, 255));
        SubmitButton.setFont(new java.awt.Font("Caladea", 0, 15)); // NOI18N
        SubmitButton.setForeground(new java.awt.Color(0, 0, 0));
        SubmitButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SubmitButton.setText("Submit");
        SubmitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SubmitButtonMouseClicked(evt);
            }
        });
        SubmitPanel.add(SubmitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 30));

        jPanel1.add(SubmitPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 560, 120, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackButtonMouseClicked
        // TODO add your handling code here:
        MainMenu main = new MainMenu();
        main.setVisible(true);
        main.namaDisplay(Name, User);
        this.dispose();
    }//GEN-LAST:event_BackButtonMouseClicked

    private void SubmitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SubmitButtonMouseClicked
        // TODO add your handling code here:
        // get selected row
        
        TableModel model1 = ListMK.getModel();
        int index[] = ListMK.getSelectedRows();
        
        for(int i = 0; i < ListMK.getRowCount(); i++){
            Boolean cek = (Boolean)ListMK.getValueAt(i, 0);
            if (cek != null && cek == true){
                String Kode = ListMK.getValueAt(i, 1).toString();
                String Matakuliah = ListMK.getValueAt(i, 2).toString();
                String SKS = ListMK.getValueAt(i, 3).toString();
                String Kelas = ListMK.getValueAt(i, 4).toString();
                String Dosen = ListMK.getValueAt(i, 5).toString();
                String Jadwal = ListMK.getValueAt(i, 6).toString();
                String Ruang = ListMK.getValueAt(i, 7).toString();
                
                AmbilMatkul listMataKuliah = new AmbilMatkul(User, Kode,Matakuliah, SKS, Dosen, Kelas, Jadwal, Ruang);
                
                list.add(listMataKuliah);
            }
        }  
        savetoFile();
               
        MainMenu menu = new MainMenu();
        menu.setVisible(true);
        menu.namaDisplay(Name, User);
        this.dispose();
    }//GEN-LAST:event_SubmitButtonMouseClicked

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        // TODO add your handling code here:
        MainMenu main = new MainMenu();
        main.setVisible(true);
        main.namaDisplay(Name, User);
        this.dispose();
    }//GEN-LAST:event_CancelButtonMouseClicked

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
            java.util.logging.Logger.getLogger(AmbilMk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AmbilMk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AmbilMk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AmbilMk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AmbilMk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackButton;
    private javax.swing.JLabel CancelButton;
    private javax.swing.JPanel CancelPanel;
    private javax.swing.JTable ListMK;
    private javax.swing.JLabel SubmitButton;
    private javax.swing.JPanel SubmitPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
