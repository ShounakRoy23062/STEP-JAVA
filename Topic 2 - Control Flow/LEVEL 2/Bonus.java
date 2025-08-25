import java.util.Scanner;
public class Bonus{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Delcaring Variables
		double salary, year, bonus, new_salary;
		System.out.print("Enter the salary : ");
		salary = input.nextDouble();
		System.out.print("Enter the no. of year serviced : ");
		year = input.nextDouble();
		
		//Using conditional statements
		if(year > 5){
			bonus = (salary * 0.05);
			new_salary = salary + bonus;
			System.out.println("Salary with bonus : " +new_salary);
		}else{
			System.out.println("Since your service is less than 5 years, your salary remains respective : " +salary);
		}
	}
}


