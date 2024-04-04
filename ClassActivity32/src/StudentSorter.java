import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

public class StudentSorter {
	
	public List<Student> sortStudents(List<Student> students) {
		
		List<Student> sortedStudents = new ArrayList<>(students);
		Collections.sort(sortedStudents);
		return sortedStudents;
	}
}
