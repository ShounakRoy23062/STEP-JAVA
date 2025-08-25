import java.util.Scanner;
public class AIBE {

    // Method to deliberately cause an ArrayIndexOutOfBoundsException
    public static void causeArrayIndexError(String[] array) {
        // Attempting to access an invalid index
        System.out.println(array[array.length + 1]);
    }

    public static void main(String[] args) {
        // Creating a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Prompting the user to enter names of five students
        System.out.println("Enter the names of five students: ");
        String[] names = new String[5];

        // Reading names from user input
        for (int i = 0; i < 5; i++) {
            names[i] = input.nextLine();
        }

        try {
            // Calling the method to deliberately cause an exception
            causeArrayIndexError(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling the exception and printing a message
            System.out.println("Exception caught: Array Index Out of Bounds");
            e.printStackTrace(); // Optionally, print the stack trace for debugging
        }
    }
}



