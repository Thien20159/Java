package pack1;

import java.util.*;

public class giaoDich {
	protected int MaGD, SoLuong;
	protected String NgayGD;
	protected double DonGia, ThanhTien;
	Scanner in = new Scanner(System.in);

	protected giaoDich() {
		this.MaGD = 0;
		this.NgayGD = "";
		this.DonGia = 0;
		this.SoLuong = 0;
		this.ThanhTien = 0;
	}

	protected giaoDich(int ma, int sl, String ngay, double dgia, double ttien) {
		super();
		MaGD = ma;
		SoLuong = sl;
		NgayGD = ngay;
		DonGia = dgia;
		ThanhTien = ttien;
	}

	protected int getMaGD() {
		return MaGD;
	}

	protected void setMaGD(int maGD) {
		MaGD = maGD;
	}

	protected int getSoLuong() {
		return SoLuong;
	}

	protected void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	protected String getNgayGD() {
		return NgayGD;
	}

	protected void setNgayGD(String ngayGD) {
		NgayGD = ngayGD;
	}

	protected double getDonGia() {
		return DonGia;
	}

	protected void setDonGia(double donGia) {
		DonGia = donGia;
	}

	protected double getThanhTien() {
		return ThanhTien;
	}

	protected void setThanhTien(double thanhTien) {
		ThanhTien = thanhTien;
	}

	protected void nhap() {
		System.out.println("Ma Giao Dich: ");
		MaGD = in.nextInt();
		System.out.println("Ngay Giao Dich: ");
		NgayGD = in.next();
		System.out.println("Don Gia: ");
		DonGia = in.nextDouble();
		System.out.println("So Luong: ");
		SoLuong = in.nextInt();
	}

	public String toString() {
		String a = "[MaGD=" + MaGD + ", SoLuong =" + SoLuong + ", NgayGD=" + NgayGD + ", DonGia=" + DonGia;
		return a;
	}

}
