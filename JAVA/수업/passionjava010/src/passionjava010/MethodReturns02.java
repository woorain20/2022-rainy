package passionjava010;

public class MethodReturns02 {
	public static void main(String[] args) {
		int result=adder(11,7);
		System.out.println(square(adder(7,35)));
		System.out.println(square(square(6)));
		System.out.println(adder(adder(4,64),adder(3,16)));
		System.out.println("11+7="+result);
		System.out.println("8X8="+square(8));
	}
	public static int adder(int num1,int num2) {
		int addResult=num1+num2;
		return addResult;
	}
	public static double square(double num) {
		return num*num;
	}
}
