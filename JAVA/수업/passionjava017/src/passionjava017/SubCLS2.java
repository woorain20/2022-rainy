package passionjava017;

public class SubCLS2 extends SuperCLS2 {
	public SubCLS2() {
		System.out.println("Con: CubCLS2()");
	}
	public SubCLS2(int i) {
		super(i);	//���� Ŭ������ �����ڸ� ���� �� ȣ��
		System.out.println("Con: SubCLS2(int i)");
	}
	public SubCLS2(int i, int j) {
		super(i,j);
		System.out.println("Con: SubCLS2(int i, int j)");
	}


}
