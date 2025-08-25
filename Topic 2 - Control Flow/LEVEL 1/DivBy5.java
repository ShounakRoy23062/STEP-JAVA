import java.util.Scanner;
public class DivBy5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		System.out.print("Enter the number : ");
		n = input.nextInt();
		//Conditional statements
		if (n%5 == 0){
			System.out.print(+n+ " is divisible by 5");
		}else{
			System.out.println(+n+ " is not divisible by 5");
		}
	}
}



