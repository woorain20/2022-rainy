package passionjava008;

public class IEIE06 {
	public static void main(String[] args) {
		int num1=3;
		int num2=9;
		int num3=2;
		int num4=8;
		int num5=(num4-num1)*(num2+num3);
		System.out.println(num5);
		if(num5<0) {
			System.out.println("음수");
		}else if(num5<50) {
			System.out.println("50미만");
		}else if(num5<100) {
			System.out.println("100미만");
		}else if(num5<150) {
			System.out.println("150미만");
		}else {
			System.out.println("150이상");
		}
	}

}
