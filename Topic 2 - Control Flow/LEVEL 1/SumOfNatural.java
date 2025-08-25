import java.util.Scanner;
public class SumOfNatural{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		System.out.print("Enter the number : ");
		n = input.nextInt();
		
		//Conditional Statements
		if(n>0){
			int sum = (n * (n + 1)) / 2;
			System.out.print("The sum of first " +n+ " numbers is " +sum);
		}else{
			System.out.println("Enter a positive number.");
		}
	}
}



