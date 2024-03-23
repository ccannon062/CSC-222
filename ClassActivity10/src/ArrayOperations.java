import java.util.*;

public class ArrayOperations {
	
	static int[] populateArray(int[] arr) {
		Random rand = new Random();
		for (int  i = 0; i < arr.length; i++) {
			int randomnum = rand.nextInt(100);
			arr[i] = randomnum;
		}
		return arr;
	}
	
	static void printArray(int[] arr) {
		System.out.print("[");
		for(int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i]);
			if(i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n");
	}
	
	static int calculateSum(int[] arr) {
		int totalcount = 0;
		for(int i = 0; i < arr.length; i ++) {
			totalcount += arr[i];
		}
		return totalcount;
	}
	
	static double calculateAverage(int sum, int length) {
		return sum / length;
	}
}
