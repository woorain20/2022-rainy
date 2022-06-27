package chapter12;

import java.util.Scanner;

public class ReadString {
	
	private Scanner scanner=new Scanner(System.in);
	private String str1;
	private String str2;

	public void scanString() {
		System.out.print("문자열 입력: ");
		str1=scanner.nextLine();
		System.out.print("문자열 입력: ");
		str2=scanner.nextLine();
	}
	
	public void printString() {
		System.out.println("입력된 문자열1: "+str1);
		System.out.println("입력된 문자열2: "+str2);
	}
	
	public static void main(String[] args) {
		ReadString readString=new ReadString();
		readString.scanString();
		readString.printString();
	}
}
