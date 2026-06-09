public class SpringSeason {
    public static void main(String[] args) {
        int month = 4;
        int day = 15;
        
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
