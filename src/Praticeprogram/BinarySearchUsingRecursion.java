package Praticeprogram;

public class BinarySearchUsingRecursion {
	static int binarySearch(int arr[], int low, int high, int key) {
		if (high >= low) {
			int mid = low + (high - low) / 2;
		
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binarySearch(arr, low, mid - 1, key);
			} else {
				return binarySearch(arr, mid + 1, high, key);
			}
	}
		
		return -1;

	}

	public static void main(String[] args) {
		BinarySearchUsingRecursion obj=new BinarySearchUsingRecursion();
		int arr[]= {1,2,5,7,8};
		int length=arr.length;
		int key=7;
		int result=obj.binarySearch(arr, 0, length-1,key);
		if(result==-1) {
			System.out.println("element is not present in the array");
		}
		else {
			System.out.println("element is present in the index "+result );
		}
	}
}
