package Assignment5;

import java.util.Scanner;

public class SequenceNumber {

	// Câu a
	static int n;
	static int[] arr;

	@SuppressWarnings("static-access")
	public SequenceNumber(int[] arr) {
		super();
		this.arr = arr;

	}

	@SuppressWarnings("resource")
	public static void input() {
		System.out.println("Nhập vào số phần tử của dãy:\n");
		n = new Scanner(System.in).nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] =  ", i);
			arr[i] = new Scanner(System.in).nextInt();
		}
	}

	public static void print() {
		System.out.println("Mảng là: ");
		for (int mang : arr) {
			System.out.print(mang + " ");
		}
		 System.out.println();
	}

	public static void main(String[] args) {

		System.out.println(" câu a");
		input();
		print();
	}
}
