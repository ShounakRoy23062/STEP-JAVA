import java.util.Scanner;
public class Marks{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Declaring Variables
		float phy, chem, maths, percentage, avg, remark;
		System.out.print("Enter the marks of Physics out of 100 : ");
		phy = input.nextFloat();
		System.out.print("Enter the marks of Maths out of 100 : ");
		maths = input.nextFloat();
		System.out.print("Enter the marks of Chemistry out of 100 : ");
		chem = input.nextFloat();
		
		//Calculation
		avg = (phy+chem+maths)/3;
		percentage = avg*100;
		
		System.out.println("The average of 3 subjects is : " +avg);
		
		//Conditional Statements
		if(percentage >= 80){
			System.out.println("Remark obtained : A, Level 4, Above agency-normalized standards");
		}
		else if(percentage >= 70 && percentage <= 79){
			System.out.println("Remark obtained : B, Level 3, At agency-normalized standards");
		}
		else if(percentage >= 60 && percentage <= 69){
			System.out.println("Remark obtained : C, Level 2, Below but approaching agency-normalized standards");
		}
		else if(percentage >= 50 && percentage <= 59){
			System.out.println("Remark obtained : D, Level 1, Well below agency-normalized standards"); 
		}
		else if(percentage >= 40 && percentage <= 49){
			System.out.println("Remark obtained : E, Level 1, Too below agency-normalized standards");
		}
		else{
			System.out.println("Remark obtained : R, Remedial standards");
		}
	}
}



		