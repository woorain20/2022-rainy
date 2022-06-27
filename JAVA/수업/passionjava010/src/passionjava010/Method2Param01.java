package passionjava010;

public class Method2Param01 {
	public static void main(String[] args) {
		System.out.println("안녕하세요"+'\n'+"저는 자바입니다.");
		int myAge=34;
		double myHeight=180.1;
		hiEveryone(21,177.7);
		hiEveryone(21,myHeight);
		hiEveryone(myAge,171.4);
		hiEveryone(myAge,myHeight);
		byEveryone();
	}
	public static void hiEveryone(int age,double height) {
		System.out.println("제 나이는 "+age+"세 입니다.");
		System.out.println("제 키는 "+height+"cm 입니다.");
	}
	public static void byEveryone() {
		System.out.println("잘 부탁드립니다.");
	}
}
