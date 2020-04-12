package assignment5;

public class MainProgram {

	public static void main(String[] args) {

		SequenceNumber selectionSort = new SelectionSort();
		selectionSort.input();
		selectionSort.print();
		selectionSort.sort();
		selectionSort.print();

		SequenceNumber insertSort = new InsertSort();
		insertSort.input();
		insertSort.print();
		insertSort.sort();
		insertSort.print();

		SequenceNumber quickSort = new QuickSort();
		quickSort.input();
		quickSort.print();
		quickSort.sort();
		quickSort.print();

	}

}
