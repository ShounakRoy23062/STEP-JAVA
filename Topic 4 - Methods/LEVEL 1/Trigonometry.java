import java.util.Scanner;
public class Trigonometry {

    //Method to calculate sine, cosine, and tangent of an angle
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); //Convert degrees to radians

        double sin = Math.sin(radians);
        double cos = Math.cos(radians);
        double tan = Math.tan(radians);

        return new double[]{sin, cos, tan};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);

        //Display the results
        System.out.printf("Sine(%.2f°)   = %.4f\n", angle, result[0]);
        System.out.printf("Cosine(%.2f°) = %.4f\n", angle, result[1]);
        System.out.printf("Tangent(%.2f°)= %.4f\n", angle, result[2]);
    }
}

	
	
	
	
	