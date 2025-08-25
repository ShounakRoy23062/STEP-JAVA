import java.util.Scanner;
public class UnitConvertor {
	
    //Convert kilometers to miles
    public static double convertKmToMiles(double km) {
        double kmTOmiles = 0.621371;
        return km * kmTOmiles;
    }

    //Convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        double milesTOkm = 1.60934;
        return miles * milesTOkm;
    }

    //Convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersTOfeet = 3.28084;
        return meters * metersTOfeet;
    }

    //Convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetTOmeters = 0.3048;
        return feet * feetTOmeters;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        //Options to choose
        System.out.println("Unit Converter Menu:");
        System.out.println("1. Kilometers to Miles");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. Meters to Feet");
        System.out.println("4. Feet to Meters");
        System.out.print("Enter your choice (1-4): ");
        choice = input.nextInt();

        double inputValue, result;

        switch (choice) {
            case 1:
                System.out.print("Enter distance in kilometers: ");
                inputValue = input.nextDouble();
                result = convertKmToMiles(inputValue);
                System.out.println(inputValue + " km = " + result + " miles");
                break;

            case 2:
                System.out.print("Enter distance in miles: ");
                inputValue = input.nextDouble();
                result = convertMilesToKm(inputValue);
                System.out.println(inputValue + " miles = " + result + " km");
                break;

            case 3:
                System.out.print("Enter distance in meters: ");
                inputValue = input.nextDouble();
                result = convertMetersToFeet(inputValue);
                System.out.println(inputValue + " meters = " + result + " feet");
                break;

            case 4:
                System.out.print("Enter distance in feet: ");
                inputValue = input.nextDouble();
                result = convertFeetToMeters(inputValue);
                System.out.println(inputValue + " feet = " + result + " meters");
                break;

            default:
                System.out.println("Invalid choice! Please enter a number from 1 to 4.");
        }
    }
}

 