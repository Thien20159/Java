import java.util.Scanner;

public class hangThuong extends hangHoa {
	private float VAT;

	public float getVAT() {
		return VAT;
	}

	public void setVAT(float vAT) {
		VAT = vAT;
	}

	public hangThuong() {
		super();
	}

//	public hangThuong(String mSo, String tHang, float dGia, float vat) {
//		super(mSo, tHang, dGia);
//		VAT = vat;
//	}
	@Override
	public void input() {
		super.input();
		float vat;
		Scanner x = new Scanner(System.in);
		System.out.print("Nhap vao VAT: ");
		vat = x.nextFloat();
		this.setVAT(vat);
	}

	public float tinhGiaBan() {
		float giaBan = (float)this.getDonGia() + this.getDonGia() * this.getVAT();
		return giaBan;
	}
}
