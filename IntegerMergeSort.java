package assignment6ms;

public class IntegerMergeSort {
	public static void mergeSort(int[] A, int lowerBound, int upperBound) {
		if(lowerBound >= upperBound)
			return;
		int mid = (lowerBound + upperBound) / 2;
		mergeSort(A, lowerBound, mid);
		mergeSort(A, mid + 1, upperBound);
		merge(A, lowerBound, mid, upperBound);
	}
	
	public static void merge(int[] A, int lowerBound, int midPoint, int upperBound) {
		int n1 = midPoint - lowerBound + 1;
		int n2 = upperBound - midPoint;
		int B[] = new int[n1], C[] = new int[n2];
		for(int i = 0; i < n1; i++)
			B[i] = A[lowerBound + i];
		for(int i = 0; i < n2; i++)
			C[i] = A[midPoint + i + 1];
		
		int i = 0, j = 0, k = lowerBound;
		while(i < n1 && j < n2) {
			if(B[i] <= C[j]) {
				A[k] = B[i];
				i++;
			}
			else {
				A[k] = C[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) {
			A[k] = B[i];
			i++;
			k++;
		}
		while(j < n2) {
			A[k] = C[j];
			j++;
			k++;
		}
	}
}
