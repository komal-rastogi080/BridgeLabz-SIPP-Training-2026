public class SmartLibrary {

    static String books[] = {"Java", "Python", null, "C++"};

    public static int getBookLength(int index) {
        try {
            return books[index].length();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid book index.");
            return -1;

        } catch (NullPointerException e) {
            System.out.println("Error: Book entry is empty (null).");
            return -1;
        }
    }

    public static void main(String[] args) {

        System.out.println("Length: " + getBookLength(1)); // Valid
        System.out.println("Length: " + getBookLength(2)); // Null
        System.out.println("Length: " + getBookLength(8)); // Invalid index
    }
}