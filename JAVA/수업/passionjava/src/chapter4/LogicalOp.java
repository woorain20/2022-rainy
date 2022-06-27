package chapter4;

public class LogicalOp {
	public static void main(String[] args) {
		int num1=1;
		int num2=2;
		int num3=2;
		boolean result;
		result=(num2>num1)&&(num2==num3); // and 연산자
		result=(num2<num1)&&(num2==num3);
		result=(num2<num1)||(num2==num3); //shift + 원화 =||, or 연산자
		result=(num2<num1)||(num2!=num3);
		System.out.println(result);
		System.out.println(!result);
		result=!result;
		System.out.println(!result);
	}

}
