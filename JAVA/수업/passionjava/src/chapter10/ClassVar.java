package chapter10;

public class ClassVar {
	//인스턴스 변수
//	private int instNum=0;
	//클래스 변수 - 사용하면 객체지향 관점에서는 좋지 않다
	//static - 메모리에 바로 올라가서 사용 준비 완료
	// System.out.println();의 out=public static final의 의미
	public static final int instNum=0;
	
	public static void main(String[] args) {
//		ClassVar classVar=new ClassVar();
//		System.out.println(classVar.instNum);
		System.out.println(instNum);
	}
}
