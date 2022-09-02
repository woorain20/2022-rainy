package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyView {

	Scanner sc=new Scanner(System.in);

	public String name;
	public String phone;
	public int date;
	
	public int firstview() {
		System.out.println("\t독서실 회원 관리");
		System.out.println("=================================================");
		System.out.println("1.회원관리 || 2.결제 || 3.상품관리 || 4.매출확인 || 5.종료");
		System.out.println("Choice: ");
		
		int choice=-1;
		try {
			choice=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("범위내 숫자를 입력하세요.");
		}return choice;
	}
	
	public int membership() {	
		
		System.out.println("회원 관리");
		System.out.println("=============================");
		System.out.println("1.신규회원 등록 || 2.회원 정보 확인");
		
		int choice=-1;
		try {
			choice=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("범위내 숫자를 입력하세요.");
		}return choice;
		
	}
	
	public int pay() {
		
		System.out.println("결제");
		System.out.println("=============================");
		System.out.println("1.결제하기 || 2.결제 변경 || 3.환불");
		
		int choice=-1;
		try {
			choice=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("범위내 숫자를 입력하세요.");
		}return choice;
	}
	
	public int item(){
		
		System.out.println("상품관리");
		System.out.println("=============================");
		System.out.println("1.상품등록 || 2.상품변경 || 3.상품삭제");
		
		int choice=-1;
		try {
			choice=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("범위내 숫자를 입력하세요.");
		}return choice;
	}
	
	public int check() {
		System.out.println("매출 확인");
		System.out.println();
		System.out.println("확인하려는 시기를 선택해주세요.");
		date=sc.nextInt();
		System.out.println("date: "+date);
		return date;
	}
	
}
