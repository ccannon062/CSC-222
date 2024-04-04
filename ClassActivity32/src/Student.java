
public class Student implements Comparable<Student> {
	
	private int id;
	private String name;
	private double gpa;
	
	public Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public int getID() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public double getGPA() {
		return gpa;
	}
	
	public int compareTo(Student x) {
		
		int gpaComparison = Double.compare(this.gpa,  x.gpa);
		
		if (gpaComparison != 0) {
			return gpaComparison;
		}
		
		return this.name.compareTo(x.name);
	}
	
	@Override
	public String toString() {
		return "Student{id=" + id + ", name'" + name + "', gpa=" +gpa + "}";
	}

}
