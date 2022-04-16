package pack1;

public class giaoDichTienTe extends giaoDich {
	private float TiGia;
	private int LoaiTienTe;

	public giaoDichTienTe() {
		super();
		this.TiGia = 0;
		this.LoaiTienTe = 0;
	}

	public giaoDichTienTe(int ma, int sl, String ngay, double dgia, double ttien, float tgia, int loai) {
		super(ma, sl, ngay, dgia, ttien);
		TiGia = tgia;
		LoaiTienTe = loai;
	}

	public float getTiGia() {
		return TiGia;
	}

	public void setTiGia(float tiGia) {
		TiGia = tiGia;
	}

	public int getLoaiTienTe() {
		return LoaiTienTe;
	}

	public void setLoaiTienTe(int loaiTienTe) {
		LoaiTienTe = loaiTienTe;
	}

	public void nhap() {
		super.nhap();
		System.out.println("Ti Gia: ");
		TiGia = in.nextFloat();
		System.out.println("Loai Tien Te: ");
		LoaiTienTe = in.nextInt();
	}

	public double TTien() {
		if (LoaiTienTe == 1)
			return this.ThanhTien = this.DonGia * this.SoLuong;
		else
			return this.ThanhTien = this.DonGia * this.SoLuong * this.TiGia;
	}

	public String toString() {
		String temp;
		if(LoaiTienTe==1)
			temp="VND";
		else if(LoaiTienTe==2)
			temp="USD";
		else
			temp="EURO";
		return "Giao Dich Tien Te: "+super.toString()+"'Ti Gia: "+TiGia+", Loai Tien Te: "+ temp +", Thanh Tien: "+ThanhTien+" ]";

	}
}