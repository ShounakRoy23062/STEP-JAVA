import java.util.Scanner;
public class NatNum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int sum = 0;
		int sum2 = 0;
		int n;
		
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		//Using conditional statement
		if(n > 0){
			int m = n;
			while (n != 0){		//Using while loop
				sum += n;
				n--;
			}
			
			sum2 = (m*(m+1))/2;
			
			//Printing Output
			System.out.println("The sum using loop : " +sum);
			System.out.println("The sum using formula : " +sum2);
		}
		
		else {
			System.out.println("The number must be a natural number.");
		}
	}
}



		
		
		
		
		
		
		
		
		
		