import java.util.Scanner;
public class SumOfNum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring variables
		double[] num = new double[10];
		double total = 0.0;
		int index = 0;
		
		//Using while loop
		while (true){
			System.out.print("Enter a number : ");
			double x = input.nextDouble();
			
			//Using conditional statement
			if(x <= 0 || x == 10){
				break;
			}
			
			num[index] = x;
			index++;
		}
		
		//Using for loop and printing output
		System.out.println("You entered the following number : ");
		for (int i = 0; i < index; i++){
			System.out.println(num[i]);
			total += num[i];
		}
		System.out.println("The total sum : " +total);
	}
}



			
		
		
		
		
		
		
		
		
		