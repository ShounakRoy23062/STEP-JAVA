import java.util.Scanner;
public class OnE{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		int n;
		System.out.print("Enter a number : ");
		n = input.nextInt();
		
		//Using for loop
		for(int i = 1; i <= n; i++){
			if(i%2 == 0){
				System.out.println(i+ " is an even number.");
			}else{
				System.out.println(i+ " is an odd number.");
			}
		}
	}
}



