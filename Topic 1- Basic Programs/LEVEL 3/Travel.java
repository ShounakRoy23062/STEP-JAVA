import java.util.Scanner;
public class Travel{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your name : ");
		String name = input.nextLine();
		System.out.print("Enter the city you are travelling from : ");
		String fromCity = input.nextLine();
		System.out.print("Enter the city you are travelling via : ");
		String viaCity = input.nextLine();
		System.out.print("Enter the city you are travelling to : ");
		String toCity = input.nextLine();
		System.out.print("Enter the distance from " +fromCity+ " to " +viaCity+ " in miles : ");
		double fromToVia = input.nextDouble();
		System.out.print("Enter the distance from " +viaCity+ " to " +toCity+ " in miles : ");
		double viaToFinalCity = input.nextDouble();
		double totalDistance = fromToVia + viaToFinalCity;
		System.out.print("Enter the time taken for your journey in hours : ");
		double time = input.nextDouble();
		System.out.print("Enter the fee : ");
		double fee = input.nextDouble();
		System.out.print("Enter the discount percentage : ");
		double discount = input.nextDouble();
		double discount_amount = (fee*discount)/100;
		double finalFee = fee - discount_amount;
		System.out.println("Passenger " +name+ " is travelling from " +fromCity+ " to " +toCity+ " via " +viaCity+ ".");
		System.out.println("The Total distance is " +totalDistance+ " miles, will be covered in " +time+ " hours.");
		System.out.println("The fee for ticket paid is INR " +discount_amount+ ".");
	}
}





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		