package phan1;

import java.util.Scanner;

public class theATM extends theNganHang {
	private int SoNgayGui;

	public int getSoNgayGui() {
		return SoNgayGui;
	}

	public void setSoNgayGui(int soNgayGui) {
		SoNgayGui = soNgayGui;
	}

	public void input() {
		super.input();
		int sng;
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap vao so ngay gui: ");
		sng = sc.nextInt();
		this.setSoNgayGui(sng);
	}

	public float tinhTienLai() {
		float TienLai = (float)this.getSoTien() * (this.getLaiSuat() / 360 * 100) * this.getSoNgayGui();
		return TienLai;
	}

}
