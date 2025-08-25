import java.util.Scanner;
public class UnitConvertor3 {

    //Convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        double fahrenheitTOcelsius = (fahrenheit - 32) * 5 / 9;
        return fahrenheitTOcelsius;
    }

    //Convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        double celsiusTOfahrenheit = (celsius * 9 / 5) + 32;
        return celsiusTOfahrenheit;
    }

    //Convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double poundsTOkilograms = 0.453592;
        return pounds * poundsTOkilograms;
    }

    //Convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilogramsTOpounds = 2.20462;
        return kilograms * kilogramsTOpounds;
    }

    //Convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallonsTOliters = 3.78541;
        return gallons * gallonsTOliters;
    }

    //Convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double litersTOgallons = 0.264172;
        return liters * litersTOgallons;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        //Options to Choose
        System.out.println("Unit Converter Menu:");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("3. Pounds to Kilograms");
        System.out.println("4. Kilograms to Pounds");
        System.out.println("5. Gallons to Liters");
        System.out.println("6. Liters to Gallons");
        System.out.print("Enter your choice (1-6): ");
        choice = input.nextInt();

        double inputValue, result;

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                inputValue = input.nextDouble();
                result = convertFahrenheitToCelsius(inputValue);
                System.out.println(inputValue + "°F = " + result + "°C");
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                inputValue = input.nextDouble();
                result = convertCelsiusToFahrenheit(inputValue);
                System.out.println(inputValue + "°C = " + result + "°F");
                break;

            case 3:
                System.out.print("Enter weight in pounds: ");
                inputValue = input.nextDouble();
                result = convertPoundsToKilograms(inputValue);
                System.out.println(inputValue + " pounds = " + result + " kilograms");
                break;

            case 4:
                System.out.print("Enter weight in kilograms: ");
                inputValue = input.nextDouble();
                result = convertKilogramsToPounds(inputValue);
                System.out.println(inputValue + " kilograms = " + result + " pounds");
                break;

            case 5:
                System.out.print("Enter volume in gallons: ");
                inputValue = input.nextDouble();
                result = convertGallonsToLiters(inputValue);
                System.out.println(inputValue + " gallons = " + result + " liters");
                break;

            case 6:
                System.out.print("Enter volume in liters: ");
                inputValue = input.nextDouble();
                result = convertLitersToGallons(inputValue);
                System.out.println(inputValue + " liters = " + result + " gallons");
                break;

            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 6.");
        }
    }
}





