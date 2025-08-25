import java.util.Scanner;
public class StringComparison {

    //Method to compare two strings using charAt() method
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        //Compare each character of both strings using charAt() method
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Take two strings as input from the user
        System.out.print("Enter the first string: ");
        String str1 = input.next();

        System.out.print("Enter the second string: ");
        String str2 = input.next();

        //Compare using charAt() method
        boolean resultUsingCharAt = compareUsingCharAt(str1, str2);

        //Compare using String equals() method
        boolean resultUsingEquals = str1.equals(str2);

        //Display the results
        System.out.println("\nComparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEquals);

        //Check if both results are the same
        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("\nBoth comparison methods produce the same result.");
        } else {
            System.out.println("\nThe comparison results are different.");
        }
    }
}
