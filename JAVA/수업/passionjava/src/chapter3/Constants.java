package chapter3;

//��Ŭ���� â ���� - window > show view 
//â ���̾ƿ� �ʱ�ȭ - window > perspective > reset

public class Constants {
	public static void main(String[] args) {
		// main ctrl+space �ڵ��ϼ�
		//alt + ȭ��ǥ - �����̵�
		// ����
		int num1=10;
		int num2=50;
		System.out.println("1: "+num1);
		num1=15;
		System.out.println("2: "+num1);
		num1=20;
		System.out.println("3: "+num1);
		//0-�Ϲ�����, 1-������
		int auth=0;
		auth=1;
		System.out.println(auth);
		// ���
		final int MAX_SIZE=100;
		//maxSize=150; �Ұ�
		System.out.println(MAX_SIZE);
		//���ͷ�
		int num3=10;
		//���� ���ͷ�->int
		//int 2^32���� ǥ��(+-21��)
		//int > long(���� �� �빮�� Ȥ�� �ҹ��� L,l)
		System.out.println(3147483647L);
		System.out.println(3147483647l);
		//�Ǽ� double
		System.out.println(3.14d);
		System.out.println(3.14D);
		//�Ǽ� float
		System.out.println(3.14f);
		System.out.println(3.14F);
		//���� ����
		//1,000/1,000,000
		int num4=1_000_000;
	}

}
