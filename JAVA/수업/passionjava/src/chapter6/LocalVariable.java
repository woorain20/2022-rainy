package chapter6;

public class LocalVariable {
	public static void main(String[] args) {
		int age=0;
		showAge(24,false);
//상위 지역변수는 하위 지역변수에 영향을 미치고, 하위 지역변수는 상위 지역변수에 영향없음

	}
	public static void showAge(int ageK,boolean birthPassed) {
		int age=0;
		if(birthPassed) {
			age=ageK-1;	//int age=지역변수, 중괄로 안에만 영향을 미침

		}else {
			age=ageK-2;	//int age=지역변수. 위에서 중복되어도 중괄로가 다르면 에러가 나지 않는다
		}
		System.out.println("만 나이: "+age);
	}
	
}
