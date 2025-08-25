import java.util.Arrays;
import java.util.Scanner;
public class Football {

    public static void main(String[] args) {
        int[] heights = new int[11];
        Scanner input = new Scanner(System.in);

        //User input
        System.out.println("Enter the heights (in cm) of 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + ": ");
            heights[i] = input.nextInt();
        }

        //Print results
        System.out.println("\n");
        System.out.println("Shortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
	
	//Method to find shortest
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int heights : arr) {
            if (heights < min) min = heights;
        }
        return min;
    }
	
	//Method to find tallest
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int heights : arr) {
            if (heights > max) max = heights;
        }
        return max;
    }
	
	//Method to find sum for mean 
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int heights : arr) {
            sum += heights;
        }
        return sum;
    }
	
	//Method to find mean
    public static int findMean(int[] arr) {
        return findSum(arr) / arr.length;
    }
}

