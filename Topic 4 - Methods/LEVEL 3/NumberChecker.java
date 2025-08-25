import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] digits = getDigits(number);
        int count = digits.length;

        System.out.println("\n--- Results ---");
        System.out.println("Count of Digits: " + count);
        System.out.println("Is Duck Number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + isArmstrong(number, digits));
        findTwoLargest(digits);
        findTwoSmallest(digits);
    }

    // Get digits of the number
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] arr = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            arr[i] = numStr.charAt(i) - '0';
        }
        return arr;
    }

    // Check if it's a duck number (has a 0 but not at the start)
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Check Armstrong number
    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int d : digits) {
            sum += Math.pow(d, power);
        }
        return sum == number;
    }

    // Find and print largest and second largest digits
    public static void findTwoLargest(int[] arr) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2 && n != max1) {
                max2 = n;
            }
        }
        System.out.println("Largest Digit: " + max1);
        System.out.println("Second Largest Digit: " + (max2 == Integer.MIN_VALUE ? "N/A" : max2));
    }

    // Find and print smallest and second smallest digits
    public static void findTwoSmallest(int[] arr) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2 && n != min1) {
                min2 = n;
            }
        }
        System.out.println("Smallest Digit: " + min1);
        System.out.println("Second Smallest Digit: " + (min2 == Integer.MAX_VALUE ? "N/A" : min2));
    }
}
