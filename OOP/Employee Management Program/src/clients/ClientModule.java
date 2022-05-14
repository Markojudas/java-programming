package clients;
import Domain.Employee;
import domain.dao.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {
    

    public static void hireNewEmployee(Employee employee){
        EmployeeDAO empDAO = new EmployeeDAO();
        empDAO.saveEmployee(employee);
    }

    public static void trerminateEmployee(Employee employee){
        EmployeeDAO empDAO = new EmployeeDAO();
        empDAO.deleteEmployee(employee);
    }

    public static void main(String[] args) {
        
        Employee peggy = new Employee(1, "Peggy", "Accounting", true);

        ClientModule.hireNewEmployee(peggy);

        printEmployeeReporter(peggy, FormatType.XML);
    }

    public static void printEmployeeReporter(Employee emp, FormatType formatType){
        EmployeeReportFormatter formatter = new EmployeeReportFormatter(emp, formatType);
        System.out.println(formatter.getFormattedEmployee());
    }
}
