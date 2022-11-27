/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project_gui;

import javax.swing.*;
import java.io.*;
import java.util.*;
/**
 *
 * @author meone
 */
public class ChangePass extends javax.swing.JFrame {
    
    ArrayList <Registrasi> regis;
    String [] cekName;
    String [] cekPass;
    String User, Pass;

    /**
     * Creates new form ChangePass
     */
    public ChangePass() {
        initComponents();
        regis = new ArrayList<Registrasi>();
        regisArrayList();
        
        cekName = new String[regis.size()];
        cekPass = new String[regis.size()];
        for (int i = 0; i < regis.size(); i++){
            cekName[i] = regis.get(i).getUserName();
            cekPass[i] = regis.get(i).getPassword();
        }
        
    }
    
    public void Ambil(String Username, String Password){
        this.User = Username;
        this.Pass = Password;
        
    }
    
    public void savetoFile(){
        
        try{
            
            FileOutputStream file = new FileOutputStream("regis.dat");
            ObjectOutputStream outputfile = new ObjectOutputStream(file);
            
            for (int i = 0; i < regis.size(); i++){
                outputfile.writeObject(regis.get(i));
            }
            
            outputfile.close();
            
            JOptionPane.showMessageDialog(null, "Successfully Change!!");
            
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    public void regisArrayList(){
        try{
            FileInputStream file = new FileInputStream("regis.dat");
            ObjectInputStream inputfile = new ObjectInputStream(file);
            
            boolean endoffile = false;
            
            while(!endoffile){
                try {
                    regis.add((Registrasi) inputfile.readObject());
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
    
    public int loginCheck(String Username, String Password){
        int index =0;
        try{
            
            for (int i = 0; i < regis.size(); i++){
                if ( (Username.equals(cekName[i])) && Password.equals(cekPass[i]) ){
                    index = i;
                    break;
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return index;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ChangeUser = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Savebutton = new javax.swing.JLabel();
        cancelButton = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Username");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password Lama");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 280, -1, -1));

        jLabel3.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password Baru");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Confirm Password");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, -1, -1));

        ChangeUser.setBackground(new java.awt.Color(255, 255, 255));
        ChangeUser.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        ChangeUser.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(ChangeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 240, 360, -1));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 280, 360, -1));

        jPasswordField2.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField2.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        jPasswordField2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 320, 360, -1));

        jPasswordField3.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField3.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        jPanel1.add(jPasswordField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 360, 360, -1));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gui/university_icon-icons.com_49967.png"))); // NOI18N
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, -1, -1));

        jLabel7.setFont(new java.awt.Font("Caladea", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Meone's University");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 650));

        jLabel5.setFont(new java.awt.Font("Caladea", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Change Password");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 160, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project_gui/Change Password Icon.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 160, -1, -1));

        Savebutton.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        Savebutton.setForeground(new java.awt.Color(0, 0, 0));
        Savebutton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Savebutton.setText("Save");
        Savebutton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Savebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SavebuttonMouseClicked(evt);
            }
        });
        jPanel1.add(Savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 400, 90, -1));

        cancelButton.setFont(new java.awt.Font("Caladea", 0, 18)); // NOI18N
        cancelButton.setForeground(new java.awt.Color(0, 0, 0));
        cancelButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelButton.setText("Cancel");
        cancelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelButtonMouseClicked(evt);
            }
        });
        jPanel1.add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 400, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SavebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SavebuttonMouseClicked
        // TODO add your handling code here:
        if (ChangeUser.getText().isEmpty() || jPasswordField1.getText().isEmpty()
                || jPasswordField2.getText().isEmpty() || jPasswordField3.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please, Enter Your UserName Or Password!!");
            
        } else{
            String Name = ChangeUser.getText().trim();
            String Pass = jPasswordField1.getText().trim();
            
            int index = loginCheck(Name, Pass);
            
            if (jPasswordField2.getText().trim().equalsIgnoreCase(jPasswordField2.getText().trim())){
                regis.get(index).setPassword(jPasswordField2.getText().trim());
                savetoFile();
                                
                MainMenu mainmenu = new MainMenu();
                 
                mainmenu.setVisible(true);
                mainmenu.namaDisplay(regis.get(index).getNama(),ChangeUser.getText());
                                        
                this.dispose();
                
            }
        }
    }//GEN-LAST:event_SavebuttonMouseClicked

    private void cancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelButtonMouseClicked
        // TODO add your handling code here:
        MainMenu mainmenu = new MainMenu();
                 
        mainmenu.setVisible(true);
        mainmenu.namaDisplay(Pass, User);
                                        
        this.dispose();
    }//GEN-LAST:event_cancelButtonMouseClicked

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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ChangeUser;
    private javax.swing.JLabel Savebutton;
    private javax.swing.JLabel cancelButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    // End of variables declaration//GEN-END:variables
}
