package chapter7;

public class BankAccount12 {
	private String accNumber;
	private String ssNumber;
	private int balance;
	
	
	public BankAccount12(String accNumber, String ssNumber, int balance) {
		super();
		this.accNumber = accNumber;
		this.ssNumber = ssNumber;
		this.balance = balance;
	}
	
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getSsNumber() {
		return ssNumber;
	}
	public void setSsNumber(String ssNumber) {
		this.ssNumber = ssNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
}
