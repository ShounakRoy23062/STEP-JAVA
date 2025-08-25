import java.util.Scanner;
import java.util.Arrays;
public class BMI2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//User input
		System.out.print("Enter number of persons: ");
        int n = input.nextInt();
        double[][] data = new double[n][3];
        String[] status = new String[n];
        
		//Using for loop
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight (kg) and height (m) for person " + (i + 1) + ": ");
            data[i][0] = input.nextDouble();
            data[i][1] = input.nextDouble();
            data[i][2] = data[i][0] / (data[i][1] * data[i][1]);
            status[i] = data[i][2] <= 18.4 ? "Underweight" : data[i][2] <= 24.9 ? "Normal" : data[i][2] <= 39.9 ? "Overweight" : "Obese";
        }
        
		//Printing results
        System.out.println("\nBMI Results:");
        System.out.println("Weight(kg)  Height(m)  BMI       Status");
        for (int i = 0; i < n; i++){ 
            System.out.printf("%-10.2f %-10.2f %-10.2f %s\n", data[i][0], data[i][1], data[i][2], status[i]);
        }
	}
}




		
		
		
		