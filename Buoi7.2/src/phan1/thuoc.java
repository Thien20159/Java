package phan1;

public abstract class thuoc {
	private String TenThuoc;
	private float DonGia;
	private int SoLuong;

	public String getTenThuoc() {
		return TenThuoc;
	}

	public void setTenThuoc(String tenThuoc) {
		TenThuoc = tenThuoc;
	}

	public float getDonGia() {
		return DonGia;
	}

	public void setDonGia(float donGia) {
		DonGia = donGia;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	
	public thuoc(String tenthuoc, float dongia, int soluong) {
		super();
		TenThuoc = tenthuoc;
		DonGia = dongia;
		SoLuong = soluong;
	}

	public abstract float tinhTienThuoc();
}
