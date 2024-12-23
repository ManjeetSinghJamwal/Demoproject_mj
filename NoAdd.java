package basic;

public class NoAdd {
	public static void main(String[] args) {
		int i = 2341;
		int r = 0;
		int sum = 0;

		while (i > 0) {
			r = i % 10;
			// System.out.println(r);
			sum = sum + r;

			i = i / 10;

		}
		System.out.println(sum);
	}
}