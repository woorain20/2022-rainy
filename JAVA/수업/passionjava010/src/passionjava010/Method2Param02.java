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
		System.out.println("제 나이는 "+age+"세 입니다.");
		System.out.println("제 키는 "+height+"cm 입니다.");
	}
	public static void byEveryone() {
		System.out.println("잘 부탁드립니다.");
	}

}
