import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		System.out.print("Enter the number : ");
		n = input.nextInt();
		int sum = 0;
		int originalNumber = n;
		
		//Using while loop
		while(n != 0){
			int lastDigit = n % 10;
			sum += lastDigit*lastDigit*lastDigit;
			n= n/10;
		}
		
		//Conditional Statements
		if(sum == originalNumber){
			System.out.println("The number is an Armstrong Number.");
		}else{
			System.out.println("The number is not an Armstrong Number.");
		}
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		