import java.util.Scanner;
public class GreatestFactors{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		int n,gf;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		//Using for loop
		for(int i = n-1; i > 1; i--){
			if(n%i == 0){
				gf = i;
				System.out.println("Greatest Factor : " +gf);
				break;
			}
		}
	}
}


		
		