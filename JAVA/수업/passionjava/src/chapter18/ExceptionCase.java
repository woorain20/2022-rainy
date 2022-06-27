package chapter18;

import java.util.Scanner;

public class ExceptionCase {
	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");	
		Scanner scanner=new Scanner(System.in);
		//예외가 발생 되는 순간 프로그램 비정상 종료
		System.out.println("a/b...a?");
		int n1=scanner.nextInt();
		System.out.println(n1);
		System.out.println("프로그램 정상 종료");
	}
}
