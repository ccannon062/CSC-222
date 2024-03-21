
public class Person {
	private String name;
	private int age;
	private String email;
	
	public Person () {
		this("Unknown", 0 ,"unknown@email.com");
	}
	
	public Person(String name) {
		this(name, 0 ,"unknown@email.com");
	}
	
	public Person(String name, int age) {
		this(name, age, "unknown@email.com");
	}
	
	public Person(String name, int age, String email) {
		this.name =  name;
		this.age = age;
		this.email = email;
	}
	
	void displayPersonDetails () {
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
	}
}
