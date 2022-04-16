package P1;

import java.util.*;
import java.lang.*;

public class Bai1 {
	public int input() {
		int n;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap vao n: ");
			n = sc.nextInt();
		} while (n < 1);
		return n;
	}
	public boolean kiemTraSoNguyenTo(int n) {
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
	public void timUocSo(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				if (kiemTraSoNguyenTo(i)) {
					System.out.print(i + "\t");
				}
			}
		}
	}
	public void demSoChanCH4(int n) {
		for (int i = 1; i < n; i++) {
			if (i % 2 == 0) {
				if (i % 4 == 0) {
					System.out.print(i + "\t");
				}
			}
		}
	}
	public static void main(String[] args) {
		Bai1 obj1 = new Bai1();
		int n = obj1.input();
		System.out.println("Uoc so cua n va la so nguyen to: ");
		obj1.timUocSo(n);
		System.out.print("\n");
		System.out.println("Cac so chan chia het cho 4 va nho hon n:");
		obj1.demSoChanCH4(n);
	}
}
