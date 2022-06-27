package chapter4;

public class Relational0p {

	public static void main(String[] args) {
		System.out.println(1>2);
		/*if(1>2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}*/
		int num1=1;
		int num2=2;
		int num3=2;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num2>num3);
		System.out.println(num2>=num3);
		System.out.println(num2<=num3);
		System.out.println(num2==num3); // 같다는 = 2개인 ==사용 
		System.out.println(num2!=num3); // !는 not을 의미
		System.out.println(num2!=num1); // !는 not을 의미

	}

}
