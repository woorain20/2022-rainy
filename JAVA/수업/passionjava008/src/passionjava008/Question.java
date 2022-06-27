package passionjava008;

public class Question {
	public static void main(String[] args) {
		int num=120;
		if(num>0) {
			if((num%2)==0)
				System.out.println("양수이면서 짝수");
		}else if((num%5)==0) {
			System.out.println("5의 배수");
		}else {
			System.out.println("모름");
		}
	}
}
