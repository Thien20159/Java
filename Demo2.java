//Demo while, do while, for
class ForDemo{
	public static void main(String[] args){
		//for
		for(int i=1;i<11;i++)
			System.out.println("i = " + i);
		int count1 = 1;
		//while
		while(count1 < 11) {
			System.out.println("count = " + count1);
			count1++;
		}
		//do while
		int count2 = 1;
		do {
			System.out.println(count2);
			count2++;
		}while(count2 < 11);
		
	}
}