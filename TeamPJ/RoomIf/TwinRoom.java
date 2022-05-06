package roomif;

import java.util.Scanner;

public class TwinRoom {
	static Scanner sc = new Scanner(System.in);
	
	public static void Twin() {
		char exit = 0; //종료체킹을 위한 변수 
		
		System.out.println("트윈룸입니다. 이용인원수를 입렵해주세요. 최대 4인");
		
		int peaple = 0;   
		peaple = sc.nextInt(); 
		while(peaple<5) {                 //최대 2인까지   0,1,2,3,4까지 출력받는다.
		System.out.println("이용인수는 "+peaple+"인 입니다."); //인실 Peaple = 인원
		peaple++;
		break;}
		int cost = 150000;           //가격 cost = 비용
		System.out.println("트윈룸의 이용비용은 "+ cost + "원입니다.");
			
		System.out.println("예약을 하시겠습니까?(y/n)"); //예약여부
		exit = sc.next().charAt(0);
		
		if(exit == 'n' || exit == 'N') { // 종료 체킹
		System.out.println("예약을 취소하였습니다.");
		return ; }
		}	
	
	public static void main(String[] args) {
		Twin();                          //메소드 호출값
}
}