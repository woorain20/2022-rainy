package chapter14;

public class BusinessMan extends Man{ //extends �ڿ� ��ӹ��� Ŭ������ �������� �ش� Ŭ������ ��Ӱ��谡 ������
	
	private String company;
	private String position;
	

	public BusinessMan(String name, String company, String position) {
		super(name);	//���� Ŭ������ ������ �޼ҵ带 ȣ��, ���� Ŭ������ �����ڿ��� ���� ���� ȣ��Ǿ�� �Ѵ�. ������ ������ ������ ������ ���� �߻�, ������ ����
		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
//		printCompany();
		tellYourName();
		System.out.println("My company is "+company);
		System.out.println("My position is "+position);
	}
	
	public void printCompany() {
		System.out.println("My company is "+company);
	}

}
