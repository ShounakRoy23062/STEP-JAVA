import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("\n--- Results ---");
        System.out.println("Is Prime: " + isPrime(number));
        System.out.println("Is Neon Number: " + isNeon(number));
        System.out.println("Is Spy Number: " + isSpy(number));
        System.out.println("Is Automorphic Number: " + isAutomorphic(number));
        System.out.println("Is Buzz Number: " + isBuzz(number));
    }

    // Check if the number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    // Check if the number is neon
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // Check if the number is spy
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // Check if the number is automorphic
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        return square % (int) Math.pow(10, (int) Math.log10(num) + 1) == num;
    }

    // Check if the number is buzz
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }
}
