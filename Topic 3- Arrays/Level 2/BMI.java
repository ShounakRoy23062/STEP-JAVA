import java.util.Scanner;
import java.util.Arrays;
public class BMI{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of persons: ");
        int n = input.nextInt();
        double[] bmi = new double[n];
        String[] status = new String[n];
        
		//Using for loop
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) and height (m) for person " + (i + 1) + ": ");
            double weight = input.nextDouble();
            double height = input.nextDouble();
            
			//Calculation
            bmi[i] = weight / (height * height);
            
			//Conditional Statements
            if (bmi[i] <= 18.4){
				status[i] = "Underweight";
			}
            else if (bmi[i] <= 24.9) {
				status[i] = "Normal";
			}
            else if (bmi[i] <= 39.9) {
				status[i] = "Overweight";
            }
			else{
				status[i] = "Obese";
			}
        }
        
		//Display results
        System.out.println("\nBMI Results:");
        for (int i = 0; i < n; i++) {
            System.out.printf("Person %d: BMI = %.2f, Status = %s\n", (i + 1), bmi[i], status[i]);
        }
	}
}



		
		