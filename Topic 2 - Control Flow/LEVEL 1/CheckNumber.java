import java.util.Scanner;
public class CheckNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		//Conditional Statements
		if(n > 0){
			System.out.print("The given number " +n+ " is positive.");
		}else if(n < 0){
			System.out.print("The given number " +n+ " is negative.");
		}else{
			System.out.print("The given number " +n+ " is equal to 0.");
		}
	}
}


