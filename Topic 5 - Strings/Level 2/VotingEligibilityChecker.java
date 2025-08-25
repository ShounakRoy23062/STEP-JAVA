import java.util.Scanner;
public class VotingEligibilityChecker {

    // Method to generate random 2-digit ages for n students
    public static int[] generateStudentAges(int numStudents) {
        int[] ages = new int[numStudents];
        for (int i = 0; i < numStudents; i++) {
            ages[i] = (int)(Math.random() * 50) + 10; // Ages between 10-59
        }
        return ages;
    }

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            
            if (ages[i] < 0) {
                result[i][1] = "Invalid (Negative)";
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        
        return result;
    }

    // Method to display results in tabular format
    public static void displayResults(String[][] eligibilityData) {
        System.out.println("\nStudent Voting Eligibility Report:");
        System.out.println("+------------+-------------------+");
        System.out.println("| Student Age| Voting Eligibility |");
        System.out.println("+------------+-------------------+");
        
        for (String[] row : eligibilityData) {
            System.out.printf("| %10s | %17s |\n", row[0], row[1]);
        }
        
        System.out.println("+------------+-------------------+");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_STUDENTS = 10;

        System.out.println("Enter ages for " + NUM_STUDENTS + " students:");
        
        // Option 1: Manual input
        int[] studentAges = new int[NUM_STUDENTS];
        for (int i = 0; i < NUM_STUDENTS; i++) {
            System.out.print("Enter age for student " + (i+1) + ": ");
            studentAges[i] = scanner.nextInt();
        }

        // Option 2: Random generation (uncomment to use instead of manual input)
        // int[] studentAges = generateStudentAges(NUM_STUDENTS);

        String[][] eligibility = checkVotingEligibility(studentAges);
        displayResults(eligibility);

        scanner.close();
    }
}

