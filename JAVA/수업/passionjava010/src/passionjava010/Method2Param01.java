package passionjava010;

public class Method2Param01 {
	public static void main(String[] args) {
		System.out.println("�ȳ��ϼ���"+'\n'+"���� �ڹ��Դϴ�.");
		int myAge=34;
		double myHeight=180.1;
		hiEveryone(21,177.7);
		hiEveryone(21,myHeight);
		hiEveryone(myAge,171.4);
		hiEveryone(myAge,myHeight);
		byEveryone();
	}
	public static void hiEveryone(int age,double height) {
		System.out.println("�� ���̴� "+age+"�� �Դϴ�.");
		System.out.println("�� Ű�� "+height+"cm �Դϴ�.");
	}
	public static void byEveryone() {
		System.out.println("�� ��Ź�帳�ϴ�.");
	}
}
