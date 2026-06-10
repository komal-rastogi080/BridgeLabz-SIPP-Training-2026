
public class WelcomeCard {
    public static void main(String[] args) {

        String name = "Ravi";
        int age = 22;
        char rank = 'A';
        double salary = 50000;
        float membershipFee = 1500.50f;

        double annualBonus = salary * 0.12;
        int bonus = (int) annualBonus;

        System.out.println("===== WELCOME CARD =====");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : " + salary);
        System.out.println("Membership Fee : " + membershipFee);
        System.out.println("Annual Bonus   : " + bonus);
        System.out.println("========================");
    }
}
