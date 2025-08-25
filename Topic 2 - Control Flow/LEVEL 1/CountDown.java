import java.util.Scanner;
public class CountDown{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		double n = 1.0;
		double sum = 0.0;
		
		//Using While loop
		while(n != 0.0){
			System.out.print("Enter a number : ");
			n = input.nextDouble();
			sum += n;
		}
		System.out.println("The sum is : " +sum);
	}
}


			
		