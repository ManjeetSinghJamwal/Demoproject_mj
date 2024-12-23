package string;

public class InsertAnother {
	public static void main(String[] args) {
		String str = "manjeet singh";
		char arr[] = str.toCharArray();
		int size = arr.length;
		char a[] = new char[size];
		int i = 0;
		while (i != size) {
			a[i] = arr[i];
			i++;
		}
		String s = new String(a);
		System.out.println(str);
		System.out.println(a);

	}

}
