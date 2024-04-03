
public class Main {
	public static void main(String[] args) {
        // Create a Pair object for a student's name and grade
        Pair<String, Integer> studentGrade = new Pair<>("John Doe", 90);
        System.out.println(studentGrade);

        // Create another Pair object for a product's name and price
        Pair<String, Double> productPrice = new Pair<>("Milk", 2.99);
        System.out.println(productPrice);
    }
}
