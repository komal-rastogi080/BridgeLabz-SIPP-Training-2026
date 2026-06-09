public class RocketLaunchCountdownWhile {
    public static void main(String[] args) {
        int counter = 5;
        
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Blast off!");
    }
}
