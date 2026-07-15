import java.io.*;
public class GroceryBillReader {
    public static void main(String[] args) {
        int lines = 0;
        try {
            BufferedReader br = new BufferedReader(new FileReader("bill.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                lines++;
            }
            br.close();
            System.out.println("Total Lines = " + lines);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}