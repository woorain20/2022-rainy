package passionjava007;

public class LogicalOp04 {
	public static void main(String[] args) {
		int num1=245;
		int num2=105;
		boolean result;
		//���� num1�� ����� ���� 200�� 250 ������ ���ΰ�?
		result=(200<=num1)&&(num1<=250);
		System.out.println("200�ʰ� 250�̸��ΰ�?"+result);
		//���� num2�� ����� ���� 5 �Ǵ� 7�� ����ΰ�?
		result=((num2%5)==0)||((num2%7)==0);
		System.out.println("5 �Ǵ� 7�� ����ΰ�?"+result);
		//���� num2�� 35�ΰ�?
		result=!(num2!=35);
		System.out.println("35�ΰ�?"+result);
		result=!(num2!=70);
		System.out.println("70�ΰ�?"+result);
		result=!(num2!=105);
		System.out.println("105�ΰ�?"+result);
	}

}
