package passionjava005;

public class UseVariable06 {
	public static void main(String[] args) {
		int num1; // ���� num1�� ����
		num1=185; // ���� num1�� 185�� ����
		
		int num2=214; // ���� num2 ����� ���ÿ� 214�� �ʱ�ȭ
		int num3=187; // ���� num3 ����� ���ÿ� 187�� �ʱ�ȭ
		int num4=num1+num2; // �� ���� ���� ������� ����
		System.out.println(num1+"+"+num2+"="+num4);
		int num5=num2-num3; // �� ���� ���� ������� ����
		System.out.println(num2+"-"+num3+"="+num5);
		int num6=num1*num5; // �� ���� ���� ������� ����
		System.out.println(num1+"*"+num5+"="+num6);
		int num7=num4/num5; // �� ���� ���� ������� ������
		System.out.println(num4+"/"+num5+"="+num7);
	}

}
