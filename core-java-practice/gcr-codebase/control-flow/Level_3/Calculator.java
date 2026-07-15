public class Calculator {
    public static void main(String[] args) {
        double first = 10;
        double second = 5;
        String op = "+";
        
        double result = 0;
        boolean validOperation = true;
        
        switch (op) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                if (second != 0) {
                    result = first / second;
                } else {
                    System.out.println("Error: Division by zero.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid Operator");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.println(first + " " + op + " " + second + " = " + result);
        }
    }
}
