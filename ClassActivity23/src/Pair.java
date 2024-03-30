
public class Pair<T1, T2> {
	private T1 x;
	private T2 y;
	
	public Pair(T1 x, T2 y) {
		this.x= x;
		this.y = y;
	}
	
	T1 getFirst() {
		return x;
	}
	
	T2 getSecond() {
		return y;
	}
}
