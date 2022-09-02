package operate;

import view.HotelView;


public class Receipt {
	HotelView hv=new HotelView();
	
	public void Singleroom() {
		int phoneNum = hv.phoneN; 
		String name = hv.name;  
		int night;
		String bookNumber;
		
		int cost = 70000; //비용

		    System.out.println(" ");
			System.out.println("\t\t 예약확인 \t\t");;
			System.out.println("예약번호 : "+bookNumber);
			System.out.println("예약자 : "+name);
			System.out.println("연락처 : "+phoneNum);
			System.out.println("결제 상품 : Single Room");
			System.out.println("이용기간 : "+night);
			System.out.println("기본요금 : "+cost);
			System.out.println("방 1|침대 1|욕실 1|오션뷰");
			System.out.println("서비스 : 조식 | 미니바 ");
			System.out.println("\t\t 예약이 완료되었습니다. \t");
		
}
		
	public void Doubleroom() {
		int cost = 100000; //비용

		    System.out.println(" ");
			System.out.println("\t\t 예약확인 \t\t");
			System.out.println("예약번호 : "+bookNumber);
			System.out.println("예약자 : "+name);
			System.out.println("연락처 : "+phoneNum);
			System.out.println("결제 상품 : Double Room");
			System.out.println("이용기간 : "+night);
			System.out.println("기본요금 : "+cost);
			System.out.println("최대인원 : 2");
			System.out.println("방 1|침대 2|욕실 1|바다뷰");
			System.out.println("혜택 : 조식 | 미니바");
			System.out.println("\t\t 예약이 완료되었습니다. \t");
			
}
	public void TwinRoom() {
		int cost = 100000; //비용

		    System.out.println(" ");
			System.out.println("\t\t 예약확인 \t\t");
			System.out.println("예약번호 : "+bookNumber);
			System.out.println("예약자 : "+name);
			System.out.println("연락처 : "+phoneNum);
			System.out.println("결제 상품 : Twin Room");
			System.out.println("이용기간 : "+night);
			System.out.println("기본요금 : "+cost);
			System.out.println("최대인원 : 2");
			System.out.println("방 2|침대 2|욕실 1|마운틴뷰");
			System.out.println("혜택 : 조식 | 미니바");
			System.out.println("\t\t 예약이 완료되었습니다. \t");
			
		
	}			
	public void suiteroom() {
		int cost = 200000; //비용

			System.out.println(" ");
			System.out.println("\t\t 예약확인 \t\t");
			System.out.println("예약번호 : "+bookNumber);
			System.out.println("예약자 : "+name);
			System.out.println("연락처 : "+phoneNum);
			System.out.println("결제 상품 : Suite Room");
			System.out.println("이용기간 : "+night);
			System.out.println("기본요금 : "+cost);
			System.out.println("최대인원 : 4");
			System.out.println("방 2|침대 4|욕실 2|마운틴뷰");
			System.out.println("혜택 : 조식 | 미니바 | 헬스장");
			System.out.println("\t\t 예약이 완료되었습니다. \t");

		}

		
}