import java.util.Scanner;
public class Count{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		int count = 0;
		int originalNumber = n;
		
		//Using while loop
		while(n != 0){
			n = n/10;
			count++;
		}
		
		if(originalNumber == 0){
			count = 1;
		}
		
		//Printing Output
		System.out.println("The total number of digits in " +originalNumber+ " is : " +count);
	}
}



		
		
		
		
		
		
		
		