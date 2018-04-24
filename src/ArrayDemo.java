
/**
 * 
 * @author amit
 *
 */
public class ArrayDemo {
/*
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[] = {10,20,30,40,50};
		int []y = {10,20,30,40,50};
		int z[] = new int[5];
		int a[] = new int[] {10,20,30,40,50};
//		for(int i = 0; i<x.length; i++) {
//			System.out.println(x[i]);
//		}
		boolean d = false;
		if(d=true) {
			
		}
		// Enhance for Loop Java 1.5
		for(int b : x) {
			System.out.println(b);
		}
		int arr[][] = new int[3][];
		arr[0] = new int[10];
		arr[1] = new int[20];
		arr[2] = new int[30];
		for(int n[]:arr) {
			for(int m:n) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		
		//int [][]arr1  = new int[3][3];
		//int []arr2[] = new int[3][3];
//		for(int i = 0 ; i<arr.length;i++) {
//			for(int j = 0;j<arr[i].length; j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}

	}

}
