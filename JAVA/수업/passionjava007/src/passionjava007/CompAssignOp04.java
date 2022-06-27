package passionjava007;

public class CompAssignOp04 {

	public static void main(String[] args) {
		short num=543;
		num=(short)(num+243L);
		int rate=21;
		rate=(int)(rate*4.6);
		System.out.println(num);
		System.out.println(rate);
		
		num=543;
		num+=243L;
		rate=21;
		rate*=4.6;
		System.out.println(num);
		System.out.println(rate);

	}

}
