import java.util.Scanner;
public class NatureOfNum {

    //Method to check if number is positive
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    //Method to check if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    //Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;
        } else if (num1 == num2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        //Take input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        //Check if each number is positive/negative and even/odd
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                System.out.print("Number " + num + " is Positive and ");
                if (isEven(num)) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Number " + num + " is Negative");
            }
        }

        //Compare first and last elements
        int result = compare(numbers[0], numbers[4]);
        System.out.print("\nComparison of first and last number: ");
        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == 0) {
            System.out.println("First number is equal to the last number.");
        } else {
            System.out.println("First number is less than the last number.");
        }
    }
}

	