import java.util.Scanner;
public class Grade2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        //Using for loop and while loop
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            physics[i] = getValidMarks(input, "Physics");
            chemistry[i] = getValidMarks(input, "Chemistry");
            maths[i] = getValidMarks(input, "Maths");

            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            grades[i] = (percentages[i] >= 80) ? "A" :
                        (percentages[i] >= 70) ? "B" :
                        (percentages[i] >= 60) ? "C" :
                        (percentages[i] >= 50) ? "D" :
                        (percentages[i] >= 40) ? "E" : "R";
        }

        // Printing output
        System.out.println("\nStudent Results:");
        System.out.println("Student  Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < n; i++) {
            System.out.printf("%d        %.2f     %.2f      %.2f    %.2f%%      %s\n",
                (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

        input.close();
    }

    //Function to validate and get positive marks
    private static double getValidMarks(Scanner input, String subject) {
        double marks;
        do {
            System.out.print(subject + " marks: ");
            marks = input.nextDouble();
            if (marks < 0) {
                System.out.println("Invalid! Enter a positive value.");
            }
        } while (marks < 0);
        return marks;
    }
}


