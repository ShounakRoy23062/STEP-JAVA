import java.util.Scanner;
public class Temp_2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		float celsius; 
		float farenheit;
		System.out.print("Enter the temperature in Farenheit : ");
		farenheit = input.nextInt();
		
		//Conversion
		celsius = (farenheit - 32) * 5/9;
		
		//Printing Output
		System.out.println("The " +farenheit+ " F is " +celsius+ " C");
	}
}

