package passionjava010;

public class Method2Param03 {
	public static void main(String[] args) {
		System.out.println("���α׷��� ���� �˷��帳�ϴ�.");
		String myProgram="Java";
		double myVersion=1.8;
		int mySerial=254;
		hiEveryone("Camera",2.0,515);
		hiEveryone("GPS",2.5,617);
		hiEveryone(myProgram,1.5,217);
		hiEveryone(myProgram,myVersion,759);
		hiEveryone(myProgram,myVersion,mySerial);
		hiEveryone(myProgram,1.9,mySerial);
		hiEveryone("Messenger",myVersion,mySerial);
		hiEveryone("Game",myVersion,3189);
		hiEveryone("Financial App",2.2,mySerial);
		byEveryone();
	}
	public static void hiEveryone(String program,double version,int serial) {
		System.out.println("�� ���α׷��� "+program+" �Դϴ�.");
		System.out.println("�ش� ���α׷��� "+version+" �Դϴ�.");
		System.out.println("�ø���ѹ��� "+serial+" �Դϴ�.");
	}
	public static void byEveryone() {
		System.out.println("�ڼ��� ������ Ȩ�������� �������ּ���");
	}
}
