
public class Point<T extends Number> {
	
	T x;
	T y;
	
	Point(T x, T y) {
		this.x = x;
		this.y = y;
	}

	T getX() {
		return x;
	}
	
	T getY() {
		return y;
	}
	
	void setX(T x) {
		this.x = x;
	}
	
	void setY(T y) {
		this.y = y;
	}
	
	public double distanceFromOrigin() {
		return (x.doubleValue() * x.doubleValue() + y.doubleValue() * y.doubleValue());
	}

	public static double distanceBetween(Point<Integer> intPoint, Point<Double> doublePoint) {
		double deltaX = intPoint.getX().doubleValue() - doublePoint.getX().doubleValue();
		double deltaY = intPoint.getY().doubleValue() - doublePoint.getY().doubleValue();
		return Math.sqrt( deltaX * deltaY + deltaY * deltaY);
	}
	
}
