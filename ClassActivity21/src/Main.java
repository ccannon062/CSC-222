
public class Main {
	public static void main(String[] args) {
		// Creating instance of StudentData
		StudentData studentData = new StudentData();
		// Reading student details from file
		studentData.readFromFile("students-1.txt");
		// Displaying student details
		studentData.displayAllStudents();
	}
}
