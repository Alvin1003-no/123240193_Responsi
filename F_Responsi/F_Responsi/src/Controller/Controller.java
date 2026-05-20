/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Employee.DAOEmployee;
import Model.Employee.InterfaceDAOEmployee;
import Model.Employee.ModelEmployee;
import Model.Employee.ModelTable;
import java.util.List;

/**
 *
 * @author Lab Informatika
 */
public class Controller {
    InterfaceDAOEmployee dao;
    List<ModelEmployee> list;
    
    public Controller(){
        dao = new DAOEmployee();
    }
    
    public void insert(String nama , String divisi , int nilai_target,
            int nilai_disiplin , int nilai_inovasi , int nilai_akhir )
    {
        ModelEmployee E = new ModelEmployee();
        double score = 
                ((nilai_target * 0.5) + (nilai_disiplin * 0.3) + (nilai_inovasi * 0.2)) / 3.0;
        
        String status;
        if(divisi == "Divisi Teknis " & score >= 80.0){
            status = "Promosi";
        }else{
            status = "Tetap";
        }
        
        if(divisi == "Divisi Pemasaran " & score >= 85.0){
            status = "Promosi";
        }else{
            status = "Tetap";
        }
        E.setNama(nama);
        E.setDivisi(divisi);
        E.setNilai_Target(nilai_target);
        E.setNilai_disiplin(nilai_disiplin);
        E.setNilai_Inovasi(nilai_inovasi);
        E.setNilai_Akhir(score);
        E.setStatus(status);
        dao.insert(E);
    }
    
    public void update(int id , String nama , String divisi , int nilai_target,
            int nilai_disiplin , int nilai_inovasi , int nilai_akhir )
    {
        ModelEmployee E = new ModelEmployee();
        double score = 
                ((nilai_target * 0.5) + (nilai_disiplin * 0.3) + (nilai_inovasi * 0.2)) / 3.0;
        
        String status;
        if(divisi == "Divisi Teknis " & score >= 80.0){
            status = "Promosi";
        }else{
            status = "Tetap";
        }
        
        if(divisi == "Divisi Pemasaran " & score >= 85.0){
            status = "Promosi";
        }else{
            status = "Tetap";
        }
        E.setId(id);
        E.setNama(nama);
        E.setDivisi(divisi);
        E.setNilai_Target(nilai_target);
        E.setNilai_disiplin(nilai_disiplin);
        E.setNilai_Inovasi(nilai_inovasi);
        E.setNilai_Akhir(score);
        E.setStatus(status);
        dao.update(E);
    }
    
    public ModelTable showdata(){
        list = dao.getAll();
        ModelTable table = new ModelTable(list);
        return table;
    }
    
    public void delete(int id){
        dao.delete(id);
    }
}
