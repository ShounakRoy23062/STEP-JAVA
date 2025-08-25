import java.util.Scanner;
public class KMtoMiles {
	public static void main (String[] args){
		
		double km;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the distance in KM : ");
		km = input.nextDouble();
		double miles = km / 1.6;
		
		System.out.println("The total miles is " +miles+ " miles for the given " +km+ " km.");
	}
}	

