import java.util.Scanner;
public class Rocket_2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		System.out.print("Enter the starting number of countdown : ");
		n = input.nextInt();
		
		//Using For loop
		for(int i = n; i >= 1; i--){
			System.out.println(i);
		}
	}
}

