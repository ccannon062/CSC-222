
public class Reptile extends Animal {
	boolean isVenomous;
	
	public Reptile(String name, int age, boolean isVenomous) {
		super(name, age);
		this.isVenomous = isVenomous;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Is venomous: " + this.isVenomous);
	}
}
