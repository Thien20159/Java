import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.io.*;
import java.text.*;
import java.util.regex.*;
public class enterStudentInformation {
	int id;
	int age;
	int year;
	int mediumScore;
	String name;
	public void inPut(){
		Scanner ip = new Scanner(System.in);

		System.out.println("Nhap vao ten: ");
		name = ip.nextLine();
		
		System.out.println("Nhap vao ma sinh vien: ");
		id = ip.nextInt();
		
		System.out.println("Nhap vao tuoi: ");
		age = ip.nextInt();
		
//		ip.close();
	}
	
	public void outPut(){
		System.out.print("Thong tin sinh vien: ");
		System.out.println("\nMa sinh vien la " + id + "\nTen sinh vien: "+ name +"\nTuoi: " + age );
	}
	public static void main(String[] args) {
		enterStudentInformation a = new enterStudentInformation();
	       a.inPut();
	       a.outPut();
	}
}
