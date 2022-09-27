package ch06Sort;

public class b1SelectionSort {
	// a[idx1]와 a[idx2]의 값을 바꾸기
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 단순 선택 정렬
	static void selectionSort(int[] a, int n) {
		for(int i=0; i<n-1; i++) {
			int min=i;	// 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 기록합니다.
			for(int j=i+1; j<n;j++) {
				if(a[j]<a[min])
					min=j;
			swap(a, i, min);	// 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환합니다.
			}
		}
		
		
		
	}
	
}
