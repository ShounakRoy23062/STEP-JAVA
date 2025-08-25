import java.util.Scanner;
public class DistanceModify{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		float d_in_feet, d_in_yards, d_in_miles;
		
		System.out.print("Enter the distance in feet : ");
		d_in_feet = input.nextFloat();
		
		//Calculations
		d_in_yards = d_in_feet/3;
		d_in_miles = d_in_yards/1760;
		
		//Printing Output
		System.out.println("Your height in feet is : " +d_in_feet+ " ft, while in yards is : " +d_in_yards+ " yd, and miles is : " +d_in_miles+ " miles");
	}
}


