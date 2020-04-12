package assignment5;



public class InsertSort extends SequenceNumber{


	@Override
	public void sort() {
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
