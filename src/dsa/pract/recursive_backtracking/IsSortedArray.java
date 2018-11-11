package dsa.pract.recursive_backtracking;
/**
 * @author KMEVADA
 *
 */
public class IsSortedArray {

	public static int isSorted(int[] arr,int n){
		if(n == 1){
			return 1;
		}
		return arr[n-1] < arr[n-2]? 0 : isSorted(arr, n-1);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,6,4,5};
		System.out.println(isSorted(arr, arr.length));
	}

}
