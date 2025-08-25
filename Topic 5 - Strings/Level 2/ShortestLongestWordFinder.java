import java.util.Scanner;
public class ShortestLongestWordFinder {

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

    public static String[][] getWordLengthPairs(String[] words) {
        String[][] wordInfo = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordInfo[i][0] = words[i];
            wordInfo[i][1] = String.valueOf(getLength(words[i]));
        }
        return wordInfo;
    }

    public static int[] findShortestAndLongest(String[][] wordInfo) {
        int minLen = Integer.parseInt(wordInfo[0][1]);
        int maxLen = Integer.parseInt(wordInfo[0][1]);
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < wordInfo.length; i++) {
            int len = Integer.parseInt(wordInfo[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String line = input.nextLine();

        String[] words = splitWords(line);
        String[][] wordInfo = getWordLengthPairs(words);
        int[] result = findShortestAndLongest(wordInfo);

        System.out.println("\nWord\t\tLength");
        for (int i = 0; i < wordInfo.length; i++) {
            System.out.println(wordInfo[i][0] + "\t\t" + Integer.parseInt(wordInfo[i][1]));
        }

        System.out.println("\nShortest word: " + wordInfo[result[0]][0]);
        System.out.println("Longest word: " + wordInfo[result[1]][0]);
    }
}
