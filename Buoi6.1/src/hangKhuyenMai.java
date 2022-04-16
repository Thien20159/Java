import java.util.Scanner;

public class hangKhuyenMai extends hangHoa {
	private float SoTienGiam;

	public float getSoTienGiam() {
		return SoTienGiam;
	}

	public void setSoTienGiam(float soTienGiam) {
		SoTienGiam = soTienGiam;
	}
	public void input() {
		super.input();
		float stg;
		Scanner x = new Scanner(System.in);
		System.out.print("Nhap vao So Tien Giam: ");
		stg = x.nextFloat();
		this.setSoTienGiam(stg);
	}

	public float tinhGiaBan() {
		float giaBan = this.getDonGia() - this.getSoTienGiam();
		return giaBan;
	}

}
