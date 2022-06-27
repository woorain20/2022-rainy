package passionjava009;

public class BreakBasic02 {
	public static void main(String[] args) {
		int num=1;
		boolean search=false;
		
		//처음 만나는 11의 배수지아 15의 배수인 수를 찾는 반복문
		while(num<150) {
			if((num%11==0)&&(num%15==0)) {
				search=true;
				break;	//while문을 탈출
			}
			num++;
		}
		if(search) {
			System.out.println("찾는 정수: "+num);
		}else {
			System.out.println("11의 배수이자 15의 배수를 찾지 못했습니다.");
		}
	}
}
