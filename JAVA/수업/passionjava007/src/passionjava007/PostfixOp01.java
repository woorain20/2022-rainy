package passionjava007;

public class PostfixOp01 {
	public static void main(String[] args) {
		int num=134;
		System.out.println((num++)+""); // ��� �Ŀ� ���� ����
		System.out.println((num++)+""); // ��� �Ŀ� ���� ����
		System.out.println((num++)+""); // ��� �Ŀ� ���� ����
		System.out.println((num++)+""); // ��� �Ŀ� ���� ����
		System.out.println(num+"\n");
		
		System.out.println((num--)+""); // ��� �Ŀ� ���� ����
		System.out.println((num--)+""); // ��� �Ŀ� ���� ����
		System.out.println((num--)+""); // ��� �Ŀ� ���� ����
		System.out.println((num--)+""); // ��� �Ŀ� ���� ����
		System.out.println(num);
	}

}
