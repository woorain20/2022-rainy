package passionjava008;

public class IEIE04 {
	public static void main(String[] args) {
		int num1=15;
		int num2=24;
		int num3=num1+num2;
		if(num3<10) {
			System.out.println("10미만");
		}else if(num3<20) {
			System.out.println("10이상 20미만");
		}else if(num3<30) {
			System.out.println("20이상 30미만");
		}else if(num3>40) {
			System.out.println("30이상 40미만");
		}else if(num3<35) {
			System.out.println("30이상 35미만");
		}else if(num3==39) {
			System.out.println("num3: 39");
		}else {
			System.out.println("39");
		}
	}
}
