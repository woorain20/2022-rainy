package chapter12;

public class FormatString {
	public static void main(String[] args) {
		int age=20;
		double height=178.2;
		String name="YOON SUNG WOO";
		
		System.out.println(age);
		//"ù��"+"\n"
		System.out.println(height+"\n");
//		System.out.println("\n");
//		System.out.println();
		System.out.println(name);
		System.out.println("------------------");
		System.out.printf("name:%s \n", name);
		//%d�� ����, %e�� �Ǽ�, �ڹٿ����� �� ������ ����
		System.out.printf("age:%d \nheight:%e\n", age, height);
	}

}
