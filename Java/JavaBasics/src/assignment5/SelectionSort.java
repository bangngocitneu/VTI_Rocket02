package assignment5;

public class SelectionSort extends SequenceNumber{
	
	private void hoanVi(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	@Override
	public void sort() {
		for(int i=0; i<arr.length - 1; i++) {
			int minArr = i;
			for(int j=i+1; j<n; j++) {
				if(arr[minArr]>arr[j]) {
					minArr = j;
				}
			}
			if(i!=minArr)
				hoanVi(arr, minArr, i);
		}
		
	}
	
}
