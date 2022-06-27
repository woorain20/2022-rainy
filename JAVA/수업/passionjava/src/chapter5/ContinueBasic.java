package chapter5;

public class ContinueBasic {
	public static void main(String[] args) {
		//continue-조건 검사로 이동
		//5의 배수와 7의 배수를 찾는다.
		int num=0;
		int count=0;
		while(num++<200) {
			if((num%5!=0)||(num%7!=0)) {
				continue;
			}
			count++;
			System.out.println(num);
		}
		System.out.println("count: "+count);
	}

}
