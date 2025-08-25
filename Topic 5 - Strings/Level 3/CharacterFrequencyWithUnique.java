import java.util.Scanner;
public class CharacterFrequencyWithUnique {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(input);
        String[][] frequencyTable = getCharacterFrequency(input, uniqueChars);
        
        System.out.println("\nCharacter Frequency Table:");
        System.out.println("+------------+------------+");
        System.out.println("| Character  | Frequency  |");
        System.out.println("+------------+------------+");
        
        for (String[] row : frequencyTable) {
            System.out.printf("| %-10s | %-10s |\n", row[0], row[1]);
        }
        
        System.out.println("+------------+------------+");
        
        scanner.close();
    }

    public static char[] findUniqueCharacters(String str) {
        char[] unique = new char[str.length()];
        int uniqueCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            
            // Check if we've seen this character before
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                unique[uniqueCount++] = currentChar;
            }
        }
        
        // Trim the array to actual size
        char[] result = new char[uniqueCount];
        System.arraycopy(unique, 0, result, 0, uniqueCount);
        
        return result;
    }

    public static String[][] getCharacterFrequency(String str, char[] uniqueChars) {
        int[] frequency = new int[256]; // ASCII frequency counter
        
        // Count all character frequencies
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            frequency[currentChar]++;
        }
        
        // Create result array for only unique characters
        String[][] result = new String[uniqueChars.length][2];
        
        for (int i = 0; i < uniqueChars.length; i++) {
            char c = uniqueChars[i];
            result[i][0] = formatCharacter(c);
            result[i][1] = String.valueOf(frequency[c]);
        }
        
        return result;
    }
    
    private static String formatCharacter(char c) {
        switch (c) {
            case ' ': return "' ' (space)";
            case '\t': return "'\\t' (tab)";
            case '\n': return "'\\n' (newline)";
            case '\r': return "'\\r' (return)";
            default: return "'" + c + "'";
        }
    }
}

