package passionjava011;

public class BankAccount001 {
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
		System.out.println("ภÜพื: "+balance);
		return balance;
	}
	public static void main(String[] args) {
		BankAccount001 Kim=new BankAccount001();
		BankAccount001 Lee=new BankAccount001();
		BankAccount001 Park=new BankAccount001();
		
		Kim.deposit(12000);
		Lee.deposit(8000);
		Park.deposit(9000);
		
		Kim.withdraw(3000);
		Lee.withdraw(6000);
		Park.withdraw(4000);
		Lee.withdraw(600);
		Kim.withdraw(500);
		Park.withdraw(800);
		
		Kim.checkMyBalance();
		Lee.checkMyBalance();
		Park.checkMyBalance();
	}
}
