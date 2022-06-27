package chapter11;

public class ConOverloading {
	
	public static void main(String[] args) {
		//여권 있는 사람의 정보를 담은 인스턴스 생성
		Person jung=new Person(335577, 112233);
		//여권 없는 사람의 정보를 담은 인스턴스 생성
		Person hong=new Person(775544);
		
		jung.showPersonalInfo();
		hong.showPersonalInfo();
	}
}
