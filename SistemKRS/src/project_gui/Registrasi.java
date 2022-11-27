/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_gui;

import java.io.*;
import java.util.*;
/**
 *
 * @author meone
 */
public class Registrasi implements Serializable {
    private String UserName, Password, Nama, Nim, Email, TTL, Telepon, 
            JK, Agama, Alamat;

    public Registrasi(String UserName, String Password, 
            String Nama, String Nim, String Email, 
            String TTL, String Telepon, String JK, 
            String Agama, String Alamat) {
        this.UserName = UserName;
        this.Password = Password;
        this.Nama = Nama;
        this.Nim = Nim;
        this.Email = Email;
        this.TTL = TTL;
        this.Telepon = Telepon;
        this.JK = JK;
        this.Agama = Agama;
        this.Alamat = Alamat;
    }

    public Registrasi() {
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
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

    public String getJK() {
        return JK;
    }

    public void setJK(String JK) {
        this.JK = JK;
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
