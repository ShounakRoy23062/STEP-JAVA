import java.util.Scanner;
public class Harshad{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		int sum = 0;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		int oN = n;
		
		//Using while loop
		while(n != 0){
			sum += n % 10;
			n = n/10;
		}
		
		//Conditional Statements
		if(oN % sum == 0){
			System.out.println("It is a Harshad Number.");
		}else{
			System.out.println("It is not a Harshad Number.");
		}
	}
}



			