package passionjava007;

public class LogicalOp02 {
	public static void main(String[] args) {
		int num1=39;
		int num2=33;
		boolean result;
		//���� num1�� ����� ���� 1�� 100������ ���ΰ�?
		result=(1<=num1)&&(num1<=100);
		System.out.println("1�ʰ� 100�̸��ΰ�?"+result);
		//���� num2�� ����� ���� 2 �Ǵ� 3�� ����ΰ�?
		result=((2%2)==0)||((2%3)==0);
		System.out.println("2 �Ǵ� 3�� ����ΰ�?"+result);
		//���� num1�� 50�ΰ�?
		result=!(num1!=50);
		System.out.println("50�ΰ�?"+result);
	}
}
