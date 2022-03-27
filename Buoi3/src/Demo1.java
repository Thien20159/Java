import java.util.Scanner;
public class Demo1 {
	public int input() {
		System.out.print("Nhap vao n: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public static boolean check(int n) {
		 if (n < 2) return false;
		 for (int i = 2; i < (n - 1); i++)
		 {
		        if (n % i == 0)
		        {
		            return false;
		        } 
		        
		}
		return true;
	}
	public static void main(String[] args) {
		Demo1 obj = new Demo1();
		int n = obj.input();
		Demo1.check(n);
		
        System.out.print("Primes list : ");
		for(int i = 2; i < n; i++) {
			if(check(i)){
	            System.out.print(i + " ");
	        } 
		}

	}
}
