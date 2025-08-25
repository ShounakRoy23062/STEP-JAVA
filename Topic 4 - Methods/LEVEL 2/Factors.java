import java.util.Scanner;
public class Factors {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Please enter a number greater than 0.");
        } else {
			//Finding Factors
            int[] factors = findFactors(n);
            System.out.print("Factors of " +n+ ": ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }
            System.out.println();
            System.out.println("Sum of factors: " + sum(factors));
            System.out.println("Product of factors: " + product(factors));
            System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        }
    }

    //Method to find the factors
    static int[] findFactors(int num) {
        int count = 0;

        //No. of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        //Creating Array
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
		return factors;
    }

    //Method to find sum
    static int sum(int[] arr) {
        int total = 0;
        for (int val : arr) {
            total += val;
        }
        return total;
    }

    //Method to find product
    static int product(int[] arr) {
        int result = 1;
        for (int val : arr) {
            result *= val;
        }
        return result;
    }

    //Method to find sum of squares
    static int sumOfSquares(int[] arr) {
        int total = 0;
        for (int val : arr) {
            total += (int)Math.pow(val, 2);
        }
        return total;
    }
}


