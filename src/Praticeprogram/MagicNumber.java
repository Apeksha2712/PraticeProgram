package Praticeprogram;

import java.util.Scanner;
//using method
//public class MagicNumber {
//	public static boolean ismagic(int num) {
//		int sum = 0;
//
//		while (num > 9) {
//			while (num > 0) {
//				int rem = num % 10;
//				sum = sum + rem;
//				num = num / 10;
//			}
//			num = sum;
//			sum = 0;
//		}
//		return num == 1;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter no:");
//		int num = sc.nextInt();
//		int copy = num;
//
//		if (ismagic(num)) {
//			System.out.println(copy + " is magic number");
//		} else {
//			System.out.println(copy + " is not  magic number");
//		}
//	}

//
//solution 2
class MagicNumber{
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		int sum=0;
		int copy=num;
		while(num>9) {
			while(num>0) {
				int rem=num%10;
				sum=sum+rem;
				num=num/10;
			}
			num=sum;
			sum=0;			
		}
		if(num==1) {
			System.out.println(copy+" is magic number");
		}
		else {
			System.out.println(copy+" is not  magic number");
		}
	}
}
