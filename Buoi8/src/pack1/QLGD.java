package pack1;

import java.util.*;

public class QLGD {
	public static void main(String[] args) {
		listGiaoDich lgd = new listGiaoDich();
		Scanner in = new Scanner(System.in);
		int x;
		do {
			System.out.println("\n \t \t==================================================");
			System.out.println("\t \t| 0. Thoat ung dung\t\t\t\t |");
			System.out.println("\t \t| 1. Them giao dich vang\t\t\t |");
			System.out.println("\t \t| 2. Them giao dich tien te\t\t\t |");
			System.out.println("\t \t| 3. Hien thi danh sach giao dich\t\t |");
			System.out.println("\t \t| 4. Xem tong so luong cua cac giao dich\t |");
			System.out.println("\t \t| 5. Xem trung binh cua giao dich tien te\t |");
			System.out.print("\t \t| 6. Hien thi danh sach giao dich co don gia\t |");
			System.out.println("\n \t \t==================================================");
			System.out.print("Choice: ");
			x=in.nextInt();
			switch (x) {
			case 1:
				lgd.ThemGD(1);
				break;
			case 2:
				lgd.ThemGD(2);
				break;
			case 3:
				lgd.HienThiDS();
				break;
			case 4:
				lgd.TongSL();
				break;
			case 5:
				lgd.TrungBinhGDTT();
				break;
			case 6:
				lgd.GiaoDich1Ty();
				break;
				
			default:
				break;
			}
		}while(x!=0);
	}

}
