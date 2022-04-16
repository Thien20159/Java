import java.util.*;
public abstract class hangHoa {
	private String MaSo;
	private String TenHang;
	private float DonGia;

	public String getMaSo() {
		return MaSo;
	}

	public void setMaSo(String maSo) {
		MaSo = maSo;
	}

	public String getTenHang() {
		return TenHang;
	}

	public void setTenHang(String tenHang) {
		TenHang = tenHang;
	}

	public float getDonGia() {
		return DonGia;
	}

	public void setDonGia(float donGia) {
		DonGia = donGia;
	}

//	public hangHoa() {
//		super();
//	}
//	public hangHoa(String ms, String th, float dg) {
//		super();
//		MaSo = ms;
//		TenHang = th;
//		DonGia = dg;
//	}
	public void input() {
		String ms = null;
		String th = null;
		float dg = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao ma so: ");
		ms = sc.nextLine();
		this.setMaSo(ms);
		
		System.out.print("Nhap vao ten hang: ");
		th = sc.nextLine();
		this.setTenHang(th);
		
		System.out.print("Nhap vao don gia: ");
		dg = sc.nextFloat();
		this.setDonGia(dg);
		
//		System.out.print("Nhap vao ten hang: ");
//		sc.nextLine();
//		System.out.print("Nhap vao don gia: ");
//		sc.nextFloat();
	}

	public abstract float tinhGiaBan();
}
