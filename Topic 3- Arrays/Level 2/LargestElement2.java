import java.util.Scanner;
import java.util.Arrays;
public class LargestElement2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		
		int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;
        
		//Using while loop
        while (n != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] temp = new int[maxDigit];
                System.arraycopy(digits, 0, temp, 0, digits.length);
                digits = temp;
            }
            digits[index] = n % 10;
            n /= 10;
            index++;
        }
		
        int largest = -1, secondLargest = -1;
        
		//Using for loop
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }
        
        //Display output
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
	}
}


