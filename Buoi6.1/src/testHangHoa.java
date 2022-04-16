public class testHangHoa {
	public static void main(String[] args) {
		
		hangThuong hanghoa1 = new hangThuong();
		System.out.println("Nhap Hang Thuong");
		hanghoa1.input();
		System.out.println("================================================");
		System.out.println("HangThuong:");
		System.out.println("+Ma So : " + hanghoa1.getMaSo());
		System.out.println("+Ten Hang : " + hanghoa1.getTenHang());
		System.out.println("+Don Gia : " + hanghoa1.getDonGia());
		System.out.println("+VAT : " + hanghoa1.getVAT());
		System.out.println("+Gia Ban + VAT = " + hanghoa1.tinhGiaBan());

		System.out.println("================================================");
		
		hangKhuyenMai hanghoa2 = new hangKhuyenMai();
		System.out.println("Nhap Hang Khuyen Mai");
		hanghoa2.input();
		System.out.println("================================================");
		System.out.println("Hang Khuyen Mai:");
		System.out.println("+Ma So : " + hanghoa2.getMaSo());
		System.out.println("+Ten Hang : " + hanghoa2.getTenHang());
		System.out.println("+Don Gia : " + hanghoa2.getDonGia());
		System.out.println("+So Tien Giam: " + hanghoa2.getSoTienGiam());
		System.out.println("+Gia Ban = " + hanghoa2.tinhGiaBan());
	}
}
