import java.util.*;
public class Demo4 
{
	public int input()
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		while(number<=0) {
			System.out.print("Hay nhap lai n > 0: ");
			number = sc.nextInt();
		}
		return number;
	}
	public static void main(String[] args) 
	{
		Demo4 b4 = new Demo4();
		System.out.print("Nhap n: ");
		int n = b4.input();
		
		int sum = 0 ;
		for(int i = 1; i <= n; i++) 
		{
			sum += i;
		}
		System.out.println("Tong 1 -> " +n+": "+sum);
	}
}
