import java.util.*;
public class Demo6 {
	public int input()
	{
		int num;
		do{
			System.out.print("Hãy nhập một số > 0: ");
			Scanner sc=new Scanner(System.in);
			num = sc.nextInt();
		}while(num<0);
			return num;
	}
	public void findFactor(int n) {
		int number, i;
		number = n;
		i = 2;
		System.out.print(n + " = ");
		do{
			if(number % i == 0)
			{
				number = number / i;
				System.out.print(" "+i);
				i = 1;
				if(number != 1)
				System.out.print(" * ");
			}
			i++;
		}while(number != 1);

	}
	public static void main(String[] args) {
		Demo6 obj = new Demo6();
		int n = obj.input();
		obj.findFactor(n);
	}

}
