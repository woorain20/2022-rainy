package operate;

import java.time.LocalDate;
import java.util.InputMismatchException;




public class ViewCheckIn {

	LocalDate ld=LocalDate.now();
		//체크인 날짜
		public void CheckInYear(int year) {
			//년도 문자열 예외처리
			while(true) {			
				try {
					while(true) {
						//현재 시간보다 과거 날짜 처리 불가
						if(ld.getYear()<=year){
							System.out.println(year+"년");		
							System.out.println("월을 선택해주세요");
							break;
						}else {
							System.out.println("과거날짜를 선택할 수 없습니다.");
						}
					}
				}catch(InputMismatchException e) {
					System.out.println("숫자를 입력해주세요.");
					continue;
				}
				break;
			}	
		}
		public void CheckInMonth(int month) {
			//월 문자열 예외처리
			while(true) {	
				try {
					while(true) {
						if(month<=12) {
							System.out.println(month+"월");
							System.out.println("일을 선택해주세요");
							break;
						}else {
							System.out.println("1~12월 중에 선택해주세요.");
						}
					}
				}catch(InputMismatchException e) {
					System.out.println("숫자를 입력해주세요");
					continue;
				}
				break;
			}
		}
			
		public void CheckInDay(int day) {
			//일 문자열 예외처리
			while(true) {
				try {
	//				System.out.println("일을 선택해주세요");
					while(true) {
						if(day<=31) {
							System.out.println(day+"일");
							break;
						}else {
							System.out.println("기간에 맞는 숫자를 선택해주세요");
						}
					}
				}catch(InputMismatchException e) {
					System.out.println("숫자를 입력해주세요");
					continue;
				}
				break;
			}
		}

	
}
