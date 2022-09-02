package roomif;

import java.util.Scanner;

public class Room {
	static Scanner sc = new Scanner(System.in);

	public static void single() {
		char exit = 0; //종료체킹을 위한 변수 
		
		int cost = 700000;            //가격 cost = 비용
		System.out.println("싱글룸의 이용비용은 "+ cost + "원입니다."); 
		
		
		System.out.println("예약을 하시겠습니까?(y/n)");   //예약 여부 
		exit = sc.next().charAt(0);
	
	    if(exit == 'n' || exit == 'N') {          // 종료 체킹
		System.out.println("예약을 취소하였습니다.");
		return ; }
	}
	
	public static void Double() {
		
		char  exit = 0; //종료체킹을 위한 변수
			
		int cost = 100000;         //가격 cost = 비용
		System.out.println("더블룸의 이용비용은 "+ cost  + "원입니다.");
		
		//인원 , 성수기 비수기 가격변동.  
		
		System.out.println("예약을 하시겠습니까?(y/n)");   //예약 여부 
		exit = sc.next().charAt(0);
		
		if(exit == 'n' || exit == 'N') {// 종료 체킹
			System.out.println("예약을 취소하였습니다.");
			return ; }
		}
	
	public static void Twin() {
		char exit = 0; //종료체킹을 위한 변수 
		
		int cost = 150000;           //가격 cost = 비용
		System.out.println("트윈룸의 이용비용은 "+ cost + "원입니다.");
			
		System.out.println("예약을 하시겠습니까?(y/n)"); //예약여부
		exit = sc.next().charAt(0);
		
		if(exit == 'n' || exit == 'N') { // 종료 체킹
		System.out.println("예약을 취소하였습니다.");
		return ; }
		}	
	
	public static void Suite() {
		char exit = 0; //종료체킹을 위한 변수 

	int cost = 120000;            //가격 cost = 비용
	System.out.println("스위트룸의 이용비용은 "+ cost + "원입니다.");
	
	System.out.println("예약을 하시겠습니까?(y/n)");  
	exit = sc.next().charAt(0);
	
	if(exit == 'n' || exit == 'N') {// 종료 체킹
	System.out.println("예약을 취소하였습니다.");
	return ; }
	}	
		

	public static void main(String[] args) {
		single();                            //메소드 호출값
		Double();
		Twin();
		Suite();
		
	}
	
	
}
