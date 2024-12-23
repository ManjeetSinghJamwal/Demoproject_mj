package basic;

public class String_exam {
public static void main(String[] args) {
	String s="manjeetsingh";

for(int i=0;i<s.length();i++ ) {
	  char c=s.charAt(i);
	  System.out.println(c);
  }
	
	String []sa=s.split("s");
	
	System.out.println(sa[0]);
	System.out.println("s"+sa[1]);
	
}
}
https://authdev.saddlepointtech.com/login