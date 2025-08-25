import java.util.Scanner;
public class AreaOfTriangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		//Declaring Variables
		int h,b;
		System.out.print("Enter the height in inches : ");
		h = input.nextInt();
		System.out.print("Enter the base in inches : ");
		b = input.nextInt();
		
		//Calculation and Conversion
		double area_in_inches = 0.5*h*b;
		double area_in_cm = area_in_inches*6.4516;
		
		//Printing Output
		System.out.println("Area in centimeters : " +area_in_cm+ " sqcm");
		System.out.println("Area in inches : " +area_in_inches+ " sqinches");
	}
}

