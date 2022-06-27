package passionjava010;

public class Method2Param03 {
	public static void main(String[] args) {
		System.out.println("프로그램에 대해 알려드립니다.");
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
		System.out.println("이 프로그램은 "+program+" 입니다.");
		System.out.println("해당 프로그램은 "+version+" 입니다.");
		System.out.println("시리얼넘버는 "+serial+" 입니다.");
	}
	public static void byEveryone() {
		System.out.println("자세한 정보는 홈페이지를 참고해주세요");
	}
}
