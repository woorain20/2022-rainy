package passionjava017;

public class SubCLS2 extends SuperCLS2 {
	public SubCLS2() {
		System.out.println("Con: CubCLS2()");
	}
	public SubCLS2(int i) {
		super(i);	//상위 클래스의 생성자를 지정 및 호출
		System.out.println("Con: SubCLS2(int i)");
	}
	public SubCLS2(int i, int j) {
		super(i,j);
		System.out.println("Con: SubCLS2(int i, int j)");
	}


}
