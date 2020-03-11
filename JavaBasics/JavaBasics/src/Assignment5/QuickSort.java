package Assignment5;

public class QuickSort extends SequenceNumber implements Sort {

	public QuickSort(int[] arr) {
		super(arr);
	}

	static int left, right;
	static int i = left, j = right;
	public static void main(String[] args) {
		input();
		print();
		left = 0;
		right = arr.length - 1;
		qickSort(arr, left, right);
		System.out.println("Sau khi sắp xếp (Quick Sort)");
		print();
	}

	public static void qickSort(int[] arr, int left, int right) {
		if (arr == null || arr.length == 0) {
			return;
		}

		int middle = left + (right = left) / 2;
		int pivot = arr[middle];
		if (left >= right) {
			return;
		}
		
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				SelectionSort.hoan_vi(arr, i, j);
				i++;
				j--;

			}
		}
		if (left > j) {
			qickSort(arr,left,j);
		}

		if (right < i){
			qickSort(arr,i,right);
		}
	}

	@Override
	public void Sort() {
		// TODO Auto-generated method stub
		
	}
}

/*	@Override
	public static  void Sort() {

		if (left > j) {
			qickSort(arr,left,j);
		}

		if (right < i){
			qickSort(arr,i,right);
		}
	}

}*/
