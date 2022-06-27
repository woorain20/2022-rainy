package chapter11;

public class StringMethod {

	public static void main(String[] args) {
		//문자열의 일부 추출
		String bornYear="100101-3";
		int curYear=2022;
		//슬라이스(1,2),(1)- 첫 번째 숫자 이상 두 번째 숫자 미만
		//0부터 시작
		
		String s1=bornYear.substring(1);
		System.out.println(s1);
		String s2=bornYear.substring(0, 2);
		System.out.println(s2);
		
		int age=curYear-Integer.parseInt("20"+s2)+1;
		System.out.println("나이: "+age);
		
		Integer i=0;
		
		//문자열 내용 비교
		String st1="Lexicographically";
		String st2="lexicographically";
		String st3=new String("Lexicographically");
		
		//String ==는 메모리 주소값 비교
		if(st1==st3) {
			System.out.println("st1==st3");
		}else {
			System.out.println("st1!=st3");
		}
		if(st1.equals(st3)) {
			System.out.println("st1==st3");
		}else {
			System.out.println("st1!=st3");
		}
		if(st1.equals(st2)) {
			System.out.println("st1==st2");
		}else {
			System.out.println("st1!=st2");
		}
	}
}
