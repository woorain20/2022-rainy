package HotelDto;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelReservation{
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
	
	//숙박기간
	public int Night() {
		
		while(true) {
			System.out.println("숙박기간을 선택해주세요");
			System.out.println("date: ");
			//문자열 예외처리
			int night=0;
			try {
				night=sc.nextInt();
				sc.nextLine();
				System.out.println(night+"박 "+(night+1)+"일을 선택하셨습니다.");
				return night;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("숫자를 입력해주세요");
			}
			System.out.println();
		}	
	}
	
	//체크인 날짜
	public void CheckIn() {
		System.out.println("Check-in 날짜를 선택해주세요");
		System.out.println("Start: ");
		System.out.println("년도를 선택해주세요");
		//문자열 예외처리
		int year=0;
		try {
			year=sc.nextInt();
			sc.nextLine();
			System.out.println(year+"년");			
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("숫자를 입력해주세요");
		}
		System.out.println("월을 선택해주세요");
		//문자열 예외처리
		int month=0;
		try {
			month=sc.nextInt();
			sc.nextLine();
			System.out.println(month+"월");
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("숫자를 입력해주세요");
		}
		System.out.println("일을 선택해주세요");
		//문자열 예외처리
		int day=0;
		try {
			day=sc.nextInt();
			sc.nextLine();
		}catch(InputMismatchException e) {
			sc.nextLine();
			System.out.println("숫자를 입력해주세요");			
		}
		System.out.println(day+"일");
		sc.nextLine();
		System.out.println(year+"년 "+month+"월 "+day+"일"+"을 선택하셨습니다.");
	}
	
	//메인
	public static void main(String[] args) {
		HotelReservation hr=new HotelReservation();
		hr.Room();
		hr.Night();
		hr.CheckIn();

	}
	
	

	
	
}
