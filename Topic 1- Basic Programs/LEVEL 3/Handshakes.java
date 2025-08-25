import java.util.Scanner;
public class Handshakes{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int num_stud, handshakes;
		System.out.print("Enter the number of students present : ");
		num_stud = input.nextInt();
		
		//Calculations
		handshakes = (num_stud*(num_stud-1))/2;
		
		//Printing Output
		System.out.println("The number of possible handshakes : " +handshakes+ ".");
	}
}





		
		
		
		
		
		
		
		
		
		