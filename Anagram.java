package string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		if (c1.length != c2.length) {
			System.out.println("Not Anagram");
		}
		Arrays.sort(c1);
		Arrays.sort(c2);
		int i = 0;
		if (c1[i] != c2[i]) {
			System.out.println("Not Anagram");
		}
		System.out.println("Anagram");
	}

}
