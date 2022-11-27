/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_gui;

/**
 *
 * @author meone
 */
public class Main_menu {
    private String Username, Nama, Nim, Email, TTL, Telepon, JenisKelamin, Agama, Alamat;

    public Main_menu(String Username, String Nama, String Nim, String Email, String TTL, String Telepon, String JenisKelamin, String Agama, String Alamat) {
        this.Username = Username;
        this.Nama = Nama;
        this.Nim = Nim;
        this.Email = Email;
        this.TTL = TTL;
        this.Telepon = Telepon;
        this.JenisKelamin = JenisKelamin;
        this.Agama = Agama;
        this.Alamat = Alamat;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getNim() {
        return Nim;
    }

    public void setNim(String Nim) {
        this.Nim = Nim;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getTTL() {
        return TTL;
    }

    public void setTTL(String TTL) {
        this.TTL = TTL;
    }

    public String getTelepon() {
        return Telepon;
    }

    public void setTelepon(String Telepon) {
        this.Telepon = Telepon;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getAgama() {
        return Agama;
    }

    public void setAgama(String Agama) {
        this.Agama = Agama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    
}
