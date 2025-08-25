import java.util.Scanner;
public class Factors{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		int n;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		//Using for loop
		for (int i = 1; i <= n; i++){
			if( n % i == 0){
				System.out.println(i);
			}
		}
	}
}




		