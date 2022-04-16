import java.util.*;
import java.lang.*;

public class Demo3 {
	public int input() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}

	public void nhapMang(int[] a) {
		int gt1;
		Scanner sc2 = new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			gt1 = sc2.nextInt();
			a[i] = gt1;
		}
	}

	public void xuatMang(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("\n");
	}

	public void sapXepMangTang(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public void sapXepMangGiam(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public int demLe(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				count += 1;
			}
		}
		return count;

	}

	public int demChan(int[] a) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count += 1;
			}
		}
		return count;

	}

	public int tongMang(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}

	public int timMax(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		return max;
	}

	public int timMin(int[] a) {
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		return min;
	}

	public boolean KiemtraNguyento(int n) {
		if (n < 2 || n == 4)
			return false;
		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public void XuatsoNguyento(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (KiemtraNguyento(a[i])) {
				System.out.println(a[i] + "\t");
			}
		}
	}

	public int timX(int[] a, int x) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				return i;
			}
		}
		return -1;
	}

	public int demX(int[] a, int x) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				count += 1;
			}
		}
		return count;
	}

	public int[] themXCuoi(int[] a, int M) {
		int d = a.length;
		a = Arrays.copyOf(a, d + 1);
		a[d] = M;
		return a;
	}

	public int[] themXDau(int[] a, int M) {
		int size = a.length + 1;
		int[] b = new int[size];
		int msize = a.length < b.length ? a.length : b.length;
		System.arraycopy(a, 0, b, 1, msize);
		b[0] = M;
		a = b;
		return a;
	}

	public int[] themSauViTriK(int[] a, int M, int K) {
		int size = a.length + 1;
		int[] b = new int[size];
		System.arraycopy(a, 0, b, 0, K + 1);
		b[K + 1] = M;
		System.arraycopy(a, K + 1, b, K + 2, a.length - (K + 1));
		a = b;
		return a;
	}

	public int[] xoaCuoiMang(int[] a) {
		int size = a.length - 1;
		int[] b = new int[size];
		System.arraycopy(a, 0, b, 0, size);
		a = b;
		return a;
	}

	public int[] xoaDauMang(int[] a) {
		int size = a.length - 1;
		int[] b = new int[size];
		System.arraycopy(a, 1, b, 0, size);
		a = b;

		return a;
	}

	public int[] xoaPhanTuTaiViTriK(int[] a, int K) {
		int size = a.length - 1;
		int[] b = new int[size];
		System.arraycopy(a, 0, b, 0, K);
		System.arraycopy(a, K + 1, b, K, a.length - (K + 1));
		a = b;
		return a;
	}

	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		int n;
		System.out.print("Nhap vao do dai mang > 0: ");
		n = obj.input();
		int a[] = new int[n];
		obj.nhapMang(a);
		System.out.print("Mang vua nhap la: ");
		obj.xuatMang(a);
		System.out.print("Sap xep tang: ");
		obj.sapXepMangTang(a);
		obj.xuatMang(a);
		System.out.print("Sap xep giam: ");
		obj.sapXepMangGiam(a);
		obj.xuatMang(a);
		System.out.println("So phan tu le trong mang = " + obj.demLe(a));
		System.out.println("So phan tu chan trong mang = " + obj.demChan(a));
		System.out.println("tinh tong phan tu trong mang = " + obj.tongMang(a));
		System.out.println("Max = " + obj.timMax(a));
		System.out.println("Min = " + obj.timMin(a));
		System.out.println("Cac so nguyen to trong mang da nhap la :  ");
		obj.XuatsoNguyento(a);
		System.out.print("Mang da duoc sap xep la: ");
		obj.xuatMang(a);
		System.out.print("Nhap vao x: ");
		int x = obj.input();
		int z = obj.timX(a, x);
		if (z == -1) {
			System.out.println("Khong tim thay");
		} else {
			System.out.println("Tim thay tai vi tri " + z);
		}
		System.out.println("So luong phan tu x can tim trong mang la: " + obj.demX(a, x));
		System.out.print("Nhap vao M: ");
		int M = obj.input();
		a = obj.themXCuoi(a, M);
		System.out.print("Them M vao cuoi: ");
		obj.xuatMang(a);
		a = obj.themXDau(a, M);
		System.out.print("Them M vao dau: ");
		obj.xuatMang(a);
		System.out.print("Nhap vao K: ");
		int K = obj.input();
		System.out.print("Them M vao sau K: ");
		a = obj.themSauViTriK(a, M, K);
		obj.xuatMang(a);
		System.out.print("Xoa cuoi mang: ");
		a = obj.xoaCuoiMang(a);
		obj.xuatMang(a);
		System.out.print("Xoa dau mang: ");
		a = obj.xoaDauMang(a);
		obj.xuatMang(a);
		System.out.print("Xoa tai k: ");
		a = obj.xoaPhanTuTaiViTriK(a, K);
		obj.xuatMang(a);

	}
}