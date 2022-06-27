package passionjava011;

public class BankAccount002 {
	int balance=0;
	public int deposit(int amount) {
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance-=amount;
		return balance;
	}
	public int check() {
		System.out.println("ภÜพื: "+balance);
		return balance;
	}
	public static void main(String[] args) {
		BankAccount002 K=new BankAccount002();
		BankAccount002 L=new BankAccount002();
		BankAccount002 P=new BankAccount002();
		BankAccount002 J=new BankAccount002();
		
		K.deposit(12000);
		L.deposit(9000);
		P.deposit(17000);
		J.deposit(6000);
		
		K.withdraw(3500);
		L.withdraw(5000);
		P.withdraw(6500);
		J.withdraw(1500);
		
		K.deposit(3000);
		K.deposit(500);
		L.deposit(1000);
		
		
		K.check();
		L.check();
		P.check();
		J.check();
	}

}
