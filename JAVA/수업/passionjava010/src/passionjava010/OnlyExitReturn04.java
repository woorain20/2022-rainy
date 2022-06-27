package passionjava010;

public class OnlyExitReturn04 {
	public static void main(String[] args) {
		adder(32,53);
		adder(123,34);
		divide(2432,32);
		divide(341,0);
		other(432,39);
		other(3412,343);
		other(832,63);
		other(42,6);
		subtra(1312,567);
		subtra(344,546);
		square(43,22);
		square(34,67);
	}
	public static void adder(int num1, int num2) {
		if(num1+num2>150) {
			System.out.println("계산값 초과");
			return;
		}
		System.out.println("Result1: "+num1+num2);
	}
	public static void divide(int num1, int num2) {
		if(num2==0) {
			System.out.println("Error1");
			return;
		}
		System.out.println("Result2: "+num1/num2);
	}
	public static void other(int num1, int num2) {
		if(num1%num2==0) {
			System.out.println("나머지 0");
			return;
		}else if(num1%num2<5) {
			System.out.println("나머지 5미만");
			return;
		}else {
			System.out.println("나머지 5이상");
		}
	}
	public static void subtra(int num1, int num2) {
		if(num1-num2<0) {
			System.out.println("Error2");
			return;
		}
		System.out.println("Result3: "+(num1-num2));
	}
	public static void square(int num1, int num2) {
		if(num1*num2>1000) {
			System.out.println("Big");
			return;
		}
		System.out.println("Result4: "+num1*num2);
	}
}
