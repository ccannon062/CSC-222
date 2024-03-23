
public class Main {

	public static void main(String[] args) {
		// Declare an array of integers with a size of 10
        int[] myArray = new int[10];
        
        // Use ArrayOperations to populate and process the array
        ArrayOperations.populateArray(myArray);
        ArrayOperations.printArray(myArray);
        
        int sum = ArrayOperations.calculateSum(myArray);
        double average = ArrayOperations.calculateAverage(sum, myArray.length);
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
	}

}
