package passionjava007;

public class CompAssignOp03 {
	public static void main(String[] args) {
		short num=34;
		num=(short)(num+86L);
		int rate=6;
		rate=(int)(rate*5.7);
		System.out.println(num);
		System.out.println(rate);
		
		num=34;
		num+=86L;
		rate=6;
		rate*=5.7;
		System.out.println(num);
		System.out.println(rate);
	}
}
