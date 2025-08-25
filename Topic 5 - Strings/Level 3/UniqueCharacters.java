import java.util.Scanner;
public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        System.out.print("Unique characters: ");
        for (char c : findUniqueChars(input)) {
            if (c != '\0') System.out.print(c + " ");
        }
    }
    
    public static char[] findUniqueChars(String str) {
        char[] unique = new char[str.length()];
        int uniqueCount = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean isUnique = true;
            
            for (int j = 0; j < uniqueCount; j++) {
                if (unique[j] == current) {
                    isUnique = false;
                    break;
                }
            }
            
            if (isUnique) {
                unique[uniqueCount++] = current;
            }
        }
        
        return unique;
    }
}

