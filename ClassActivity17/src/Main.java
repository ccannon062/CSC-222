import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Lion("Simba", 5, 12.5));
        animals.add(new Parrot("Polly", 2, "Green"));
        animals.add(new Dolphin("Flipper", 7, "Long"));

        for (Animal animal : animals) {
            animal.speak();
            if (animal instanceof Swimmable) {
                ((Swimmable) animal).swim();
            }
        }
    }
}
