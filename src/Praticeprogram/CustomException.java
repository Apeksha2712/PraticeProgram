package Praticeprogram;
//custom Exception
public class CustomException{
public static void main(String[] args) {
	
	try {		
	vote(12);
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
	 static void vote(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("not eligible for vote");
		}
		else {
			System.out.println("eligible for vote");
		}
	}
}
class InvalidAgeException extends Exception{
	InvalidAgeException(String msg){
		System.out.println(msg);
	}
}

