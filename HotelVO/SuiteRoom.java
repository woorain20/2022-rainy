import java.util.Scanner;

public class SuiteRoom {
	static Scanner sc = new Scanner(System.in);

	public static void Suite() {
			char exit = 0; //종료체킹을 위한 변수 
		
		System.out.println("스위트룸입니다. 이용인원수를 입렵해주세요. 최대 2인");
	
		int peaple = 0;                 //인실 peaple = 인원
		peaple = sc.nextInt(); 
		while(peaple<3) {               //최대 2인까지   0,1,2까지 출력받는다.
		System.out.println("이용인수는 "+peaple+"인 입니다.");
		peaple++;
		
		int cost = 120000;            //가격 cost = 비용
		System.out.println("스위트룸의 이용비용은 "+ cost + "원입니다.");
		
		System.out.println("예약을 하시겠습니까?(y/n)");  
		exit = sc.next().charAt(0);
		
		if(exit == 'n' || exit == 'N') {// 종료 체킹
		System.out.println("예약을 취소하였습니다.");
		return ; }
		}	
}
	public static void main(String[] args) {
		Suite();                    //메소드 호출값
}
}