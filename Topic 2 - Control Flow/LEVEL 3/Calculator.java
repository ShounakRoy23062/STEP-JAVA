import java.util.Scanner;
public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Delcaring Variables
		double a, b, result;
        String op;
        System.out.print("Enter the first number: ");
        a = input.nextDouble();
        System.out.print("Enter the second number: ");
        b = input.nextDouble();
		System.out.print("Enter an operator (+, -, *, /): ");
        op = input.next();
		
		//Using for loop and switch case
        for (int i = 1; i < 2; i++) {  
            switch (op) {
                case "+":
                    result = a + b;  
                    System.out.println("Result: " + a + " + " + b + " = " + result);
                    break;
                    
                case "-":
                    result = a - b; 
                    System.out.println("Result: " + a + " - " + b + " = " + result);
                    break;
                    
                case "*":
                    result = a * b;  
                    System.out.println("Result: " + a + " * " + b + " = " + result);
                    break;
                    
                case "/":
                    if (b != 0) {
                        result = a / b;  
                        System.out.println("Result: " + a + " / " + b + " = " + result);
                    } else {
                        System.out.println("Error! Division by zero is not allowed.");
                    }
                    break;
                    
                default:
                    System.out.println("Invalid Operator. Please use one of the following: +, -, *, /");
                    break;
            }
        }
	}
}


		
		