
public class Bird extends Animal {
	
	double wingSpan;
	
	public Bird(String name, double wingSpan) {
		super(name);
		this.wingSpan = wingSpan;
	}
	
	@Override
	public String makeSound() {
		return "Chirp chirp";
	}
	
	public String toString() {
		return "Bird {name ='" + getName() + "', wingSpan='" + wingSpan + "'}";
	}
}
