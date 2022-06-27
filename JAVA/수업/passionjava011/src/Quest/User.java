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
		System.out.println("아이디:"+userID);
		System.out.println("비밀번호:"+userPW);
		System.out.println("이름:"+userName);
		System.out.println("주민등록번호:"+userPinNumber);
	}

		
	public static void main(String[] args) {
		User yang=new User();
		User park=new User();

		yang.setUserID("myeongji");
		park.setUserID("ddddd");

		yang.setUserPW("ddddd");
		park.setUserPW("abcdefg");

		yang.setUserName("양명지");
		park.setUserName("park");

		yang.setUserPinNumber("123456-124234");
		park.setUserPinNumber("341324-613413");

		yang.printUserInfo();
		park.printUserInfo();
	}
}
