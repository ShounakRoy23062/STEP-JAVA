import java.util.Scanner;
public class Uppercase {

    // Method to convert text to uppercase using custom logic
    public static String getUpper(String text) {
        String res = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert lowercase letters to uppercase by subtracting 32 (ASCII value difference)
            if (ch >= 'a' && ch <= 'z') {
                res += (char)(ch - 32);
            } else {
                res += ch;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        
        // Convert the string to uppercase using the built-in method
        String up = text.toUpperCase();
        
        // Convert the string to uppercase using the user-defined method
        String up1 = getUpper(text);
        
        // Output both results
        System.out.println("Uppercase using user-defined function: " + up1);
        System.out.println("Uppercase using built-in function: " + up);
    }
}


