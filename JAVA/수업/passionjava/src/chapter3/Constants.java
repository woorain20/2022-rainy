package chapter3;

//이클립스 창 열기 - window > show view 
//창 레이아웃 초기화 - window > perspective > reset

public class Constants {
	public static void main(String[] args) {
		// main ctrl+space 자동완성
		//alt + 화살표 - 한줄이동
		// 변수
		int num1=10;
		int num2=50;
		System.out.println("1: "+num1);
		num1=15;
		System.out.println("2: "+num1);
		num1=20;
		System.out.println("3: "+num1);
		//0-일반유저, 1-관리자
		int auth=0;
		auth=1;
		System.out.println(auth);
		// 상수
		final int MAX_SIZE=100;
		//maxSize=150; 불가
		System.out.println(MAX_SIZE);
		//리터럴
		int num3=10;
		//정수 리터럴->int
		//int 2^32까지 표현(+-21억)
		//int > long(숫자 뒤 대문자 혹은 소문자 L,l)
		System.out.println(3147483647L);
		System.out.println(3147483647l);
		//실수 double
		System.out.println(3.14d);
		System.out.println(3.14D);
		//실수 float
		System.out.println(3.14f);
		System.out.println(3.14F);
		//돈의 단위
		//1,000/1,000,000
		int num4=1_000_000;
	}

}
