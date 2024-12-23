package string;

import java.util.Scanner;

public class New_Line {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String s = sc.nextLine();
		int l = s.length();
		String res = "";
		for (int i = 0; i < l; i++) {
			char c = s.charAt(i);
			if (c != l) {
				res = res + c;

			}
			// System.out.println(c);

		}
		System.out.println(res);
	}

}
