package passionjava017;

public class CheeseCake2 extends Cake2 {
	public int size; 	//Cheese size
	
	public CheeseCake2(int sz1, int sz2) {
		super(sz1);
		size=sz2;
	}
	public void showCakeSize() {
		//super.size�� ���� Ŭ������ ��� size�� �ǹ���
		System.out.println("Bread Ounces: "+super.size);
		
		//size�� �� Ŭ���� CheeseCake�� size�� �ǹ���
		System.out.println("Cheese Ounces: "+size);
	}

}
