
public class DataStructures1 {// BUBBLE SORT ALGORITHM

	public static int[] bubbleSort(int[] a) {
		for (int i = 0; i <= a.length - 2; i++) {// algorithm runs n-1 times where n is the number of items
			for (int j = 0; j < a.length - i - 1; j++) {// algorithm runs up till the end then each extra time it only needs to run one less
				if (a[j] > a[j+1]) {// compare two adjacent items
					int temp = a[j+1];// store one item in the "box"
					a[j+1] = a[j];// replace one item with another
					a[j] = temp;// place the box contents in empty box in array
				}
			}
		}	
		return a;
		// note that each iteration contains 4 operations, one comparison and three assignments
		// also note that the length - i - 1 of the array will be repeated length - 1 times
		// thus, there will be, for n items of input, 4*(n-1,n-2,n-3,...,3,2,1) operations at most
		// this is a quadratic, so bubbleSort has time complexity of O(n^2)
		// more rigurously, since we have a number of operations of the form f(n) = an^2 + bn + k, then
		// there are positive numbers c and n_0 such that 0 <= f(n) <= cn^2 when n > n_0, making this performance
		// be within the classification of O(n^2)
	}
	
	public static void main(String[] args) {
		System.out.println("DEMONSTRATING BUBBLE SORT:");
		int[] a = { 21, 3, 41, 6, 12, 8, 9 };
		int[] b = { 2, 1, 1, 6, 2, 88, 9 };
		int[] c = { 210, 30, 410, 600, 102, 8, 5 };
		int[] d = { 21, 3, 41, 6, 12, 8, 9 };
		int[] e = { 9, 0 };
		int[] f = { 0 };
		int[][] G = {a, b, c, d, e, f};
		for (int k = 0; k < G.length; k++) {
			for (int l = 0; l < G[k].length; l++) {
				System.out.println(bubbleSort(G[k])[l]);
			}
			System.out.println("Finished with array " + k);
		}
	}

}
