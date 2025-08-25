import java.util.Scanner;
public class SimpleInterest {

    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input principal
        System.out.print("Enter Principal: ");
        double principal = scanner.nextDouble();

        // Input rate
        System.out.print("Enter Rate of Interest: ");
        double rate = scanner.nextDouble();

        // Input time
        System.out.print("Enter Time: ");
        double time = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = calculateSimpleInterest(principal, rate, time);

        // Output the result
        System.out.printf("The Simple Interest is %.2f for Principal %.2f, Rate of Interest %.2f and Time %.2f\n",
                simpleInterest, principal, rate, time);
    }
}


