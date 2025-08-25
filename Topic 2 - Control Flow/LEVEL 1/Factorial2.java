import java.util.Scanner;
public class Factorial2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		int n;
		int fac = 1;
		
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		//Using conditional statement
		if(n >= 0){
			int m = n;
			for(int i = n; i > 0; i--){		//Using for loop
				fac *= i;
			}
			
			//Printing output
			System.out.println("The factorial of " +m+ " is : " +fac);
		}
		else{
			System.out.println("Enter a positive number.");
		}
	}
}


