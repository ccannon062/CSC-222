
public interface Storage<T> {
	
	void store(T item);
	
	T retrieve();
}
