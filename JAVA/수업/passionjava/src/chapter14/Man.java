package chapter14;

public class Man {
	//����� �Ϲ������� Ŭ������ ������ ���
	
	private String name;
//	private String company;
//	private String position;
	
	
	// �޼ҵ� �����ε����� ���� �߻����� ����(�Ű������� �޶� ��밡��)
	public Man() {
//		super();	// super(); ���� ����
	}
	
	public Man(String name) {
		//�ڹ��� ��� Ŭ������ object Ŭ������ ����ϰ� �ִ�.
		super();
		this.name = name;
	
	}
	public void tellYourName() {
		System.out.println("My name is "+name);
	}

}
