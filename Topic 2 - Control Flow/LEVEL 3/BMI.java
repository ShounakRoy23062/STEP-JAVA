import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		double weight_in_kg, height_in_cm;
		System.out.print("Enter the weight in kg : ");
		weight_in_kg = input.nextDouble();
		System.out.print("Enter the height in cm : ");
		height_in_cm = input.nextDouble();
		
		double height_in_m = height_in_cm/100;
		double BMI = weight_in_kg/(height_in_m*height_in_m);
		
		//Conditional Statements
		if(BMI <= 18.4){
			System.out.println("Status : Underweight");
		}
		else if(BMI >= 18.5 && BMI <= 24.9){
			System.out.println("Status : Normal");
		}
		else if(BMI >= 25.0 && BMI <= 39.9){
			System.out.println("Status : Overweight");
		}
		else{
			System.out.println("Status : Obese");
		}
	}
}






		
		
		
		