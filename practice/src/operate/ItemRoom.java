package operate;

import dto.StudyVO;

public class ItemRoom {
	
	StudyVO sv=new StudyVO();
	public static String room;
	
	public void room(int item) {
		if(item==1) {
			room="1인실";
			int priceday=15000;
			sv.setPriceday(priceday);
			int pricemonth=400000;
			sv.setPricemonth(pricemonth);
		}else if(item==2) {
			room="2인실";
			int priceday=12000;
			sv.setPriceday(priceday);
			int pricemonth=300000;
			sv.setPricemonth(pricemonth);
		}else if(item==3) {
			room="다인실";
			int priceday=9000;
			sv.setPriceday(priceday);
			int pricemonth=240000;
			sv.setPricemonth(pricemonth);
		}
	}
}
