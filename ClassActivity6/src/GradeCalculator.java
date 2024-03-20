
public class GradeCalculator {
	
	void calculate(int score) {
		if (score >= 90) {
			System.out.println("Your grade is A.");
		}
		else if (score >= 80 && score < 90) {
			System.out.println("Your grade is B.");
		}
		else if (score >= 70 && score < 80) {
			System.out.println("Your grade is C.");
		}
		else if (score >= 60 && score < 70) {
			System.out.println("Your grade is D.");
		}
		else {
			System.out.println("Your grade is F.");
		}
	}
	
}
