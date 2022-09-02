package chapter27;

public class PrinterMain {
	public static void main(String[] args) {
		// 인터페이스 쓰는 방법 - 라이브러리 쓸 때 (멀티쓰레드)
		//1 클래스로 구현
		//2 익명클래스
		//3 람다 - 메소드 매개변수+몸체
		Printable printable=new Printable() {
			
			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		printable.print("Hello World!");
		
		Printable printable2=(String s)->{
			System.out.println(s);
		};
		
		printable2.print("Hello Lambda!");
		
		Printable printable3=s->System.out.println(s);
		printable3.print("Hello Lambda2!");
	}

}






