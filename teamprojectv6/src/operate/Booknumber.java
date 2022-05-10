package operate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;


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
		
	public static String bookNumber() {
		Booknumber bn=new Booknumber();	

		LocalDate ld=LocalDate.now();
		DateTimeFormatter fm1=DateTimeFormatter.ofPattern("yyMMdd");
		
		String bookNumber = ld.format(fm1)+bn.numberGen(2);
		
		return bookNumber;
								
	}

}
