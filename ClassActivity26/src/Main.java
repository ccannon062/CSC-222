
public class Main {
	 public static void main(String[] args) {
	        // Create a Point with Integer coordinates.
	        Point<Integer> intPoint = new Point<>(3, 4);
	        // Create a Point with Double coordinates.
	        Point<Double> doublePoint = new Point<>(1.5, 2.5);

	        // Display the distances from the origin.
	        System.out.println("Distance from origin (Integer Point): " + intPoint.distanceFromOrigin());
	        System.out.println("Distance from origin (Double Point): " + doublePoint.distanceFromOrigin());

	        // Display the distance between the two points.
	        System.out.println("Distance between two points: " + Point.distanceBetween(intPoint, doublePoint));
	    }
}