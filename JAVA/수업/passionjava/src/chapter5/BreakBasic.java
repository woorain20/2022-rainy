package chapter5;

public class BreakBasic {
	public static void main(String[] args) {
		//처음 만나는 5의 배수이자 7의 배수인 수를 찾는 반복문
		int num=1;
		boolean search=false;
		while(num<1000) {
			if((num%5==0)&&(num%7==0)) {
				search=true;
				break;
			}
			num++;
		}
		if(search) {
			System.out.println("찾는 정수: "+num);
		}else {
			System.out.println("수를 찾지 못했습니다.");
		}
		System.out.println("종료");
	}	
}
