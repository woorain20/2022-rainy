package dto;

import java.io.Serializable;

public class HotelVO implements Serializable{
	
	private int room;
	private String name;
	private int phoneNum;
	private int night;
	private int checkIn;
	private double cost;
	private String booknumber;
	private int year;
	private int month;
	private int day;
	

	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	public int getNight() {
		return night;
	}
	public void setNight(int night) {
		this.night = night;
	}
	public int getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(int checkIn) {
		this.checkIn = checkIn;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getBooknumber() {
		return booknumber;
	}
	public void setBooknumber(String booknumber) {
		this.booknumber = booknumber;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	@Override
	public String toString() {
		return "HotelVO [�����ȣ : "+booknumber+", ������=" + name + ", Room=" + room + ", ����ó=" + phoneNum + ", �̿�Ⱓ=" + night + ", "
				+ "üũ��="+ year+"-"+month+"-"+day+ ", ������=" + cost + "]";
	}
	public void print() {
	
		System.out.println(toString());
	}
	

	
}
