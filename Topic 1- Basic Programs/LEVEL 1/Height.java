import java.util.Scanner;
public class Height{
	public static void main(String[] args){
		double height_cm;
		double height_inch;
		double height_feet;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your height in cm : ");
		height_cm = input.nextDouble();
		height_inch = height_cm/2.54;
		height_feet = height_inch/12;
		
		System.out.println("Your height in cm : " +height_cm+ " cm");
		System.out.println("Your height in inches : " +height_inch+ " inches");
		System.out.println("Your height in feet : " +height_feet+ " feet");
		
		input.close();
	}
}


