package passionjava012;

public class PassingRef {
	public static void main(String[] args) {
		BankAccount ref=new BankAccount();
		ref.deposit(4000);
		ref.withdraw(300);
		check(ref);		//'���� ��'�� ����
	}
	public static void check(BankAccount acc) {
		acc.checkMyBalance();
	}
}
