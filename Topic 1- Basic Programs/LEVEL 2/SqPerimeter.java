import java.util.Scanner;
public class SqPerimeter{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int x, p;
		System.out.print("Enter the Perimeter : ");
		p = input.nextInt();
		
		//Calculation
		x = p/4;
		
		//Printing output
		System.out.print("The length of the side is " +x+ " cm, whose perimeter is : " +p+ " cm");
	}
}


