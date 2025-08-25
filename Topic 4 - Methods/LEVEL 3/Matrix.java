import java.util.Random;
public class Matrix {

    public static void main(String[] args) {
        int[][] A = generateMatrix(2, 2); // You can change to 3x3 if needed
        int[][] B = generateMatrix(2, 2);

        System.out.println("Matrix A:");
        printMatrix(A);

        System.out.println("Matrix B:");
        printMatrix(B);

        System.out.println("Addition:");
        printMatrix(addMatrices(A, B));

        System.out.println("Subtraction:");
        printMatrix(subtractMatrices(A, B));

        System.out.println("Multiplication:");
        printMatrix(multiplyMatrices(A, B));

        System.out.println("Transpose of A:");
        printMatrix(transposeMatrix(A));

        System.out.println("Determinant of A: " + determinant2x2(A));
        System.out.println("Inverse of A:");
        double[][] inverse = inverse2x2(A);
        printMatrix(inverse);
    }

    // Generate a random matrix
    public static int[][] generateMatrix(int rows, int cols) {
        Random rand = new Random();
        int[][] mat = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                mat[i][j] = rand.nextInt(10); // values from 0-9
        return mat;
    }

    // Addition
    public static int[][] addMatrices(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                res[i][j] = A[i][j] + B[i][j];
        return res;
    }

    // Subtraction
    public static int[][] subtractMatrices(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                res[i][j] = A[i][j] - B[i][j];
        return res;
    }

    // Multiplication
    public static int[][] multiplyMatrices(int[][] A, int[][] B) {
        int[][] res = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < B[0].length; j++)
                for (int k = 0; k < B.length; k++)
                    res[i][j] += A[i][k] * B[k][j];
        return res;
    }

    // Transpose
    public static int[][] transposeMatrix(int[][] A) {
        int[][] res = new int[A[0].length][A.length];
        for (int i = 0; i < A.length; i++)
            for (int j = 0; j < A[0].length; j++)
                res[j][i] = A[i][j];
        return res;
    }

    // Determinant for 2x2
    public static int determinant2x2(int[][] A) {
        return A[0][0] * A[1][1] - A[0][1] * A[1][0];
    }

    // Inverse for 2x2
    public static double[][] inverse2x2(int[][] A) {
        int det = determinant2x2(A);
        if (det == 0) {
            System.out.println("Matrix is not invertible.");
            return new double[][]{{0, 0}, {0, 0}};
        }

        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1] / (double) det;
        inv[0][1] = -A[0][1] / (double) det;
        inv[1][0] = -A[1][0] / (double) det;
        inv[1][1] = A[0][0] / (double) det;

        return inv;
    }

    // Print int matrix
    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row)
                System.out.print(val + "\t");
            System.out.println();
        }
    }

    // Print double matrix
    public static void printMatrix(double[][] mat) {
        for (double[] row : mat) {
            for (double val : row)
                System.out.printf("%.2f\t", val);
            System.out.println();
        }
    }
}
