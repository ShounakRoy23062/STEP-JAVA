import java.util.Scanner;
public class Operations{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int a,b,c,d,e,f,g;
		System.out.print("Enter the values of a : ");
		a = input.nextInt();
		System.out.print("Enter the values of b : ");
		b = input.nextInt();
		System.out.print("Enter the values of c : ");
		c = input.nextInt();
		
		//Calculations
		d = a + b * c;
		e = a * b + c;
		f = c + a / b;
		g = a % b + c;
		
		//Printing output
		System.out.println("The result of 1st operation is : " +d);
		System.out.println("The result of 2nd operation is : " +e);
		System.out.println("The result of 3rd operation is : " +f);
		System.out.println("The result of 4th operation is : " +g);
	}
}





