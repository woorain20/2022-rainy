package passionjava007;

public class UnaryAddMin02 {
	public static void main(String[] args) {
		short num1=9;
		System.out.println(+num1); // ��������� ���ʿ��� +����
		System.out.println(-num1); // ��ȣ�� �ٲ㼭 ���� ����� ���
		
		short num2=13;
		short num3=(short)(+num2);
		short num4=(short)(-num2);
		System.out.println(num3);
		System.out.println(num4);
	}

}
