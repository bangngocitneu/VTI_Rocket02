package Assignment5;

import java.util.Scanner;

public abstract class SequenceNumber implements Sort {
 
	protected int n;
	protected int[] arr;

	@SuppressWarnings("resource")
	public void input() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử của dãy:\n");
		n = scanner.nextInt();
		arr = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("a[%d] =  ", i);
			arr[i] = scanner.nextInt();
		}
	}

	public void print() {
		System.out.println("Mảng là: ");
		for (int mang : arr) {
			System.out.print(mang + " ");
		}
		System.out.println();
	}

}
