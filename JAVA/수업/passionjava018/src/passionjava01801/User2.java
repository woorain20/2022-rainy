package passionjava01801;

public class User2 {
	private int member;
	private int room;
	public int getMember() {
		return member;
	}
	public void setMember(int member) {
		this.member = member;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	@Override
	public String toString() {
		return "User2 [member=" + member + ", room=" + room + "]";
	}
	
	
}
