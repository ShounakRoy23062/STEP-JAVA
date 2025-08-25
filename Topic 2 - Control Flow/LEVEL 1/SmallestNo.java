import java.util.Scanner;
public class SmallestNo{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n1,n2,n3;
		System.out.print("Enter the 1st number : ");
		n1 = input.nextInt();
		System.out.print("Enter the 2nd number : ");
		n2 = input.nextInt();
		System.out.print("Enter the 3rd number : ");
		n3 = input.nextInt();
		
		//Conditional Statements
		if(n1 < n2 && n1 < n3){
			System.out.print("Yes! The first number is the smallest number.");
		}else{
			System.out.println("No! The first number is not the smallest number.");
		}
	}
}



		
		
		
		
		