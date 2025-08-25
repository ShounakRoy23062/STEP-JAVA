import java.util.Scanner;
public class TotalPrice{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int unit_price, quantity, total_price;
		
		System.out.print("Enter the Price : ");
		unit_price = input.nextInt();
		System.out.print("Enter the quantity : ");
		quantity = input.nextInt();
		
		//Calculating
		total_price = unit_price*quantity;
		
		//Printing Output
		System.out.println("The total purchase price is INR " +total_price+ " if the quantity is " +quantity+ " and unit price is INR " +unit_price);
	}
}


