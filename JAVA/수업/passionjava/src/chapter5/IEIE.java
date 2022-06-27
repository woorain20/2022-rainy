package chapter5;

public class IEIE {
	//FBI, CSI 등의 줄임말은 대문자로 가능
	public static void main(String[] args) {
		int num=120;
		//위에 있는 조건에 걸리면 실행. 밑에 부합되는 조건은 무시.
		if(num<0){
			System.out.println("0 미만");
		}else if(num<100) {
			System.out.println("0 이상 100 미만");
		}else if(num<200) {
			System.out.println("0 이상 200 미만");
		}else if(num<300) {
			System.out.println("0 이상 300 미만");
			//else if문은 무한정 추가할 수 있음
		}else {
			System.out.println("300 이상");
			//else 수식은 생략가능
		}
		System.out.println("실행 끝");
	}

}
