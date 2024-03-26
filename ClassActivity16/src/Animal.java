
public class Animal {
	String name;
	int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
}
