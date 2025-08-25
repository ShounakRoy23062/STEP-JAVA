import java.util.Scanner;
import java.util.Arrays;
public class Grade{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter the number of students: ");
        int n = input.nextInt();
        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];
        
		//Using for loop
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + " (Physics, Chemistry, Maths):");
            for (int j = 0; j < 3; j++) {
                double mark;
                do {
                    mark = input.nextDouble();
                    if (mark < 0) {
                        System.out.println("Invalid! Enter a positive value: ");
                    }
                } while (mark < 0);
                marks[i][j] = mark;
            }
            
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            grades[i] = (percentages[i] >= 80) ? "A" :
                        (percentages[i] >= 70) ? "B" :
                        (percentages[i] >= 60) ? "C" :
                        (percentages[i] >= 50) ? "D" :
                        (percentages[i] >= 40) ? "E" : "R";
        }
        
		//Printing output
        System.out.println("\nStudent Results:");
        System.out.println("Student   Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d         %.2f    %.2f      %.2f    %.2f%%       %s\n", 
                (i + 1), marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
	}
}



