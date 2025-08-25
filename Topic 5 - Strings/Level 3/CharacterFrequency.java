import java.util.Scanner;
public class CharacterFrequency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[][] frequencyTable = getCharacterFrequency(input);
        
        System.out.println("\nCharacter Frequency Table:");
        System.out.println("+------------+------------+");
        System.out.println("| Character  | Frequency  |");
        System.out.println("+------------+------------+");
        
        for (String[] row : frequencyTable) {
            if (row != null) {
                System.out.printf("| %-10s | %-10s |\n", row[0], row[1]);
            }
        }
        
        System.out.println("+------------+------------+");
        
        scanner.close();
    }

    public static String[][] getCharacterFrequency(String str) {
        // Array to store frequencies (using ASCII values as indices)
        int[] frequency = new int[256];
        
        // Count character frequencies
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++;
        }
        
        // Count how many unique characters we have
        int uniqueCount = 0;
        for (int count : frequency) {
            if (count > 0) {
                uniqueCount++;
            }
        }
        
        // Create 2D array to store results
        String[][] result = new String[uniqueCount][2];
        int index = 0;
        
        // Fill the result array
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                result[index][0] = getPrintableChar(i); // Character
                result[index][1] = String.valueOf(frequency[i]); // Frequency
                index++;
            }
        }
        
        return result;
    }
    
    // Helper method to handle special characters
    private static String getPrintableChar(int asciiValue) {
        if (asciiValue == ' ') {
            return "' ' (space)";
        } else if (asciiValue == '\t') {
            return "'\\t' (tab)";
        } else if (asciiValue == '\n') {
            return "'\\n' (newline)";
        } else if (asciiValue == '\r') {
            return "'\\r' (return)";
        } else {
            return "'" + (char)asciiValue + "'";
        }
    }
}

