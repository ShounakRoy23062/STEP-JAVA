import java.util.Scanner;
public class FizzBuzz{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a positive number : ");
		int n = input.nextInt();
		
		//Conditional Statement
		if(n <= 0){
			System.out.println("Enter a positive number.");
			return;
		}
		
		//Declaring String array
		String[] result = new String[n+1];
		
		//Using for loop
		for(int i = 0; i <= n; i++){
			if(i%3==0 && i%5==0){
				result[i] = "FizzBuzz";
			}
			else if(i%3 == 0){
				result[i] = "Fizz";
			}
			else if(i%5 == 0){
				result[i] = "Buzz";
			}
			else{
				result[i] = String.valueOf(i);
			}
		}
		
		//Printing output
		for(int i = 0; i < n; i++){
			System.out.println("Position " +i+ " = " +result[i]);
		}
	}
}


		
		
		
		
		