import java.util.Scanner;
public class VowelConsonantIdentifier {
    
    // Method to check if a character is a vowel, consonant, or not a letter
    public static String checkCharType(char ch) {
        // Convert to lowercase if it's an uppercase letter
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // ASCII conversion to lowercase
        }
        
        // Check if it's a letter
        if (ch >= 'a' && ch <= 'z') {
            // Check if it's a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }
    
    // Method to analyze each character in the string
    public static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = checkCharType(currentChar);
        }
        
        return result;
    }
    
    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] charAnalysis) {
        System.out.println("\nCharacter Analysis:");
        System.out.println("+------------+----------------+");
        System.out.println("| Character  |      Type      |");
        System.out.println("+------------+----------------+");
        
        for (String[] row : charAnalysis) {
            System.out.printf("|     %-6s | %-14s |\n", row[0], row[1]);
        }
        
        System.out.println("+------------+----------------+");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        String[][] analysis = analyzeString(inputString);
        displayResults(analysis);
        
        scanner.close();
    }
}

