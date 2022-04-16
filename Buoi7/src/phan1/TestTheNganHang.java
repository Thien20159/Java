
package phan1;

public class TestTheNganHang {

	public static void main(String[] args) {
		soTietKiem t1 = new soTietKiem();
		System.out.println("=======================================");
		System.out.println("SO TIET KIEM");
		t1.input();
		System.out.println("Tien Lai Tiet Kiem = " + t1.tinhTienLai());
		
		System.out.println("=======================================");
		System.out.println("THE ATM");
		theATM t2 = new theATM();
		System.out.println("=======================================");
		t2.input();
		System.out.println("Tien Lai ATM = " + t2.tinhTienLai());
	}

}
