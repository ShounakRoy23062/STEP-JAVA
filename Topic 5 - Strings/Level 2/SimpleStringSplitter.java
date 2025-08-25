import java.util.Scanner;
public class SimpleStringSplitter {

    // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    // Method to split a string into words without using split()
    public static String[] customSplit(String str) {
        int len = findLength(str);
        int wordCount = 1;

        // Count spaces to determine number of words
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        String word = "";
        int index = 0;

        // Build words by checking spaces
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                word += ch;
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word;

        return words;
    }

    // Method to compare two string arrays
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = input.nextLine();

        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");
        boolean same = compareArrays(custom, builtin);

        System.out.println("Custom Split:");
        for (String w : custom) System.out.println(w);

        System.out.println("Built-in Split:");
        for (String w : builtin) System.out.println(w);

        System.out.println("Are both results equal? " + same);
    }
}
