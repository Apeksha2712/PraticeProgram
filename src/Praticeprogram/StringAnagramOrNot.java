package Praticeprogram;

import java.util.Arrays;

public class StringAnagramOrNot {
public static void  isAnagram(String str1,String str2) {

	boolean status=true;
	if(str1.length() != str2.length()) {
		status=false;

	}
	else {
		char ch1[]=str1.toLowerCase().toCharArray();
		char ch2[]=str2.toLowerCase().toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		 status=Arrays.equals(ch1,ch2);
			}
	if(status) {
		System.out.println(str1 +" and "+ str2 +" are anagram");
			}
	else {
	      System.out.println(str1 +" and "+ str2 +" are not anagram");
	}
}
public static void main(String[] args) {
	isAnagram("Listen", "slienk");
	
}
}
