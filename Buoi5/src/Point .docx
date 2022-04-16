//Le Hoang Thien DTH216164 DH22TH3
import java.util.*;
import java.lang.*;

public class Point {
	private String tenDiem;
	private double tungDo;
	private double hoanhDo;
	
	public String getTenDiem() {
		return tenDiem;
	}
	public void setTenDiem(String tenDiem) {
		this.tenDiem = tenDiem;
	}
	public double getTungDo() {
		return tungDo;
	}
	public void setTungDo(double tungDo) {
		this.tungDo = tungDo;
	}
	public double getHoanhDo() {
		return hoanhDo;
	}
	public void setHoanhDo(double hoanhDo) {
		this.hoanhDo = hoanhDo;
	}
	public void input() {
		String ten;
		double tdo, hdo;

		Scanner n = new Scanner(System.in);
		
		System.out.print("Nhap ten diem: ");
		ten = n.nextLine();
		this.setTenDiem(ten);
		
		System.out.print("Hoanh do: ");
		hdo = n.nextDouble();
		this.setHoanhDo(hdo);
		
		System.out.print("Tung do: ");
		tdo = n.nextDouble();
		this.setTungDo(tdo);
	}

	public void display() {
		System.out.println("Point: "+this.getTenDiem()+" at ("+this.getHoanhDo()+", "+this.getTungDo()+")");
	}
	public double check(Point a, Point b) {
		double result, x, y;
		x = Math.pow(a.getHoanhDo() - b.getHoanhDo(),2);
		y = Math.pow(a.getTungDo() - b.getTungDo(),2);
		result = Math.sqrt(x+y);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Nhap vao diem A: ");
		Point a = new Point();
		a.input();
		System.out.println("Nhap vao diem B: ");
		Point b = new Point();
		b.input();
		System.out.println("Khoang cach tu diem A -> B: "+b.check(a, b));
	}
}
