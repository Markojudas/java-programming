package domain.dao;
import Domain.Employee;

public class EmployeeDAO {
    
    public void saveEmployee(Employee emp){
        System.out.println("saved employee to database: " + emp);
    }

    public void deleteEmployee(Employee emp){
        System.out.println("Deleted employee: " + emp);
    }

}
