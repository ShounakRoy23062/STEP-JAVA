import java.util.Scanner;
public class Vote{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		int[] ages = new int[10];
		//Using for loop and taking input
		for(int i = 0; i < ages.length; i++){
			System.out.print("Enter the age of student " +(i+1)+ " : ");
			ages[i] = input.nextInt();
		}
			
			//Using for loop and conditional statements
			for(int i = 0; i < ages.length; i++){
				int age = ages[i];
				if(age < 0){
					System.out.println("Invalid age.");
				}
				else if(age >= 18){
					System.out.println("Student with the age " +age+ " can vote.");
				}
				else{
					System.out.println("Student with the age " +age+ " cannot vote.");
				}
			}
	}
}







	
	