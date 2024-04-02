
public class Main {
	public static void main(String[] args) {
        Box<Double> box = new Box<>();
        box.setValue(9.75);
        System.out.println("Box Value: " + box.getValue());
    }
}
