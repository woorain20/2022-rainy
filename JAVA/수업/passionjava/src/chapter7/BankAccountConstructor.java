package chapter7;

public class BankAccountConstructor {
	//변수-private 메소드-public
	private String accNumber;	//계좌번호
	private String ssNumber;	//주민번호
	private int balance;	//예금 잔액
	
	//생성자 메소드 - 클래스 이름과 동일, 리턴 타입부분 삭제
	public BankAccountConstructor(String acc, String ss, int bal) {
		accNumber=acc;
		ssNumber=ss;
		balance=bal;
	}
	
	//getter setter
	public void serAccNumber(String accNumber) {
		this.accNumber=accNumber;
	}
	
	public int deposit(int amount) {
		//balance=balance+amount
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance-=amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("계좌번호: "+accNumber);
		System.out.println("주민번호: "+ssNumber);
		System.out.println("잔액: "+balance);
		return balance;
	}
}
