import java.util.Scanner;
public class Power{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		int n,power,result=1;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		System.out.print("Enter the power : ");
		power = input.nextInt();
		
		//Using for loop
		for(int i = 1; i<=power; i++){
			result = result*n;
		}
		System.out.println("The result is : " +result);
	}	
}


		
		
		