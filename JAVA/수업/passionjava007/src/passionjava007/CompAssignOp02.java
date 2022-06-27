package passionjava007;

public class CompAssignOp02 {
	public static void main(String[] args) {
		
		short num=12;
		num=(short)(num+79L); // 형 변환 안 하면 컴파일 오류 발생
		int rate=4;
		rate=(int)(rate*4.5); // 형 변환 안 하면 컴파일 오류 발생
		System.out.println(num);
		System.out.println(rate);
		
		num=12;
		num+=79L; // 형 변환 필요하지 않다.
		rate=4;
		rate*=4.5; // 형 변환 필요하지 않다.
		System.out.println(num);
		System.out.println(rate);
	}
}
