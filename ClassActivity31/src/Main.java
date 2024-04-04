
public class Main {
	public static void main(String[] args) {
        // Create a Box with a capacity of 3.
        Box box = new Box(3);
        box.store("Book");
        box.store("Pen");
        box.store("Notebook");
        // Try to store one more item than the capacity allows.
        box.store("Pencil"); // Should print error message.

        // Retrieve items from the Box.
        System.out.println(box.retrieve()); // Should print "Notebook".
        System.out.println(box.retrieve()); // Should print "Pen".

        // Create a Safe with a capacity of 2.
        Safe safe = new Safe(2);
        safe.store(100);
        safe.store(200);
        // Try to store one more item than the capacity allows.
        safe.store(300); // Should print error message.

        // Retrieve items from the Safe.
        System.out.println(safe.retrieve()); // Should print 200.
        System.out.println(safe.retrieve()); // Should print 100.
    }
}
