import java.util.Scanner;
public class Demo7 {
	public int input() {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		return number;
	}
	public void binaryExchange(int n) {
		int a = 0;
		int reversed = 0;
		String arr[];
		List<String> testList = new ArrayList<>(Arrays.asList(arr));
		while (n != 0)
        {
            a = n % 2;
            n = n/2;
            testList.push(a);
            System.out.print(testList);
        }
		System.out.print(testList);
		while(a != 0) {
			   int digit = a % 10;
			   reversed = reversed * 10 + digit;
			   a = a / 10;
			}
//        	System.out.print(reversed);
	}
	public static void main(String[] args) {
		Demo7 obj = new Demo7();
		System.out.print("Nhap vao so: ");
		int n = obj.input();
		obj.binaryExchange(n);
//		System.out.println(n);
	}
}