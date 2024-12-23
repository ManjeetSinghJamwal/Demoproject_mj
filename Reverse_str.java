package string;

public class Reverse_str {
	public static void main(String[] args) {
	String s="Manjeet";
	String rs="";
	char ch;
	for(int i=0;i<=s.length()-1;i++) {
		ch=s.charAt(i);
		//System.out.println(ch);
		rs=ch+rs;
		}
	System.out.println("Normal string :"+s);
	System.out.println("Reverse string :"+rs);
	}

}
