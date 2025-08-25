import java.util.Scanner;
public class Chars {
	
    // Method to convert string to character array manually
    public static char[] giveChars(String text) {
        char[] value = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            value[i] = text.charAt(i);
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input string from user
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Convert using user-defined method and built-in method
        char[] userDefined = giveChars(text);
        char[] functionUsed = text.toCharArray();

        // Print results by converting char[] to String
        System.out.println("User defined method  : " + new String(userDefined));
        System.out.println("Built-in function    : " + new String(functionUsed));
    }
}

