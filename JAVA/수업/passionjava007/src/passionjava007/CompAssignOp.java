package passionjava007;

public class CompAssignOp {
	public static void main(String[] args) {
		short num=10;
		num=(short)(num+77L); // �� ��ȯ ���ϸ� ������ ���� �߻�
		int rate=3;
		rate=(int)(rate*3.5); // �� ��ȯ ���ϸ� ������ ���� �߻�
		System.out.println(num);
		System.out.println(rate);
		
		num=10;
		num+=77L; // �� ��ȯ �ʿ����� �ʴ�.
		rate=3;
		rate*=3.5; // �� ��ȯ �ʿ����� �ʴ�.
		System.out.println(num);
		System.out.println(rate);
	}
}
