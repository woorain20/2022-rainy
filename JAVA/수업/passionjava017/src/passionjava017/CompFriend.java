package passionjava017;

public class CompFriend {
	private String name;
	private String department;
	private String phone;
	
	public CompFriend(String na, String de, String ph) {
		name=na;
		department=de;
		phone=ph;
	}
	public void showInfo() {
		System.out.println("�̸�: "+name);
		System.out.println("�μ�: "+department);
		System.out.println("��ȭ: "+phone);
	}

}
