public class Dolphin extends Animal implements Swimmable {
	String bottleNoseType;
	
	public Dolphin(String name, int age, String bottleNoseType) {
		super(name, age);
		this.bottleNoseType = bottleNoseType;
	}
	
	@Override
	public void speak() {
		System.out.println("Dolphin clicks");
	}
	
	
	public void swim() {
		System.out.println("Dolphin swims gracefully");
	}
	
}
