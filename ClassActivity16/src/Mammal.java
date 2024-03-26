
public class Mammal extends Animal {
	boolean isHerbivore;
	
	public Mammal(String name, int age, boolean isHerbivore) {
		super(name, age);
		this.isHerbivore = isHerbivore;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Is Herbivore: " + this.isHerbivore);
	}
}
