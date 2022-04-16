package phan2;

import java.util.*;
import java.lang.*;

public class index {
	public int input() {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			n = sc.nextInt();
		} while (n < 0);
		return n;
	}

	public int[] inputArray(int[] a, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = input();
		}
		return a;
	}

	public void display(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public boolean checkNumberPer(int x) {
		int sum = 0;
		if (x == 0) {
			return false;
		}
		for (int i = 1; i <= x / 2; i++) {
			if (x % i == 0) {
				sum += i;
			}
		}
		if (sum == x) {
			return true;
		}
		return false;
	}

	public void numberPer(int a[], int n) {
		System.out.println("Cac so hoan hao trong mang: ");
		for (int i = 0; i < n; i++) {
			if (checkNumberPer(a[i])) {
				System.out.print(a[i] + "\t");
			}
		}
	}

	public int[] xoaCuoiMang(int[] a, int n) {
		a = Arrays.copyOf(a, n-1);
		return a;
	}

	public static void main(String[] args) {
		index obj1 = new index();
		System.out.print("Nhap vao n: ");
		int n = obj1.input();
		int[] a = new int[n];
		obj1.inputArray(a, n);
		System.out.println("\n=======================================");
		System.out.println("Mang vua nhap : ");
		obj1.display(a);
		System.out.println("\n=======================================");
		obj1.numberPer(a, n);
		System.out.println("\n=======================================");
		a = obj1.xoaCuoiMang(a, n);
		System.out.println("Mang sau khi xoa : ");
		obj1.display(a);
	}
}
