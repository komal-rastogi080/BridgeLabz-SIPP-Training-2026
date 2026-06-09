public class YoungTallFriends {
    public static void main(String[] args) {
        int amar_age = 25;
        int akbar_age = 22;
        int anthony_age = 28;
        
        int amar_height = 175;
        int akbar_height = 180;
        int anthony_height = 172;
        
        // Find youngest
        int youngest_age = amar_age;
        String youngest_name = "Amar";
        
        if (akbar_age < youngest_age) {
            youngest_age = akbar_age;
            youngest_name = "Akbar";
        }
        if (anthony_age < youngest_age) {
            youngest_age = anthony_age;
            youngest_name = "Anthony";
        }
        
        // Find tallest
        int tallest_height = amar_height;
        String tallest_name = "Amar";
        
        if (akbar_height > tallest_height) {
            tallest_height = akbar_height;
            tallest_name = "Akbar";
        }
        if (anthony_height > tallest_height) {
            tallest_height = anthony_height;
            tallest_name = "Anthony";
        }
        
        System.out.println("Youngest friend: " + youngest_name + " (Age: " + youngest_age + ")");
        System.out.println("Tallest friend: " + tallest_name + " (Height: " + tallest_height + " cm)");
    }
}
