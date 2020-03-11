package Assignment5;



public class InsertSort extends SequenceNumber implements Sort{

	public InsertSort(int[] arr) {
		super(arr);
	}

	public static void main(String[] args) {
		input();
		print(); 
		Sort();
		System.out.println("Sau khi sắp xếp (Insertion Sort)");
		print();
	}

	@Override
	public static void Sort() {
		for(int i=1; i<n; i++) {
			int x = arr[i];
			int y = i;
			while( y > 0 && arr[ y - 1 ] > x ) {
				arr[y]=arr[y-1];
				y--;
			}
			arr[y]=x;
		}
		
	}

}
