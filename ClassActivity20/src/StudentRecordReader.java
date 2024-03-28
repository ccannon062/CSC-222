import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StudentRecordReader {
	public void readFile(String filename) {
		File file = new File(filename);
		
	
	try (Scanner scanner = new Scanner(file)) {
		while(scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] parts = line.split(",");
			
			if(parts.length == 2) {
				String name = parts[0].trim();
				String gpa = parts[1].trim();
				System.out.printf("Student: %s, GPA: %s\n", name, gpa);
			}
			else {
				System.out.println("Warning: Invalid record format -> " + line);
				}
			}
		}
	catch (FileNotFoundException e) {
		System.out.println("Error: " + filename + " not found. Please ensure the file is in the correct directory.");
		}
	}
}
