
public class Triangle implements Shape {
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double area() {
		double area = 0.5 * base * height;
		return area;
	}
	
	public void display() {
		System.out.printf("Triangle with base %.2f and height %.2f has an area of %.2f.\n", base, height, area());
	}
}
