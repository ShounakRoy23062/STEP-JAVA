import java.util.Scanner;
public class Rocket{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		System.out.print("Enter the starting number of countdown : ");
		n = input.nextInt();
		
		//Using While loop
		while(n>=1){
			System.out.println(n);
			n--;
		}
	}
}
		
		
