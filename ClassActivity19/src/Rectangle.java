
public class Rectangle implements Shape {
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		double area = length * width;
		return area;
	}
	
	public void display() {
		System.out.printf("Rectangle has length of %.2f and width of %.2f with area of %.2f.\n",length,width,area());
	}
}
