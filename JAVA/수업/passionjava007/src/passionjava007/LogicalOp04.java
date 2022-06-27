package passionjava007;

public class LogicalOp04 {
	public static void main(String[] args) {
		int num1=245;
		int num2=105;
		boolean result;
		//변수 num1에 저장된 값이 200과 250 사이의 수인가?
		result=(200<=num1)&&(num1<=250);
		System.out.println("200초과 250미만인가?"+result);
		//변수 num2에 저장된 값이 5 또는 7의 배수인가?
		result=((num2%5)==0)||((num2%7)==0);
		System.out.println("5 또는 7의 배수인가?"+result);
		//변수 num2가 35인가?
		result=!(num2!=35);
		System.out.println("35인가?"+result);
		result=!(num2!=70);
		System.out.println("70인가?"+result);
		result=!(num2!=105);
		System.out.println("105인가?"+result);
	}

}
