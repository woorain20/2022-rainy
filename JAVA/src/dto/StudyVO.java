package dto;

import java.io.Serializable;

public class StudyVO implements Serializable {

	private String name;
	private String phone;
	private boolean gender;
	private int age;
	private int room;
	private double priceday;
	private double pricemonth;
	private int date;
	private int cost;
	
	
	public double getPriceday() {
		return priceday;
	}
	public void setPriceday(double priceday) {
		this.priceday = priceday;
	}
	public double getPricemonth() {
		return pricemonth;
	}
	public void setPricemonth(double pricemonth) {
		this.pricemonth = pricemonth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "StudyVO [name=" + name + ", phone=" + phone + ", gender=" + gender + ", age=" + age + ", room=" + room
				+ ", priceday=" + priceday + ", pricemonth=" + pricemonth + ", date=" + date + ", cost=" + cost + "]";
	}
	public void print() {
		System.out.println(toString());
	}
}
