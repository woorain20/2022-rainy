package view;


import java.util.Scanner;
import dto.HotelVO;
import operate.Booknumber;
import operate.CostChange;
import operate.Receipt;
import operate.ViewCheckIn;
import operate.ViewNight;
import operate.ViewRoom;
import service.Management2;


public class HotelView {
	
	public String name;
	public int phoneN=0;
	public HotelVO hotelVO=new HotelVO();
	Management2 mng=new Management2();
	
	public void Reservation() {
		Scanner sc=new Scanner(System.in);
		
		//예약 화면
		System.out.println("Welcome to 자바 Hotel");
		System.out.println();
		System.out.println("아래의 항목 중 원하시는 항목의 번호를 선택해주세요");
		System.out.println("======================================================");
		System.out.println("1. 예약 || 2. 예약조회 || 3. 예약변경 || 4. 예약취소 || 5. 종료");
		System.out.print("Reservation: ");
		System.out.println();
		
		
		int n=sc.nextInt();
		
		Receipt rec=new Receipt();
		ViewRoom vr=new ViewRoom();
		ViewNight vn=new ViewNight();
		ViewCheckIn vc=new ViewCheckIn();
		CostChange cc=new CostChange();
		Booknumber bn=new Booknumber();
		
		
		switch(n) {
		
		case 1:
			Scanner sc1=new Scanner(System.in);
			System.out.println("예약을 진행하겠습니다.");
			System.out.println("====================");
			System.out.println("예약자 이름을 입력해주세요.");
			name=sc1.nextLine();
			System.out.println("예약자명: "+name);
			System.out.println("연락처(-없이 입력해주세요.)");	
			phoneN=sc1.nextInt();
			System.out.println("연락처: "+phoneN);
			System.out.println();
			//HotelReservation 가져오기
			vr.Room();
			vc.CheckIn();
			vn.Night();
			hotelVO.setName(name);
			hotelVO.setPhoneNum(phoneN);
			hotelVO.setBooknumber(bn.bookNumber());
			hotelVO.setRoom(vr.room);
			hotelVO.setNight(vn.night);
			hotelVO.setYear(vc.year);
			hotelVO.setMonth(vc.month);
			hotelVO.setDay(vc.day);
			cc.totalCost(hotelVO);
			hotelVO.setCost(cc.tocost);
			mng.createRervation(hotelVO);
			rec.Room(hotelVO);
			break;
			
		case 2:
			//예약조회
			System.out.println("예약 조회");
			System.out.println();
			System.out.println("예약번호를 입력해주세요");
			System.out.println("====================");
			String booknumber;
			booknumber=sc.nextLine();
			sc.nextLine();
			System.out.println("예약번호: "+booknumber);
			mng.readResrve();
			hotelVO.print();
//			rec.Room(hotelVO);
//			mng.getReservation(booknumber);
			
			break;
			
		case 3:
			//예약 수정
//			HotelVO hotelVO2=new HotelVO();
			System.out.println("예약 변경");
			System.out.println();
			System.out.println("예약번호를 입력해주세요");
			System.out.println("====================");
//			int booknumber;
//			booknumber=sc.nextInt();
//			System.out.println("예약번호: "+booknumber);
						
			System.out.print("예약 내용 변경");
			vr.Room();
			vc.CheckIn();
			vn.Night();
			hotelVO.setRoom(vr.room);
			hotelVO.setNight(vn.night);
			hotelVO.setYear(vc.year);
			hotelVO.setMonth(vc.month);
			hotelVO.setDay(vc.day);
			mng.putResreve(hotelVO);
			hotelVO.print();
			break;
			
		case 4:
			System.out.println("예약 취소");
			System.out.println();
			System.out.println("예약번호를 입력해주세요");
			System.out.println("====================");
			System.out.print("예약번호: ");
			break;
			
		default:
			System.out.println("이용해주셔서 감사합니다.");
			System.out.println();
			System.out.println("\t종료");
		}	
		
	}
	
}
