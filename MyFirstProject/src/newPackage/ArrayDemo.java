package newPackage;

public class ArrayDemo {

	static void display(int arr1[]) {
		for(int i : arr1) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		/**
		 * syntax for single dimensional array
		 * datatype[] array_name = new datatype[size];
		 */

		int[] arr = {5,10,15,20,25};
		
		display(arr);
		//arr = new int[10];
		
		//populate the array
//		for(int i = 0; i < 10; i++) {
//			arr[i] = i * 5;
//		}
		
		//print the contents
//		for(int i = 0; i<10; i++) {
//			System.out.println(arr[i]);
//		}
		
//		for(int i = 0; i< arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//System.out.println("Extended For");
		
		
		
	}

}
