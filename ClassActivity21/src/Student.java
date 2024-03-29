
public class Student {
	
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name =  name;
		this.age = age;
	}
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		age = newAge;
	}
	
	@Override
	public String toString() {
		return "Name: "+ name + "\n" + "Age:" + age;
	}
	
}
