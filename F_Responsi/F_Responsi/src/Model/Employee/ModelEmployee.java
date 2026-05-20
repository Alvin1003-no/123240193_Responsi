/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;

/**
 *
 * @author Lab Informatika
 */
public class ModelEmployee {
    // Encapsulation
    private int id;
    private String nama;
    private String divisi;
    private int nilai_target;
    private int nilai_disiplin;
    private int nilai_inovasi;
    private double nilai_akhir;
    private String status;
    
    // Getter Dan Setter 
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getDivisi(){
        return divisi;
    }
    public void setDivisi(String divisi){
        this.divisi = divisi;
    }
    public int getNilai_Target(){
        return nilai_target;
    }
    public void setNilai_Target(int nilai_target){
        this.nilai_target = nilai_target;
    }
    public int getNilai_Disiplin(){
        return nilai_disiplin;
    }
    public void setNilai_disiplin(int nilai_disiplin){
        this.nilai_disiplin = nilai_disiplin;
    }
    public int getNilai_inovasi(){
        return nilai_inovasi;
    }
    public void setNilai_Inovasi(int nilai_inovasi){
        this.nilai_inovasi = nilai_inovasi;
    }
    public double getNilai_Akhir(){
        return nilai_akhir;
    }
    public void setNilai_Akhir(double nilai_akhir){
        this.nilai_akhir = nilai_akhir;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status = status;
    }
}
