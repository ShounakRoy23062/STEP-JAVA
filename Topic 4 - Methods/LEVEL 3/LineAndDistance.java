import java.util.Scanner;
public class LineAndDistance {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for two points
        System.out.print("Enter x1: ");
        double x1 = input.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = input.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = input.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = input.nextDouble();

        // Compute and print distance
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        // Compute and print line equation
        double[] line = findLineEquation(x1, y1, x2, y2);
        System.out.printf("Equation of Line: y = %.2fx + %.2f\n", line[0], line[1]);
    }

    // Method to calculate Euclidean distance
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // Method to calculate slope (m) and intercept (b), return as array
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1); // slope
        double b = y1 - m * x1;           // y-intercept
        return new double[]{m, b};
    }
}

