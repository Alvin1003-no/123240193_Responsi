/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;
import javax.swing.table.AbstractTableModel;
import java.util.List;
/**
 *
 * @author Lab Informatika
 */
public class ModelTable extends AbstractTableModel{
    List<ModelEmployee> DaftarEmployee;
    
    String coloumn[] = {"Id" ,"Nama","Divisi","Nilai_Target","Nilai_Disiplin","Nilai_Inovasi" , "Nilai_Akhir" , "Status"};

    // Constructor
    public ModelTable(List<ModelEmployee> DaftarEmployee){
        this.DaftarEmployee = DaftarEmployee;      
    }
    
    @Override
    public int getRowCount(){
        return DaftarEmployee.size();
    }
    public Object getValueAnt(int RowIndex , int ColoumnIndex){
        switch (ColoumnIndex) {
            case 0:
                return DaftarEmployee.get(RowIndex).getId();
            case 1:
                return DaftarEmployee.get(RowIndex).getNama();
            case 2:
                return DaftarEmployee.get(RowIndex).getDivisi();
            case 3:
                return DaftarEmployee.get(RowIndex).getNilai_Target();
            case 4:
                return DaftarEmployee.get(RowIndex).getNilai_Disiplin();
            case 5:
                return DaftarEmployee.get(RowIndex).getNilai_inovasi();
            case 6:
                return DaftarEmployee.get(RowIndex).getNilai_Akhir();
            case 7:
                return DaftarEmployee.get(RowIndex).getStatus();
                
            default:
                return null;
        }
    }
    @Override
    public int getColumnCount() {
        return coloumn.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       return coloumn[columnIndex]; 
    }
    
}
