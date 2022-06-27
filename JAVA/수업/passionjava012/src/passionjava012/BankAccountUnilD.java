package passionjava012;

public class BankAccountUnilD {
	public static void main(String[] args) {
		BankAccount01 yoon=new BankAccount01();	//계좌 생성
		yoon.initAccount("12-34-89","990990-90909990",10000);	//초기화
		
		BankAccount01 park=new BankAccount01();	//계좌 생성
		park.initAccount("33-55-09","770088-5959007",10000);	//초기화
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
