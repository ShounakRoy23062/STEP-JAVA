import java.util.Scanner;
public class Factors{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		
		//Declaring an array
		int[] factors = new int[n];
		int index = 0;
		
		//Using for loop
		for(int i = 1; i <= n; i++){
			if(n % i ==0){
				factors[index++] = i;
			}
		}
		
		//Printing output
		System.out.println("Factors of " +n+ " are : ");
		for(int i = 0; i < index; i++){
			System.out.println(factors[i]);
		}
	}
}



		
		
		
		
		
		
		
		
		
		
		
		
		