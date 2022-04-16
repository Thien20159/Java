package phan1;

public class thuocThuong extends thuoc {
	private boolean CoKeDon;

	public boolean isCoKeDon() {
		return CoKeDon;
	}

	public void setCoKeDon(boolean coKeDon) {
		CoKeDon = coKeDon;
	}

	public thuocThuong(String tenthuoc, float dongia, int soluong, boolean cokedon) {
		super(tenthuoc, dongia, soluong);
		CoKeDon = cokedon;
	}

	public float tinhTienThuoc() {
		float tinhtienthuoc;
		if (CoKeDon==true) {
			tinhtienthuoc = (float) ((this.getDonGia() * this.getSoLuong()) * (0.05));
		} else {
			tinhtienthuoc = (float) this.getDonGia() * this.getSoLuong();
		}
		return tinhtienthuoc;
	}
}
