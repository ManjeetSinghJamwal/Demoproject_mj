package basic;

public class Int_Add {
	public static void main(String[] args) {
		int i=455887;
		int r =0;
		int sum=0;
		while(i>0) {
			r=i%1000;
			sum=r+sum;
			i=i/1000;
		}
		System.out.println(sum);
	}

}
