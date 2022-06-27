package passionjava005;

public class UseVariable06 {
	public static void main(String[] args) {
		int num1; // 변수 num1의 선언
		num1=185; // 변수 num1에 185를 저장
		
		int num2=214; // 변수 num2 선언과 동시에 214로 초기화
		int num3=187; // 변수 num3 선언과 동시에 187로 초기화
		int num4=num1+num2; // 두 변수 값을 대상으로 덧셈
		System.out.println(num1+"+"+num2+"="+num4);
		int num5=num2-num3; // 두 변수 값을 대상으로 뺄셈
		System.out.println(num2+"-"+num3+"="+num5);
		int num6=num1*num5; // 두 변수 값을 대상으로 곱셈
		System.out.println(num1+"*"+num5+"="+num6);
		int num7=num4/num5; // 두 변수 값을 대상으로 나눗셈
		System.out.println(num4+"/"+num5+"="+num7);
	}

}
