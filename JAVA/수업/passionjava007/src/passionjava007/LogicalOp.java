package passionjava007;

public class LogicalOp {
	public static void main(String[] args) {
		int num1=11;
		int num2=22;
		boolean result;
		//���� num1�� ����� ���� 1�� 100 ������ ���ΰ�?
		result=(1<num1)&&(num1<100);
		System.out.println("1�ʰ� 100�̸��ΰ�?"+result);
		
		//���� num2�� ����� ���� 2 �Ǵ� 3�� ����ΰ�?
		result=((num2%2)==0)||((num2%3)==0);
		System.out.println("2 �Ǵ� 3�� ����ΰ�?"+result);
		
		//���� num1�� 0�ΰ�?
		result=!(num1!=0);
		System.out.println("0�ΰ�?"+result);
	}

}
