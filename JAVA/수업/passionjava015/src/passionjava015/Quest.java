package passionjava015;

import java.util.Scanner;

public class Quest {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//정수 입력
		System.out.print("정수 입력: ");
		int num1=scanner.nextInt();
		//스캐너 개행 문자 버그를 위해 삽입한 코드
		scanner.nextLine();
		//정수+\n
		//문자열 입력
		System.out.println("문자열 입력: ");
		String str1=scanner.nextLine();
		//콘솔 입력
		System.out.println("입력받은 정수: "+num1+"\n"+"입력받은 문자열: "+str1);
		
		/* 오류: 스캐너의 nextLine 메소드는 스캐너의 숫자 메소드와 만나서 콘솔에 입력하게 되면 nextLine 메소드를 사용할 수 없는 오류가 발생한다.
		 * 원인: nextLine 메소드는 숫자 메소드와 출발점이 달라서 데이터를 읽는 지점에 따라 오류가 발생한다.
		 * 해결방법 1: nextLine 메소드를 숫자 메소드보다 먼저 사용한다.
		 * 해결방법 2: 숫자 메소드 다음에 nextLine 메소드를 추가한다.
		 */
		
		
		
	}

}
