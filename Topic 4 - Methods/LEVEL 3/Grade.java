import java.util.Scanner;
import java.util.Random;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // Arrays to store data
        int[] physics = new int[n];
        int[] chemistry = new int[n];
        int[] math = new int[n];
        int[] total = new int[n];
        double[] average = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        // Generate random marks (50-100)
        for (int i = 0; i < n; i++) {
            physics[i] = rand.nextInt(51) + 50;
            chemistry[i] = rand.nextInt(51) + 50;
            math[i] = rand.nextInt(51) + 50;

            // Calculate results
            total[i] = physics[i] + chemistry[i] + math[i];
            average[i] = Math.round((total[i] / 3.0) * 100) / 100.0;
            percentage[i] = average[i];

            // Determine grade
            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        // Display results
        System.out.println("\nStudent Score Card");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("ID\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        System.out.println("-----------------------------------------------------------------");

        for (int i = 0; i < n; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%d\t%.2f\t%.2f\t%c\n",
                i+1, physics[i], chemistry[i], math[i], 
                total[i], average[i], percentage[i], grade[i]);
        }
    }
}

