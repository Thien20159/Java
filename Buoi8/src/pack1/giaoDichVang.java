package pack1;

public class giaoDichVang extends giaoDich {
	private String LoaiVang;

	public giaoDichVang() {
		super();
		this.LoaiVang = "";
	}

	public giaoDichVang(int ma, int sl, String ngay, double dgia, double ttien, String lvang) {
		super(ma, sl, ngay, dgia, ttien);
		LoaiVang = lvang;
	}

	public void setLoaiVang(String loaiVang) {
		LoaiVang = loaiVang;
	}

	public void nhap() {
		super.nhap();
		System.out.print("Loai Vang: ");
		LoaiVang = in.next();
	}

	public double TTien() {
		return this.ThanhTien = this.DonGia * this.SoLuong;
	}

	public String toString() {
		return "Giao Dich Vang: " + super.toString() + ",Loai Vang: " + LoaiVang + ", Thanh Tien: " + ThanhTien + "]";
	}
}
