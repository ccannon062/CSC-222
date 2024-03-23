public class SimpleCircle {
	double radius;
	
	public SimpleCircle() {
		this.radius = 1;
	}
	
	public SimpleCircle(double newRadius) {
		this.radius = newRadius;
	}
	
	double getArea() {
		return Math.PI * radius * radius;
	}
	
	double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	void setRadius(double newRadius) {
		radius = newRadius;
	}
}
