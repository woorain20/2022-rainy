package passionjava015;

public class ArrayIsInstance {
	public static void main(String[] args) {
		//���̰� 5�� int�� 1���� �迭�� ����
		int[]ar1=new int[5];
		
		//���̰� 7�� int�� 1���� �迭�� ����
		int[]ar2=new int[7];
		
		//�迭�� ���������� �ν��Ͻ� ���� �и�
		float[]ar3;
		ar3=new float[9];
		
		//�迭�� �ν��Ͻ� ���� ����
		System.out.println("�迭 ar1 ����: "+ar1.length);
		System.out.println("�迭 ar2 ����: "+ar2.length);
		System.out.println("�迭 ar3 ����: "+ar3.length);
	}

}
