import java.util.Arrays;
public class Swap{
	public static void main(String[] args){
		
		//Declaring arrays
		int[] arr = {1,2,3,4,5};
		System.out.println("Before Swapping : " +Arrays.toString(arr));
		
		//Performing Swap
		int temp = arr[1];
		arr[1] = arr[3];
		arr[3] = temp;
		
		//Printing output
		System.out.println("After Swapping : " +Arrays.toString(arr));
	}
}


		