package passionjava017;

public class CheeseCake extends Cake {
	public void yummy() {
		super.yummy(); 		//Cake의 yummy 메소드 호출
		System.out.println("Yummy Cheese Cake");
	}
	public void tasty() {
		super.yummy(); 		//Cake의 yummy 메소드 호출
		System.out.println("Yummy Tasty Cake");
	}
}
