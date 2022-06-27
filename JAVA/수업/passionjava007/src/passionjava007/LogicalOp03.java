package passionjava007;

public class LogicalOp03 {
	public static void main(String[] args) {
		int num1=156;
		int num2=48;
		boolean result;
		//변수 num1에 저장된 값이 1과 100 사이의 수인가?
		result=(1<=num1)&&(num1<=100);
		System.out.println("1 초과 100 미만의 수인가"+result);
		//변수 num2에 저장된 값이 3 또는 4의 배수인가?
		result=((num2%3)==0)||((num2%4)==0);
		System.out.println("3 또는 4의 배수인가?"+result);
		result=((num2%5)==0)||((num2%7)==0);
		System.out.println("5 또는 7의 배수인가?"+result);
		//변수 num1이 150인가?
		result=!(num1!=150);
		System.out.println("150인가?"+result);
	}

}
