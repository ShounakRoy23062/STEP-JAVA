import java.util.Scanner;
public class Factorial{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		int n;
		int fac = 1;
		
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		//Using conditional statements
		if(n >= 0){
			int m = n;
			while(n != 0){		//Using while loop
				fac *= n;
				n--;
			}
			
			//Printing output
			System.out.println("The factorial of " +m+ " is : " +fac);
		}
		else{
			System.out.println("Enter a positive number.");
		}
	}
}


				
			