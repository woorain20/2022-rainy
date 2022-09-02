package view;

import java.util.InputMismatchException;
import java.util.Scanner;

import dto.StudyVO;
import operate.Membership;

public class StudyCon {
	
	Scanner sc=new Scanner(System.in);
	StudyView sv=new StudyView();
	Membership ms=new Membership();
	public String name;
	public String phone;
	public boolean gender;
	public int age;
	public double cost;
	
	public void makeInfo() {
		int menu;
		while(true) {
			menu=sv.firstview();
			StudyVO svo=new StudyVO();
			
			switch(menu) {
			case 0:
				System.out.println();
				break;
				
			case 1:
				sv.membership();
				sc.nextInt();
				while(true) {
					int n=0;
					try {
						if(n==1) {
							System.out.println("ȸ�� ���");
							System.out.println("ȸ�� �̸��� �Է��ϼ���.");
							name=sc.nextLine();
							System.out.println("�̸�: "+name);
							System.out.println();
							svo.setName(name);
							System.out.println("����ó�� �Է��ϼ���.");
							phone=sc.nextLine();
							System.out.println("����ó: "+phone);
							System.out.println();
							svo.setPhone(phone);
							System.out.println("������ �Է��ϼ���.");
							gender=sc.nextBoolean();
							System.out.println("����: "+gender);
							System.out.println();
							System.out.println("���̸� �Է��ϼ���.");
							age=sc.nextInt();
							System.out.println("����: "+age);
							
						}else if(n==2){
							System.out.println("ȸ�� ����");
							System.out.println("ã���� �ϴ� ȸ���� ������ �Է��ϼ���.");
							name=sc.nextLine();
							System.out.println("�̸�: ");
							phone=sc.nextLine();
							System.out.println("����ó: ");
							ms.member(svo);
						}
					}catch(InputMismatchException e){
						sc.nextLine();
						System.out.println("��Ȯ�� �Է����ּ���.");
					}
					break;
				}
				break;
				
			case 2:
				sv.pay();
				sc.nextInt();
				while(true) {
					int n=0;
					try {
						if(n==1) {
							System.out.println("\t����");
							System.out.println("===================");
							System.out.println("�����ݾ�: "+(int)cost);
							System.out.println("������ �����Ͻðڽ��ϱ�?");
							if(true) {
								ms.member(svo);
							}
						}else if(n==2) {
							System.out.println("\t���� ����");
							System.out.println("===================");
							System.out.println("�����ݾ�: "+(int)cost);
						}else if(n==3) {
							System.out.println("\tȯ��");
							System.out.println("===================");
						}
					}catch(InputMismatchException e) {
						sc.nextLine();
						System.out.println("��Ȯ�� �Է����ּ���.");
					}
					break;
				}
				break;
				
			case 3:
				sv.item();
				sc.nextInt();
				while(true) {
					int n=0;
					try {
						if(n==1) {
							System.out.println("\t��ǰ ����");
							
						}
					}catch(InputMismatchException e) {
						sc.nextLine();
						System.out.println("��Ȯ�� �Է����ּ���.");
					}
				}	
			}
		}
	}
}