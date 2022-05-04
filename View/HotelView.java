package View;

import java.util.Scanner;

public class HotelView {
	
	private Scanner sc=new Scanner(System.in);
	
	int n;
	
	public void Reservation() {
		
		//예약 화면
		System.out.println("Welcome to NWJ Hotel");
		System.out.println();
		System.out.println("아래의 항목 중 원하시는 항목의 번호를 선택해주세요");
		System.out.println("======================================================");
		System.out.println("1. 예약 || 2. 예약조회 || 3. 예약변경 || 4. 예약취소 || 5. 종료");
		System.out.println("Reservation: ");
		System.out.println();
		
		n=sc.nextInt();
		
		switch(n) {
		
		case 1:
			System.out.println("예약을 선택하셨습니다.");
			//HotelReservation 가져오기
			ViewRoom vr=new ViewRoom();
			ViewNight vn=new ViewNight();
			ViewCheckIn vc=new ViewCheckIn();
			vr.Room();
			vn.Night();
			vc.CheckIn();
			System.out.println("예약을 진행하겠습니까?");
			System.out.println("True || False");
			boolean no=sc.nextBoolean();
			if(no=false) {
				return;
			}
			break;
			
		case 2:
			System.out.println("예약조회를 선택하셨습니다.");
			
			break;
			
		case 3:
			System.out.println("예약을 변경하겠습니다.");
			
			break;
			
		case 4:
			System.out.println("예약을 취소하겠습니다.");
			
			break;
			
		default:
			System.out.println("종료");
		}	
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("예약자 이름을 입력해주세요.");
		String name=sc.nextLine();
		System.out.println("예약자명: "+name);
		System.out.println("연락처(-없이 입력해주세요.)");	
		int phoneN=sc.nextInt();	
		HotelView hv=new HotelView();
		hv.Reservation();
	}
}
