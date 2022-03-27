import java.util.*;
public class Demo8 {
	public int input() {
		System.out.print("Nhap vao n: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public void total(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) 
		{
			sum += i;
		}
		System.out.println("Sum = " + sum);
	}
	public static void main(String[] args) {
		Demo8 b8 = new Demo8();
		int n = b8.input();
		b8.total(n);
	}
}
