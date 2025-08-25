import java.util.Scanner;
public class CustomStringTrimmer {

    // Method to find the start and end indices of non-space characters
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        // Find first non-space character from start
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        
        // Find first non-space character from end
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        
        return new int[]{start, end};
    }
    
    // Method to create substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        // Handle empty string case
        if (start > end) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }
        
        return result.toString();
    }
    
    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string with leading/trailing spaces: ");
        String inputString = scanner.nextLine();
        
        // Custom trim using charAt()
        int[] indices = findTrimIndices(inputString);
        String customTrimmed = customSubstring(inputString, indices[0], indices[1]);
        
        // Built-in trim for comparison
        String builtInTrimmed = inputString.trim();
        
        // Compare results
        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);
        
        System.out.println("\nOriginal string: '" + inputString + "'");
        System.out.println("Custom trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtInTrimmed + "'");
        System.out.println("Are they equal? " + areEqual);
        
        scanner.close();
    }
}

