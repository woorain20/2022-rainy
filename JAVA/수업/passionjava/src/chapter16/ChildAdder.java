package chapter16;

public class ChildAdder extends ParentAdder {

	//메소드 오바라이드가 아니고 메소드 오버로딩
//	public double add(double a, double b) {
//		System.out.println("덧셈을 진행합니다.");
//		return a+b;
//	}
	
	//프로그래머의 실수하는 상황을 막기 위해 어노테이션을 써준다
	@Override // 어노테이션, 오버라이드 문법을 벗어나면 오류 표시가 나타남
	public int add(int a, int b) {
		System.out.println("덧셈을 진행합니다.");
		return a+b;
	}
	
	

}
