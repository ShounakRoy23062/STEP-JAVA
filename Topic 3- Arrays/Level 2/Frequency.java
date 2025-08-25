import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		// Taking user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        int[] frequency = new int[10];

        //Using while loop
        while (number > 0) {
            int digit = number % 10; // Extract last digit
            frequency[digit]++; // Increase count
            number /= 10; // Remove last digit
        }

        //Printing output
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times");
            }
        }
    }
}
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		