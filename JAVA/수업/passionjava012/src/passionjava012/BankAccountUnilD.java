package passionjava012;

public class BankAccountUnilD {
	public static void main(String[] args) {
		BankAccount01 yoon=new BankAccount01();	//���� ����
		yoon.initAccount("12-34-89","990990-90909990",10000);	//�ʱ�ȭ
		
		BankAccount01 park=new BankAccount01();	//���� ����
		park.initAccount("33-55-09","770088-5959007",10000);	//�ʱ�ȭ
		
		yoon.deposit(5000);
		park.deposit(3000);
		yoon.withdraw(2000);
		park.withdraw(2000);
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
