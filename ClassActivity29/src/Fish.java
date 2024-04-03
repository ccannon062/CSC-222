
public class Fish extends Animal {
	
	String waterType;
	
	public Fish(String name, String waterType) {
		super(name);
		this.waterType = waterType;
		}
	
	@Override
	public String makeSound() {
		return "Blub blub";
		}
	
	public String toString() {
		return "Fish {name ='" + getName() + "', waterType='" + waterType + "'}";
		}
	}
