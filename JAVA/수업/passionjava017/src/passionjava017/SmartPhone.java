package passionjava017;

public class SmartPhone extends MobilePhone {
	private String androidVer;	//�ȵ���̵� �ü�� ����(����)	
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer=ver;
	}
	public void playApp() {
		System.out.println("App is running in "+androidVer);
	}

}
