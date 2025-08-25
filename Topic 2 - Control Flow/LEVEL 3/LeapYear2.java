import java.util.Scanner;
public class LeapYear2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int year;
		System.out.print("Enter a year : ");
		year = input.nextInt();
		
		//Conditional Statements
		if(year % 4 == 0){
			System.out.println("The given year is a leap year.");
		}
		else if(year % 100 != 0){
			System.out.println("The given year is a leap year.");
		}
		else if(year % 400 == 0){
			System.out.println("The given year is a leap year.");
		}
		else{
			System.out.println("The given year is not a leap year.");
		}
	}
}


