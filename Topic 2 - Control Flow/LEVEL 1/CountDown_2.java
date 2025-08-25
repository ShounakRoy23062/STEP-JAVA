import java.util.Scanner;
public class CountDown_2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		int sum = 0;
		int n;
		
		//Using While loop
		while(true){
			System.out.print("Enter a number : ");
			n = input.nextInt();
			if(n <= 0){
				break;
			}
			sum += n;
		}
		
		//Printing Output
		System.out.println("The sum is : " +sum);
	}
}


