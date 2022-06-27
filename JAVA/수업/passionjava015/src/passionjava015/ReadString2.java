package passionjava015;

import java.util.Scanner;

public class ReadString2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("문자열 입력: ");
		String st1=sc.nextLine();
		System.out.println("문자열 입력: ");
		String st2=sc.nextLine();
		
		System.out.printf("입력된 문자열 1: %s\n, st1");
		System.out.printf("입력된 문자열 2: %s\n, st2");
	}

}
