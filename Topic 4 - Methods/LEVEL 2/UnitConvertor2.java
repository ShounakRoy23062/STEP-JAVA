import java.util.Scanner;
public class UnitConvertor2 {

    //Convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yardsTOfeet = 3;
        return yards * yardsTOfeet;
    }

    //Convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feetTOyards = 0.333333;
        return feet * feetTOyards;
    }

    //Convert meters to inches
    public static double convertMetersToInches(double meters) {
        double metersTOinches = 39.3701;
        return meters * metersTOinches;
    }

    //Convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inchesTOmeters = 0.0254;
        return inches * inchesTOmeters;
    }

    //Convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inchesTOcm = 2.54;
        return inches * inchesTOcm;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        //Options to Choose
        System.out.println("Unit Converter Menu:");
        System.out.println("1. Yards to Feet");
        System.out.println("2. Feet to Yards");
        System.out.println("3. Meters to Inches");
        System.out.println("4. Inches to Meters");
        System.out.println("5. Inches to Centimeters");
        System.out.print("Enter your choice (1-5): ");
        choice = input.nextInt();

        double inputValue, result;

        switch (choice) {
            case 1:
                System.out.print("Enter distance in yards: ");
                inputValue = input.nextDouble();
                result = convertYardsToFeet(inputValue);
                System.out.println(inputValue + " yards = " + result + " feet");
                break;

            case 2:
                System.out.print("Enter distance in feet: ");
                inputValue = input.nextDouble();
                result = convertFeetToYards(inputValue);
                System.out.println(inputValue + " feet = " + result + " yards");
                break;

            case 3:
                System.out.print("Enter distance in meters: ");
                inputValue = input.nextDouble();
                result = convertMetersToInches(inputValue);
                System.out.println(inputValue + " meters = " + result + " inches");
                break;

            case 4:
                System.out.print("Enter distance in inches: ");
                inputValue = input.nextDouble();
                result = convertInchesToMeters(inputValue);
                System.out.println(inputValue + " inches = " + result + " meters");
                break;

            case 5:
                System.out.print("Enter length in inches: ");
                inputValue = input.nextDouble();
                result = convertInchesToCentimeters(inputValue);
                System.out.println(inputValue + " inches = " + result + " centimeters");
                break;

            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 5.");
        }
    }
}



