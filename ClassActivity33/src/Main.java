public class Main {
    public static void main(String[] args) {
        ItemManager manager = new ItemManager();

        // Adding items to the manager.
        manager.addItem(new Item(1, "Item 1"));
        manager.addItem(new Item(2, "Item 2"));
        manager.addItem(new Item(3, "Item 3"));

        // Displaying items before removal.
        System.out.println("Items before removal:");
        manager.displayItems();

        // Removing an item and displaying the list again.
        manager.removeItemById(2);
        System.out.println("\nItems after removing item with ID 2:");
        manager.displayItems();
    }
}
