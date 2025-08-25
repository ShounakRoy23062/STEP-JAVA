import java.util.Scanner;
public class NatureOfNum {
	
	//Method to find the nature of number
	public static int check(int n){
		if(n>0){
			return 1;
		} else if (n<0){
			return -1;
		} else{
			return 0;
		}
	}
	
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter number : ");
		int num = input.nextInt();
		
		int result = check(num);
		
		//Conditional Statement
		if(result == 1){
			System.out.println("The number is positive.");
		} else if(result == -1){
			System.out.println("The number is negative.");
		} else{
			System.out.println("The number is zero.");
		}
	}
}

