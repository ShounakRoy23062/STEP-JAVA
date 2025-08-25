import java.util.Scanner;
public class Abundant{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		int sum = 0;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		int oN = n;
		
		//Using for loop
		for(int i = 1; i<n; i++){
			if(n%i==0){
				sum+=i;
			}
		}
		
		//Conditional Statements
		if(sum > oN){
			System.out.println("The number is an Abundant number.");
		}else{
			System.out.println("The number is not an Abundant number.");
		}
	}
}



