package ArrayTest;

import java.util.*;

public class Array1 {
	public int input() {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap vao so luong phan tu: ");
			n = sc.nextInt();
		} while (n < 0);
		return n;
	}

	public int[] inputArr(int n, int[] a) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		return a;
	}

	public void display(int n, int a[]) {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + "\t");
		}
		System.out.print("\n");
	}

	public void findMaxMin(int a[], int n) {
		int max = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		int min = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("\nMax = " + max);
		System.out.println("\nMin = " + min);
	}

	public void countEvenOdd(int a[]) {
		System.out.println("Phan tu chan trong mang: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.print(a[i] + "\t");
			}
		}
		System.out.print("\n");
		System.out.println("Phan tu le trong mang: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.print(a[i] + "\t");
			}
		}
	}

//	public int[] selectionSort(int a[], int n) {
//		int temp;
//		int minindex = 0;
//		for (int i = 0; i < n - 1; i++) {
//			minindex = i;
//			for (int j = i + 1; j < n; j++) {
//				if (a[j] < a[minindex]) {
//					minindex = j;
//				}
//			}
//			temp = a[i];
//			a[i] = a[minindex];
//			a[minindex] = temp;
//		}
//		return a;
//	}

//	public int[] insertionSort(int a[], int n) {
//		int temp;
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (a[i] > a[j]) {
//					temp = a[j];
//					a[j] = a[i];
//					a[i] = temp;
//				}
//			}
//		}
//		return a;
//	}

//	public int[] interchangeSort(int a[], int n) {
//		int temp;
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = i + 1; j < n; j++) {
//				if (a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		return a;
//	}
//	public int[] bubbleSort(int a[], int n) {
//		int temp;
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = 0; j < n - 1 - i; j++) {
//				if (a[j] > a[j+1]) {
//					temp = a[j];
//					a[j] = a[j+1];
//					a[j+1] = temp;
//				}
//			}
//		}
//
//		return a;
//	}

	public static void main(String[] args) {
		Array1 obj1 = new Array1();
		int n = obj1.input();
		int[] a = new int[n];
		a = obj1.inputArr(n, a);
		System.out.println("\n===================");
		System.out.println("\nMang vua nhap la: \n");
		obj1.display(n, a);
		System.out.println("\n===================");
		obj1.findMaxMin(a, n);
		System.out.println("\n===================");
		obj1.countEvenOdd(a);
		System.out.println("\n===================");
//		a = obj1.selectionSort(a, n);
//		a = obj1.insertionSort(a, n);
//		a = obj1.interchangeSort(a, n);
		a = obj1.bubbleSort(a, n);
		obj1.display(n, a);
	}
}
