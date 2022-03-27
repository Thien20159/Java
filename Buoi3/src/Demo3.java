//Buoi 3 bai 3
import java.util.*;
public class Demo3 {
	public int input() {
		Scanner sc = new Scanner(System.in);
		int number =  sc.nextInt();
		return number;
	}
	public void check(int a, int b) {
		System.out.print("So chia het cho 3 hoac 5 la: ");
		for(int i = a; i <= b ; i++) {
			if(i%3==0 || i%5==0) {
				System.out.print(i + " ");
			}else {
				continue;
			}
		}
	}
	public static void main(String[] args) {
		Demo3 obj = new Demo3();
		System.out.print("Nhap vao a: ");
		int a = obj.input();
		System.out.print("Nhap vao a: ");
		int b = obj.input();
		obj.check(a, b);
	}
}
