import java.io.Serializable;
public class Employee implements Serializable {
    private int employeeId;
    private String name;
    private String department;
    private double salary;
    public Employee(int employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String toString() {
        return "Employee ID: " + employeeId + "\nName: " + name + "\nDepartment: " + department + "\nSalary: " + salary;
    }
}