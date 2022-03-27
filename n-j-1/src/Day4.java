import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.regex.*;
//Tinh Chan Le
public class Day4 {
	public int nhapSo() {
		int n;
		Scanner so1 = new Scanner(System.in);
		n = so1.nextInt();
		return n;
	}
	public void kiemTraChanLe(int so)
	{
		if(so % 2 == 0)
			System.out.println(so + " la so chan");
		else
			System.out.println(so + " la so le");
	}
	public static void main(String[] args) {
		int m;
		Day4 t = new Day4();
		System.out.print("Nhap vao so = ");
		m = t.nhapSo();
		t.kiemTraChanLe(m);
	}
}
