package chapter11;

public class ConOverloading {
	
	public static void main(String[] args) {
		//���� �ִ� ����� ������ ���� �ν��Ͻ� ����
		Person jung=new Person(335577, 112233);
		//���� ���� ����� ������ ���� �ν��Ͻ� ����
		Person hong=new Person(775544);
		
		jung.showPersonalInfo();
		hong.showPersonalInfo();
	}
}
