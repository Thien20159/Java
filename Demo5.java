
import java.util.*;
public class Demo5 {
	public int input() 
	{
		System.out.print("Nhap vao n: ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public int evenCount()
	{
		int sum = 0;
		for(int i=0; i<=20; i++) 
		{
			sum += i;
//			System.out.println(i);
			i++;

		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Demo5 b5 = new Demo5();
		int n = b5.input();
		
		System.out.println("Tong cua 10 so chan dau tien la: " + b5.evenCount());
	}
}
