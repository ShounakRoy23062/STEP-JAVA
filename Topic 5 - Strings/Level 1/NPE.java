import java.util.Scanner;
public class NPE {

    // Method that intentionally causes a NullPointerException
    public static void generateException() {
        String text = null; // Null reference
        int n = text.length(); // This line throws NullPointerException
        System.out.print(n); // This line won't be executed
    }

    public static void main(String[] args) {
        try {
            generateException(); // Call method that throws exception
        } catch (Exception e) {
            System.out.println("Exception caught: " + e); // Print exception info
        }
    }
}

