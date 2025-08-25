import java.util.Scanner;
public class Temp{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		float celsius; 
		float farenheit;
		System.out.print("Enter the temperature in Celsius : ");
		celsius = input.nextInt();
		
		//Conversion
		farenheit = (celsius * 9/5) + 32;
		
		//Printing Output
		System.out.println("The " +celsius+ " C is " +farenheit+ " F");
	}
}


