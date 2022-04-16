package phan2;

import java.util.*;
import java.lang.*;
import java.math.*;

public class index {
	public int input() {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			n = sc.nextInt();
		} while (n < 0);
		return n;
	}

	public int[] inputArray(int n, int a[]) {
		for (int i = 0; i < n; i++) {
			System.out.print("Nhap vao phan tu thu " + i + " = ");
			Scanner sc = new Scanner(System.in);
			a[i] = sc.nextInt();
		}
		return a;
	}

	public void display(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("");
	}

	public boolean check(int n) {
		if (n < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					return false;
				}
			}
		}
		return true;
	}

	public void checkPrimes(int a[], int n) {
		System.out.println("Cac so nguyen to trong mang: ");
		for (int i = 0; i < n; i++) {
			if (check(a[i])) {
				System.out.print(a[i] + " ");
			}
		}
		System.out.print("\n");
	}

	public int[] addX(int a[], int x, int n) {
		
		a = Arrays.copyOf(a, n + 1);
		a[n] = x;
		return a;
	}

	public static void main(String[] args) {
		index obj1 = new index();
		System.out.print("Nhap vao so luong phan tu trong mang: ");
		int n = obj1.input();
		int[] a = new int[n];
		System.out.print("Nhap vao x: ");
		int x = obj1.input();
		obj1.inputArray(n, a);
		System.out.println("=========================");
		System.out.println("Mang vua nhap la: ");
		obj1.display(a);
		System.out.println("=========================");
		obj1.checkPrimes(a, n);
		System.out.println("=========================");
		a = obj1.addX(a, x, n);
		System.out.println("Them X vao cuoi: ");
		obj1.display(a);
		
	}
}
