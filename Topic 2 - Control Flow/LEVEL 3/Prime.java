import java.util.Scanner;
public class Prime{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		boolean isPrime = true;
		
		//Conditional Statements
		if(n <= 1){
			isPrime = false;
		}else{
			for(int i = 2; i <= n/2; i++){
				if (n%i == 0){
					isPrime = false;
					break;
				}
			}
		}
		
		//Printing Output
		if(isPrime){
			System.out.println("The number is a Prime Number.");
		}else{
			System.out.println("The number is not a Prime Number.");
		}
	}
}




					