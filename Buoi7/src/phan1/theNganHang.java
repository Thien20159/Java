package phan1;
import java.util.*;

import java.util.Scanner;

public abstract class theNganHang {
	private String MaThe;
	private float SoTien;
	private float LaiSuat;

	public String getMaThe() {
		return MaThe;
	}

	public void setMaThe(String maThe) {
		MaThe = maThe;
	}

	public float getSoTien() {
		return SoTien;
	}
	
	public void setSoTien(float soTien) {
		SoTien = soTien;
	}

	public float getLaiSuat() {
		return LaiSuat;
	}

	public void setLaiSuat(float laiSuat) {
		LaiSuat = laiSuat;
	}
	public void input() {
		String mt;
		float st;
		float ls;
		Scanner sc =  new Scanner(System.in);
		System.out.print("Nhap vao ma the: ");
		mt = sc.nextLine();
		this.setMaThe(mt);
		System.out.print("Nhap vao so tien: ");
		st = sc.nextFloat();
		this.setSoTien(st);
		System.out.print("Nhap vao lai suat: ");
		ls = sc.nextFloat();
		this.setLaiSuat(ls);
	}
	
	public abstract float tinhTienLai();
}
