import java.util.Scanner;
public class MDA{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Taking user input
		System.out.print("Enter the number of rows : ");
		int r = input.nextInt();
		System.out.print("Enter the number of columns : ");
		int c = input.nextInt();
		
		//Declaring array
		int[][] matrix = new int[r][c];
		int[] array = new int[r*c];
		int index = 0;
		
		//Taking input of the elements and performing the multi dimensional arrays
		System.out.println("Enter the matrix elements : ");
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				matrix[i][j] = input.nextInt();
				array[index++] = matrix[i][j];
			}
		}
		
		//Printing output
		System.out.println("1D Array : ");
		for(int n : array){
			System.out.print(n+ " ");
		}
	}
}


		
		
		