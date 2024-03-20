
public class Main {

	public static void main(String[] args) {
		int[] lista = {5, 4, 8, 7, 15, 12, 14, 9};
		
		/* Printing original list*/
		
		System.out.print("Original Array: [");
		for (int i = 0; i < lista.length; i++) {
			while (i < 7) {
				System.out.print(lista[i] + ", ");
				i++;
				}
			System.out.print(lista[i]);
			}
		System.out.print("]\n");
		
		/* Sort array */
		
		for (int i = 0; i < lista.length - 1; i++) {
			for (int j = 0; j < lista.length - i - 1; j++) {
				if (lista[j] > lista[j + 1]) {
					int temp = lista[j];
					lista[j] = lista[j + 1];
					lista[j + 1] = temp;
				}
			}
		}
		
		System.out.print("Sorted Array: [");
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i]);
			if (i < lista.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.print("]\n");
		
		/* Sum of array*/
		
		int sum = 0;
		for (int i = 0; i < lista.length; i++) {
			sum += lista[i];
		}
		
		/* Average */
		
		int average = sum / lista.length;
		
		System.out.println("Sum of array elements: " + sum);
		System.out.println("Average: " + average);
		
		for(int i = 0; i < lista.length; i++) {
			if (lista[i] == 12) {
				System.out.println("Value " + lista[i] + " found at index " + i);
			}
		}
		
	}
}
