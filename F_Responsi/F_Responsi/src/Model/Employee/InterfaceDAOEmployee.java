/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Employee;
import java.util.List;
/**
 *
 * @author Lab Informatika
 */
public interface InterfaceDAOEmployee {
    public void insert(ModelEmployee Employee);
    public void update(ModelEmployee Employee);
    public void delete(int id);
    public List<ModelEmployee> getAll();
}
