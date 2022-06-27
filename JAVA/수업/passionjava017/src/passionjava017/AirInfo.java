package passionjava017;

import java.util.Scanner;

public class AirInfo {
	public static void main(String[] args) {
		Airline[]air=new Airline[6];
		int al=0;
		
		air[al++]=new Demestic("제주 항공", "대구", "11시 40분", "제주", "12시 30분", "50분");
		air[al++]=new Demestic("티웨이 항공", "김해", "10시 35분", "인천", "11시 35분", "60분");
		air[al++]=new International("루프트 한자", "인천", "13시 45분", "프랑크푸르트", "23시 55분", "10시간 10분", "암스테르담", "독일");
		air[al++]=new International("핀에어", "반타", "16시 20분", "뉴욕", "0시 40분", "8시간 20분", "파리", "미국");
		air[al++]=new International("카타르 항공", "방콕", "20시 5분", "웰링턴", "2시 50분", "6시간 45분", "시드니", "뉴질랜드");
		air[al++]=new International("델타 항공", "두바이", "17시 12분", "창이", "22시 36분", "5시간 24분", "직항", "싱가포르");
		
		for(int i=0;i<al;i++) {
			air[i].showInfo();
			System.out.println();
			System.out.println();
		}
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		if(num==0) {
			air[0].showInfo();
		}else if(num==1) {
			air[1].showInfo();
		}else if(num==2) {
			air[2].showInfo();
		}else if(num==3) {
			air[3].showInfo();
		}else if(num==4) {
			air[4].showInfo();
		}else if(num==5) {
			air[5].showInfo();
		}
	}

}
