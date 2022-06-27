package passionjava008;

public class IEIE01 {
	public static void main(String[] args) {
		int num=160;
		if(num<0) {	//먼저 검사
			System.out.println("0미만");
	}else if(num<100) { //위 조건이 만족되지 않으면 여기서 다시 검사
		System.out.println("0이상 100미만");
	}else if(num<200) { //위 조건이 만족되지 않으면 여기서 다시 검사
		System.out.println("100이상 200미만");
	}else { //아무것도 만족되지 않으면 else에 속한 문장 실행
		System.out.println("200이상");
	}

	}
}