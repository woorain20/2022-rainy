package passionjava005;
/*
 * �����̸�: UseVaraiable05
 * �ۼ���: ȫ�浿
 * �ۼ���: 2021�� 3�� 12��
 * ����: System.out.println �޼ҵ��� ��� �׽�Ʈ
 */

public class UseVariable05 {
	public static void main(String[] arge) {
		int num1; // ���� num1�� ����
		num1=358; // ���� num1�� 358�� ����
		int num2=48; // ���� num2 ����� ���ÿ� 48�� �ʱ�ȭ
		int num3=39; // ���� num3 ����� ���ÿ� 39�� �ʱ�ȭ
		int num4=2; // ���� num4 ����� ���ÿ� 2�� �ʱ�ȭ
		int num5=78; // ���� num5 ����� ���ÿ� 78�� �ʱ�ȭ
		int num6=num1+num2; // �� ���� ���� ������� ����
		int num7=num1+num3;
		int num8=num4*num5; // �� ���� ���� ������� ����
		int num9=num1*num4;
		int num10=num5-num3; // �� ���� ���� ������� ����
		int num11=num1-num2-num3; // �� ���� ���� ������� ����
		int num12=num1/num4; // �� ���� ���� ������� ������
		System.out.println(num1+"+"+num2+"="+num6);
		System.out.println(num1+"+"+num3+"="+num7);
		System.out.println(num4+"*"+num5+"="+num8);
		System.out.println(num1+"*"+num4+"="+num9);
		System.out.println(num5+"-"+num3+"="+num10);
		System.out.println(num1+"-"+num2+"-"+num3+"="+num11);
		System.out.println(num1+"/"+num4+"="+num12);
	}

}
