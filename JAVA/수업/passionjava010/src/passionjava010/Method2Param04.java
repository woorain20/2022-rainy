package passionjava010;

public class Method2Param04 {
	public static void main(String[] args) {
		System.out.println("���� ������ �˷��帳�ϴ�.");
		String myStoc="īī��";
		int myMonth=18;
		double myCapital=12;
		double myProfit=38.8;
		stockChannel("�Ｚ����",21,21.5,33);
		stockChannel("���̹�",12,11.3,15.7);
		stockChannel("���",28,10,39.5);
		stockChannel("����",32,7.8,48.8);
		stockChannel("��ī�ݶ�",myMonth,34,31);
		stockChannel(myStoc,11,6,myProfit);
		stockChannel(myStoc,8,myCapital,27.1);
		stockChannel(myStoc,10,8,myProfit);
		stockChannel("Sk������",myMonth,myCapital,57.5);
		stockChannel(myStoc,myMonth,myCapital,myProfit);
		goodBye();
	}
	public static void stockChannel(String stoc, int month, double capital, double profit) {
		System.out.println("����� ������ ������ "+stoc+"�Դϴ�.");
		System.out.println("����� ���ڱⰣ�� "+month+"���� �Դϴ�.");
		System.out.println("����� ���ڿ����� "+capital+"$ �Դϴ�.");
		System.out.println("����� ������ "+profit+"$ �Դϴ�.");
	}
	public static void goodBye() {
		System.out.println("���� �������� �� �� �����...."+'\n'+"�����մϴ�.");
	}
}
