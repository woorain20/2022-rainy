package chapter7;

public class BankAccountConstructor2 {
	public static void main(String[] args) {
		BankAccountConstructor yoon=new BankAccountConstructor("12-34-89", "990990-9090990",10000);
//		yoon.accNumber="12-34-56"; - ºÒ°¡
		yoon.deposit(5000);
		yoon.checkMyBalance();
		
		BankAccountConstructor park=new BankAccountConstructor("33-55-09", "770088-5959007",10000);
		park.deposit(4000);
		park.checkMyBalance();
	}
}
