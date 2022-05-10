package HotelDto;

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
			HotelReservation hv=new HotelReservation();
			hv.Room();
			hv.Night();
			hv.CheckIn();
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
		
		HotelView res=new HotelView();
		res.Reservation();
	}
}
