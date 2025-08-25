import java.util.Scanner;
public class NaturalNumbers {
	public static int recursiveSum(int n) {
		
		//Recursive method to find the sum
        if (n == 1) {
            return 1;
        } else {
            return n + recursiveSum(n - 1);
        }
    }

    //Formula method to find sum
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();
        if (n < 1) {
            System.out.println("Please enter a natural number.");
            return;
        }

        //Get results from both the methods
        int SumRecursive = recursiveSum(n);
        int SumFormula = formulaSum(n);

        // Display results
        System.out.println("Sum using recursion : " + SumRecursive);
        System.out.println("Sum using formula : " + SumFormula);

        // Compare and show if both are equal
        if (SumRecursive == SumFormula) {
            System.out.println("Both results are equal.");
        } else {
            System.out.println("Results do not match.");
        }
    }
}

