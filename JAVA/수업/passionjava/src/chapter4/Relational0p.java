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
		System.out.println(num2==num3); // ���ٴ� = 2���� ==��� 
		System.out.println(num2!=num3); // !�� not�� �ǹ�
		System.out.println(num2!=num1); // !�� not�� �ǹ�

	}

}
