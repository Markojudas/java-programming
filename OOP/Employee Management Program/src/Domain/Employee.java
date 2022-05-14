package Domain;
public class Employee {

    private long id;
    private String name;
    private String department;
    private boolean working;

    public Employee(long _id, String _name, String _department, boolean _working){
        this.id = _id;
        this.name = _name;
        this.department = _department;
        this.working = _working;
    }

    public String toString(){
        return "Employee [id = " + id + ", name = " + name + ", department = " + department +
                    ", working = " + working + "]";
    }
    

}
