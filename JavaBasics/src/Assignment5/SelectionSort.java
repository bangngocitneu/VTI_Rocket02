package Assignment5;

public class SelectionSort extends SequenceNumber implements Sort{

	public SelectionSort(int[] arr) {
		super(arr);
	}
	public static void main(String[] args) {
		input();
		print();
		Sort();
		System.out.println("Sau khi sắp xếp (Selection Sort)");
		print();
	}
	public static void hoan_vi(int[] arr, int i, int j) {

		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	
	public  void Sort() {
		for(int i=0; i<arr.length - 1; i++) {
			int minArr = i;
			for(int j=i+1; j<n; j++) {
				if(arr[minArr]>arr[j]) {
					minArr = j;
				}
			}
			if(i!=minArr)
				hoan_vi(arr, minArr, i);
		}
		
	}
	
}
