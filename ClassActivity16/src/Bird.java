
public class Bird extends Animal {
	boolean canFly;
	
	public Bird(String name, int age, boolean canFly) {
		super(name,age);
		this.canFly = canFly;
	}
	
	@Override
	public void display() {
		super.display();
		System.out.println("Can fly: " + this.canFly);
	}
}
