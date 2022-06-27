package chapter10;

public class NumberPrinter {
	
	private int myNum=0;
	
	//클래스 메소드
	//static은 메인에만 붙이는 걸로
	static void showInt(int n) {
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		NumberPrinter.showInt(111);
	}
}
