package chapter12;

public class FormatString {
	public static void main(String[] args) {
		int age=20;
		double height=178.2;
		String name="YOON SUNG WOO";
		
		System.out.println(age);
		//"첫줄"+"\n"
		System.out.println(height+"\n");
//		System.out.println("\n");
//		System.out.println();
		System.out.println(name);
		System.out.println("------------------");
		System.out.printf("name:%s \n", name);
		//%d는 정수, %e는 실수, 자바에서는 잘 쓰이지 않음
		System.out.printf("age:%d \nheight:%e\n", age, height);
	}

}
