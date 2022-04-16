package phan1;

public class testThuoc {
	public static void main(String[] args) {
		thuocThuong t1 = new thuocThuong("Thuoc Cam", 200, 5, true);
		System.out.println("Tien "+t1.getTenThuoc()+" = "+t1.tinhTienThuoc());
		System.out.println("==============================================");
		thuocBaoHiem t2 = new thuocBaoHiem("Thuoc Ho", 1000, 20, 80);
		System.out.println("Tien "+t2.getTenThuoc()+" = "+t2.tinhTienThuoc());
	}
}
