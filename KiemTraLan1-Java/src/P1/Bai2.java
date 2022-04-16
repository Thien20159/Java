package P1;

import java.util.*;
import java.lang.*;

public class Bai2 {
	public int input() {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			n = sc.nextInt();
		} while (n < 1);
		return n;
	}

	public int[] inputArray(int[] a, int n) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < n; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		return a;
	}

	public void display(int[] a, int n) {
		System.out.println("Mang vua vao co gia tri la: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
	}

	public int timSoChia3Va5(int[] a, int n) {
		int sum = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 3 == 0 || a[i] % 5 == 0) {
				sum += a[i];
			}
		}
		return sum;
	}

	public int timChiSoChia3(int[] a, int n) {
		int b = 0;
		for (int i = n - 1; i > 0; i--) {
			if (a[i] % 3 == 0) {
				b = i;
				break;
			}
		}
		if (b == 0) {
			return -1;
		} else {
			return b;
		}
	}

	public int[] themSauChia3(int[] a, int x, int n, int b) {
		a = Arrays.copyOf(a, n + 1);
		for (int i = n; i > b; i--) {
			a[i] = a[i-1];
		}
		a[b+1] = x;
		return a;
	}

	public static void main(String[] args) {
		Bai2 obj1 = new Bai2();
		System.out.print("Nhap vao so luong phan tu trong mang: ");
		int n = obj1.input();
		int[] a = new int[n];
		obj1.inputArray(a, n);
		obj1.display(a, n);
		System.out.println("\n=====================================");
		System.out.println("Tong cac so chia het cho 3 va 5 trong mang: ");
		int sum = obj1.timSoChia3Va5(a, n);
		System.out.println(sum);
		System.out.println("So chia het cho 3 cuoi cung nam tai vi tri: ");
		int b = obj1.timChiSoChia3(a, n);
		System.out.print(b);
		System.out.print("\n=====================================");
		System.out.print("\nNhap vao x: ");
		int x = obj1.input();
		a = obj1.themSauChia3(a, x, n, b);
		obj1.display(a, n);

	}
}
