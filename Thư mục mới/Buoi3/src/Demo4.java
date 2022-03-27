import java.util.*;
public class Demo4 {
	public int input() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public static void main(String[] args) {
		Demo4 obj = new Demo4();
		System.out.print("Nhap vao n: ");
		int n = obj.input();
		
		int i = 0, check;
		System.out.print("So hoan hao la: ");
		while(i < n) {
			check = find_perfect_num(i);
			if(check == 1) System.out.print(i + " ");
			++i;
		}		
	}
	private static int find_perfect_num(int n) 
	{
		int total = 0;
		int check  = 0;
		for(int i=1; i<n; i++)
		{
		    if(n%i==0) 
		    	total+=i;
		}   
		if (total == n & n!=0) check = 1;
	    return check;
	}
}
