import java.util.Scanner;
public class WordLengthTable {

    // Method to find string length without using length()
    public static int getLength(String str) {
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

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {
        int len = getLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        String word = "";
        int index = 0;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
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

    // Method to return a 2D String array with word and its length
    public static String[][] getWordLengthPairs(String[] words) {
        String[][] wordInfo = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordInfo[i][0] = words[i];
            wordInfo[i][1] = String.valueOf(getLength(words[i]));
        }
        return wordInfo;
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input
        System.out.print("Enter a sentence: ");
        String line = input.nextLine();

        // Get words and their lengths
        String[] words = splitWords(line);
        String[][] wordData = getWordLengthPairs(words);

        // Display table
        System.out.printf("%-15s %-10s\n", "Word", "Length");
        for (int i = 0; i < wordData.length; i++) {
            String word = wordData[i][0];
            int length = Integer.parseInt(wordData[i][1]); // convert from String to int
            System.out.printf("%-15s %-10d\n", word, length);
        }
    }
}
