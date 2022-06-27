package passionjava008;

public class IEIE05 {
	public static void main(String[] args) {
		int num1=5;
		int num2=12;
		int num3=num1+num2;
		if(num3<0) {
			System.out.println("num3은 음수");
		}else if(num3<10) {
			System.out.println("0<num3<10");
		}else if(num3<20) {
			System.out.println("10<num3<20");
		}else if(num3<30) {
			System.out.println("20<num3<30");
		}else {
			System.out.println("num3은 30이상");
		}
	}

}
