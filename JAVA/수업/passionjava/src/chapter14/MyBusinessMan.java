package chapter14;

public class MyBusinessMan {
	
	public static void main(String[] args) {
		BusinessMan businessMan=new BusinessMan("김자바", "자바컴퍼니", "사원");
		businessMan.tellYourInfo();
		
		Man man=new Man("이클립스");
		man.tellYourName();
		Object object=new Object();
		
		//다중 상속은 불가능, 한 클래스에서 상속할 수 있는 클래스는 1개. 트리 형태의 상속은 가능
	}

}
