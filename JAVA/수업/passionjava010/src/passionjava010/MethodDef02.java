package passionjava010;

public class MethodDef02 {
	public static void main(String[] args) {
		System.out.println("프로그램의 시작");
		hiEveryone(1.6);
		hiEveryone(1.7);
		hiEveryone(1.8);
		hiEveryone(1.9);
		System.out.println("프로그램의 끝");
	}
	public static void hiEveryone(double version) {
		System.out.println("이 프로그램은 자바입니다.");
		System.out.println("해당 자바는 "+version+"버전입니다.");
	}
}
