package passionjava007;

public class CompAssignOp02 {
	public static void main(String[] args) {
		
		short num=12;
		num=(short)(num+79L); // �� ��ȯ �� �ϸ� ������ ���� �߻�
		int rate=4;
		rate=(int)(rate*4.5); // �� ��ȯ �� �ϸ� ������ ���� �߻�
		System.out.println(num);
		System.out.println(rate);
		
		num=12;
		num+=79L; // �� ��ȯ �ʿ����� �ʴ�.
		rate=4;
		rate*=4.5; // �� ��ȯ �ʿ����� �ʴ�.
		System.out.println(num);
		System.out.println(rate);
	}
}
