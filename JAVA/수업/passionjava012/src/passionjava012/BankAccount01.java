package passionjava012;

public class BankAccount01 {
	private String accNumber;	//���¹�ȣ
	private String ssNumber;	//�ֹι�ȣ
	private int balance;	//���� �ܾ�
	
	//�ʱ�ȭ�� ���� �޼ҵ�
	public void initAccount(String acc, String ss, int bal) {
		accNumber=acc;
		ssNumber=ss;
		balance=bal;	// ���� ���� �� ���ݾ����� �ʱ�ȭ
	}
	public int deposit(int amount) {
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
		System.out.println("�ܾ�: "+balance+'\n');
		return balance;
	}
}
