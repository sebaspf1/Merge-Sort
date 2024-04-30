package assignment6ms;

public class Main {
	public static void main(String args[]) {
		int A[] = {51, 16, 12, 61, 1624, 123, 1234, 4};
		IntegerMergeSort.mergeSort(A, 0, A.length - 1);
		for(int i = 0; i < A.length; i++)
			System.out.print(A[i] + " ");
		
		System.out.println();
		
		String[] B = {"Sebastian", "Andres", "Hfquew", "Eudqjpeioqj", "Riwephfiqwfe"};
		AnyTypeMergeSort<String> sorter = new AnyTypeMergeSort<>();
		sorter.mergeSort(B, 0, B.length - 1);
		for(int i = 0; i < B.length; i++)
			System.out.print(B[i] + " ");
		
		System.out.println();
		
		Double[] C = {1.1, 1.01, 0.25, 0.5, 2.04, 3.14};
		AnyTypeMergeSort<Double> sorter2 = new AnyTypeMergeSort<>();
		sorter2.mergeSort(C, 0, C.length - 1);
		for(int i = 0; i < C.length; i++)
			System.out.print(C[i] + " ");
	}
}
