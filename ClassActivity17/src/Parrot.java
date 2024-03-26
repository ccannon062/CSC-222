public class Parrot extends Animal {
	String featherColor;
	
	public Parrot(String name, int age, String featherColor) {
		super(name, age);
		this.featherColor = featherColor;
	}
	
	
	@Override
	public void speak() {
		System.out.println("Parrot speaks");
	}
}
