package operate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;

import dto.HotelVO;

public class Booknumber {
			
	public String numberGen(int dupCd) {
		
		Random rand = new Random();
		String numStr = ""; //난수가 저장될 변수
		
		for(int i=0;i<3;i++) {
						//0~9 까지 난수 생성
			String ran = Integer.toString(rand.nextInt(10));
			if(dupCd==2) {
				//중복을 허용하지 않을시 중복된 값이 있는지 검사한다
				if(!numStr.contains(ran)) {
					//중복된 값이 없으면 numStr에 append
					numStr += ran;
				}else {
					//생성된 난수가 중복되면 루틴을 다시 실행한다
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
