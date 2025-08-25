import java.util.Scanner;
public class NaturalNumbers {
    public static int findSum(int n) {
        int sum = 0;
		
		//For loop
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		//Taking user input
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
		
		//Printing output
        if (number <= 0) {
            System.out.println("Please enter a positive number greater than 0.");
        } else {
            int result = findSum(number);
            System.out.println("The sum of first " + number + " natural numbers is: " + result);
        }
    }
}

