import java.util.Scanner;
public class Vote{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		System.out.print("Enter the age : ");
		n = input.nextInt();
		
		//Conditional Statements
		if(n >= 18 && n > 0){
			System.out.print("The person is eligible to vote.");
		}else if(n < 18 && n > 0){
			System.out.print("The person is not eligible to vote.");
		}else{
			System.out.print("Enter a valid age.");
		}
	}
}


