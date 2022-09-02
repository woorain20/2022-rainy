package operate;

public class Receipt {
	
	public static void Singleroom() {
		
		String room = "single Room";  // 방이름
		int phoneNum = 0;    //폰번호<--view에서 가져오기
		int night = 0;       //이용기간
		String name = "";  //이름 
		int cost = 70000; //비용

		    System.out.println(" ");
			System.out.println("\t\t 예약정보들을 불러드리겠습니다.\t");;
			System.out.println("예약자 : "+name);
			System.out.println("연락처 : "+phoneNum);
			System.out.println("결제 상품 : "+room);
			System.out.println("이용기간 : "+night);
			System.out.println("기본요금 : "+cost);
			System.out.println("방 1|침대 1|욕실 1|오션뷰");
			System.out.println("서비스 : 조식 | 미니바 ");
			System.out.println("\t\t 이용 감사드립니다. \t");
		
}
		
	public static void Doubleroom() {
		String room = "Double Room";  // 방이름
		int phoneNum = 0;    //폰번호<--view에서 가져오기
		int night = 0;       //이용기간
		String name = "";  //이름 
		int cost = 100000; //비용

		    System.out.println(" ");
			System.out.println("\t\t 예약정보들을 불러드리겠습니다.\t");
			System.out.println("예약자 : "+name);
			System.out.println("연락처 : "+phoneNum);
			System.out.println("결제 상품 : "+room);
			System.out.println("이용기간 : "+night);
			System.out.println("기본요금 : "+cost);
			System.out.println("최대인원 : 2");
			System.out.println("방 1|침대 2|욕실 1|바다뷰");
			System.out.println("혜택 : 조식 | 미니바");
			System.out.println("\t\t 이용 감사드립니다. \t");
			
}
	public static void TwinRoom() {
		String room = "Twin Room";  // 방이름
		int phoneNum = 0;    //폰번호<--view에서 가져오기
		int night = 0;       //이용기간
		String name = "";  //이름 
		int cost = 100000; //비용

		    System.out.println(" ");
			System.out.println("\t\t 예약정보들을 불러드리겠습니다.\t");
			System.out.println("예약자 : "+name);
			System.out.println("연락처 : "+phoneNum);
			System.out.println("결제 상품 : "+room);
			System.out.println("이용기간 : "+night);
			System.out.println("기본요금 : "+cost);
			System.out.println("최대인원 : 2");
			System.out.println("방 2|침대 2|욕실 1|마운틴뷰");
			System.out.println("혜택 : 조식 | 미니바");
			System.out.println("\t\t 이용 감사드립니다. \t");
			
		
	}			
			public static void suiteroom() {
				String room = "Suite Room";  // 방이름
				int phoneNum = 0;    //폰번호<--view에서 가져오기
				int night = 0;       //이용기간
				String name = "";  //이름 
				int cost = 200000; //비용

					System.out.println(" ");
					System.out.println("\t\t 예약정보들을 불러드리겠습니다.\t");
					System.out.println("예약자 : "+name);
					System.out.println("연락처 : "+phoneNum);
					System.out.println("결제 상품 : "+room);
					System.out.println("이용기간 : "+night);
					System.out.println("기본요금 : "+cost);
					System.out.println("최대인원 : 4");
					System.out.println("방 2|침대 4|욕실 2|마운틴뷰");
					System.out.println("혜택 : 조식 | 미니바 | 헬스장");
					System.out.println("\t\t 이용 감사드립니다. \t");

			}
//			public void roomSelection(String room) {
//				Rooms rooms=new Rooms();
//				HotelVO hotelVO=new HotelVO();
//				if(room.equals("싱글")) {
//					hotelVO.getName();
//					hotelVO.getPhoneNum();
//					hotelVO.getNight();
//					rooms.Singleroom();
//				}else if(room.equals("더블")) {
//					hotelVO.getName();
//					hotelVO.getPhoneNum();
//					hotelVO.getNight();
//					rooms.Doubleroom();
//				}else if(room.equals("트윈")) {
//					hotelVO.getName();
//					hotelVO.getPhoneNum();
//					hotelVO.getNight();
//					rooms.TwinRoom();
//				}else if(room.equals("스위트")) {
//					hotelVO.getName();
//					hotelVO.getPhoneNum();
//					hotelVO.getNight();
//					rooms.suiteroom();
//				}
//			}
		public static void main(String[] args) {
			Singleroom();
			Doubleroom();
			TwinRoom();
			suiteroom();
			
					
}
		
}