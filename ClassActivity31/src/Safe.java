import java.util.ArrayList;


public class Safe implements Storage<Integer>{
	
	int size;
	
	ArrayList<Integer> deposit = new ArrayList<>();
	
	public Safe(int size) {
		this.size = size;
	}

	@Override
	public void store(Integer item) {
		if (deposit.size() <= size - 1) {
			deposit.add(item);
		}
		else {
			System.out.println("Safe is full. Cannot store more items.");
		}
	}

	@Override
	public Integer retrieve() {
		return deposit.remove(deposit.size() - 1);	
	}

}
