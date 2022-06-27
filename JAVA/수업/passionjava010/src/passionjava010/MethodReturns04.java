package passionjava010;

public class MethodReturns04 {
	public static void main(String[] args) {
		int result;
		result=subtract(12,7);
		System.out.println("12-7="+result);
		System.out.println("8/4="+divide(8,4));
		System.out.println(divide(subtract(32,6),(subtract(12,4))));
		System.out.println(subtract(subtract(subtract(54,33),subtract(33,11)),subtract(subtract(15,9),5)));
		System.out.println(divide(divide(84,6),4));
	}
	public static int subtract(int num1, int num2) {
		int subtractResult=num1-num2;
		return subtractResult;
	}
	public static double divide(double num1, double num2) {
		return num1/num2;
	}
}
