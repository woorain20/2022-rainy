package passionjava010;

public class LocalVariable01 {
	public static void main(String[] args) {
		showAge(26,true);
		showAge(33,false);
	}
	public static void showAge(int ageK,boolean birthPassed) {
		int age=0;
		if(birthPassed) {
			age=ageK-1;
		}else {
			age=ageK-2;
		}
		System.out.println("¸¸ ³ªÀÌ: "+age);
	}
}
