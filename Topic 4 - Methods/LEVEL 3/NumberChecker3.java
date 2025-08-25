import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = getDigits(number);
        int[] reversed = reverseArray(digits);

        System.out.println("\n--- Results ---");
        System.out.println("Count of Digits: " + digits.length);
        System.out.println("Is Palindrome: " + isPalindrome(digits, reversed));
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
    }

    // Get digits from number
    public static int[] getDigits(int num) {
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }

    // Reverse the digits array
    public static int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            rev[i] = arr[arr.length - 1 - i];
        }
        return rev;
    }

    // Check if arrays are equal (for palindrome)
    public static boolean isPalindrome(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Check for duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
}
