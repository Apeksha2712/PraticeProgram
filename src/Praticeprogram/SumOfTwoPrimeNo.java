package Praticeprogram;

import java.util.Scanner;


public class SumOfTwoPrimeNo {
	
public static boolean isPrime(int num) {
	 boolean check=true;
	for(int i=2;i<=num/2;i++) {
		if(num%i==0) {
			check=false;
			break;
		}
	}
	return check;
	
}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter num:");
	int num=sc.nextInt();
	boolean flag=false;
	for(int i=2;i<=num/2;i++) {
		if(isPrime(i)) {
			//num=num-i
			if(isPrime(num-i)) {
				System.out.println(i+"+"+(num-i)+"="+num);
				flag=true;
			}
		}
	}
	if(flag==false) {
		System.out.println(num+" can not be written as sum of two prime no");
	}
}
}
