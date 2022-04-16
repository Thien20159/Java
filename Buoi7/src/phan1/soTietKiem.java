package phan1;

import java.util.Scanner;

public class soTietKiem extends theNganHang {
	private int KyHan;

	public int getKyHan() {
		return KyHan;
	}

	public void setKyHan(int kyHan) {
		KyHan = kyHan;
	}

	public void input() {
		super.input();
		int kh;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Nhap vao ky han: ");
		kh =  sc.nextInt();
		this.setKyHan(kh);
	}
	//Override
	public float tinhTienLai() {
		float tienLai = (float)this.getSoTien()*(this.getLaiSuat()/12*100)*this.getKyHan();
		return tienLai;
	}

}
