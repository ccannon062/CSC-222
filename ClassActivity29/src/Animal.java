
public abstract class Animal {
	
	String name;
	
	public Animal(String name) {
		this.name  = name;	
		}
	
	public abstract String makeSound();
	
	String getName() {
		return name;
	}
}
