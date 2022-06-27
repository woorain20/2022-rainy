package chapter17;

public class PrintableInterface {
	public static void main(String[] args) {
		Printable printable = new Printer();
		printable.print("Hello Java");
		//상속은 1개만 상속해야 되지만. 구현은 여러개 가능. 상속과 구현을 동시에 하는 것도 가능 	
	}
}
