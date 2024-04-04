import java.util.ArrayList;

public class Box implements Storage<String>{
	
	int size;
	
	ArrayList<String> box = new ArrayList<>();
	
	public Box(int size) {
		this.size = size;
	}

	@Override
	public void store(String item) {
		if(box.size() <= size - 1) {
			box.add(item);
		}
		else {
			System.out.println("Box is full. Cannot store more items.");
		}
	}

	@Override
	public String retrieve() {
		return box.remove(box.size() - 1);	
	}
	
}
