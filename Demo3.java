//random
import java.util.*;
public class Demo3{
	public static void main(String[] args) {
		Random r = new Random();
		int max = 50;
		int min = 10;
		int rnum = r.nextInt(min, max);
		System.out.println("Gia tri ngau nhien la " + rnum);
	}
}