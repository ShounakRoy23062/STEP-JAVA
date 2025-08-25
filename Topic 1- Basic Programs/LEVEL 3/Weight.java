import java.util.Scanner;
public class Weight{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		double wt_p, wt_kg;
		System.out.print("Enter the weight in pounds : ");
		wt_p = input.nextDouble();
		
		//Calculation
		wt_kg = wt_p*0.45;
		
		//Printing Output
		System.out.println("The weight of the person in pound is " +wt_p+ " and in kg is " +wt_kg+ ".");
	}
}



