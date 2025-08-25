import java.util.Scanner;
public class Chocolates{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int num_choco, num_chil, div_choco, rem_choco;
		System.out.print("Enter the total number of chocolates available : ");
		num_choco = input.nextInt();
		System.out.print("Enter the total number of children present : ");
		num_chil = input.nextInt();
		
		//Calculating
		div_choco = num_choco / num_chil;
		rem_choco = num_choco % num_chil;
		
		//Printing output
		System.out.println("The number of chocolates each child gets is " +div_choco+ " and the number of remaining chocolates are " +rem_choco+ ".");
	}
}





		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		