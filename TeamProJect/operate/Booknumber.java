package operate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import dto.HotelVO;

public class Booknumber {
			
	public String numberGen(int dupCd) {
		
		Random rand = new Random();
		String numStr = ""; //������ ����� ����
		
		for(int i=0;i<3;i++) {
						//0~9 ���� ���� ����
			String ran = Integer.toString(rand.nextInt(10));
			if(dupCd==2) {
				//�ߺ��� ������� ������ �ߺ��� ���� �ִ��� �˻��Ѵ�
				if(!numStr.contains(ran)) {
					//�ߺ��� ���� ������ numStr�� append
					numStr += ran;
				}else {
					//������ ������ �ߺ��Ǹ� ��ƾ�� �ٽ� �����Ѵ�
					i-=1;
				}
			}
		}
		return numStr;
	}
	

	HotelVO hotelVO=new HotelVO();
	static Booknumber bn=new Booknumber();	
		
	public static String bookNumber() {

		LocalDate ld=LocalDate.now();
		DateTimeFormatter fm1=DateTimeFormatter.ofPattern("yyMMdd");
		
		String bookNumber = ld.format(fm1)+bn.numberGen(2);
		
		
		return bookNumber;
								
	}

		
	
	
	
}
