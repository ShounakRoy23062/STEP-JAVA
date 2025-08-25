import java.util.Arrays;
public class RandomStats {

    // Method to generate 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            // Generate random number between 1000 and 9999
            numbers[i] = (int)(Math.random() * 9000) + 1000;
        }
        return numbers;
    }

    // Method to find average, min, and max
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int[] randomNumbers = generate4DigitRandomArray(5);

        // Print the random numbers
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));

        double[] result = findAverageMinMax(randomNumbers);

        System.out.printf("Average: %.2f\n", result[0]);
        System.out.printf("Minimum: %.0f\n", result[1]);
        System.out.printf("Maximum: %.0f\n", result[2]);
    }
}


