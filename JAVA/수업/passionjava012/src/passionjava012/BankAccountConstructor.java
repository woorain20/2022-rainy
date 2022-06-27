package passionjava012;

public class BankAccountConstructor {
	public static void main(String[] args) {
		BankAccount02 yoon=new BankAccount02("12-34-89","990990-9090990",10000);
		BankAccount02 park=new BankAccount02("33-55-09","770088-5959007",10000);
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}

}
