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
							System.out.println("회원 등록");
							System.out.println("회원 이름을 입력하세요.");
							name=sc.nextLine();
							System.out.println("이름: "+name);
							System.out.println();
							svo.setName(name);
							System.out.println("연락처를 입력하세요.");
							phone=sc.nextLine();
							System.out.println("연락처: "+phone);
							System.out.println();
							svo.setPhone(phone);
							System.out.println("성별을 입력하세요.");
							gender=sc.nextBoolean();
							System.out.println("성별: "+gender);
							System.out.println();
							System.out.println("나이를 입력하세요.");
							age=sc.nextInt();
							System.out.println("연령: "+age);
							
						}else if(n==2){
							System.out.println("회원 관리");
							System.out.println("찾고자 하는 회원의 정보를 입력하세요.");
							name=sc.nextLine();
							System.out.println("이름: ");
							phone=sc.nextLine();
							System.out.println("연락처: ");
							ms.member(svo);
						}
					}catch(InputMismatchException e){
						sc.nextLine();
						System.out.println("정확히 입력해주세요.");
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
							System.out.println("\t결제");
							System.out.println("===================");
							System.out.println("결제금액: "+(int)cost);
							System.out.println("결제를 진행하시겠습니까?");
							if(true) {
								ms.member(svo);
							}
						}else if(n==2) {
							System.out.println("\t결제 변경");
							System.out.println("===================");
							System.out.println("결제금액: "+(int)cost);
						}else if(n==3) {
							System.out.println("\t환불");
							System.out.println("===================");
						}
					}catch(InputMismatchException e) {
						sc.nextLine();
						System.out.println("정확히 입력해주세요.");
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
							System.out.println("\t상품 관리");
							
						}
					}catch(InputMismatchException e) {
						sc.nextLine();
						System.out.println("정확히 입력해주세요.");
					}
				}	
			}
		}
	}
}