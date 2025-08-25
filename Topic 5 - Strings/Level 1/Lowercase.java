import java.util.Scanner;
public class Lowercase {

    // Method to convert text to lowercase using custom logic
    public static String getLower(String text) {
        String res = "";
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            // Convert uppercase letters to lowercase by adding 32 (ASCII value difference)
            if (ch >= 'A' && ch <= 'Z') {
                res += (char)(ch + 32);
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
        
        // Convert the string to lowercase using the built-in method
        String lower = text.toLowerCase();
        
        // Convert the string to lowercase using the user-defined method
        String lower1 = getLower(text);
        
        // Output both results
        System.out.println("Lowercase using user-defined function: " + lower1);
        System.out.println("Lowercase using built-in function: " + lower);
    }
}


