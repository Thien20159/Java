import java.util.*;
public class Demo2 {
	private Scanner sc;
	public char input() {
		Scanner sc = new Scanner(System.in);
		char n = sc.next().charAt(0);
		return n;
		 
	}
	//switch case
	public int checkSwitch(char a) {
		switch(a){
			case 'khong':
			{
				System.out.println("0");
				break;
			}
			case "mot":
			{
				System.out.println("1");
				break;
			}
			case "hai":
			{
				System.out.println("2");
				break;
			}
			case "ba":
			{
				System.out.println("3");
				break;
			}
			case "bon":
			{
				System.out.println("4");
				break;
			}
			case "nam":
			{
				System.out.println("5");
				break;
			}
			case "sau":
			{
				System.out.println("6");
				break;
			}
			case "bay":
			{
				System.out.println("7");
				break;
			}
			case "tam":
			{
				System.out.println("8");
				break;
			}
			case "chin":
			{
				System.out.println("9");
				break;
			}
			
			default:
			{
				System.out.println("Nhap sai!");
				break;
			}
		}
		return a;
	}
	//if else
	public void checkIf(char b) {
		System.out.println(b);
		if(b=='khong') 
				System.out.println("0");
			else if(b=='mot') 
					System.out.println("1");
				else if(b=="hai") 
						System.out.println("2");
					else if(b =="ba") 
							System.out.println("3");
						else if(b=="bon") 
								System.out.println("4");
							else if(b=="nam") 
									System.out.println("5");
								else if(b=="sau") 
										System.out.println("6");
									else if(b=="bay") 
											System.out.println("7");
										else if(b=="tam") 
												System.out.println("8");
											else if(b=="chin") 
													System.out.println("9");
												else 
														System.out.println("Nhap sai!");
	}
	public static void main(String[] args) {
		Demo2 obj = new Demo2();
		System.out.print("Nhap vao string a(khong nhap dau): ");
		char a = obj.input();
		System.out.print("Nhap vao string b(khong nhap dau): ");
		char b = obj.input();
		obj.checkSwitch(a);
		obj.checkIf(b);
	}
}
