package passionjava017;

public class UnivFriend {
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String na, String ma, String ph) {
		name=na;
		major=ma;
		phone=ph;
	}
	public void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("전공: "+major);
		System.out.println("전화: "+phone);
	}
}
