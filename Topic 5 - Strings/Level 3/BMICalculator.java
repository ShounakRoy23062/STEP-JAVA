import java.util.Scanner;
public class BMICalculator {
    
    // Method to calculate BMI and determine status
    public static String[] calculateBMIStatus(double weight, double height) {
        // Convert height from cm to meters
        double heightInMeters = height / 100;
        double bmi = weight / (heightInMeters * heightInMeters);
        
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "Normal";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        return new String[] {
            String.format("%.1f cm", height),
            String.format("%.1f kg", weight),
            String.format("%.2f", bmi),
            status
        };
    }
    
    // Method to process all team members' data
    public static String[][] processTeamData(double[][] heightWeightData) {
        String[][] results = new String[10][4];
        
        for (int i = 0; i < heightWeightData.length; i++) {
            double weight = heightWeightData[i][0];
            double height = heightWeightData[i][1];
            results[i] = calculateBMIStatus(weight, height);
        }
        
        return results;
    }
    
    // Method to display results in tabular format
    public static void displayResults(String[][] bmiData) {
        System.out.println("\nTeam BMI Report:");
        System.out.println("+---------+------------+------------+------------+--------------+");
        System.out.println("| Person  | Height     | Weight     | BMI        | Status       |");
        System.out.println("+---------+------------+------------+------------+--------------+");
        
        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("| %7d | %10s | %10s | %10s | %12s |\n",
                            (i+1), 
                            bmiData[i][0], 
                            bmiData[i][1], 
                            bmiData[i][2], 
                            bmiData[i][3]);
        }
        
        System.out.println("+---------+------------+------------+------------+--------------+");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int TEAM_SIZE = 10;
        double[][] heightWeightData = new double[TEAM_SIZE][2];
        
        System.out.println("Enter height (cm) and weight (kg) for 10 team members:");
        
        for (int i = 0; i < TEAM_SIZE; i++) {
            System.out.println("\nMember " + (i+1) + ":");
            System.out.print("Height in cm: ");
            heightWeightData[i][1] = scanner.nextDouble();
            System.out.print("Weight in kg: ");
            heightWeightData[i][0] = scanner.nextDouble();
        }
        
        String[][] bmiResults = processTeamData(heightWeightData);
        displayResults(bmiResults);
        
        scanner.close();
    }
}

