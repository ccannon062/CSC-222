import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private final List<Animal> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void displayAnimals() {
        for (Animal animal : animals) {
            animal.display();
            System.out.println();
        }
    }
}
