package string;

public class EvenWordDemo {
	public static void main(String[] args) {
		String str="manjeet singh hi yes true false he is";
		for(String s:str.split(" ")) {
			if(s.length()%2==0) {
				System.out.println(s);
			}
		}
	}

}
