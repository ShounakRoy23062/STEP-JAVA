import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int count = countDigits(number);
        int[] digits = getDigitsArray(number);

        System.out.println("\n--- Results ---");
        System.out.println("Count of Digits: " + count);
        System.out.println("Sum of Digits: " + sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + sumOfSquares(digits));
        System.out.println("Is Harshad Number: " + isHarshad(number, digits));
        printDigitFrequency(digits);
    }

    // Method to count digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to get digits array
    public static int[] getDigitsArray(int number) {
        String str = String.valueOf(number);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }
        return arr;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshad(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find digit frequencies
    public static void printDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; // [digit][frequency]

        // Initialize digit values
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // Count frequencies
        for (int d : digits) {
            freq[d][1]++;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + ": " + freq[i][1] + " time(s)");
            }
        }
    }
}
