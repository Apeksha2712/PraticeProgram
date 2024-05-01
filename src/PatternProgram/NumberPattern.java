package PatternProgram;

//
//public class NumberPattern {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//for(int i=1;i<=4;i++) { //for Row[forloop always start from  row]
//	for(int j=1;j<=i;j++) {//for column [for loops always depends on row]
//		System.out.print(i);
//	}
//	System.out.println();                         //output
//}                                                 //1
//	}                                               //22
//}                                                 //333
//                                                  //4444
//-------------------------------------------------------------------------------------------------------

//Result

//1
//12
//123
//1234

class NumberPattern {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
