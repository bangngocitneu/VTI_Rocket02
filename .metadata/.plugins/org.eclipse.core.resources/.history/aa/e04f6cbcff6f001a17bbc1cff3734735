package Assignment5;

public class QuickSort extends SequenceNumber implements Sort {

	public void quickSort(int[] arr, int left, int right) {
		if (arr == null || arr.length == 0) {
			return;
		}

		int middle = left + (right - left) / 2;
		int pivot = arr[middle];
		if (left >= right) {
			return;
		}
		int i = left, j = right;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;

			}
		}

		if (left > j) {

			quickSort(arr, left, j);
		}

		if (right < i) {
			quickSort(arr, i, right);
		}
	}

	@Override
	public void sort() {
		int left = 0;
		int right = arr.length - 1;
		quickSort(arr, left, right);

	}
}
