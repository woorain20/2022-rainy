package passionjava010;

public class MethodDef {
	public static void main(String[] args) {
		System.out.println("���α׷��� ����");
		hiEveryone(12);	//12�� �����ϸ� hiEveryone ȣ��
		hiEveryone(13); //13�� �����ϸ� hiEveryone ȣ��
		System.out.println("���α׷��� ��");
	}
	public static void hiEveryone(int age) {
		System.out.println("���� ��ħ�Դϴ�.");
		System.out.println("�� ���̴� "+age+"�� �Դϴ�.");
	}
}
