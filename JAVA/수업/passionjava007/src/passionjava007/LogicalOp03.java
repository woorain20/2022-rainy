package passionjava007;

public class LogicalOp03 {
	public static void main(String[] args) {
		int num1=156;
		int num2=48;
		boolean result;
		//���� num1�� ����� ���� 1�� 100 ������ ���ΰ�?
		result=(1<=num1)&&(num1<=100);
		System.out.println("1 �ʰ� 100 �̸��� ���ΰ�"+result);
		//���� num2�� ����� ���� 3 �Ǵ� 4�� ����ΰ�?
		result=((num2%3)==0)||((num2%4)==0);
		System.out.println("3 �Ǵ� 4�� ����ΰ�?"+result);
		result=((num2%5)==0)||((num2%7)==0);
		System.out.println("5 �Ǵ� 7�� ����ΰ�?"+result);
		//���� num1�� 150�ΰ�?
		result=!(num1!=150);
		System.out.println("150�ΰ�?"+result);
	}

}
