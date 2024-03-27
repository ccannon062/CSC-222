
public class Main {
	public static void main(String[] args) {
        // Create instances of Circle, Rectangle, and Triangle
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);
        Shape triangle = new Triangle(5.0, 3.0);

        // Display the area of each shape using the display() method
        circle.display();
        rectangle.display();
        triangle.display();
    }
}
