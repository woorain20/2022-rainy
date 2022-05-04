package View;

import java.util.Scanner;

public class ViewRoom {
	private Scanner sc=new Scanner(System.in);
	
	//객실 선택
	public void Room() {
		
		while(true) {
			System.out.println();
			System.out.println("아래의 방 중 원하시는 방을 선택해주세요");
			System.out.println("=============================");
			System.out.println("싱글 || 더블 || 트윈 || 스위트");
			System.out.print("Room: ");
			String room=sc.nextLine();
		
			if(room.equals("싱글")) {
				System.out.println("싱글룸을 선택하셨습니다.");
				break;
			}else if(room.equals("더블")) {
				System.out.println("더블룸을 선택하셨습니다.");
				break;
			}else if(room.equals("트윈")) {
				System.out.println("트윈룸을 선택하셨습니다.");
				break;
			}else if(room.equals("스위트")) {
				System.out.println("스위트룸을 선택하셨습니다.");
				break;
			}else {
				System.out.println("잘못 선택하셨습니다.");
				System.out.println("다시 입력해주세요.");
			}
		}
		System.out.println();
	}	
	public static void main(String[] args) {
		ViewRoom vr=new ViewRoom();
		vr.Room();
	}
}
