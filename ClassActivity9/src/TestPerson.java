
public class TestPerson {
	public static void main(String[] args) {
        // Testing the default constructor
        Person person1 = new Person();
        System.out.println("Person 1 details:");
        person1.displayPersonDetails();
        System.out.println();

        // Testing the constructor that takes only name
        Person person2 = new Person("Alice");
        System.out.println("Person 2 details:");
        person2.displayPersonDetails();
        System.out.println();

        // Testing the constructor that takes name and age
        Person person3 = new Person("Bob", 25);
        System.out.println("Person 3 details:");
        person3.displayPersonDetails();
        System.out.println();

        // Testing the constructor that takes name, age, and email
        Person person4 = new Person("Charlie", 30, "charlie@email.com");
        System.out.println("Person 4 details:");
        person4.displayPersonDetails();
    }
}
