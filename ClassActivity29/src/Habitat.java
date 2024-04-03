
public class Habitat<T extends Animal> {
	
	private java.util.List<T> animals = new java.util.ArrayList<>();
	
	
	public void addAnimal(T animal) {
		animals.add(animal);
	}
	
	public void printAnimals() {
		for(T animal: animals) {
			System.out.print(animal.toString() + " says" + animal.makeSound());
		}
	}

}
