package Quest;

public class User {
	private String userID;
	private String userPW;
	private String userName;
	private String userPinNumber;

	public void setUserID(String id) {
		this.userID=id;
	}

	public void setUserPW(String pw) {
		this.userPW=pw;
	}

	public void setUserName(String name) {
		this.userName=name;
	}

	public void setUserPinNumber(String pin) {
		this.userPinNumber=pin;
	}

	public void printUserInfo() {
		System.out.println("���̵�:"+userID);
		System.out.println("��й�ȣ:"+userPW);
		System.out.println("�̸�:"+userName);
		System.out.println("�ֹε�Ϲ�ȣ:"+userPinNumber);
	}

		
	public static void main(String[] args) {
		User yang=new User();
		User park=new User();

		yang.setUserID("myeongji");
		park.setUserID("ddddd");

		yang.setUserPW("ddddd");
		park.setUserPW("abcdefg");

		yang.setUserName("�����");
		park.setUserName("park");

		yang.setUserPinNumber("123456-124234");
		park.setUserPinNumber("341324-613413");

		yang.printUserInfo();
		park.printUserInfo();
	}
}
