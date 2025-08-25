import java.util.Scanner;
public class IAE {

    // Method that attempts to create a substring with invalid indices
    public static void getChar(String text) {
        // This will throw StringIndexOutOfBoundsException if start > end
        String sub = text.substring(5, 2);
        System.out.print(sub); // This line will not execute
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine(); // Read user input

        try {
            getChar(text); // Try the invalid substring operation
        } catch (Exception e) {
            // Catch and handle the exception
            System.out.println("Invalid substring index: " + e);
        }
    }
}


