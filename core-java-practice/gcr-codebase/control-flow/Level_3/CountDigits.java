public class CountDigits {
    public static void main(String[] args) {
        int number = 12345;
        int count = 0;
        
        while (number != 0) {
            count++;
            number = number / 10;
        }
        
        System.out.println("Number of digits: " + count);
    }
}
