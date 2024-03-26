public class Lion extends Animal {
	double maneLength;
	
	public Lion(String name, int age, double maneLength) {
		super(name, age);
		this.maneLength = maneLength;
	}
	
	@Override
	public void speak() {
		System.out.println("Lion roars");
	}
}
