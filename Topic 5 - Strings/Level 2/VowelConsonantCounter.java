import java.util.Scanner;
public class VowelConsonantCounter {
    
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
    
    // Method to count vowels and consonants in a string
    public static int[] countVowelsAndConsonants(String str) {
        int vowelCount = 0;
        int consonantCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String charType = checkCharType(currentChar);
            
            if (charType.equals("Vowel")) {
                vowelCount++;
            } else if (charType.equals("Consonant")) {
                consonantCount++;
            }
            // Ignore non-letter characters
        }
        
        return new int[]{vowelCount, consonantCount};
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        int[] counts = countVowelsAndConsonants(inputString);
        
        System.out.println("Number of vowels: " + counts[0]);
        System.out.println("Number of consonants: " + counts[1]);
        
        scanner.close();
    }
}

