package passionjava017;

public class MobilePhone {
	protected String number;	//��ȭ��ȣ
	
	public MobilePhone(String num) {
		number=num;
	}
	public void answer() {
		System.out.println("Hi~ from "+number);
	}
}
