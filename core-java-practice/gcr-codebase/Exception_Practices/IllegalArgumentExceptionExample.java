public class IllegalArgumentExceptionExample {
    public static void main(String[] args) {
        try {
            printAge(-5); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
        System.out.println("IllegalArgumentException caught: " + e.getMessage());
        }
    }
    public static void printAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        System.out.println("Age: " + age);
    }
}
