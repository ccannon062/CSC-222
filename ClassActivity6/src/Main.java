import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		System.out.print("Please enter your score: ");
		try (Scanner score = new Scanner(System.in)) {
			int awnser = score.nextInt();
			
			GradeCalculator obj1 = new GradeCalculator();
			
			obj1.calculate(awnser);
		}
		
	}
	
}
