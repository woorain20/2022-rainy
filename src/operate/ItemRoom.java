package operate;

import dto.StudyVO;

public class ItemRoom {
	
	StudyVO sv=new StudyVO();
	public static String item;
	
	public void item(int room) {
		if(room==1) {
			item="1�� Ư��";
			int priceday=15000;
			sv.setPriceday(priceday);
			int pricemonth=400000;
			sv.setPricemonth(pricemonth);
		}else if(room==2) {
			item="1�� Ŀư��";
			int priceday=14000;
			sv.setPriceday(priceday);
			int pricemonth=380000;
			sv.setPricemonth(pricemonth);
		}else if(room==3) {
			item="2�ν�";
			int priceday=12000;
			sv.setPriceday(priceday);
			int pricemonth=300000;
			sv.setPricemonth(pricemonth);
		}else if(room==4) {
			item="�Ϲݽ�";
			int priceday=9000;
			sv.setPriceday(priceday);
			int pricemonth=240000;
			sv.setPricemonth(pricemonth);
		}else if(room==5) {
			item="���͵��";
			int priceday=20000;
			sv.setPriceday(priceday);
			int pricemonth=550000;
			sv.setPricemonth(pricemonth);
		}else {
			System.out.println("�߸� �����ϼ̽��ϴ�.");
			System.out.println("�ٽ� �Է����ּ���.");
		}
		System.out.println();
	}
}
