package chapter18;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionCase4 {
	public static void main(String[] args) {
		
		System.out.println("나누기 프로그램 시작");	
		//예외가 발생 되는 순간 프로그램 비정상 종료
		Scanner scanner=new Scanner(System.in);
		System.out.println("나누기 프로그램");
		try {
			System.out.println("a/b...a?");
			int n1=scanner.nextInt();
			scanner.nextLine();
			System.out.println("a/b...b?");
			int n2=scanner.nextInt();
			System.out.println(n1+"/"+n2+"="+n1/n2);	
		}catch(Throwable e) {
//			System.out.println(e.getMessage());
			System.out.println("잘못 입력했습니다.");
		}
		System.out.println("나누기 프로그램 정상 종료");
	}
}
