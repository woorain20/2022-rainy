package chapter7;

public class BankAccountConstructor {
	//����-private �޼ҵ�-public
	private String accNumber;	//���¹�ȣ
	private String ssNumber;	//�ֹι�ȣ
	private int balance;	//���� �ܾ�
	
	//������ �޼ҵ� - Ŭ���� �̸��� ����, ���� Ÿ�Ժκ� ����
	public BankAccountConstructor(String acc, String ss, int bal) {
		accNumber=acc;
		ssNumber=ss;
		balance=bal;
	}
	
	//getter setter
	public void serAccNumber(String accNumber) {
		this.accNumber=accNumber;
	}
	
	public int deposit(int amount) {
		//balance=balance+amount
		balance+=amount;
		return balance;
	}
	public int withdraw(int amount) {
		balance-=amount;
		return balance;
	}
	public int checkMyBalance() {
		System.out.println("���¹�ȣ: "+accNumber);
		System.out.println("�ֹι�ȣ: "+ssNumber);
		System.out.println("�ܾ�: "+balance);
		return balance;
	}
}
