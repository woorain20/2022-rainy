package passionjava010;

public class MethodReturns03 {
	public static void main(String[] args) {
		int result;
		result=adder(43,56);
		System.out.println("43+56="+result);
		System.out.println("11X11="+square(11));
		System.out.println(square(adder(5,17)));
		System.out.println(square(square(square(4))));
		System.out.println(adder(adder(3,adder(2,7)),(adder(6,34))));
	}
	public static int adder(int num1, int num2) {
		int addResult=num1+num2;
		return addResult;
	}
	public static double square(double num) {
		return num*num;
	}

}
