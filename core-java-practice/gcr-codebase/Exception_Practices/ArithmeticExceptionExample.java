public class ArithmeticExceptionExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
            System.out.println("Result: " + result); // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }
}
