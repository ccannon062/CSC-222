
public class Rectangle extends Shape {
	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length= length;
		this.width = width;
	}
	
	@Override
	public double area() {
		double area = length * width;
		return area;
	}
	
	@Override
	public double perimeter() {
		double perimeter = 2 * length + 2 * width;
		return perimeter;
	}
}
