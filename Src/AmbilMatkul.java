/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project_gui;

import java.io.*;
/**
 *
 * @author meone
 */
public class AmbilMatkul implements Serializable{
    private String Username, Kode,Matakuliah, SKS, Dosen, Kelas, Jadwal, Ruang;

    public AmbilMatkul(String Username, String Kode, String Matakuliah, String SKS, String Dosen, String Kelas, String Jadwal, String Ruang) {
        this.Username = Username;
        this.Kode = Kode;
        this.Matakuliah = Matakuliah;
        this.SKS = SKS;
        this.Dosen = Dosen;
        this.Kelas = Kelas;
        this.Jadwal = Jadwal;
        this.Ruang = Ruang;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getKode() {
        return Kode;
    }

    public void setKode(String Kode) {
        this.Kode = Kode;
    }

    public String getMatakuliah() {
        return Matakuliah;
    }

    public void setMatakuliah(String Matakuliah) {
        this.Matakuliah = Matakuliah;
    }

    public String getSKS() {
        return SKS;
    }

    public void setSKS(String SKS) {
        this.SKS = SKS;
    }

    public String getDosen() {
        return Dosen;
    }

    public void setDosen(String Dosen) {
        this.Dosen = Dosen;
    }

    public String getKelas() {
        return Kelas;
    }

    public void setKelas(String Kelas) {
        this.Kelas = Kelas;
    }

    public String getJadwal() {
        return Jadwal;
    }

    public void setJadwal(String Jadwal) {
        this.Jadwal = Jadwal;
    }

    public String getRuang() {
        return Ruang;
    }

    public void setRuang(String Ruang) {
        this.Ruang = Ruang;
    }

    
    
    
    
}
