package passionjava005;

public class VariableDeci05 {
	public static void main(String[] args) {
		double num1, num2, num3, num4; // 4개의 변수 동시 선언
		double result1;
		double result2;
		double result3;
		double result4;
		double result5;
		num1=1.00000001;
		num2=2.00000001;
		num3=3.00000001;
		num4=5.30000001;
		result1=num1+num2;
		result2=num3+num4;
		result3=num1+num2+num3+num4;
		result4=num4-num1;
		result5=num1*num2;
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
	}

}
