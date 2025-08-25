import java.util.Scanner;
public class Athlete{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		float r, l1, l2, l3, p, d=5000; 
		System.out.print("Enter the length of 1st side of triangular park in meters : ");
		l1 = input.nextFloat();
		System.out.print("Enter the length of 2nd side of triangular park in meters : ");
		l2 = input.nextFloat();
		System.out.print("Enter the length of 3rd side of triangular park in meters : ");
		l3 = input.nextFloat();
		
		//Calculating
		p = l1 + l2 + l3;
		r = d/p;
		
		//Printing Output
		System.out.println("The total number of rounds an athlete will run is " +r+ " to complete 5km");
	}
}


