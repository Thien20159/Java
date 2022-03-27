public class Demo7 {
	public static void main(String[] args) {
		Demo7 b7 = new Demo7();
		boolean a = true;
		int b = 0;
		while(a) {
			b++;
			System.out.println(b);
			if(b>=10) {
				a = false;
			}
		}
	}
}
