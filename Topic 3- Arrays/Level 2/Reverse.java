import java.util.Scanner;
import java.util.Arrays;
public class Reverse{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		
		int temp = n, count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }
        
        //Using for loop
        int[] digits = new int[count];
        temp = n;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }
        
        //Display result
        System.out.print("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
	}
}


		