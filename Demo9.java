import java.util.*;
public class Demo9 {
	public int input() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public int calculateOdd(int n) {
		int sum = 0;
		for(int  i = 0; i<=n; i++) {
			sum += i;
			i++;
		}
		System.out.println("Sum odd = "+sum);
		return sum;
	}
	public int calculateEven(int n) {
		int sum = 0;
		for(int  i = 1; i<=n; i++) {
			sum += i;
			i++;
		}
		System.out.println("Sum even = "+sum);
		return sum;
	}
	public static void main(String[] args) {
		Demo9 obj = new Demo9();
		System.out.print("Nhap vao n: ");
		int n = obj.input();
		if(n%2==0) {
			obj.calculateOdd(n);
		}else {
			obj.calculateEven(n);
		}
	}
}
