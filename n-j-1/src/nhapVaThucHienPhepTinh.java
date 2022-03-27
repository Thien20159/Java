import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.regex.*;
public class nhapVaThucHienPhepTinh {
	public int nhap2So() {
		Scanner inPut = new Scanner(System.in);
		int num = inPut.nextInt();
		return num;
	}
	public int nhap2so1() {
		try {
			int ch = System.in.read();
			return ch;
		}
		catch(IOException ie) {
			System.out.print("Error" + ie);;
			return 0;
		}
	}
	public void thucHien(int a, int b, int ch) {
		int kq = 0;
		try {
			if((char)ch == '+')
				kq = a+b;
			if((char)ch == '-')
				kq = a-b;
			if((char)ch == '*')
				kq = a*b;
			if((char)ch == '/')
				kq = a/b;
			System.out.println("Phép toán "+a + " "+(char)ch +" "+b +" = " + kq);
		}
		catch(ArithmeticException ex) {
			System.out.print("Khong duoc chia cho 0");
		}
	}
	public static void main(String[] args) {
		nhapVaThucHienPhepTinh pt = new nhapVaThucHienPhepTinh();
		int a, b, ch;
		System.out.print("Nhap so a = ");
		a = pt.nhap2So();
		System.out.print("Nhap so b = ");
		b = pt.nhap2So();
		System.out.print("Nhap 1 trong 4 phep toan(+,-,*,/): ");
		ch = pt.nhap2so1();
		pt.thucHien(a, b, ch);
	}

}

