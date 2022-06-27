package passionjava017;

public class CheeseCake2 extends Cake2 {
	public int size; 	//Cheese size
	
	public CheeseCake2(int sz1, int sz2) {
		super(sz1);
		size=sz2;
	}
	public void showCakeSize() {
		//super.size는 상위 클래스의 멤버 size를 의미함
		System.out.println("Bread Ounces: "+super.size);
		
		//size는 이 클래스 CheeseCake의 size를 의미함
		System.out.println("Cheese Ounces: "+size);
	}

}
