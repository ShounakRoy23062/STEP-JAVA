import java.util.Scanner;
import java.util.Arrays;
public class Bonus{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring arrays
		final int emp = 10;
		double[] salary = new double[emp];
		double[] years = new double[emp];
		double[] new_sal = new double[emp];
		double[] bonus_am = new double[emp];
		
		//Declaring arrays with starting value = 0
		double total_bonus = 0;
		double total_oldSalary = 0;
		double total_newSalary = 0;
		
		//Using for loop and while loop
		for(int i = 0; i < emp; i++){
			while(true){
				System.out.print("Enter salary of employee " +(i+1)+ " : ");
				salary[i] = input.nextDouble();
				System.out.print("Enter the year of service of employee " +(i+1)+ " : ");
				years[i] = input.nextDouble();
				
				if(salary[i] < 0 && years[i] <= 0){
					System.out.println("Invalid input");
				}else{
					break;
				}
			}
		}
		for(int i = 0; i < emp; i++){
			bonus_am[i] = (years[i] > 5) ? salary[i]*0.05 : salary[i]*0.02;
			new_sal[i] = salary[i] + bonus_am[i];
			
			//Assigning
			total_bonus += bonus_am[i];
			total_oldSalary += salary[i];
			total_newSalary += new_sal[i];
		}
		
		//Printing output
		System.out.println("Old Salary : " +total_oldSalary);
		System.out.println("Bonus amount : " +total_bonus);
		System.out.println("New Salary : " +total_newSalary);
	}
}



		
		
		
		