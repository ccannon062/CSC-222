
public class ShapeApp {
	public static void main(String[] args) {
        Circle circle = new Circle("Red", 5);
        Rectangle rectangle = new Rectangle("Blue", 10, 5);

        // Display details of Circle
        System.out.println("Circle Details:");
        System.out.println("Color: " + circle.getColor());
        System.out.println("Area: " + circle.area());
        System.out.println("Perimeter: " + circle.perimeter());

        // Change color and display again
        circle.setColor("Green");
        System.out.println("Updated Color: " + circle.getColor());

        System.out.println();

        // Display details of Rectangle
        System.out.println("Rectangle Details:");
        System.out.println("Color: " + rectangle.getColor());
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());

        // Change color and display again
        rectangle.setColor("Yellow");
        System.out.println("Updated Color: " + rectangle.getColor());
    }
}
