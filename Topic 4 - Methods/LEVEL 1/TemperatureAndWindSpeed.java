import java.util.Scanner;
public class TemperatureAndWindSpeed {

    //Method to calculate wind chill based on temperature and wind speed
    public double calculateWindChill(double temperature, double windSpeed) {
        // Formula for calculating wind chill
        double chill = 35.74 + 0.6215 * temperature +
                       (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return chill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter temperature (in Fahrenheit): ");
        double temp = sc.nextDouble();
        System.out.print("Enter wind speed (in mph): ");
        double windSp = sc.nextDouble();

        TemperatureAndWindSpeed wc = new TemperatureAndWindSpeed();
        
        //Calculating and printing wind chill
        double result = wc.calculateWindChill(temp, windSp);
        System.out.printf("Wind chill: %.2f°F\n", result);
    }
}


