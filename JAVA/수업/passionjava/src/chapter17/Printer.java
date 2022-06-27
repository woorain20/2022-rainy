package chapter17;

//상속 - 변수, 메소드를 이어 받는 것
//인터페이스 - 구현(불완전한 추상 메소드를 완전하게)
public class Printer implements Printable{

	@Override
	public void print(String doc) {
		System.out.println(doc);
		
	}

}
