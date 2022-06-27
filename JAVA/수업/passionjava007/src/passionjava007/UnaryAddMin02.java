package passionjava007;

public class UnaryAddMin02 {
	public static void main(String[] args) {
		short num1=9;
		System.out.println(+num1); // 결과적으로 불필요한 +연산
		System.out.println(-num1); // 부호를 바꿔서 얻은 결과를 출력
		
		short num2=13;
		short num3=(short)(+num2);
		short num4=(short)(-num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}
