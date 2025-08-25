import java.util.Scanner;
public class Salary{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
	
		//Delcaring Variables
		int original_salary, bonus, total_salary;
		System.out.print("Enter the salary : ");
		original_salary = input.nextInt();
		System.out.print("Enter the bonus : ");
		bonus = input.nextInt();
		
		total_salary = original_salary + bonus;
		
		System.out.println("The salary is INR " +original_salary+ " and bonus is INR " +bonus+ ". Hence Total Income is INR " +total_salary);
	}
}



