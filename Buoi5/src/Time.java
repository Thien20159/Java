//Le Hoang Thien DTH216164 DH22TH3
import java.util.*;
public class Time {
	private int day;
	private int month;
	private int year;

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public Time() {
		this.setDay(25);
		this.setMonth(02);
		this.setYear(2015);
	}
	public void inputDMY() {
		int d, m, y;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhap vao ngay: ");
			d = sc.nextInt();
			this.setDay(d);
		}while(d<0||d>31);
		
		do {
			System.out.print("Nhap vao thang: ");
			m = sc.nextInt();
			this.setMonth(m);
		}while(m<0||m>12);
		
		do {
			System.out.print("Nhap vao nam: ");
			y = sc.nextInt();
			this.setYear(y);
		}while(y<0);
	}
	public void display() {
		System.out.println("Time: "+this.getDay()+"/"+this.getMonth()+"/"+this.getYear());
	}
	public static void main(String[] args) {
		Time obj1 =  new Time();
		Time obj2 =  new Time();
		obj2.display();
		obj1.inputDMY();
		obj1.display();
	}
	
}
