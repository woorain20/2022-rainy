package operate;

import dto.StudyVO;

public class ItemRoom {
	
	StudyVO sv=new StudyVO();
	public static String item;
	
	public void item(int room) {
		if(room==1) {
			item="1인 특실";
			int priceday=15000;
			sv.setPriceday(priceday);
			int pricemonth=400000;
			sv.setPricemonth(pricemonth);
		}else if(room==2) {
			item="1인 커튼실";
			int priceday=14000;
			sv.setPriceday(priceday);
			int pricemonth=380000;
			sv.setPricemonth(pricemonth);
		}else if(room==3) {
			item="2인실";
			int priceday=12000;
			sv.setPriceday(priceday);
			int pricemonth=300000;
			sv.setPricemonth(pricemonth);
		}else if(room==4) {
			item="일반실";
			int priceday=9000;
			sv.setPriceday(priceday);
			int pricemonth=240000;
			sv.setPricemonth(pricemonth);
		}else if(room==5) {
			item="스터디룸";
			int priceday=20000;
			sv.setPriceday(priceday);
			int pricemonth=550000;
			sv.setPricemonth(pricemonth);
		}else {
			System.out.println("잘못 선택하셨습니다.");
			System.out.println("다시 입력해주세요.");
		}
		System.out.println();
	}
}
