//Conditional
import java.util.*;
class Conditional{
	public int input() {
		Scanner sc = new Scanner(System.in);
		int so = sc.nextInt();
		return so;
	}
	public void doiDiem(int testScore) {
		char grade;
		if(testScore >= 90)
			grade = 'A';
		else if(testScore >= 80)
				grade = 'B';
			else if(testScore >= 70)
					grade = 'C';
				else if(testScore >= 60)
						grade = 'D';
					else
						grade = 'F';
		System.out.println("grade = " + grade);
	}
	public void thang(int month) {
		String monthString;
		switch(month) 
		{
			case 1: monthString="January"; break;
			case 2: monthString="February"; break;
			case 3: monthString="March"; break;
			case 4: monthString="April"; break;
			case 5: monthString="May"; break;
			case 6: monthString="June"; break;
			case 7: monthString="July"; break;
			case 8: monthString="Angust"; break;
			case 9: monthString="September"; break;
			case 10: monthString="October"; break;
			case 11: monthString="November"; break;
			case 12: monthString="December"; break;
			default: monthString="Invalid month"; break;
		}
		System.out.println(monthString);
	}
	public static void main(String[] args)
	{
		Conditional ct = new Conditional();
		int menu;
		do{
			System.out.println("=====================MENU==========================");
			System.out.println("Nhap 0, 1, 2");
			System.out.println("0.Thoat");
			System.out.println("1.Diem");
			System.out.println("2.Thang");
			System.out.print("Chon so: ");
			
			menu = ct.input();		
			switch(menu) 
			{
				case 0:break;
				case 1: 
				{
					System.out.print("Nhap vao diem: ");
					int testScore = ct.input();
					ct.doiDiem(testScore);
					break;
				}
				case 2:
				{
					System.out.print("Nhap vao thang: ");
					int month = ct.input();
					ct.thang(month);
					break;
				}
			}
		}while(menu>0);
	}
}





