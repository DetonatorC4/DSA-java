import java.util.*;

public class Palindrome {

	public static boolean isPalindrome(String str) {
		int n = str.length();

		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(n - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String str = "racecar";

		if (isPalindrome(str)) {
			System.out.println("The string is a palindrome");
		} else {
			System.out.println("The string is not a palindrome");
		}
	}
}
