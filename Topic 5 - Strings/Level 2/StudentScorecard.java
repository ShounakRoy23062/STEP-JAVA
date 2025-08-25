import java.util.Scanner;
import java.util.Random;
public class StudentScorecard {

    // Generate random 2-digit marks for Physics, Chemistry, and Math
    public static int[][] generateScores(int students) {
        Random rand = new Random();
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = rand.nextInt(100); // Random marks 0–99
            }
        }
        return scores;
    }

    // Calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        int students = scores.length;
        double[][] results = new double[students][3]; // total, average, percentage
        for (int i = 0; i < students; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    // Determine grade from percentage
    public static char[] calculateGrades(double[][] results) {
        int students = results.length;
        char[] grades = new char[students];
        for (int i = 0; i < students; i++) {
            double percent = results[i][2];
            if (percent >= 80) grades[i] = 'A';
            else if (percent >= 70) grades[i] = 'B';
            else if (percent >= 60) grades[i] = 'C';
            else if (percent >= 50) grades[i] = 'D';
            else if (percent >= 40) grades[i] = 'E';
            else grades[i] = 'R';
        }
        return grades;
    }

    // Display final scorecard in table format
    public static void displayScorecard(int[][] scores, double[][] results, char[] grades) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percent", "Grade");

        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.0f %-10.2f %-10.2f %-10c\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students from user
        System.out.print("Enter number of students: ");
        int n = input.nextInt();

        // Generate data and process
        int[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        char[] grades = calculateGrades(results);

        // Display scorecard
        displayScorecard(scores, results, grades);
    }
}

