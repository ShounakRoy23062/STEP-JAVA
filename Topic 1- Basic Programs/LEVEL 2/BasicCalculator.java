import java.util.Scanner;
public class BasicCalculator{
	public static void main(String[] args){
		//Declaring variables
		float a, b, add, sub, prod, div;
		
		//Taking input
		Scanner input = new Scanner(System.in);
		System.out.print("Enter value of a : ");
		a = input.nextFloat();
		System.out.print("Enter value of b : ");
		b = input.nextFloat();
		
		//Solving using Arithmetic Operations and Conditional Statements
		add = a+b;
		if (a>b){
			sub = a-b;
		} else{
			sub = b-a;
		}
		prod = a*b;
		if (a>b){
			div = a/b;
		} else {
			div = b/a;
		}
		
		//Printing output
		System.out.println("Addition : " +add);
		System.out.println("Subtraction : " +sub);
		System.out.println("Multiplication : " +prod);
		System.out.println("Division : " +div);
	}
}

