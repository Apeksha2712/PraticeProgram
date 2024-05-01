package PatternProgram;

//public class Pattern1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		for (int i = 1; i <= 4; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//
//}

//output

//*
//**
//***
//****




//reverse Pattern
//class Pattern1{
//	 public static void main(String[] args) {
//		 for(int i=1;i<=4;i++) {         //--->first loop always for row 
//			 for(int j=4;j>=i;j--) {     //---->second loop always for column and this loop is depend on row.
//				 System.out.print("*");
//			 }
//			 System.out.println();
//		 }
//	 }
//}

//output

//****
//***
//**
//*

//---------------------------------------------------------------------------------------------

//Result 

//****
//****
//****
//****

class Pattern1{
	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {  //-->first loop always for row 
			for(int j=1;j<=4;j++) {   //--->iif j is not depend on i then it will print like this ****
				System.out.print("*");                            //                              **** 
			}                                                     //                              ****			  
			System.out.println();                                 //                              ****
			 }
	}
	
}
