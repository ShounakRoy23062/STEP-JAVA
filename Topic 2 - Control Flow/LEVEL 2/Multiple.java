import java.util.Scanner;
public class Multiple{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variable
		int n;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		//Using for loop
		for(int i = 100; i >= 1; i--){
			if(i%n == 0){
				System.out.println(i);
			}
		}
	}
}





		