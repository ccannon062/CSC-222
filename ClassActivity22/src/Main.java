
public class Main {
	public static void main(String[] args) {
		System.out.println("String is palindrome: " + isPalindrome("A man, a plan, a canal, panama"));
		System.out.println("String is palindrome: " + isPalindrome("Was it a car or a cat I saw?"));
		System.out.println("String is palindrome: " + isPalindrome("I am learning java."));
	}
	
	public static Boolean isPalindrome(String s) {
		return checkPalindrome(s, 0, s.length() -1);
	}
	
	private static Boolean checkPalindrome(String s, int left, int right) {
		while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
			left ++;
		}
		while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
			right --;
		}
		
		if (left >= right) {
			return true;
		}
		
		if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
			return false;
		}
		
		return checkPalindrome(s, left + 1, right -1);
	}
}
