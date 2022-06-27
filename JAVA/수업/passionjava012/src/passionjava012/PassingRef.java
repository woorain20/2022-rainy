package passionjava012;

public class PassingRef {
	public static void main(String[] args) {
		BankAccount ref=new BankAccount();
		ref.deposit(4000);
		ref.withdraw(300);
		check(ref);		//'참조 값'의 전달
	}
	public static void check(BankAccount acc) {
		acc.checkMyBalance();
	}
}
