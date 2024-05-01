package Praticeprogram;

//public class Factorial {
//public static void main(String[] args) {
//	int no=4,fact =1;
////	for(int i=1;i<=no;i++)  
//	for(int i=no;i>=1;i--) // you can used any one of the for loop
//	{
//		fact=fact*i;
//	}
//	System.out.println(fact);
//}
//}
//

//by creating factorial method
class Factorial{
	public  static void isFactorial(int no) {
				int  fact=1;
		for(int i=1;i<=no;i++) {
			fact=fact*i;
}
		
		System.out.println(  no+"  factorial is " +fact);
		}
	
	public static void main(String[] args) {
		isFactorial(4);
	}
}