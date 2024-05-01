package Praticeprogram;

public class FactorialUsingRecursion {

	static int fact = 1;

	void isFactorial(int no) {
		if (no >= 1) {
			fact = fact * no;
			isFactorial(no - 1);
		}
	}

	public static void main(String[] args) {
		int no = 5;
		FactorialUsingRecursion obj = new FactorialUsingRecursion();
		obj.isFactorial(no);
		System.out.println("factorial  of " + no + " is " + fact);
	}

}
