package chapter11;

public class Person {
	
	private int regiNum;
	private int passNum;
	
	public Person(int regiNum) {
		this.regiNum = regiNum;
	}
	
	public Person(int regiNum, int passNum) {
		this.regiNum = regiNum;
		this.passNum = passNum;
	}
	
	public void showPersonalInfo() {
		System.out.println("주민번호: "+regiNum);
		if(passNum!=0) {
			System.out.println("여권번호: "+passNum);
		}else {
			System.out.println("여권 없음");
		}
	}
	
	public static void main(String[] args) {
		//친구 A
		Person p1=new Person(201001013, 35487355);
		p1.showPersonalInfo();
		//친구 B - 여권 없음
		Person p2=new Person(201001013);
		p2.showPersonalInfo();
	}
	
}
