import java.util.Arrays;
public class SwapWithoutTemp{
	public static void main(String[] args){
		
		//Declaring array
		int[] arr = {14,67,34,17,54};
		
		//Taking user input
		System.out.println("Before Swapping : " +Arrays.toString(arr));
		
		//Performing Swap
		int i = 1, j = 3;
		arr[i] = arr[i] + arr[j]; //arr[1] = arr[1] + arr[3] = 67 + 17 = 84
		arr[j] = arr[i] - arr[j]; //arr[3] = arr[1] - arr[3] = 84 - 17 = 67
		arr[i] = arr[i] - arr[j]; //arr[1] = arr[1] - arr[3] = 84 - 67 = 17
		
		//Printing output
		System.out.println("After Swapping : " +Arrays.toString(arr));
	}
}



		
		