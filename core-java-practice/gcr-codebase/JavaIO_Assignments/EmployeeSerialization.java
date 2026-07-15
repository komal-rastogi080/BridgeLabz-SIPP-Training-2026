import java.io.*;
import java.util.*;
public class EmployeeSerialization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Department: ");
            String dept = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee emp = new Employee(id, name, dept, salary);
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.ser"));
            oos.writeObject(emp);
            oos.close();
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"));
            Employee recovered = (Employee) ois.readObject();
            ois.close();
            System.out.println(recovered);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}