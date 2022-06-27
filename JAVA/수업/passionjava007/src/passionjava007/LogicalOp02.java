package passionjava007;

public class LogicalOp02 {
	public static void main(String[] args) {
		int num1=39;
		int num2=33;
		boolean result;
		//변수 num1에 저장된 값이 1과 100사이의 수인가?
		result=(1<=num1)&&(num1<=100);
		System.out.println("1초과 100미만인가?"+result);
		//변수 num2에 저장된 값이 2 또는 3의 배수인가?
		result=((2%2)==0)||((2%3)==0);
		System.out.println("2 또는 3의 배수인가?"+result);
		//변수 num1이 50인가?
		result=!(num1!=50);
		System.out.println("50인가?"+result);
	}
}
