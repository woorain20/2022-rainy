package passionjava011;

class BankAccount {
	int balance=0;	//���� �ܾ�
	
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
class BankAccountOO{
	public static void main(String[] args) {
		//�� ���� �ν��Ͻ� ����
		BankAccount yoon=new BankAccount();
		BankAccount park=new BankAccount();
		//�� �ν��Ͻ��� ������� ������ ����
		yoon.deposit(5000);
		park.deposit(3000);
		//�� �ν��Ͻ��� ������� ����� ����
		yoon.withdraw(2000);
		park.withdraw(2000);
		//�� �ν��Ͻ��� ������� �ܾ��� ��ȸ
		yoon.checkMyBalance();
		park.checkMyBalance();
	}
}
