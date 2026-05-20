/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;
import Model.Connector;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Lab Informatika
 */
public class DAOEmployee implements InterfaceDAOEmployee{
    Connector connector = new Connector();  
    @Override
    public void insert(ModelEmployee E){
        try{
            String query = "INSERT INTO evaluasi VALUES "
                    + "(null,?,?,?,?,?,?,?)";
            PreparedStatement st ;
            st = connector.Connect().prepareStatement(query);
            st.setString(1, E.getNama());
            st.setString(2, E.getDivisi());
            st.setInt(3, E.getNilai_Target());
            st.setInt(4, E.getNilai_Disiplin());
            st.setInt(5, E.getNilai_inovasi());
            st.setDouble(6, E.getNilai_Akhir());
            st.setString(7, E.getStatus());
            st.executeUpdate();
        }catch(Exception Ex){
            System.out.println("Input Salah / Tidak Valid" + Ex.getLocalizedMessage());
        }
    }
    @Override
    public void update(ModelEmployee E){
        try{
            String query = "UPDATE evaluasi SET nama=?,divisi=?,nilai_target=?,"
                    + "nilai_disiplin=?,nilai_inovasi=?,nilai_akhir=?,status=? "
                    + "WHERE id=?";
                   
            PreparedStatement st ;
            st = connector.Connect().prepareStatement(query);
            st.setString(1, E.getNama());
            st.setString(2, E.getDivisi());
            st.setInt(3, E.getNilai_Target());
            st.setInt(4, E.getNilai_Disiplin());
            st.setInt(5, E.getNilai_inovasi());
            st.setDouble(6, E.getNilai_Akhir());
            st.setString(7, E.getStatus());
            st.setInt(8, E.getId());
            st.executeUpdate();
        }catch(Exception Ex){
            System.out.println("Update Gagal! :" + Ex.getLocalizedMessage());
        }
    }
    @Override
    public void delete(int id){
        try{
            String query = "DELETE FROM evaluasi WHERE id=?";
            PreparedStatement st;
            st = connector.Connect().prepareStatement(query);
            st.setInt(1, id);
            st.executeUpdate();
        }catch(Exception Ex){
            System.out.println("Delete Gagal! :" + Ex.getLocalizedMessage());
        }
    }
    @Override
    public List<ModelEmployee> getAll(){
            List<ModelEmployee> listEmployee = null;
        try{
            listEmployee = new ArrayList<>();
            Statement st = connector.Connect().createStatement();
            
            String query = "SELECT * FROM evaluasi";
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                ModelEmployee E = new ModelEmployee();
                E.setId(rs.getInt("id"));
                E.setNama(rs.getString("nama"));
                E.setDivisi(rs.getString("divisi"));
                E.setNilai_Target(rs.getInt("nilai_target"));
                E.setNilai_disiplin(rs.getInt("nilai_disiplin"));
                E.setNilai_Inovasi(rs.getInt("nilai_inovasi"));
                E.setNilai_Akhir(rs.getDouble("nilai_akhir"));
                E.setStatus(rs.getString("status"));
                listEmployee.add(E);
            }
        }catch(Exception ex){
            System.out.println("Error : " + ex.getLocalizedMessage());
        }
        return listEmployee;
    }
    
}
