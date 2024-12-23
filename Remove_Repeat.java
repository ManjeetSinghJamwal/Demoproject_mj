package basic;

public class Remove_Repeat {
	public static void main(String[] args) {
		int n[] = { 1,2,3,4,5,1,2,3,4,5 };
		int rev[];
		for (int i = 0; i < n.length - 1; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] == n[j]) {
					n[i] = -1;

				}

			}
			if (n[i] != -1) {
				System.out.println(n[i]);
			}
		}
	}
}