import java.util.Scanner;
public class Height{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Delcaring an array
		double[] height = new double[11];
		double sum = 0;
		
		//Taking user input and using for loop
		for(int i = 0; i < 11; i++){
			System.out.print("Enter height of player " +(i+1)+ " : ");
			height[i] = input.nextDouble();
			sum += height[i];
		}
		
		//Printing output
		double mean_height = sum/11;
		System.out.println("The mean height of the team is : " +mean_height);
	}
}


		
		
		
		
		
		