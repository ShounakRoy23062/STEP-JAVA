import java.util.Scanner;
public class CharacterFrequencyNestedLoops {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String[] frequencyResult = getCharacterFrequency(input);
        
        System.out.println("\nCharacter Frequency Table:");
        System.out.println("+------------+------------+");
        System.out.println("| Character  | Frequency  |");
        System.out.println("+------------+------------+");
        
        for (String entry : frequencyResult) {
            if (entry != null) {
                String[] parts = entry.split(":");
                System.out.printf("| %-10s | %-10s |\n", parts[0], parts[1]);
            }
        }
        
        System.out.println("+------------+------------+");
        
        scanner.close();
    }

    public static String[] getCharacterFrequency(String str) {
        char[] characters = str.toCharArray();
        int[] frequency = new int[characters.length];
        String[] result = new String[characters.length];
        int resultIndex = 0;
        
        for (int i = 0; i < characters.length; i++) {
            // Skip if we've already processed this character
            if (characters[i] == '\0') continue;
            
            frequency[i] = 1; // Count the current character
            
            // Compare with remaining characters
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '\0'; // Mark as processed
                }
            }
            
            // Store the result for this character
            result[resultIndex++] = formatCharacter(characters[i]) + ":" + frequency[i];
        }
        
        // Trim the result array to remove null entries
        String[] finalResult = new String[resultIndex];
        System.arraycopy(result, 0, finalResult, 0, resultIndex);
        
        return finalResult;
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

