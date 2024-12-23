package string;

public class Palindrome {
	public static void main(String[] args) {
		String s = "abcdedcba";
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j)) {
				System.out.println("Not_Palindrome");

			} else {
				System.out.println("Palindrome");
			}
			i++;
			j--;
		}

	}
}
