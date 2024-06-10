
public class MultidimensionalArray {

	public static void main(String[] args) {
		/*
		 * int[][] arr = { { 1, 2 }, { 3, 4 }, { 5, 6, 7 } };
		 * System.out.print(arr[0][0]); System.out.print("\t");
		 * System.out.println(arr[0][1]); System.out.print(arr[1][0]);
		 * System.out.print("\t"); System.out.println(arr[1][1]);
		 * System.out.print(arr[2][0]); System.out.print("\t");
		 * System.out.print(arr[2][1]); System.out.print("\t");
		 * System.out.print(arr[2][2]);
		 */

		int[] arr2 = { 110, 199, 201, 301, 401, 501, 505, 600 };
		// arr3 = {{110,199},{201},{301},{401},{501,505},{600}}
		// arr3 = {{0},{201},{301},{401},{501,505},{600}}
		int[][] arr3 = new int[6][6];

		for (int i = 0; i < arr2.length; i++) {
			int firstIndex = arr2[i] / 100; // 1
			int secondIndex = 1;
			if(!(firstIndex==i+1)) {
				arr3[i] = new int[secondIndex];
			} else {
				for (int j = 0; j < arr2.length; j++) {
					int temp = arr2[j] / 100;
					if (temp == firstIndex) {
						secondIndex = secondIndex + 1;
					}
				}
				arr3[0] = new int[secondIndex];
			}
		}
		
		for(int k=0;k<(arr2.length-1);k++) {
			int firstIndex = arr2[k] / 100;
			if (!(firstIndex==k+1)) {
				continue;
			} else {
				// arr3[firstIndex][secondIndex] = arr2[k];
			}			
		}
	}
}