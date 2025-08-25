import java.util.Scanner;
public class Vote {

    //Method to check if a student can vote
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vote checker = new Vote();
        int[] studentAges = new int[10];

        //Loop to take input for each student and check if they can vote
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age for student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

            //Check if the student can vote and display the result
            if (checker.canStudentVote(studentAges[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
    }
}



