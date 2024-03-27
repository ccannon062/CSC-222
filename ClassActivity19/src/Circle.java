
public class Circle implements Shape {
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;	
		}
	
	public double area() {
		double area = Math.PI * radius * radius;
		return area;
	}
	
	public void display() {
		System.out.printf("Circle with radius %.2f has an area of %.2f.\n", radius, area());
	}
}
