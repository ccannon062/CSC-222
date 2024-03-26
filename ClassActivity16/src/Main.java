
public class Main {
	public static void main(String[] args) {
        Zoo myZoo = new Zoo();

        Lion lion = new Lion("Leo", 5, false);
        Eagle eagle = new Eagle("Eddie", 3, true);
        Snake snake = new Snake("Sly", 2, true);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(eagle);
        myZoo.addAnimal(snake);

        myZoo.displayAnimals();
    }
}
