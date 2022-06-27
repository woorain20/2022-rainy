package chapter6;

public class Method2Param {
	public static void main(String[] args) {
		double myShoeSize=175.9;
		hiEveryone(12, 120.5);
		hiEveryone(13, myShoeSize);
		byEveryone();
	}
	public static void hiEveryone(int age,double shoeSize) {
		System.out.println("제 나이는 "+age+"세 입니다.");
		System.out.println("저의 신발 사이즈는 "+shoeSize+"cm 입니다.");
	}
	public static void byEveryone() {
		System.out.println("다음에 뵙겠습니다.");
	}
}
