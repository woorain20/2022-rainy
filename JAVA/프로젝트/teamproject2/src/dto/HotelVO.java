package dto;


public class HotelVO {
	
	private String room;
	private String name;
	private String phoneNum;
	private String date;
	private String bookNum;
	private int cost;
	private String booknumber;
	
	public String getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(String booknumber) {
		this.booknumber = booknumber;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getBookdate() {
		return bookNum;
	}
	public void setBookdate(String bookNum) {
		this.bookNum = bookNum;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "HotelVO [�����ȣ : "+booknumber+", ������=" + name + ", Room=" + room + ", ����ó=" + phoneNum + ", �̿�Ⱓ=" + date + ", "
				+ "������="+ bookNum + ", ���=" + cost + "]";
	}
	public void print() {
		System.out.println(booknumber);
	}
	
}
