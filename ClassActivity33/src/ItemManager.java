import java.util.ArrayList;
import java.util.Iterator;

public class ItemManager {
	private ArrayList<Item> items;
	
	public ItemManager() {
		items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItemById (int id) {
		
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			if(item.getId() == id) {
				iterator.remove();
				break;
			}
		}
	}
	
	public void displayItems() {
		
		Iterator<Item> iterator = items.iterator();
		while(iterator.hasNext()) {
			Item item = iterator.next();
			
			System.out.println("Item ID: " + item.getId() + ", Name: " + item.getName());
		}
	}
}
