package passionjava009;

public class BreakBasic01 {
	public static void main(String[] args) {
		int num=1;
		boolean search=false;
		
		//처음 만나는 6의 배수이자 9의 배수인 수를 찾는 반복문
		while(num<50) {
			if((num%6==0)&&(num%9==0)) {
				search=true;
				break;	//while문을 탈출
			}
			num++;
		}
		if(search) {
			System.out.println("찾는 정수: "+num);
		}else {
			System.out.println("6의 배수이자 9의 배수인 수를 찾지 못했습니다.");
		}
	}
}
