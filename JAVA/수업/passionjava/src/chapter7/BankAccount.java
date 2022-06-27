package chapter7;

//메소드 확장=클래스
//메소드-기능, 클래스-데이터(변수)+기능(메소드)
public class BankAccount {
	//예금 잔액
	int balance=0;
	//디폴트 생성자
	public BankAccount() {
		
	}
	//기능(메소드)
	//static-메모리에 올려서 사용 준비
	public int deposit(int amount) {
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance-=amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("잔액: "+balance);
		return balance;
	}
	//main 메소드는 static이 붙어야 된다
	public static void main(String[] args) {
		//클래스-틀, 인스턴스-메모리에 올려서 사용준비
		//인스턴스 생성
		BankAccount yoon=new BankAccount();
		BankAccount p=new BankAccount();
		BankAccount park=new BankAccount();
		//입금
		yoon.deposit(5000);
		p.deposit(3000);
		park.deposit(7000);
		//잔액조회
		yoon.checkMyBalance();
		p.checkMyBalance();
		park.checkMyBalance();
	}
}