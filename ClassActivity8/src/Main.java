
public class Main {

	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 3, 7, 1, 1, 5};
		System.out.print("Original Array: [");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n");
		
		int[] countedElements = new int[arr.length];
		
		int countedIndex = 0;
		
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			boolean alreadyCounted = false;
			for (int j = 0; j < countedIndex; j++) {
				if (arr[i] == countedElements[j]) {
					alreadyCounted = true;
					break;
				}
			}
			if (alreadyCounted) {
				continue;
			}
			
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			countedElements[countedIndex++] = arr[i];
			System.out.println(arr[i] + " occurs " + count + (count > 1 ? " times " : " time "));
		}
		
	}
	
}
