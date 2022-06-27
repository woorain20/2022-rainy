package passionjava007;

public class PostfixOp01 {
	public static void main(String[] args) {
		int num=134;
		System.out.println((num++)+""); // 출력 후에 값이 증가
		System.out.println((num++)+""); // 출력 후에 값이 증가
		System.out.println((num++)+""); // 출력 후에 값이 증가
		System.out.println((num++)+""); // 출력 후에 값이 증가
		System.out.println(num+"\n");
		
		System.out.println((num--)+""); // 출력 후에 값이 감소
		System.out.println((num--)+""); // 출력 후에 값이 감소
		System.out.println((num--)+""); // 출력 후에 값이 감소
		System.out.println((num--)+""); // 출력 후에 값이 감소
		System.out.println(num);
	}

}
