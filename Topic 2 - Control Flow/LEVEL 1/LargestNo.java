import java.util.Scanner;
public class LargestNo{
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
		if(n1 > n2 && n1 > n3){
			System.out.println("The First number is largest.");
		}else{
			System.out.println("The First number is not the largest.");
		}
		if(n2 > n1 && n2 > n3){
			System.out.println("The Second number is largest.");
		}else{
			System.out.println("The Second number is not the largest.");
		}
		if(n3 > n1 && n3 > n2){
			System.out.println("The Third number is largest.");
		}else{
			System.out.println("The Third number is not the largest.");
		}
	}
}


