package passionjava011;

public class BankAccountPo {
	static int balance=0;	//���� �ܾ�
	public static void main(String[] args) {
		deposit(10000);		//�Ա� ����
		checkMyBalance();		//�ܾ� Ȯ��
		withdraw(3000);		//��� ����
		checkMyBalance();		//�ܾ� Ȯ��
	}
	public static int deposit(int amount) {		//�Ա��� ����ϴ� �޼ҵ�
		balance+=amount;
		return balance;
	}
	public static int withdraw(int amount) {	//����� ����ϴ� �޼ҵ�
		balance-=amount;
		return balance;
	}
	public static int checkMyBalance() { 	//���� ��ȸ�� ����ϴ� �޼ҵ�
		System.out.println("�ܾ�: "+balance);
		return balance;
	}

}
