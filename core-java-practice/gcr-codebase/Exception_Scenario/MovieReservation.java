public class MovieReservation {

    static int seats[] = {101, 102, 103, 104, 105};

    public static int getSeat(int index) {
        try {
            return seats[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid seat position!");
            return -1;
        }
    }

    public static void main(String[] args) {

        int seat = getSeat(8);

        if (seat != -1) {
            System.out.println("Booked Seat Number: " + seat);
        } else {
            System.out.println("Seat not available");
        }
    }
}