import java.io.*;
import java.util.*;
public class DailyExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("expenses.txt", true));
            System.out.print("Enter Category: ");
            String category = sc.nextLine();
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            bw.write(category + " - " + amount);
            bw.newLine();
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}