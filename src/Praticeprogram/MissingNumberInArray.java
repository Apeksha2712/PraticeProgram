package Praticeprogram;




//solution 1
//public class MissingNumberInArray {
//public static void main(String[] args) {
//	int a[]= {1,2,4,5,3,6,7,8,9};
//	int sum1=0;
//	for(int i=0;i<a.length;i++) {
//		sum1=sum1+a[i];
//	}
//	System.out.println(sum1);
//	
//	int sum2=0;
//	for(int i=1;i<=10;i++) {
//		sum2=sum2+i;
//	}
//	System.out.println(sum2);
//	int missElement;
//	missElement=sum2-sum1;
//	System.out.println("the missing element is array is "+missElement);
//	
//}
//}

//solution 2

//class MissingNumberInArray{
//	public static void main(String[] args) {
//		 int a[]= {1,5,7,4,3,2};
//		 int n=a.length+1;
//		 int sum=(n*(n+1))/2;
//		 
//		 for(int i=0;i<a.length;i++) {
//			 sum=sum-a[i];
//			 
//		 }
//		 System.out.println(sum);
//	}
//}

//solution 3
class MissingNumberInArray{
	static int getMissingNo(int arr[],int n) {
		int sum1=0;
		for(int i=0;i<n-1;i++) {
			sum1=sum1+arr[i];
		}
		int sum2=n*(n+1)/2;
		int diff=sum2-sum1;
		return diff ;
	}
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,5};
		int n=arr.length;
		
		
		System.out.println("missing no is "+ getMissingNo(arr, n));
	}
}