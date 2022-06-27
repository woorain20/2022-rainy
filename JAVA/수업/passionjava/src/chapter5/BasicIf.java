package chapter5;

public class BasicIf {
	public static void main(String[] args) {
		int n1=5;
		int n2=7;
		if(n1<n2) {
			//소괄호의 조건이 true일 때 실행
//			System.out.println("5<7 is true");
//			System.out.println("5<7 is true");
//			System.out.println("5<7 is true");
		}
		//if문에 속한 문장이 하나일 경우 중괄호 생략 가능
		if(n1>n2)
			System.out.println("5<7 is true in if");
		//중괄호 생략되었을 때는 하나밖에 못 넣음
		if(n1>n2) {
			System.out.println("5<7 is true in if");
		}	
//		System.out.println("5<7 is true");
		//if ~ else문
		if(n1==n2) {
			System.out.println("n1==n2 is true");
		}else {
			//소괄호의 조건이 false일 때 실행되는 영역
			System.out.println("n1==n2 is false");
		}
	}

}
