import java.util.*;
public class Demo5 {
	public int input() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public void calculateSum(int n) {
		int sum = 0;
		while(n>0) {
			sum+=n%10;
			n=n/10;
		}
		System.out.print("sum = "+sum);
	}
	public static void main(String[] args) {
		Demo5 obj = new Demo5();
		System.out.print("Nhap vao so nguyen: ");
		int n = obj.input();
		obj.calculateSum(n);
	}
}
