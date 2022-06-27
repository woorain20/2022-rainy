package chapter6;

public class OnlyExitReturn {
	public static void main(String[] args) {
		divide(4,2);
		divide(9,0);
	}
	//return 1. 값을 반환 2. 메소드의 종료
	public static void divide(int num1,int num2) {
		if(num2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		}
		System.out.println("나눗셈 결과: "+num1/num2);
	}
}
