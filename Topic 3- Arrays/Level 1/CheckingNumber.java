import java.util.Scanner;
public class CheckingNumber{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Using arrays to take input
		int[] numbers = new int[5];
		for(int i = 0; i < numbers.length; i++){
			System.out.print("Enter number " +(i+1)+ " : ");
			numbers[i] = input.nextInt();
		}
		
		//Conditional Statements
		for(int i = 0; i < numbers.length; i++){
			int number = numbers[i];
			if(number > 0){
				System.out.println("The number " +number+ " is a positive number.");
				if (number % 2 == 0){
					System.out.println("The number " +number+ " is an even number.");
				}else{
					System.out.println("The number " +number+ " is an odd number.");
				}
			}
			else if(number < 0){
				System.out.println("The number " +number+ " is a negative number.");
			}
			else{
				System.out.println("The number " +number+ " is zero.");
			}
		}
	}
}



