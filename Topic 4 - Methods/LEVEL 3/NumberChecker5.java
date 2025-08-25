import java.util.Arrays;
import java.util.Scanner;
public class NumberChecker5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = getFactors(number);

        System.out.println("\n--- Results ---");
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println("\nGreatest Factor: " + greatestFactor(factors));
        System.out.println("Sum of Factors: " + sumOfFactors(factors));
        System.out.println("Product of Factors: " + productOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + productOfCubes(factors));
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));

    }

    // Get factors of a number
    public static int[] getFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    // Greatest factor
    public static int greatestFactor(int[] factors) {
        int max = 0;
        for (int factor : factors) {
            if (factor > max) max = factor;
        }
        return max;
    }

    // Sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Product of cubes of the factors
    public static double productOfCubes(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Check if number is perfect
    public static boolean isPerfectNumber(int num) {
        return sumOfFactors(getFactors(num)) == num;
    }

    // Check if number is abundant
    public static boolean isAbundantNumber(int num) {
        return sumOfFactors(getFactors(num)) > num;
    }

    // Check if number is deficient
    public static boolean isDeficientNumber(int num) {
        return sumOfFactors(getFactors(num)) < num;
    }

    // Check if number is strong
    public static boolean isStrongNumber(int num) {
        int sum = 0;
        int original = num;
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == original;
    }

    // Factorial of a number
    public static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
