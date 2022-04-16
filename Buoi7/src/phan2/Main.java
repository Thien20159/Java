package phan2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int n, min;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập vào số phần tử của mảng: ");
		n = scanner.nextInt();
		int[] t = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
			t[i] = scanner.nextInt();
		}
		System.out.println("\nCác số nguyên tố trong mảng vừa nhập là: ");
		for (int i = 0; i < n; i++) {
			if (checkNguyenTo(t[i])) {
				System.out.print(t[i] + "\t");
			}
		}
//		for (int i = 0; i < n - 1; i++) {
//			for (int j = i + 1; j <= n - 1; j++) {
//				if (t[i] > t[j]) {
//					min = t[i];
//					t[i] = t[j];
//					t[j] = min;
//				}
//			}
//		}
//		System.out.println("\nCác số nguyen tố sắp xếp tăng dần là: ");
//		for (int i = 0; i < n; i++) {
//			if (checkNguyenTo(t[i])) {
//				System.out.print(t[i] + "\t");
//			}
//		}

	}

	public static boolean checkNguyenTo(int n) {
		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0)
					return false;
			}
		}
		return true;
	}
}
