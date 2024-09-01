import java.util.*;

public class BasicStrings {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		char arr[] = { 'a', 'b', 'c', 'd' };
		String str1 = "abcd";
		String str2 = new String("xyz");

		// Strings are immutable in java

		String name;
		System.out.print("Enter String : ");
		name = sc.nextLine();
		System.out.println(name);
	}
}
