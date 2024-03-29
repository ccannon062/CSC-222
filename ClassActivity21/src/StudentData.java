import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class StudentData {
	private ArrayList<Student> students = new ArrayList<>();
	
	public void readFromFile(String filename) {
		try {
			Scanner scanner = new Scanner(new File(filename));
			
			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				
				String[] parts = line.split(",");
				String name = parts[0].trim();
				int age = Integer.parseInt(parts[1].trim());
				
				Student student = new Student(name, age);
				students.add(student);
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File: " + filename + " not found.");
			}
		}
	
	public void displayAllStudents() {
		for (Student student : students) {
			System.out.println(student);
			}
		}
	}
