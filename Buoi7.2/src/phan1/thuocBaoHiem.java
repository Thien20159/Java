package phan1;

public class thuocBaoHiem extends thuoc {
	private int TiLeGiam;

	public int getTiLeGiam() {
		return TiLeGiam;
	}

	public void setTiLeGiam(int tiLeGiam) {
		TiLeGiam = tiLeGiam;
	}

	public thuocBaoHiem(String tenthuoc, float dongia, int soluong, int tilegiam) {
		super(tenthuoc, dongia, soluong);
		TiLeGiam = tilegiam;
	}

	public float tinhTienThuoc() {
		float tinhtienthuoc = (float) (this.getDonGia() * this.getSoLuong() * (this.getTiLeGiam()/100.0));
		return tinhtienthuoc;
	}

}
