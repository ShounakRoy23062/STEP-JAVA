import java.util.Scanner;
public class OnE{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		
		//Conditional Statements
		if(n < 1){
			System.out.println("Enter a natural number.");
			return;
		}
		
		//Declaring arrays
		int even = n/2;
		int odd = (n+1)/2;
		int[] evenN = new int[even];
		int[] oddN = new int[odd];
		int evenIndex = 0, oddIndex = 0;
		
		//Using for loop
		for(int i = 1; i <= n; i++){
			if(i%2==0){
				evenN[evenIndex++] = i;
			} else{
				oddN[oddIndex++] = i;
			}
		}
		
		//Printing output
		System.out.print("Even numbers : ");
		for(int i = 0; i<evenIndex; i++){
			System.out.print(evenN[i] + " ");
		}
		System.out.println();
		System.out.print("Odd numbers : ");
		for(int i = 0; i<oddIndex; i++){
			System.out.print(oddN[i] + " ");
		}
	}
}


