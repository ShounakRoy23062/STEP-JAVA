import java.util.Scanner;
public class QnR {

    //Method to find remainder and quotient
    public static int[] findQnR(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;

        //Return both in an array
        return new int[]{remainder, quotient};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Take user input
        System.out.print("Enter the number: ");
        int number = input.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        //Check for zero divisor
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            //Call method to find remainder and quotient
            int[] result = findQnR(number, divisor);

            //Printing output
            System.out.println("Quotient: " + result[1]);
            System.out.println("Remainder: " + result[0]);
        }
    }
}

