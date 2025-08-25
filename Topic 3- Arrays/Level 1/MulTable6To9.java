import java.util.Scanner;
public class MulTable6To9{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user input and storing it in an array
		System.out.print("Enter a number : ");
		int n = input.nextInt();
		int[] mul_res = new int[4];
		
		//Using for loop and printing output
		for(int i = 6; i <= 9; i++){
			mul_res[i-6] = n*i;
			System.out.println(n+ " * " +i+ " = " +mul_res[i-6]);
		}
	}
}



		