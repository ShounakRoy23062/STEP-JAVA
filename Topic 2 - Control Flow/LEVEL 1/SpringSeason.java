import java.util.Scanner;
public class SpringSeason{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int d,m;
		System.out.print("Enter the month (1 - 12) : ");
		m = input.nextInt();
		System.out.print("Enter the date (1 - 31) : ");
		d = input.nextInt();
		
		//Conditional Statements
		if(m >= 3 && d >= 20){
			if(m <= 6 && d <= 20){
				System.out.println("It is a Spring Season.");
			}
			else{
				System.out.println("It is not a Spring Season.");
			}		
		}
	}
}




