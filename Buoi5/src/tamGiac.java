import java.util.*;
import java.lang.*;

public class tamGiac {
	private float a;
	private float b;
	private float c;

	public float getA() {
		return a;
	}

	public void setA(float a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(float b) {
		this.b = b;
	}

	public float getC() {
		return c;
	}

	public void setC(float c) {
		this.c = c;
	}

	public tamGiac() {
		this.setA(3);
		this.setB(4);
		this.setC(6);
	}

	public tamGiac(float a, float b, float c) {
		this.setA(a);
		this.setB(b);
		this.setC(c);
	}

	public void input() {
		float a, b, c;
		Scanner sc = new Scanner(System.in);

		do {
			do {
				System.out.print("Nhap vao do dai canh a: ");
				a = (float) sc.nextFloat();
				this.setA(a);
			} while (a < 0);

			do {
				System.out.print("Nhap vao do dai canh b: ");
				b = (float) sc.nextFloat();
				this.setB(b);
			} while (b < 0);
			do {
				System.out.print("Nhap vao do dai canh c: ");
				c = (float) sc.nextFloat();
				this.setC(c);
			} while (c < 0);
		}while(a + b > c && a + c > b && b + c > a);
	}

	public void display() {
		if((a + b > c && a + c > b && b + c > a)) {
			System.out.println("Do dai tam giac la: (" + this.getA() + ", " + this.getB() + ", " + this.getC() + ")");
		}
	}


	public void triangleType() {
		if((a + b > c && a + c > b && b + c > a)) {
			if (a == b && a == c) 
			{
				System.out.println("La tam giac deu");
			}  
			else if (((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)||(a*a)+(c*c)==(b*b))&&(a == b || a == c || b == c)) {
				System.out.println("La tam giac vuong can");
			}
			else if ((a*a)+(b*b)==(c*c)||(b*b)+(c*c)==(a*a)||(a*a)+(c*c)==(b*b)) 
			{
				System.out.println("La tam giac vuong");
			} 
			else if (a == b || a == c || b == c) 
			{
				System.out.println("La tam giac can");
			}
			else {
				System.out.println("La tam giac thuong");
			}
		}else {
			System.out.println("Khong la tam giac!");
			System.out.println("Nhap lai!");
		}	
	}

	public void perimeter() {
		if((a + b > c && a + c > b && b + c > a)) {
			float chuVi;
			chuVi = (float) (a + b + c);
			System.out.println("Chu vi tam giac  =  " + chuVi);

		}
	}

	public void acreage() {
		if((a + b > c && a + c > b && b + c > a)) {
			float chuVi, nuaChuVi;
			chuVi = (float) (a + b + c);
			nuaChuVi = chuVi / 2;
			float dienTich;
			dienTich = (float) Math.sqrt(nuaChuVi * (nuaChuVi - a) * (nuaChuVi - b) * (nuaChuVi - c));
			System.out.println("Dien tich tam giac  =  " + dienTich);
		}
	}

	public static void main(String[] args) {

		tamGiac obj1 = new tamGiac();
		obj1.display();

		tamGiac obj2 = new tamGiac(7, 8, 9);
		obj2.display();
		
		tamGiac obj3 = new tamGiac();
		obj3.input();
		obj3.triangleType();
		obj3.display();
		obj3.perimeter();
		obj3.acreage();
	}
}
