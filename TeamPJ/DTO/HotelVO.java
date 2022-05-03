package DTO;

import java.time.LocalDateTime;

public class HotelVO {
	
	private String Room;
	private String name;
	private String phoneNum;
	private String date;
	private LocalDateTime bookdate;
	private int cost;
	private int booknumber;
	
	public int getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(int booknumber) {
		this.booknumber = booknumber;
	}
	public String getRoom() {
		return Room;
	}
	public void setRoom(String room) {
		Room = room;
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
	public LocalDateTime getBookdate() {
		return bookdate;
	}
	public void setBookdate(LocalDateTime bookdate) {
		this.bookdate = bookdate;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "HotelVO [예약번호 : "+booknumber+", 예약자=" + name + ", Room=" + Room + ", 연락처=" + phoneNum + ", 이용기간=" + date + ", "
				+ "예약일="+ bookdate + ", 비용=" + cost + "]";
	}
	
}
