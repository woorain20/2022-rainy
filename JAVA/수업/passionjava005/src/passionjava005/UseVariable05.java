package passionjava005;
/*
 * 파일이름: UseVaraiable05
 * 작성자: 홍길동
 * 작성일: 2021년 3월 12일
 * 목적: System.out.println 메소드의 기능 테스트
 */

public class UseVariable05 {
	public static void main(String[] arge) {
		int num1; // 변수 num1의 선언
		num1=358; // 변수 num1에 358을 저장
		int num2=48; // 변수 num2 선언과 동시에 48로 초기화
		int num3=39; // 변수 num3 선언과 동시에 39로 초기화
		int num4=2; // 변수 num4 선언과 동시에 2로 초기화
		int num5=78; // 변수 num5 선언과 동시에 78로 초기화
		int num6=num1+num2; // 두 변수 값을 대상으로 덧셈
		int num7=num1+num3;
		int num8=num4*num5; // 두 변수 값을 대상으로 곱셈
		int num9=num1*num4;
		int num10=num5-num3; // 두 변수 값을 대상으로 뺄셈
		int num11=num1-num2-num3; // 세 변수 값을 대상으로 뺄셈
		int num12=num1/num4; // 두 변수 값을 대상으로 나눗셈
		System.out.println(num1+"+"+num2+"="+num6);
		System.out.println(num1+"+"+num3+"="+num7);
		System.out.println(num4+"*"+num5+"="+num8);
		System.out.println(num1+"*"+num4+"="+num9);
		System.out.println(num5+"-"+num3+"="+num10);
		System.out.println(num1+"-"+num2+"-"+num3+"="+num11);
		System.out.println(num1+"/"+num4+"="+num12);
	}

}
