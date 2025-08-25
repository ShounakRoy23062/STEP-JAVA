import java.util.Scanner;
public class QnR{
	public static void main(String[] args){
		
		//Declaring Variables
		int a,b;
		int q,r;
		System.out.print("Enter the value of a : ");
		a = input.nextInt();
		System.out.print("Enter the value of b : ");
		b = input.nextInt();
		
		//Using conditional statements
		if(a>b){
			q = a/b;
			r = a%b;
		}else{
			q = b/a;
			r = b%a;
		}
		
		//Printing output
		System.out.println("The Quotient is " +q+ " and the Remainder is " +r);
	}
}




