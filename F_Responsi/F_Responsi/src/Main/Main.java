package Main;
import Model.Employee.DAOEmployee;
import View.Karyawan.ViewData;

public class Main {
    public static void main(String[] args) {
        new ViewData();
        DAOEmployee dao = new DAOEmployee();
        dao.getAll();
    }
}