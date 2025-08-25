import java.util.Scanner;
public class SimpleInterest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		double principle, rate, time, simple_interest;
		System.out.print("Enter the principle amount : ");
		principle = input.nextDouble();
		System.out.print("Enter the rate : ");
		rate = input.nextDouble();
		System.out.print("Enter the time in hours : ");
		time = input.nextDouble();
		
		//Calculation
		simple_interest = (principle*rate*time)/100;
		
		//Printing Output
		System.out.println("The Simple Interest is " +simple_interest+ " for Principal amount INR " +principle+ ", Rate of Interest INR " +rate+ " and Time " +time+ " hours");
	}
}



