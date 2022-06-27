package passionjava010;

public class MethodReturns05 {
	public static void main(String[] args) {
		int result1;
		int result2;
		result1=adder(42,28);
		result2=subtra(56,19);
		System.out.println("42+28="+result1);
		System.out.println("56-19="+result2);
		System.out.println("6.8X6.8="+square(6.8));
		System.out.println("68/34="+divide(68,34));
		System.out.println(divide(adder(32,65),subtra(43,12)));
		System.out.println(square(subtra(43,37)));
		System.out.println(divide(subtra(adder(43,76),adder(12,33)),square(4)));
		System.out.println(square(subtra(122,subtra(43,32))));
		System.out.println(adder(subtra(93,67),adder(38,4)));
	}
	public static int adder(int num1, int num2) {
		int addResult=num1+num2;
		return addResult;
	}
	public static int subtra(int num1, int num2) {
		int subResult=num1-num2;
		return subResult;
	}
	public static double square(double num) {
		return num*num;
	}
	public static double divide(double num1, double num2) {
		return num1/num2;
	}
}
