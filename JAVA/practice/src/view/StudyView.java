package view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StudyView {

	Scanner sc=new Scanner(System.in);

	public String name;
	public String phone;
	public int date;
	
	public int firstview() {
		System.out.println("\t������ ȸ�� ����");
		System.out.println("=================================================");
		System.out.println("1.ȸ������ || 2.���� || 3.��ǰ���� || 4.����Ȯ�� || 5.����");
		System.out.println("Choice: ");
		
		int choice=-1;
		try {
			choice=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("������ ���ڸ� �Է��ϼ���.");
		}return choice;
	}
	
	public int membership() {	
		
		System.out.println("ȸ�� ����");
		System.out.println("=============================");
		System.out.println("1.�ű�ȸ�� ��� || 2.ȸ�� ���� Ȯ��");
		
		int choice=-1;
		try {
			choice=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("������ ���ڸ� �Է��ϼ���.");
		}return choice;
		
	}
	
	public int pay() {
		
		System.out.println("����");
		System.out.println("=============================");
		System.out.println("1.�����ϱ� || 2.���� ���� || 3.ȯ��");
		
		int choice=-1;
		try {
			choice=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("������ ���ڸ� �Է��ϼ���.");
		}return choice;
	}
	
	public int item(){
		
		System.out.println("��ǰ����");
		System.out.println("=============================");
		System.out.println("1.��ǰ��� || 2.��ǰ���� || 3.��ǰ����");
		
		int choice=-1;
		try {
			choice=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("������ ���ڸ� �Է��ϼ���.");
		}return choice;
	}
	
	public int check() {
		System.out.println("���� Ȯ��");
		System.out.println();
		System.out.println("Ȯ���Ϸ��� �ñ⸦ �������ּ���.");
		date=sc.nextInt();
		System.out.println("date: "+date);
		return date;
	}
	
}
