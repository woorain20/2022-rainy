package chapter7;
//VO, DTO
public class BankAccount11 {
	private String accNumber;
	private String ssNumber;
	private int balance;
	
	//getter setter, 게더 세더
	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber=accNumber;
	}
	//마우스 우클릭-소스-제네레이터-게더 세터=자동완성
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
	
	public static void main(String[] args) {
		BankAccount11 bankAccount=new BankAccount11();
		bankAccount.setAccNumber("12-34-56");
		String str=bankAccount.getAccNumber();
		System.out.println(str);
	}

}
