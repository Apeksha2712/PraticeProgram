package Praticeprogram;

public class ReverseString {
public static void main(String[] args) {
	String string="Deepak";
	String revString="";
	for(int i=string.length()-1;i>=0;i--) {
		revString=revString+string.charAt(i);
	}
	System.out.println(revString);
	if(string.equals(revString)) {
		System.out.println("palindrone");
	}
	else {
		System.out.println("not palindone");
	}
}
}
