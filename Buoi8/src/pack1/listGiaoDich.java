package pack1;

public class listGiaoDich {
	giaoDich gd[] = new giaoDich[100];
	private int CountGD, sum1 = 0, sum2 = 0, dem = 0, sumtien = 0;

	public listGiaoDich() {
		CountGD = 0;
		for (int i = 0; i < 100; i++) {
			gd[i] = new giaoDich();
		}
	}

	public void ThemGD(int temp) {
		if (CountGD > 100) {
			System.out.println("Bo nho full, ko the them moi!");
		} else {
			if (temp == 1) {
				gd[CountGD] = new giaoDichVang();
				giaoDichVang gdv = new giaoDichVang();
				gdv.nhap();
				gdv.ThanhTien = gdv.TTien();
				gd[CountGD] = gdv;
				sum1 += gdv.SoLuong;
			} else {
				gd[CountGD] = new giaoDichTienTe();
				giaoDichTienTe gdtt = new giaoDichTienTe();
				gdtt.nhap();
				gdtt.ThanhTien = gdtt.TTien();
				gd[CountGD] = gdtt;
				sumtien += gdtt.ThanhTien;
				sum2 += gdtt.SoLuong;
				dem++;
			}
			CountGD++;
		}
	}

	public void HienThiDS() {
		for (int i = 0; i < CountGD; i++) {
			System.out.println("\n-----So TT: " + (i + 1));
			System.out.println(gd[i].toString());
		}
	}

	// tong so luong cua giao dich
	public void TongSL() {
		System.out.println("|-> Tong So Luong Cua Giao Dich Vang: " + sum1 + " <-||");
		System.out.println("|-> Tong So Luong Cua Giao Dich Tien Te: " + sum2 + " <-|");
	}

	public void TrungBinhGDTT() {
		System.out.println("|-> Trung Binh Thanh Tien Giao Dich Tien Te: " + (sumtien / dem) + " <-|");
	}

	// xuat danh sach giao dich 1 ty
	public void GiaoDich1Ty() {
		int d = 0;
		for (int i = 0; i < CountGD; i++) {
			if (gd[i].DonGia > 1000) {
				System.out.println(gd[i].toString());
				d++;
			}
		}
		if (d == 0) {
			System.out.println("Khong co thong tin!");
		}
	}
}
