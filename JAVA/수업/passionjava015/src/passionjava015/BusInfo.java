package passionjava015;

import java.util.Scanner;

public class BusInfo {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("버스 번호: ");
		int num=sc.nextInt();
		if(num==724) {
			System.out.println("목적지: 칠곡");
			System.out.println("현재: 임당네거리");
			System.out.println("도착시간: 6분");
		}else {
			System.out.println("잘못된 버스 정보입니다.");
		}
		int num2=sc.nextInt();
		if(num2==449) {
			System.out.println("목적지: 영남대");
			System.out.println("현재: 중앙로");
			System.out.println("도착시간: 16분");
		}else {
			System.out.println("잘못된 버스 정보입니다.");
		}
		int num3=sc.nextInt();
		if(num3==524) {
			System.out.println("목적지: 화원");
			System.out.println("현재: 북구청");
			System.out.println("도착시간: 3분");
		}else {
			System.out.println("잘못된 버스 정보입니다.");
		}
	}
}
