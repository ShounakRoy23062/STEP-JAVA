import java.util.Scanner;
public class NFE {

    // Method that tries to parse input text to an integer
    public static void getChar(String text) {
        // This line throws NumberFormatException if input is not a valid integer
        System.out.print(Integer.parseInt(text));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask user to enter a string
        System.out.print("Enter a text: ");
        String text = input.nextLine();

        try {
            getChar(text); // Attempt to parse the input
        } catch (NumberFormatException e) {
            // Catch specific number format exception
            System.out.println("Number Format Exception: Input is not a valid integer.");
        }
    }
}

