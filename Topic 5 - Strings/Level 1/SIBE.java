import java.util.Scanner;
public class SIBE {

    // Method to deliberately access an invalid index in the string
    public static void getChar(String text) {
        int n = text.length();
        // This will throw StringIndexOutOfBoundsException
        System.out.print(text.charAt(n)); // n is out of bounds
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a text: ");
        String text = input.nextLine(); // Read input string

        try {
            getChar(text); // Try to access invalid character
        } catch (Exception e) {
            System.out.println("Tried to access an index that's out of range");
        }
    }
}



