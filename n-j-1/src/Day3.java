import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.regex.*;
public class Day3 {
	public float nhapSo()
	{
		float n;
		Scanner so1 = new Scanner(System.in);
		n = so1.nextFloat();
		return n;
	}
	public float tinhDienTich(float d, float r)
	{
		float S;
		S = d * r;
		return S;
	}
	public static void main(String[] args) {
		float dai, rong, dientich;
			Day3 hcn = new Day3();
			System.out.print("Enter width: ");
			dai = hcn.nhapSo();
			
			System.out.print("Enter height: ");
			rong = hcn.nhapSo();
			
			dientich = hcn.tinhDienTich(dai, rong);
			System.out.println("Dien tich = "+ dientich);
	}
}




