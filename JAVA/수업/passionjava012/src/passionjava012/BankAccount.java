package passionjava012;

public class BankAccount {
	int balance=0;
	
	public int deposit(int amount) {
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance-=amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("�ܾ�: "+balance);
		return balance;
	}
}
