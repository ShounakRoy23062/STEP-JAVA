import java.util.Scanner;
public class BMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] people = new double[10][3]; // weight, height(cm), bmi
        String[] status = new String[10];

        //Input weight and height
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1));
            System.out.print("Enter weight (kg): ");
            double weight = input.nextDouble();

            System.out.print("Enter height (cm): ");
            double height = input.nextDouble();

            people[i][0] = weight;
            people[i][1] = height;

            //Convert cm to meters
            double heightMeters = height / 100;

            //Calculate BMI
            double bmi = weight / (heightMeters * heightMeters);
            people[i][2] = bmi;

            //Determine status
            if (bmi <= 18.4)
                status[i] = "Underweight";
            else if (bmi <= 24.9)
                status[i] = "Normal";
            else if (bmi <= 39.9)
                status[i] = "Overweight";
            else
                status[i] = "Obese";
        }

        //Print result
        System.out.println("\nPerson\tWeight\tHeight\tBMI\t\tStatus");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.1f\t%.1f\t%.2f\t%s\n",
                    (i + 1), people[i][0], people[i][1], people[i][2], status[i]);
        }
    }
}


