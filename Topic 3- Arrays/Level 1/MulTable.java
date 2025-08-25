import java.util.Scanner;
public class MulTable{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking input
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		
		//Creating an array
		int[] mulTable = new int[10];
		
		//Calculation
		for(int i = 1; i <= 10; i++){
			mulTable[i-1] = n*i;
		}
		
		//Printing output
		for(int i = 1; i <= 10; i++){
			System.out.println(n+ " x " +i+ " = " +mulTable[i-1]);
		}
	}
}


		
		
		
		
		
		
		