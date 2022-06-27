package passionjava010;

public class MethodReturns01 {
	public static void main(String[] args) {
		int result;
		result=adder(5,7);
		System.out.println(square(adder(12,5)));
		System.out.println("5+7="+result);
		System.out.println("5.5x5.5="+square(5.5));
	}
	public static int adder(int num1, int num2) {
		int addResult=num1+num2;
		return addResult;
	}
	public static double square(double num) {
		return num*num;
	}

}
