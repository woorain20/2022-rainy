package chapter4;

public class ArithOp {
	public static void main(String[] args) {
		int num1=7;
		int num2=3;
		int num3=num1+num2;
		//ctrl+/ 마우스로 선택된 것을 주석처리 및 해제
		System.out.println(num1+num2);
		System.out.println(num3);
		System.out.println(num1-num2);
		System.out.println(num1*num2);
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		int num4=1, num5=3, num6=2;
		System.out.println(num4+num5*num6);
		System.out.println((num4+num5)*num6);
		//복합 대입 연산자
		int i=0;
		i=i+1;
		System.out.println(i);
		i+=1;
		System.out.println(i);
	}

}
