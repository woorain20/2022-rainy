package passionjava010;

public class Method2Param02 {
	public static void main(String[] args) {
		double myHeight=178.7;
		int myAge=28;
		hiEveryone(43,168.7);
		hiEveryone(25,myHeight);
		hiEveryone(myAge,188.0);
		hiEveryone(myAge,myHeight);
		byEveryone();
	}
	public static void hiEveryone(int age, double height) {
		System.out.println("�� ���̴� "+age+"�� �Դϴ�.");
		System.out.println("�� Ű�� "+height+"cm �Դϴ�.");
	}
	public static void byEveryone() {
		System.out.println("�� ��Ź�帳�ϴ�.");
	}

}
