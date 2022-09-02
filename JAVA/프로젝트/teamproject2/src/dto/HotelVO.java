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
		return "HotelVO [예약번호 : "+booknumber+", 예약자=" + name + ", Room=" + room + ", 연락처=" + phoneNum + ", 이용기간=" + date + ", "
				+ "예약일="+ bookNum + ", 비용=" + cost + "]";
	}
	public void print() {
		System.out.println(booknumber);
	}
	
}
